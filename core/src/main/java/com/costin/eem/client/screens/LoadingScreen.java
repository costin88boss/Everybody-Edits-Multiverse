package com.costin.eem.client.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.costin.eem.client.MainClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoadingScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(LoadingScreen.class);
    private Texture loadingTexture;
    private SpriteBatch batch;

    @Override
    public void start() {
        loadingTexture = new Texture("media/loading.png");
        batch = MainClient.mainBatch();
    }

    @Override
    public void render(double elapsedTime) {
        batch.begin();
        batch.setColor(1, 1, 1, 1);
        batch.draw(loadingTexture, 0, 0);
        batch.end();
    }
}
