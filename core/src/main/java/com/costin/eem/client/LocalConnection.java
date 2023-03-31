package com.costin.eem.client;

import com.costin.eem.Config;
import com.costin.eem.client.screens.MenuScreen;
import com.costin.eem.client.screens.WorldLoadingScreen;
import com.costin.eem.client.screens.WorldScreen;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.Packet;
import com.costin.eem.net.handlers.LoginHandler;
import com.costin.eem.net.protocol.begin.client.ClientHelloPacket;
import com.costin.eem.net.protocol.begin.server.ServerHelloBackPacket;
import com.costin.eem.net.protocol.login.client.ClientPlayerDesirePacket;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class LocalConnection implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(LocalConnection.class);

    private static LocalConnection instance;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private NetHandler currentHandler;
    private Socket client = new Socket();
    private InetSocketAddress serverAddress;
    private volatile boolean stopClient;


    public static LocalConnection instance() {
        if (instance == null) instance = new LocalConnection();
        return instance;
    }

    public void sendPacket(Packet packet) {
        try {
            out.writeObject(packet);
            out.flush();
        } catch (IOException e) {
            log.error("IOException: {}", e.toString());
        }
    }

    public void setHandler(NetHandler newHandler) {
        currentHandler = newHandler;
    }

    public void startLocalServer(int port, String worldName) throws IOException {
        if (!MainServer.isRunning()) new Thread(new MainServer(port, worldName)).start();
    }

    public void connectTo(String ip, int port) throws IOException {
        if (!client.isClosed()) client.close();
        MainClient.setScreen(WorldLoadingScreen.instance());
        float timer = 5000;
        serverAddress = new InetSocketAddress(ip, port);
        log.info("Connecting to {}:{}", ip, port);
        new Thread(this).start();
    }

    public void stopClient() {
        stopClient = true;
    }

    @Override
    public void run() {
        client = new Socket();
        try {
            client.connect(serverAddress);
            client.setSoTimeout(10000);
            out = new ObjectOutputStream(client.getOutputStream());
            ClientHelloPacket sentPacket = new ClientHelloPacket(Config.VERSION);
            sendPacket(sentPacket);
            in = new ObjectInputStream(client.getInputStream());
            ServerHelloBackPacket receivedPacket = (ServerHelloBackPacket) in.readObject();
            if (!receivedPacket.accepted) {
                MenuScreen.instance().showInfoWindow("Kicked!", "Kick reason: \"" + receivedPacket.kickReason + "\"");
                MainClient.setScreen(MenuScreen.instance());
                client.close();
                return;
            }
            ClientPlayerDesirePacket clientPlayerDesirePacket = new ClientPlayerDesirePacket("Name", 0, 0, false);
            sendPacket(clientPlayerDesirePacket);

            setHandler(new LoginHandler());
            while (!client.isClosed()) {
                if (stopClient) {
                    WorldScreen.instance().clearData();
                    client.close();
                    break;
                }

                currentHandler.clientHandle((Packet) in.readObject(), this);

                //currentHandler.clientHandle((Packet) in.readObject(), this);
            }

        } catch (ConnectException e) {
            MenuScreen.instance().showInfoWindow("Could not connect!", "Connection refused.");
            MainClient.setScreen(MenuScreen.instance());
            throw new RuntimeException(e);
        } catch (SocketTimeoutException e) {
            log.info("Server {}:{} is not responding. We have to close the connection!", client.getInetAddress().getHostAddress(), client.getPort());
            MenuScreen.instance().showInfoWindow("Server not responding!", "The server didn't send data for a long time, did it die??");
            MainClient.setScreen(MenuScreen.instance());
        } catch (EOFException e) {
            if (!MenuScreen.instance().isInfoWindowShown()) {
                MenuScreen.instance().showInfoWindow("Hit the roadblock!", "The server didn't send data so we've hit the roadblock!");
                MainClient.setScreen(MenuScreen.instance());
            }
        } catch (IOException e) {
            e.printStackTrace();
            MenuScreen.instance().showInfoWindow("IOException Error!", e.toString());
            MainClient.setScreen(MenuScreen.instance());
        } catch (ClassNotFoundException e) {
            log.error("Server sent unknown class. is class corrupted? is server/client somehow outdated? WHAT IS HAPPENING?");
        }
        LocalConnection.instance().stopClient(); // client's networking thread
        MainServer.stopServer(); // client will start a local server when joining a world
        log.info("Closed local connection.");
    }
}
