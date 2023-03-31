package com.costin.eem.server;

import com.costin.eem.Config;
import com.costin.eem.net.protocol.world.server.KeepAlivePacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerGameplayController implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(ServerGameplayController.class);
    private static ServerGameplayController singleton;
    private final Thread thread;
    float test = 5;
    private volatile boolean running;
    private long lastTime = System.nanoTime();
    private long time;

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
        while (running) {
            // update physics
            long currentTime = System.nanoTime();
            double elapsedTime = (currentTime - lastTime) / 1000000000.0;
            if (elapsedTime >= Config.TIMERATE) {
                lastTime = currentTime;
                tick();
            }
            //render (elapsedTime / Config.TIMERATE);
            //log.info(String.valueOf(running));
        }

        log.info("Stopped server loop.");
    }

    private void tick() {
        test -= Config.TIMERATE;
        if (test <= 0) {
            MainServer.broadcast(new KeepAlivePacket());
            test = 5;
        }
    }
}
