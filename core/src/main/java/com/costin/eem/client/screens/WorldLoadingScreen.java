package com.costin.eem.client.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.costin.eem.client.MainClient;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldLoadingScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(WorldLoadingScreen.class);
    private static WorldLoadingScreen singleton;
    private final Texture loadingTexture;

    private WorldLoadingScreen() {
        loadingTexture = new Texture("media/loading.png");
    }

    public static WorldLoadingScreen instance() {
        if (singleton == null) {
            singleton = new WorldLoadingScreen();
        }
        return singleton;
    }

    @Override
    public boolean keyDown(int keycode) {
        MenuScreen.instance().showInfoWindow("Join cancelled", "You have cancelled the server join.");
        if (MainServer.isRunning()) MainServer.stopServer();
        MainClient.setScreen(MenuScreen.instance());
        return false;
    }

    @Override
    public void start() {
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render(double elapsedTime) {
        batch.begin();
        batch.draw(loadingTexture, 0, 0);
        batch.end();
    }
}
