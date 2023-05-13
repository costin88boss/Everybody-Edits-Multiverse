package com.costin.eem;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.costin.eem.net.client.Client;
import com.costin.eem.net.server.Server;
import com.costin.eem.screens.Screen;

public final class Game {
    static boolean serverOnly;
    private static Game singleton;
    private static Screen currScreen;
    private SpriteBatch batch = null;
    private AssetManager manager = null;
    private FitViewport viewport = null;
    private Texture pixel;
    private long time;

    private Game() {
    }

    public static Game instance() {
        if (singleton == null) {
            singleton = new Game();
        }
        return singleton;
    }

    void create() {
        if (!serverOnly) {
            changeScreen(Screen.Type.SPLASH);
            Client.start();
        } else {
            Server.start();
        }

        if (isServerOnly()) return;

        manager = new AssetManager();
        Screen.Type.preload();
        batch = new SpriteBatch();
        viewport = new FitViewport(Config.WIDTH, Config.HEIGHT);
        pixel = new Texture("pixel.png");
    }

    void update() {
        if ((TimeUtils.millis() - time) / Config.PHYSICS_MS_PER_TICK > 15) {
            time = TimeUtils.millis() - Config.PHYSICS_MS_PER_TICK * 15;
        }

        while (time < TimeUtils.millis()) {
            if(Server.isServerOn()) Server.logic();
            if(!serverOnly) currScreen.logic();
            time += Config.PHYSICS_MS_PER_TICK;
        }


        if (serverOnly) return;
        ScreenUtils.clear(0, 0, 0, 1);

        viewport.getCamera().update();
        viewport.apply();

        batch.setProjectionMatrix(viewport.getCamera().combined);

        //if(Server.isServerOn()) Server.render();
        if(!serverOnly) currScreen.render(batch);
    }

    void resize(int w, int h) {
        viewport.update(w, h, true);
    }

    void dispose() {
        if(Server.isServerOn()) Server.serverClose();
        if(!serverOnly) currScreen.gameClose();
    }

    public void changeScreen(Screen screen) {
        if (currScreen != null) currScreen.end();
        currScreen = screen;
        currScreen.start();
    }

    public boolean isServerOnly() {
        return serverOnly;
    }

    public Texture pixel() {
        return pixel;
    }

    public <T> void assetLoad(String fn, Class<T> type) {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        manager.load(Config.assetFolder + fn, type);
    }
    public <T> void assetRootLoad(String fn, Class<T> type) {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        manager.load(fn, type);
    }

    public <T> T assetRootGet(String fn) {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        return manager.get(fn);
    }
    public <T> T assetGet(String fn) {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        return manager.get(Config.assetFolder + fn);
    }

    public boolean assetUpdate() {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        return manager.update();
    }
    public float assetProgress() {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        return manager.getProgress();
    }
}
