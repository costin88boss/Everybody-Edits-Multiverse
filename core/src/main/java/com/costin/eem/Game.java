package com.costin.eem;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.costin.eem.game.world.items.manager.ItemManager;
import com.costin.eem.net.client.GameClient;
import com.costin.eem.net.server.GameServer;
import com.costin.eem.screens.Screen;
import jdk.jpackage.internal.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static com.costin.eem.Config.rootFolder;

public final class Game {
    private static final Logger log = LoggerFactory.getLogger(Game.class);
    static boolean serverOnly;
    private static Game singleton;
    private static Screen currScreen;
    private SpriteBatch batch = null;
    private AssetManager manager = null;
    private FitViewport viewport = null;
    private OrthographicCamera camera = null;
    private Texture pixel;
    private Texture error;
    private long time;

    public FitViewport getViewport() {
        return viewport;
    }
    public OrthographicCamera getCamera() {
        return camera;
    }

    private Game() {
    }

    public static Game instance() {
        if (singleton == null) {
            singleton = new Game();
        }
        return singleton;
    }

    void create() {
        //com.esotericsoftware.minlog.Log.set(0);
        if (!serverOnly) {
            changeScreen(Screen.Type.SPLASH);

            manager = new AssetManager();

            ItemManager.preloadTextures();
            Screen.Type.preload();
            batch = new SpriteBatch();
            camera = new OrthographicCamera(Config.WIDTH, Config.HEIGHT);
            viewport = new FitViewport(Config.WIDTH, Config.HEIGHT, camera);
            camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
            camera.update();
            pixel = new Texture("pixel.png");
            error = new Texture("error.png");
            shadowQueue = new ArrayList<>();

        } else {
            try {
                ItemManager.initialize(false);
                GameServer.start();
            } catch (IOException e) {
                throw new RuntimeException("Couldn't start server?");
            }
        }
    }

    private int counter;
    void update() {
        if ((TimeUtils.millis() - time) / Config.PHYSICS_MS_PER_TICK > 15) {
            time = TimeUtils.millis() - Config.PHYSICS_MS_PER_TICK * 15;
        }

        while (time < TimeUtils.millis()) {
            if (GameServer.isServerOn()) GameServer.logic();
            if (!serverOnly) currScreen.logic();
            counter += Config.PHYSICS_MS_PER_TICK;
            time += Config.PHYSICS_MS_PER_TICK;
            /*
            if(counter % 100 == 0) {
                if (GameClient.clientExists()) {
                    GameClient.getEndpoint().updateReturnTripTime();
                    log.debug("[CLIENT] PING: " + GameClient.getEndpoint().getReturnTripTime());
                }
            }*/
        }

        if (serverOnly) return;

        coinRot -= Gdx.graphics.getDeltaTime() * 4;
        if(coinRot <= -1f) {
            coinRot = 1;
        }
        if(coinRot <= 0.15f && coinRot > -0.15f) {
            coinRot = -0.15f;
        }

        camera.update();
        batch.setProjectionMatrix(camera.combined);

        ScreenUtils.clear(0, 0, 0, 1);

        //if(GameServer.isServerOn()) GameServer.render();
        if (!serverOnly) currScreen.render(batch);
    }

    void resize(int w, int h) {
        viewport.update(w, h);
    }

    void dispose() {
        if (GameServer.isServerOn()) GameServer.serverClose();
        if (!serverOnly) currScreen.gameClose();
    }

    public void changeScreen(Screen screen) {
        if (currScreen != null) currScreen.end();
        currScreen = screen;
        if(Game.instance().getCamera() != null) {
            camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
        }
        currScreen.start();
    }

    private ArrayList<Sprite> shadowQueue;
    public ArrayList<Sprite> getShadowQueue() {
        return shadowQueue;
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
        return manager.update(1000);
    }

    public float assetProgress() {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        return manager.getProgress();
    }

    public int assetLoaded() {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        return manager.getLoadedAssets();
    }

    public int assetQueue() {
        if (manager == null) throw new RuntimeException("AssetManager not initialised?");
        return manager.getQueuedAssets();
    }

    FreeTypeFontGenerator fontgen_nokiafc22;
    FreeTypeFontGenerator fontgen_visitor;
    HashMap<Integer, BitmapFont> fonts_nokiafc22 = new HashMap<>();
    HashMap<Integer, BitmapFont> fonts_visitor = new HashMap<>();

    private float coinRot = 1;
    public float getCoinRotation() {
        return coinRot;
    }

    public Texture error() {
        return error;
    }

    public enum FontType {
        NOKIAFC22,
        VISITOR
    }

    public BitmapFont getFont(FontType fontType, int size) {
        BitmapFont font = null;
        switch (fontType) {
            case NOKIAFC22:
                if(fontgen_nokiafc22 == null) fontgen_nokiafc22 = new FreeTypeFontGenerator(Gdx.files.internal(rootFolder + "media/nokiafc22.ttf"));
                font = fonts_nokiafc22.get(size);
                if(font == null) {
                    FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
                    parameter.size = size;
                    fonts_nokiafc22.put(size, fontgen_nokiafc22.generateFont(parameter));
                    font = fonts_nokiafc22.get(size);
                }
                break;
            case VISITOR:
                if(fontgen_visitor == null) fontgen_visitor = new FreeTypeFontGenerator(Gdx.files.internal(rootFolder + "media/visitor.ttf"));
                font = fonts_visitor.get(size);
                if(font == null) {
                    FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
                    parameter.size = size;
                    fonts_visitor.put(size, fontgen_visitor.generateFont(parameter));
                    font = fonts_visitor.get(size);
                }
                break;
        }

        return font;
    }
}
