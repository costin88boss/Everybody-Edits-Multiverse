package com.costin.eem.client.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.costin.eem.client.MainClient;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoadingScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(LoadingScreen.class);
    private Texture loadingTexture;

    private static LoadingScreen singleton;

    private LoadingScreen() {
        loadingTexture = new Texture("media/loading.png");
    }
    @Override
    public boolean keyDown(int keycode) {
        MenuScreen.instance().showInfoWindow("Join cancelled", "You have cancelled the server join.");
        if(MainServer.isRunning()) MainServer.stopServer();
        MainClient.setScreen(MenuScreen.instance());
        return false;
    }

    public static LoadingScreen instance() {
        if (singleton == null) {
            singleton = new LoadingScreen();
        }
        return singleton;
    }


    @Override
    public void start() {
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render(double elapsedTime) {
        batch.begin();
        batch.setColor(1, 1, 1, 1);
        batch.draw(loadingTexture, 0, 0);
        batch.end();
    }
}
