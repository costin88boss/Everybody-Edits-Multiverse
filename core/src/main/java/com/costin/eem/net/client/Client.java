package com.costin.eem.net.client;


import com.costin.eem.Game;
import com.costin.eem.screens.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger log = LoggerFactory.getLogger(Client.class);
    private static boolean started = false;

    public static void start() {
        if (started) throw new RuntimeException("Couldn't start client: already started");
        started = true;
        log.info("Client starting.");


    }

    public static boolean connectTo(String hostname, int port) {
        log.info("Attempting to connect to {}:{}..", hostname, port);

        Game.instance().changeScreen(Screen.Type.LOADING);



        // if failed:
        Game.instance().changeScreen(Screen.Type.MENU);
        return true;
    }
}
