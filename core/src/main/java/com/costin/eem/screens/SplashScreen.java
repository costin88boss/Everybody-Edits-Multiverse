package com.costin.eem.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.costin.eem.Config;
import com.costin.eem.Game;
import com.costin.eem.game.world.items.manager.ItemManager;
import com.costin.eem.net.client.GameClient;

import static com.costin.eem.Config.rootFolder;

public class SplashScreen extends Screen {
    private Texture loadingTexture;
    private boolean loadNextUpdate;
    private BitmapFont font = new BitmapFont();
    private String currentLoading = "";
    private int totalAssets;

    @Override
    public void preload() {
        loadingTexture = new Texture(rootFolder + "media/titlescreen.png");
        totalAssets = Game.instance().assetQueue();
    }

    @Override
    public void postload() {
        // this method won't be called
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
        // moved from logic to render
        if (loadNextUpdate) {
            loadNextUpdate = false;
            ItemManager.initialize(true);
            GameClient.start();
            Screen.Type.postload();
            Game.instance().changeScreen(Type.MENU);
        }

        if (Game.instance().assetUpdate()) {
            loadNextUpdate = true;
            //currentLoading = "other stuff";
        } else {
            //currentLoading = "asset " + Game.instance().assetLoaded() + "/" + totalAssets;
        }


        batch.begin();
        batch.setColor(1, 1, 1, 1);
        batch.draw(loadingTexture, 0, 0, Config.WIDTH, Config.HEIGHT);
        batch.setColor(1, 1, 1, 1);
        batch.draw(Game.instance().pixel(), 0, 0, Config.WIDTH * Game.instance().assetProgress(), 50);
        font.setColor(0, 0, 0, 1);
        font.draw(batch, "Progress: " + (Game.instance().assetProgress() * 100), 20, 40);
        font.draw(batch, "Loading " + currentLoading, 20, 20);
        batch.end();
    }

    @Override
    public void end() {

    }

    @Override
    public void gameClose() {

    }
}
