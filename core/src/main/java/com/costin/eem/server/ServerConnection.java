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
import com.costin.eem.net.protocol.login.server.PlayerListPacket;
import com.costin.eem.net.protocol.login.server.WorldDataPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServerConnection implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(ServerConnection.class);
    private Player player;
    private boolean closeConnection;
    private Thread thisThread;
    public Thread getThread() {
        return thisThread;
    }

    public Player getPlayer() {
        return player;
    }
    public void closeConnection() {
        closeConnection = true;
        try {
            client.close();
        } catch (IOException ignored) {

        }
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
        thisThread = this.getThread();
        try {
            client.setSoTimeout(10000);
            in = new ObjectInputStream(client.getInputStream());
            HelloPacket receivedPacket = (HelloPacket) in.readObject();
            boolean accepted = true;
            String kickReason = "No reason";

            if(receivedPacket.clientVersion < Config.VERSION) {
                accepted = false;
                kickReason = "Outdated client";
            }
            if(receivedPacket.clientVersion > Config.VERSION) {
                accepted = false;
                kickReason = "Outdated server";
            }

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
            MainServer.getPlayers().add(this);

            PlayerInfoPacket playerInfoPacket = new PlayerInfoPacket(nickname, 0, 0, smileyID, auraID, false);
            sendPacket(playerInfoPacket);
            World world = MainServer.getWorld();
            WorldDataPacket worldDataPacket = new WorldDataPacket(world.getBlockData(), world.getOwner(), world.getWorldName(), world.getWidth(), world.getHeight(), world.getGravity(), world.getBackground(), world.getDescription(), world.getCampaign(), world.getCrewId(), world.getCrewName(), world.getCrewStatus(), world.getMinimap(), world.getOwnerID());
            sendPacket(worldDataPacket);

            int plySize = MainServer.getPlayers().size();
            String[] nicknames = new String[plySize];
            float[] xPositions = new float[plySize];
            float[] yPositions = new float[plySize];
            float[] xVelocities = new float[plySize];
            float[] yVelocities = new float[plySize];
            int[] smileyIDs =  new int[plySize];
            int[] auraIDs =  new int[plySize];
            boolean[] golden = new boolean[plySize];
            boolean[] godMode = new boolean[plySize];

            for (int i = 0; i < MainServer.getPlayers().size(); i++) {
                ServerConnection ply = MainServer.getPlayers().get(i);
                nicknames[i] = ply.player.getNickname();
                xPositions[i] = ply.player.getX();
                yPositions[i] = ply.player.getY();
                xVelocities[i] = ply.player.getVelX();
                yVelocities[i] = ply.player.getVelY();
                smileyIDs[i] = ply.player.getSmileyID();
                auraIDs[i] = ply.player.getAuraID();
                golden[i] = ply.player.isGolden();
                godMode[i] = ply.player.isGodMode();
            }

            PlayerListPacket playerListPacket = new PlayerListPacket(nicknames, xPositions, yPositions, xVelocities, yVelocities, smileyIDs, auraIDs, golden, godMode);
            sendPacket(playerListPacket);

            setHandler(new LoginHandler());
            while (!client.isClosed()) {
                if(closeConnection) {
                    client.close();
                    break;
                }
                currentHandler.serverHandle((Packet) in.readObject(), this);
            }
            log.info("Closing client");
            MainServer.getPlayers().remove(this);
        } catch (ClassNotFoundException e) {
            log.error("Client sent unknown class. is class corrupted? is server/client somehow outdated? WHAT IS HAPPENING?");
        } catch (SocketTimeoutException e) {
            log.info("Client {}:{} is not responding. We have to close the connection!" , client.getInetAddress().getHostAddress(), client.getPort());
            try {
                client.close();
            } catch (IOException e2) {
                log.error(e2.getMessage());
            }
        } catch (IOException e) {
            log.error(e.getMessage());
        }

        log.info("Closed client connection.");
    }
}
