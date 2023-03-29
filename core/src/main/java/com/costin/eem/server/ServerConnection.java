package com.costin.eem.server;

import com.costin.eem.Config;
import com.costin.eem.game.Player;
import com.costin.eem.game.items.ItemManager;
import com.costin.eem.game.level.World;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.handlers.LoginHandler;
import com.costin.eem.net.protocol.Packet;
import com.costin.eem.net.protocol.begin.client.HelloPacket;
import com.costin.eem.net.protocol.begin.server.HelloBackPacket;
import com.costin.eem.net.protocol.login.client.PlayerDesirePacket;
import com.costin.eem.net.protocol.login.server.PlayerInfoPacket;
import com.costin.eem.net.protocol.login.server.WorldDataPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerConnection implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(ServerConnection.class);
    private Player player;

    public Player getPlayer() {
        return player;
    }

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
            boolean accepted = true;
            String kickReason = "";

            if(receivedPacket.clientVersion < Config.VERSION) {
                accepted = false;
                kickReason = "Outdated client";
            }
            if(receivedPacket.clientVersion > Config.VERSION) {
                accepted = false;
                kickReason = "Outdated server";
            }

            accepted = false;
            kickReason = "El Bozo";


            out = new ObjectOutputStream(client.getOutputStream());
            HelloBackPacket sendPacket = new HelloBackPacket(accepted, kickReason);
            sendPacket(sendPacket);
            if(!accepted) {
                client.close();
                return;
            }

            int smileyID;
            int auraID;
            String nickname = "Guest" + MainServer.getPlayers().size();

            PlayerDesirePacket playerDesirePacket = (PlayerDesirePacket) in.readObject();
            if(playerDesirePacket.smileyID >= ItemManager.instance().getSmileyCount() || playerDesirePacket.smileyID < 0) {
                smileyID = 0;
            } else smileyID = playerDesirePacket.smileyID;
            if(playerDesirePacket.auraID >= ItemManager.instance().getAuraCount() || playerDesirePacket.auraID < 0) {
                auraID = 0;
            } else auraID = playerDesirePacket.auraID;

            player = new Player();
            player.setNickname(nickname);
            MainServer.addPlayer(this);

            PlayerInfoPacket playerInfoPacket = new PlayerInfoPacket(nickname, 0, 0, smileyID, auraID, false);
            sendPacket(playerInfoPacket);
            World world = MainServer.getWorld();
            WorldDataPacket worldDataPacket = new WorldDataPacket(world.getBlockData(), world.getOwner(), world.getWorldName(), world.getWidth(), world.getHeight(), world.getGravity(), world.getBackground(), world.getDescription(), world.getCampaign(), world.getCrewId(), world.getCrewName(), world.getCrewStatus(), world.getMinimap(), world.getOwnerID());
            sendPacket(worldDataPacket);

            setHandler(new LoginHandler());
            while (!client.isClosed()) {
                currentHandler.serverHandle((Packet) in.readObject(), this);
            }
            MainServer.removePlayer(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
