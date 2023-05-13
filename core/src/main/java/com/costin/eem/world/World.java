package com.costin.eem.world;

import com.badlogic.gdx.Gdx;
import com.costin.eem.world.tiles.BaseTile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class World {
    private static final Logger log = LoggerFactory.getLogger(World.class);
    // disclaimer: if blocks is null, then world is unloaded
    private BaseTile[][][] blocks; // x-y-layer
    private int worldWidth, worldHeight;


    public static void loadWorld(String fn) {
        DataInputStream data = new DataInputStream(new InflaterInputStream(Gdx.files.internal(fn).read(), new Inflater(true)));

        // TODO: 5/8/2023 this
    }

}
