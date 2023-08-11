package com.costin.eem.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Screen {
    Screen() {

    }

    public abstract void preload();

    public abstract void postload();

    public abstract void start();

    public abstract void logic();

    public abstract void render(SpriteBatch batch);

    public abstract void end();

    public abstract void gameClose();

    public static class Type {
        public static final SplashScreen SPLASH = new SplashScreen();
        public static final MenuScreen MENU = new MenuScreen();
        public static final WorldScreen WORLD = new WorldScreen();
        public static final LoadingScreen LOADING = new LoadingScreen();
        private static boolean preloaded, postloaded;

        public static void preload() {
            if (preloaded) return;
            preloaded = true;

            MENU.preload();
            LOADING.preload();
            WORLD.preload();

            SPLASH.preload();
        }

        public static void postload() {
            if (postloaded) return;
            postloaded = true;

            MENU.postload();
            LOADING.postload();
            WORLD.postload();
        }
    }
}
