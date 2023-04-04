package com.costin.eem.server;

import com.badlogic.gdx.graphics.Color;
import com.costin.eem.Config;
import com.costin.eem.game.Player;
import com.costin.eem.game.items.ItemManager;
import com.costin.eem.game.level.World;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.Packet;
import com.costin.eem.net.handlers.LoginHandler;
import com.costin.eem.net.protocol.begin.client.ClientHelloPacket;
import com.costin.eem.net.protocol.begin.server.ServerHelloBackPacket;
import com.costin.eem.net.protocol.login.client.ClientPlayerDesirePacket;
import com.costin.eem.net.protocol.login.server.ServerLoginEndPacket;
import com.costin.eem.net.protocol.login.server.ServerPlayerInfoPacket;
import com.costin.eem.net.protocol.login.server.ServerPlayerListPacket;
import com.costin.eem.net.protocol.login.server.ServerWorldDataPacket;
import com.costin.eem.net.protocol.world.server.ServerPlayerLeftPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class PlayerConnection implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(PlayerConnection.class);
    private final Socket client;
    private Player player;
    private boolean closeConnection;
    private Thread thisThread;
    private ArrayList<NetHandler> currentHandlers;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    public PlayerConnection(Socket client) throws IOException {
        this.client = client;
        currentHandlers = new ArrayList<>();
    }

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

    public void sendPacket(Packet packet) throws IOException {
        if(!client.isClosed() && MainServer.isRunning()) {
            out.writeObject(packet);
            out.flush();
        }
    }

    public void addHandler(NetHandler handler) {
        // bad function since 2 instances of a class can be added
        if(!currentHandlers.contains(handler)) currentHandlers.add(handler);
    }
    public void removeHandler(Class<? extends NetHandler> handler) {
        currentHandlers.removeIf(netHandler -> netHandler.getClass() == handler);
    }

    @Override
    public void run() {
        thisThread = this.getThread();
        try {
            client.setSoTimeout(10000);
            in = new ObjectInputStream(client.getInputStream());
            ClientHelloPacket receivedPacket = (ClientHelloPacket) in.readObject();
            boolean accepted = true;
            String kickReason = "No reason";

            if (receivedPacket.clientVersion < Config.VERSION) {
                accepted = false;
                kickReason = "Outdated client";
            }
            if (receivedPacket.clientVersion > Config.VERSION) {
                accepted = false;
                kickReason = "Outdated server";
            }

            out = new ObjectOutputStream(client.getOutputStream());
            ServerHelloBackPacket sendPacket = new ServerHelloBackPacket(accepted, kickReason);
            sendPacket(sendPacket);
            if (!accepted) {
                client.close();
                return;
            }

            int smileyID;
            int auraID;
            String nickname = "Guest" + MainServer.getPlayers().size();

            ClientPlayerDesirePacket clientPlayerDesirePacket = (ClientPlayerDesirePacket) in.readObject();
            if (clientPlayerDesirePacket.smileyID >= ItemManager.instance().getSmileyCount() || clientPlayerDesirePacket.smileyID < 0) {
                smileyID = 0;
            } else smileyID = clientPlayerDesirePacket.smileyID;
            if (clientPlayerDesirePacket.auraID >= ItemManager.instance().getAuraCount() || clientPlayerDesirePacket.auraID < 0) {
                auraID = 0;
            } else auraID = clientPlayerDesirePacket.auraID;

            player = new Player();
            player.setNickname(nickname);
            player.getPosition().set(16, MainServer.getWorld().getHeight() * 16 - 16);
            player.setSmileyID(MainServer.getPlayers().size());
            player.setAuraID(MainServer.getPlayers().size());
            player.setAuraColor(Color.SKY);
            player.setGolden(false);

            ServerPlayerInfoPacket serverPlayerInfoPacket = new ServerPlayerInfoPacket(player.getNickname(), player.getPosition().x, player.getPosition().y, player.getSmileyID(), player.getAuraID(), player.isGolden());
            sendPacket(serverPlayerInfoPacket);
            World world = MainServer.getWorld();
            ServerWorldDataPacket serverWorldDataPacket = new ServerWorldDataPacket(world.getLayers(), world.getOwner(), world.getWorldName(), world.getWidth(), world.getHeight(), world.getGravity(), world.getBackground(), world.getDescription(), world.getCampaign(), world.getCrewId(), world.getCrewName(), world.getCrewStatus(), world.getMinimap(), world.getOwnerID());
            sendPacket(serverWorldDataPacket);

            int plySize = MainServer.getPlayers().size();
            String[] nicknames = new String[plySize];
            float[] xPositions = new float[plySize];
            float[] yPositions = new float[plySize];
            float[] xVelocities = new float[plySize];
            float[] yVelocities = new float[plySize];
            int[] smileyIDs = new int[plySize];
            int[] auraIDs = new int[plySize];
            boolean[] golden = new boolean[plySize];
            boolean[] godMode = new boolean[plySize];

            for (int i = 0; i < MainServer.getPlayers().size(); i++) {
                PlayerConnection ply = MainServer.getPlayers().get(i);
                nicknames[i] = ply.player.getNickname();
                xPositions[i] = ply.player.getPosition().x;
                yPositions[i] = ply.player.getPosition().y;
                xVelocities[i] = ply.player.getVelocity().x;
                yVelocities[i] = ply.player.getVelocity().y;
                smileyIDs[i] = ply.player.getSmileyID();
                auraIDs[i] = ply.player.getAuraID();
                golden[i] = ply.player.isGolden();
                godMode[i] = ply.player.isGodMode();
            }

            ServerPlayerListPacket serverPlayerListPacket = new ServerPlayerListPacket(nicknames, xPositions, yPositions, xVelocities, yVelocities, smileyIDs, auraIDs, golden, godMode);
            sendPacket(serverPlayerListPacket);

            ServerLoginEndPacket serverLoginEndPacket = new ServerLoginEndPacket();
            sendPacket(serverLoginEndPacket);

            addHandler(new LoginHandler());
            while (!client.isClosed()) {
                if (closeConnection) {
                    client.close();
                    break;
                }

                Packet packet = (Packet) in.readObject();
                for (NetHandler handler :
                    currentHandlers) {
                    if (handler.serverHandle(packet, this)) {
                        break;
                    }
                }
            }
            removePlayer(false, "Client left");
            log.info("Closing client");
        } catch (ClassNotFoundException e) {
            log.error("Client sent unknown class. is class corrupted? is server/client somehow outdated? WHAT IS HAPPENING?");
        } catch (SocketTimeoutException e) {
            log.info("Client {}:{} is not responding. We have to close the connection!", client.getInetAddress().getHostAddress(), client.getPort());
            try {
                client.close();
            } catch (IOException e2) {
                log.error(e2.getMessage());
            }
            removePlayer(false, "Client not responding");
        } catch (IOException e) {
            log.error(e.getMessage());
            removePlayer(false, "An unexpected IOException occurred");
        }

        log.info("Closed client connection.");
    }
    private void removePlayer(boolean suppress, String reason) {
        MainServer.getPlayers().remove(this);
        ServerPlayerLeftPacket leftPacket = new ServerPlayerLeftPacket(player.getNickname(), suppress, reason);
        MainServer.broadcast(leftPacket);
    }
}
