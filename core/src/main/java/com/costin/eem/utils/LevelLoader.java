package com.costin.eem.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.costin.eem.Config;
import com.costin.eem.game.level.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class LevelLoader {

    private static final Logger log = LoggerFactory.getLogger(LevelLoader.class);

    public static String[] listSaves() {
        Gdx.files.local(Config.GameData + Config.GameSaves).mkdirs();
        FileHandle[] handles = Gdx.files.local(Config.GameData + Config.GameSaves).list(".eelvl");
        String[] saves = new String[handles.length];
        for (int i = 0; i < handles.length; i++) {
            saves[i] = handles[i].nameWithoutExtension();
        }
        return saves;
    }

    private static void readBlockData() {

    }

    public static World loadWorld(String fileName) throws IOException {
        log.info("Loading world " + fileName);

        DataInputStream data = new DataInputStream(new InflaterInputStream(Gdx.files.internal(fileName).read(), new Inflater(true)));

        /*
        byte[] bytes = data.readAllBytes();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        log.debug(sb.toString());*/

        World world = new World();

        String owner = data.readUTF();
        String worldName = data.readUTF();
        int width = data.readInt();
        int height = data.readInt();
        Float gravity = data.readFloat();
        int background = data.readInt(); //LoaderUtils.readUnsignedInt(data);
        String description = data.readUTF();
        Boolean campaign = data.readBoolean();
        String crewId = data.readUTF();
        String crewName = data.readUTF();
        int crewStatus = data.readInt();
        Boolean minimap = data.readBoolean();
        String ownerID = data.readUTF();

        world.setOwner(owner);
        world.setWorldName(worldName);
        world.setWidth(width);
        world.setHeight(height);
        world.setGravity(gravity);
        Color.argb8888ToColor(world.getBackground(), background);
        world.setDescription(description);
        world.setCampaign(campaign);
        world.setCrewId(crewId);
        world.setCrewName(crewName);
        world.setCrewStatus(crewStatus);
        world.setMinimap(minimap);
        world.setOwnerID(ownerID);

        world.printWorldInfo();

        return world;
    }

    public static class LoaderUtils {
        public static long readUnsignedInt(DataInputStream in) throws IOException {
            return Integer.toUnsignedLong(in.readInt());
        }

    }
}
