package com.costin.eem.client.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.costin.eem.client.MainClient;
import com.costin.eem.game.items.ItemManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SplashScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(SplashScreen.class);
    private final Texture titlescreen;
    private boolean invert = false;
    private float waitTime;
    private static SplashScreen singleton;

    private SplashScreen() {
        titlescreen = new Texture("media/titlescreen.png");
        ItemManager.initialize(true);
    }

    public static SplashScreen instance() {
        if (singleton == null) {
            singleton = new SplashScreen();
        }
        return singleton;
    }

    @Override
    public void start() {
        Gdx.input.setInputProcessor(this);
        batch.setColor(1, 1, 1, 0.0001f);
        invert = false;
        waitTime = 2;
    }

    @Override
    public void tick() {

    }

    @Override
    public boolean keyDown(int keycode) {
        MainClient.setScreen(MenuScreen.instance());
        return false;
    }

    @Override
    public void render(double elapsedTime) {
        batch.begin();
        if(!invert || waitTime <= 0) {
            batch.setColor(1, 1, 1, MathUtils.lerp(0, 1, invert ? batch.getColor().a - 0.025f : batch.getColor().a + 0.025f));
        } else {
            waitTime -= Gdx.graphics.getDeltaTime();
        }
        batch.draw(titlescreen, 0, 0);
        batch.end();
        if (batch.getColor().a >= 1) {
            invert = true;
        }
        if (batch.getColor().a <= 0) MainClient.setScreen(MenuScreen.instance());
    }
}
