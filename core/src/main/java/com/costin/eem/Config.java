package com.costin.eem;

import com.badlogic.gdx.Input;

public class Config {
    public static final int WIDTH = 850, HEIGHT = 500;


    // debug
    public static final boolean ARTLAGTEST = true;
    public static final int ARTLAGTIMER = 75;

    public static final String rootFolder = "EEM_data/";
    public static final String assetFolder = rootFolder + "media/";

    // physics
    public static final float CAMERA_LAG = 1/16f;
    public static final int PHYSICS_MS_PER_TICK = 10;

    public static final double baseDrag = Math.pow(.9981, PHYSICS_MS_PER_TICK) * 1.00016093f;
    public static final double noModDrag = Math.pow(.9900, PHYSICS_MS_PER_TICK) * 1.00016093;

    // input
    public static int KEY_LEFT = Input.Keys.A;
    public static int KEY_RIGHT = Input.Keys.D;
    public static int KEY_UP = Input.Keys.W;
    public static int KEY_DOWN = Input.Keys.S;
    public static int KEY_JUMP = Input.Keys.SPACE;

    public static int KEY_LEFT_2 = Input.Keys.LEFT;
    public static int KEY_RIGHT_2 = Input.Keys.RIGHT;
    public static int KEY_UP_2 = Input.Keys.UP;
    public static int KEY_DOWN_2 = Input.Keys.DOWN;
}
