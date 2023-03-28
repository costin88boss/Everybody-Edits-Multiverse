package com.costin.eem.client;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.costin.eem.Config;
import com.costin.eem.client.screens.Screen;
import com.costin.eem.client.screens.SplashScreen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClient extends ApplicationAdapter {
    private static final Logger log = LoggerFactory.getLogger(MainClient.class);
    private static Screen currentScreen;
    private static Viewport viewport;
    private static SpriteBatch mainBatch;
    private long lastTime = System.nanoTime();
    private long time;

    public static SpriteBatch mainBatch() {
        return mainBatch;
    }

    public static void setScreen(Screen screen) {
        if (currentScreen != null) currentScreen.dispose();
        mainBatch.setColor(1, 1, 1, 1);
        currentScreen = screen;
        Gdx.input.setInputProcessor(currentScreen);
        currentScreen.start();
    }

    @Override
    public void create() {
        log.info("Client initializing.");
        mainBatch = new SpriteBatch();
        setScreen(new SplashScreen());
        viewport = new FitViewport(Config.WIDTH, Config.HEIGHT);
        time = System.currentTimeMillis();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
        currentScreen.resize(width, height);
    }

    @Override
    public void pause() {
        currentScreen.pause();
    }

    @Override
    public void resume() {
        currentScreen.resume();
    }

    @Override
    public void render() {
        viewport.apply(true);
        mainBatch.setProjectionMatrix(viewport.getCamera().combined);

        // update physics
        long currentTime = System.nanoTime();
        double elapsedTime = (currentTime - lastTime) / 1000000000.0;
        if (elapsedTime >= Config.TIMERATE) {
            lastTime = currentTime;
            currentScreen.tick();
        }
        ScreenUtils.clear(0, 0, 0, 1);
        currentScreen.render((float) (elapsedTime / Config.TIMERATE));
    }

    @Override
    public void dispose() {
        LocalConnection.instance().stopClient();
        currentScreen.dispose();
    }
}
