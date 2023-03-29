package com.costin.eem.client.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.costin.eem.client.MainClient;
import com.costin.eem.game.items.ItemManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SplashScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(SplashScreen.class);
    SpriteBatch batch;
    Texture titlescreen;
    boolean invert = false;

    @Override
    public void start() {
        batch = MainClient.mainBatch();
        batch.setColor(1, 1, 1, 0.0001f);
        titlescreen = new Texture("media/titlescreen.png");
        invert = false;
        ItemManager.initialize(true);
    }

    @Override
    public void tick() {

    }

    @Override
    public boolean keyDown(int keycode) {
        MainClient.setScreen(new MenuScreen());
        return false;
    }

    @Override
    public void render(double elapsedTime) {
        batch.begin();
        batch.setColor(1, 1, 1, MathUtils.lerp(0, 1, invert ? batch.getColor().a - 0.005f : batch.getColor().a + 0.025f));
        batch.draw(titlescreen, 0, 0);
        batch.end();
        if (batch.getColor().a >= 1) invert = true;
        if (batch.getColor().a <= 0) MainClient.setScreen(new MenuScreen());
    }
}
