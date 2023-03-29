package com.costin.eem.client;

import com.costin.eem.Config;
import com.costin.eem.client.screens.LoadingScreen;
import com.costin.eem.client.screens.MenuScreen;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.handlers.LoginHandler;
import com.costin.eem.net.protocol.Packet;
import com.costin.eem.net.protocol.begin.client.HelloPacket;
import com.costin.eem.net.protocol.begin.server.HelloBackPacket;
import com.costin.eem.net.protocol.login.client.PlayerDesirePacket;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    public void sendPacket(Packet packet) throws IOException {
        out.writeObject(packet);
        out.flush();
    }

    public void setHandler(NetHandler newHandler) {
        currentHandler = newHandler;
    }

    public void startLocalServer(int port, String worldName) throws IOException {
        if (!MainServer.isRunning()) new Thread(new MainServer(port, worldName), "Server-Thread").start();
    }

    public void connectTo(String ip, int port) throws IOException {
        if (!client.isClosed()) client.close();
        MainClient.setScreen(LoadingScreen.instance());
        serverAddress = new InetSocketAddress(ip, port);
        log.info("Connecting to {}:{}", ip, port);
        new Thread(this).start();
    }

    public void stopClient() {
        stopClient = true;
        try {
            client.close();
        } catch (IOException ignored) {
        }
    }

    @Override
    public void run() {
        client = new Socket();
        try {
            client.connect(serverAddress);
            client.setSoTimeout(10000);
            out = new ObjectOutputStream(client.getOutputStream());
            HelloPacket sentPacket = new HelloPacket(Config.VERSION);
            sendPacket(sentPacket);
            in = new ObjectInputStream(client.getInputStream());
            HelloBackPacket receivedPacket = (HelloBackPacket) in.readObject();
            if (!receivedPacket.accepted) {
                MenuScreen.instance().showWindow("Kicked!","Kick reason: \"" + receivedPacket.kickReason + "\"");
                MainClient.setScreen(MenuScreen.instance());
                client.close();
                return;
            }
            PlayerDesirePacket playerDesirePacket = new PlayerDesirePacket("Name", 0, 0, false);
            sendPacket(playerDesirePacket);

            setHandler(new LoginHandler());
            while (!client.isClosed()) {
                if (stopClient) {
                    client.close();
                    break;
                }

                currentHandler.clientHandle((Packet) in.readObject(), this);
            }

        } catch (ConnectException e) {
            MenuScreen.instance().showWindow("Could not connect!", "There is no server.");
            MainClient.setScreen(MenuScreen.instance());
            throw new RuntimeException(e);
        } catch (SocketTimeoutException e) {
            log.info("Server {}:{} is not responding. We have to close the connection!" , client.getInetAddress().getHostAddress(), client.getPort());
            try {
                client.close();
                if(MainClient.isRunning()) {
                    MenuScreen.instance().showWindow("Server not responding!", "The server might be dead.");
                    MainClient.setScreen(MenuScreen.instance());
                }
            } catch (IOException e2) {
                log.error(e2.getMessage());
            }
        } catch (IOException e) {
            MenuScreen.instance().showWindow("Could not connect!", e.getMessage());
            MainClient.setScreen(MenuScreen.instance());
        } catch (ClassNotFoundException e) {
            log.error("Server sent unknown class. is class corrupted? is server/client somehow outdated? WHAT IS HAPPENING?");
        }

        log.info("Closed local connection.");
    }
}
