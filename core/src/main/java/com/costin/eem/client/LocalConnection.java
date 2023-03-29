package com.costin.eem.client;

import com.costin.eem.Config;
import com.costin.eem.client.screens.LoadingScreen;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.handlers.LoginHandler;
import com.costin.eem.net.protocol.Packet;
import com.costin.eem.net.protocol.begin.client.HelloPacket;
import com.costin.eem.net.protocol.begin.server.HelloBackPacket;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

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
        MainClient.setScreen(new LoadingScreen());
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
            out = new ObjectOutputStream(client.getOutputStream());
            HelloPacket sentPacket = new HelloPacket(Config.VERSION);
            sendPacket(sentPacket);
            in = new ObjectInputStream(client.getInputStream());
            HelloBackPacket receivedPacket = (HelloBackPacket) in.readObject();
            if (!receivedPacket.accepted) {
                // TODO: 3/26/2023 kick with receivedPacket.kickReason
                client.close();
                return;
            }

            setHandler(new LoginHandler());
            while (!client.isClosed()) {
                if (stopClient) {
                    client.close();
                    break;
                }

                currentHandler.clientHandle((Packet) in.readObject(), this);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
