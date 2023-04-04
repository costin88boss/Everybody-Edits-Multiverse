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
import com.costin.eem.server.MainServer;
import com.costin.eem.utils.FontManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class MainClient extends ApplicationAdapter {
    private static final Logger log = LoggerFactory.getLogger(MainClient.class);
    private static Screen currentScreen;
    private static Viewport viewport;
    private static SpriteBatch mainBatch;
    private static volatile boolean isRunning;

    public static void setScreen(Screen screen) {
        if (currentScreen != null) {
            currentScreen.dispose();
        }
        String screenClassName = screen.getClass().getName();
        int index = screenClassName.split("\\.").length;
        screenClassName = screenClassName.split("\\.")[index - 1];
        log.info("Transitioning current screen to {}", screenClassName);
        mainBatch.setColor(1, 1, 1, 1);
        currentScreen = screen;
        currentScreen.batch = mainBatch;
        currentScreen.viewport = viewport;
        viewport.getCamera().position.set(viewport.getWorldWidth() / 2f, viewport.getWorldHeight() / 2f, 0);
        currentScreen.start();
    }

    public static boolean isRunning() {
        return isRunning;
    }
    private float time;
    private long lastTime;

    @Override
    public void create() {
        mainBatch = new SpriteBatch();
        viewport = new FitViewport(Config.WIDTH, Config.HEIGHT);
        Config.setCurrentSize(viewport.getWorldWidth(), viewport.getWorldHeight());
        setScreen(SplashScreen.instance());
        log.info("Client started");
        lastTime = System.currentTimeMillis();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, false);
        Config.setCurrentSize(viewport.getWorldWidth(), viewport.getWorldHeight());
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
        Gdx.graphics.setTitle("Everybody Edits Multiverse | " + Gdx.graphics.getFramesPerSecond());

        viewport.apply(false);
        mainBatch.setProjectionMatrix(viewport.getCamera().combined);


        long currentTime = System.currentTimeMillis();
        float elapsedTime = (currentTime - lastTime) / 1000f;
        time += elapsedTime;
        lastTime = System.currentTimeMillis();

        if(time >= 1 / 60f) {
            currentScreen.tick();
        }
        if(time >= 1) {
            time -= 1;
        }

        ScreenUtils.clear(0, 0, 0, 1);
        currentScreen.render(time);
    }

    @Override
    public void dispose() {
        isRunning = false;
        LocalConnection.instance().stopClient(); // client's networking thread
        MainServer.stopServer(); // client will start a local server when joining a world
        currentScreen.dispose();

        FontManager.instance().dispose();

        log.info("Closed main thread.");
    }
}
