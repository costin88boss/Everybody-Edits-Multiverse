package com.costin.eem.client.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.costin.eem.client.MainClient;
import com.costin.eem.game.items.ItemManager;
import com.costin.eem.utils.FontManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Time;
import java.time.Instant;

public class SplashScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(SplashScreen.class);
    private static SplashScreen singleton;
    private final Texture titlescreen;
    private boolean invert = false;
    private float waitTime;

    private SplashScreen() {
        titlescreen = new Texture("media/titlescreen.png");
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

    private void loadGame() {
        if(invert) return;
        log.info("Loading game assets");
        long beginTime = System.currentTimeMillis();
        ItemManager.initialize(true);

        // initialize the screens singletons
        MenuScreen.instance();
        WorldLoadingScreen.instance();
        WorldScreen.instance();

        FontManager.instance();
        long endTime = System.currentTimeMillis();
        float takeTime = (endTime - beginTime) / 1000f;
        log.info("Game assets loaded, took {} seconds", takeTime);
    }
    @Override
    public boolean keyDown(int keycode) {
        loadGame();
        MainClient.setScreen(MenuScreen.instance());
        return false;
    }
    @Override
    public void render(double elapsedTime) {
        batch.begin();
        if (!invert || waitTime <= 0) {
            batch.setColor(1, 1, 1, MathUtils.lerp(0, 1, invert ? batch.getColor().a - 0.025f : batch.getColor().a + 0.025f));
        } else {
            waitTime -= Gdx.graphics.getDeltaTime();
        }
        batch.draw(titlescreen, 0, 0);
        batch.end();
        if (batch.getColor().a >= 1 && !invert) {
            loadGame();
            invert = true;
        }
        if (batch.getColor().a <= 0) {
            MainClient.setScreen(MenuScreen.instance());
        }
    }
}
