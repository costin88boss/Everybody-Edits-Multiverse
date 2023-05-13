package com.costin.eem.net.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {
    private static final Logger log = LoggerFactory.getLogger(Server.class);
    private static boolean started = false;
    private static boolean active = false;
    private static int port;
    private static String worldName;

    public static boolean isServerOn() {
        return active;
    }

    public static void start() {
        if (started) throw new RuntimeException("Couldn't start server: already started");
        started = true;

        log.info("Starting server on port {}, world \"{}\".", port, worldName);
    }

    public static void setConfig(int port, String worldName) {
        if (started) throw new RuntimeException("Couldn't set config: server already started");
        Server.port = port;
        Server.worldName = worldName;
    }

    public static void logic() {

    }

    public static void serverClose() {
        log.info("Server closing.");
    }
}
