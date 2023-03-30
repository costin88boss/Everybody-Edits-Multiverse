package com.costin.eem.server;

import com.costin.eem.game.items.ItemManager;
import com.costin.eem.game.level.World;
import com.costin.eem.net.Packet;
import com.costin.eem.utils.LevelLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MainServer implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(MainServer.class);
    private static int port;
    private static String worldName;
    private static World world;
    private volatile static boolean running;
    private static ServerSocket server;
    private static ArrayList<ServerConnection> players;
    public static World getWorld() {
        return world;
    }

    public MainServer(int port, String worldName) {
        MainServer.port = port;
        MainServer.worldName = worldName;
        new Thread(this).start();
    }
    private MainServer() {}
    public static boolean broadcast(Packet packet) {
        if(server != null && running) {
            for (ServerConnection playerConnection :
                players) {
                try {
                    playerConnection.sendPacket(packet);
                } catch (IOException e) {
                    log.error("Could not send {} to {}", packet, playerConnection.getPlayer().getNickname());
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isRunning() {
        return running;
    }

    public static void stopServer() {
        if(!running) return;
        running = false;
        try {
            server.close();
        } catch (IOException ignored) {

        }
    }

    @Override
    public void run() {
        if (running) return;
        running = true;
        log.info("Server initializing.");

        ItemManager.initialize(false);

        try {
            world = LevelLoader.loadWorld(worldName);
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        log.info("Server initialized on port {}.", port);

        while (running) {
            try {
                Socket client = server.accept();
                new Thread(new ServerConnection(client)).start();
            } catch (IOException ignored) {

            }
        }
        try {
            server.close();
        } catch (IOException ignored) {}
        for (ServerConnection player :
            players) {
            player.closeConnection();
        }

        log.info("Closed Server.");

    }
    public static ArrayList<ServerConnection> getPlayers() {
        if (players == null) players = new ArrayList<>();
        return players;
    }
}
