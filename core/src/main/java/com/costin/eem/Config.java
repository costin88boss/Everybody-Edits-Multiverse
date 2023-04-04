package com.costin.eem;

public class Config {
    private Config() {}
    public static final String GameData = "EEM_data/";
    public static final String GameSaves = "saves/";

    public static final int LAYERS = 4;

    public static final int VERSION = 1;

    public static final int WIDTH = 850, HEIGHT = 500;
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

    public static class PlayerProperties {
        private PlayerProperties() {}
        public static final float CAMERA_LAG = 1/16f;
}
    public static class Physics {
        private Physics() {}
        public static final float PHYSICS_MS_PER_TICK = 10; //10; // this is in milliseconds

        public static final float VARIABLE_MULTIPLIER = 7.752f;

        public static final float BASE_DRAG = (float) (Math.pow(.9981, PHYSICS_MS_PER_TICK) * 1.00016093);
        public static final float ICE_NO_MOD_DRAG = (float) (Math.pow(.9993, PHYSICS_MS_PER_TICK) * 1.00016093);
        public static final float ICE_DRAG = (float) (Math.pow(.9998, PHYSICS_MS_PER_TICK) * 1.00016093);
        //Multiplyer when not applying force by userkeys
        public static final float NO_MODIFIER_DRAG = (float) (Math.pow(.9900, PHYSICS_MS_PER_TICK) * 1.00016093);
        public static final float WATER_DRAG = (float) (Math.pow(.9950, PHYSICS_MS_PER_TICK) * 1.00016093);
        public static final float MUD_DRAG = (float) (Math.pow(.9750, PHYSICS_MS_PER_TICK) * 1.00016093);
        public static final float LAVA_DRAG = (float) (Math.pow(.9800, PHYSICS_MS_PER_TICK) * 1.00016093);
        public static final float TOXIC_DRAG = (float) (Math.pow(.9900, PHYSICS_MS_PER_TICK) * 1.00016093);
        public static final float JUMP_HEIGHT = 26;

        public static final float GRAVITY = 2;
        public static final float BOOST = 16;
        public static final float WATER_BUOYANCY = -.5f;
        public static final float MUD_BUOYANCY = .4f;
        public static final float LAVA_BUOYANCY = .2f;
        public static final float TOXIC_BUOYANCY = -.4f;

        public static final int QUEUE_LENGTH = 2;
    }
}
