package com.costin.eem;

import com.badlogic.gdx.ApplicationListener;

public class Main implements ApplicationListener {

    public Main(boolean serverOnly) {
        Game.serverOnly = serverOnly;
    }

    @Override
    public void create() {
        Game.instance().create();
    }

    @Override
    public void resize(int width, int height) {
        Game.instance().resize(width, height);
    }

    @Override
    public void render() {
        Game.instance().update();
    }

    @Override
    public void pause() {
        // when window is unfocused
    }

    @Override
    public void resume() {
        // when window gets focused
    }

    @Override
    public void dispose() {
        Game.instance().dispose();
    }
}
