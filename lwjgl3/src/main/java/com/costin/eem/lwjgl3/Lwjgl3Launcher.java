package com.costin.eem.lwjgl3;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.backends.headless.HeadlessApplication;
import com.badlogic.gdx.backends.headless.HeadlessApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.costin.eem.Config;
import com.costin.eem.client.MainClient;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Lwjgl3Launcher {

    private static final Logger log = LoggerFactory.getLogger(Lwjgl3Launcher.class);

    public static void main(String[] args) {
        boolean isServer = false;
        int port = -1;
        String worldName = "";

        for (int i = 0; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("--server")) {
                isServer = true;
            }
            if (args[i].equalsIgnoreCase("-port")) {
                try {
                    port = Integer.parseInt(args[i + 1]);
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                    log.error("Could not run. reason: -port requires an integer argument. make sure to space them too.");
                    return;
                }
            }
            if (args[i].equalsIgnoreCase("-world")) {
                try {
                    worldName = args[i + 1];
                } catch (ArrayIndexOutOfBoundsException ex) {
                    log.error("Could not run. reason: -world requires a string argument of a file name. make sure to space them too.");
                    return;
                }
            }
        }

        if (isServer && Objects.equals(worldName, "")) {
            log.error("Could not run. attempting to make server with no world? use -world \"{filename}\".");
            return;
        }

        if (isServer && port == -1) {
            log.warn("port argument was not used. default port will be 33466.");
            port = 33466;
        }
        if (!isServer && port != -1) {
            log.warn("port argument was used, but --server argument wasn't used. the client will run instead.");
        }

        if (isServer) {
            log.info("Starting server..");
            createServer(port, worldName);
        } else {
            log.info("Starting client..");
            createApplication();
        }
    }

    private static void createServer(int port, String worldName) {
        HeadlessApplicationConfiguration configuration = new HeadlessApplicationConfiguration();
        try {
            new HeadlessApplication(new ApplicationAdapter() {
                @Override
                public void create() {
                    new MainServer(port, worldName);
                }
            }, configuration);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void createApplication() {
        new Lwjgl3Application(new MainClient(), getDefaultConfiguration());
    }

    private static Lwjgl3ApplicationConfiguration getDefaultConfiguration() {
        Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();
        configuration.setTitle("EverybodyEditsMultiverse");
        configuration.useVsync(true);
        //// Limits FPS to the refresh rate of the currently active monitor.
        configuration.setForegroundFPS(Lwjgl3ApplicationConfiguration.getDisplayMode().refreshRate);
        //// If you remove the above line and set Vsync to false, you can get unlimited FPS, which can be
        //// useful for testing performance, but can also be very stressful to some hardware.
        //// You may also need to configure GPU drivers to fully disable Vsync; this can cause screen tearing.
        configuration.setWindowedMode(Config.WIDTH, Config.HEIGHT);
        configuration.setWindowIcon("icon.png");
        return configuration;
    }
}
