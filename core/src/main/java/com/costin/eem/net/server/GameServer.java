package com.costin.eem.net.server;

import com.costin.eem.Config;
import com.costin.eem.game.world.World;
import com.costin.eem.net.Network;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class GameServer {
    private static final Logger log = LoggerFactory.getLogger(GameServer.class);
    private static boolean started = false;
    private static boolean active = false;
    private static int port = 0;
    private static String worldName = "";
    private static ArrayList<PlayerConnection> loggedPlayers;
    private static Server endpoint;
    private static World world;

    public static boolean isServerOn() {
        return active;
    }

    public static Server getEndpoint() {
        return endpoint;
    }

    public static void start() throws IOException {
        if (started) throw new RuntimeException("Couldn't start server: already started");
        if (port == 0 && worldName.equals("")) throw new RuntimeException("Didn't set config");
        started = true;
        log.info("Starting server on port {}, world \"{}\".", port, worldName);

        loggedPlayers = new ArrayList<>();
        world = World.loadWorld(worldName);

        endpoint = new Server() {
            @Override
            protected Connection newConnection() {
                return new PlayerConnection();
            }
        };
        Network.register(endpoint);
        endpoint.addListener(new ServerListener());
        endpoint.bind(Network.defaultPort);
        endpoint.start();
        active = true;
    }

    public static void setConfig(int port, String worldName) {
        if (started) throw new RuntimeException("Couldn't set config: server already started");
        GameServer.port = port;
        GameServer.worldName = worldName;
    }

    private static int counter;
    public static void logic() {
        counter += Config.PHYSICS_MS_PER_TICK;
        for (PlayerConnection loggedPlayer : loggedPlayers) {
            loggedPlayer.player.logic(true);
            if(loggedPlayer.player.hasMoved()) loggedPlayer.player.updateMyPacket = true;
            // TODO: 6/27/2023 fix interpolation to stop player from stuttering clientside
            if(counter % 250 == 0 && loggedPlayer.player.updateMyPacket) {
                loggedPlayer.player.updateMyPacket = false;
                Network.PlayerMovementSync sync = new Network.PlayerMovementSync();
                sync.playerID = loggedPlayer.player.getPlayerID();
                sync.x = loggedPlayer.player.getPos().x;
                sync.y = loggedPlayer.player.getPos().y;
                sync.vX = loggedPlayer.player.getVel().x;
                sync.vY = loggedPlayer.player.getVel().y;
                endpoint.sendToAllTCP(sync);
            }
        }
        if(counter >= 10000) counter = 0;
    }

    public static void serverClose() {
        if (!started) return;
        log.info("GameServer closing.");
        active = false;
        endpoint.stop();
        started = false;
    }

    public static Collection<PlayerConnection> getPlayers() {
        return loggedPlayers;
    }

    public static World getWorld() {
        return world;
    }

}
