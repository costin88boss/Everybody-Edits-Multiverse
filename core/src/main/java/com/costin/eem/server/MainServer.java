package com.costin.eem.server;

import com.costin.eem.game.Player;
import com.costin.eem.game.level.World;
import com.costin.eem.utils.LevelLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MainServer implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(MainServer.class);
    private static MainServer singleton;
    private int port;
    private String worldName;
    private World world;
    private boolean running;
    private ServerSocket server;
    private ArrayList<Player> players;

    public MainServer(int port, String worldName) {
        this.port = port;
        this.worldName = worldName;
        new Thread(this).start();
    }

    public static MainServer instance() {
        return singleton;
    }

    public ArrayList<Player> getPlayers() {
        if (players == null) players = new ArrayList<>();
        return players;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        if (running) return;
        running = true;
        log.info("Server initializing.");
        try {
            world = LevelLoader.loadWorld(worldName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (true) return;
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        log.info("Server initialized on port {}.", port);

        while (running) {
            try {
                Socket client = server.accept();
                new Thread(new ServerConnection(client), "Client-Thread").start();
            } catch (IOException ignored) {

            }
        }
    }
}
