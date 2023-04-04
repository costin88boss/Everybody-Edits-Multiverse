package com.costin.eem.server;

import com.costin.eem.Config;
import com.costin.eem.net.protocol.world.KeepAlivePacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerGameplayController implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(ServerGameplayController.class);
    private static ServerGameplayController singleton;
    private final Thread thread;
    float keepAlive = 5;
    private volatile boolean running;
    private float time;
    private long lastTime;

    private ServerGameplayController() {
        thread = new Thread(this);
    }

    public static ServerGameplayController instance() {
        if (singleton == null) {
            singleton = new ServerGameplayController();
        }
        return singleton;
    }

    public void start() {
        if (!thread.isAlive()) {
            running = true;
            thread.start();
        }
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        lastTime = System.currentTimeMillis();
        while (running) {
            // update physics
            long currentTime = System.currentTimeMillis();
            float elapsedTime = (currentTime - lastTime) / 1000f;
            time += elapsedTime;
            lastTime = System.currentTimeMillis();

            if(time >= 1 / 60f) {
                tick();
            }
            if(time >= 1) {
                time -= 1;
            }

            //render (elapsedTime / Config.TIMERATE);
        }

        log.info("Stopped server loop.");
    }

    private void tick() {
        keepAlive -= 1f / 60;
        if (keepAlive <= 0) {
            MainServer.broadcast(new KeepAlivePacket());
            keepAlive = 5;
        }

        for (PlayerConnection connection:
             MainServer.getPlayers()) {
            connection.getPlayer().act(true);
        }
    }
}
