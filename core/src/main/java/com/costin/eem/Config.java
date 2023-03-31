package com.costin.eem;

public class Config {

    public static final String GameData = "EEM_data/";
    public static final String GameSaves = "saves/";

    public static final int LAYERS = 4;

    public static final int VERSION = 1;

    public static final float TIMERATE = 1f / 10;
    public static final int WIDTH = 850, HEIGHT = 500;
    public static final float camera_lag = 1/16f;
    private static float currWidth, currHeight;

    public static float width() {
        return currWidth;
    }

    public static float height() {
        return currHeight;
    }

    public static void setCurrentSize(float width, float height) {
        Config.currWidth = width;
        Config.currHeight = height;
    }
}
