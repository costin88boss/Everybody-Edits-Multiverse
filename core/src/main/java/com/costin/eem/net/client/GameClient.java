package com.costin.eem.net.client;


import com.costin.eem.Config;
import com.costin.eem.Game;
import com.costin.eem.game.players.Player;
import com.costin.eem.game.world.World;
import com.costin.eem.net.Network;
import com.costin.eem.screens.Screen;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

public class GameClient {
    private static final Logger log = LoggerFactory.getLogger(GameClient.class);
    static World world;
    static ArrayList<Player> otherPlayers;
    static Player thisPlayer;
    private static boolean started = false;
    private static Client endpoint;

    public static Client getEndpoint() {
        return endpoint;
    }

    public static ArrayList<Player> getOtherPlayers() {
        return otherPlayers;
    }

    public static Player getThisPlayer() {
        return thisPlayer;
    }


    public static boolean clientExists() {
        return started;
    }
    public static void start() {
        if (started) throw new RuntimeException("Couldn't start client: already started");
        started = true;
        log.info("GameClient starting.");

        endpoint = new Client() /*{
            @Override
            public int sendTCP(Object object) {
                if(Config.ARTLAGTEST) {
                    try {
                        Thread.sleep(Config.ARTLAGTIMER);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                return super.sendTCP(object);
            }
            @Override
            void notifyReceived(Object object) {

            }
        }*/;
        Network.register(endpoint);
        endpoint.addListener(new ClientListener());
        endpoint.start();
    }

    public static void connectTo(String hostname, int port) throws IOException {
        log.info("Attempting to connect to {}:{}..", hostname, port);
        Game.instance().changeScreen(Screen.Type.LOADING);
        endpoint.connect(hostname, port);
    }

    public static World getWorld() {
        return world;
    }
}
