package com.costin.eem.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.costin.eem.Config;
import com.costin.eem.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SplashScreen extends Screen {
    private Texture loadingTexture;
    private float timer;
    private float alpha;

    @Override
    public void preload() {
        loadingTexture = new Texture("media/titlescreen.png");
    }

    @Override
    public void postload() {
        // this method won't be called
    }

    @Override
    public void start() {
        Gdx.input.setInputProcessor(new InputAdapter());
        alpha = 1;
        timer = 2;
    }

    @Override
    public void logic() {
        if (Game.instance().assetUpdate()) {
            timer -= Gdx.graphics.getDeltaTime();
            alpha = MathUtils.clamp(timer / 2, 0, 1);

            if (timer <= 0) {
                timer = 1;
                Screen.Type.postload();
                Game.instance().changeScreen(Type.MENU);
            }
        }
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.begin();
        batch.setColor(1, 1, 1, alpha);
        batch.draw(loadingTexture, 0, 0, Config.WIDTH, Config.HEIGHT);
        batch.setColor(0, 1, 0, alpha);
        batch.draw(Game.instance().pixel(), 0, 0, Config.WIDTH * Game.instance().assetProgress(), 50);
        batch.setColor(1, 1, 1, 1);
        batch.end();
    }

    @Override
    public void end() {

    }

    @Override
    public void gameClose() {

    }
}
