package com.costin.eem.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.costin.eem.Game;

public class LoadingScreen extends Screen {

    Texture loadingTx;

    @Override
    public void preload() {
        Game.instance().assetLoad("loading.png", Texture.class);
    }

    @Override
    public void postload() {
        loadingTx = Game.instance().assetGet("loading.png");
    }

    @Override
    public void start() {
        Gdx.input.setInputProcessor(new InputAdapter());
    }

    @Override
    public void logic() {

    }

    @Override
    public void render(SpriteBatch batch) {
        batch.begin();
        batch.draw(loadingTx, 0, 0);
        batch.end();
    }

    @Override
    public void end() {

    }

    @Override
    public void gameClose() {

    }
}
