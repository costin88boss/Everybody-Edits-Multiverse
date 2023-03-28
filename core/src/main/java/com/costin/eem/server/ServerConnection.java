package com.costin.eem.server;

import com.costin.eem.net.NetHandler;
import com.costin.eem.net.handlers.LoginHandler;
import com.costin.eem.net.protocol.Packet;
import com.costin.eem.net.protocol.begin.client.HelloPacket;
import com.costin.eem.net.protocol.begin.server.HelloBackPacket;
import com.costin.eem.net.protocol.login.server.PlayerInfoPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerConnection implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(ServerConnection.class);
    private final Socket client;
    private NetHandler currentHandler;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public ServerConnection(Socket client) throws IOException {
        this.client = client;
    }

    public void sendPacket(Packet packet) throws IOException {
        out.writeObject(packet);
        out.flush();
    }

    public void setHandler(NetHandler newHandler) {
        currentHandler = newHandler;
    }

    @Override
    public void run() {
        try {
            in = new ObjectInputStream(client.getInputStream());
            HelloPacket receivedPacket = (HelloPacket) in.readObject();
            out = new ObjectOutputStream(client.getOutputStream());
            HelloBackPacket sentPacket = new HelloBackPacket(true, "");
            sendPacket(sentPacket);
            PlayerInfoPacket playerInfoPacket = new PlayerInfoPacket("Guest" + MainServer.instance().getPlayers().size(), 0, 0, 0, false);
            sendPacket(playerInfoPacket);

            currentHandler = new LoginHandler();
            while (!client.isClosed()) {
                currentHandler.serverHandle((Packet) in.readObject(), this);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
