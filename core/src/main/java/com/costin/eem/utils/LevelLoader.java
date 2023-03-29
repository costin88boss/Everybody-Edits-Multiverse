package com.costin.eem.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.costin.eem.Config;
import com.costin.eem.game.items.ItemId;
import com.costin.eem.game.level.Block;
import com.costin.eem.game.level.World;
import com.costin.eem.game.level.blocks.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class LevelLoader {

    private static final Logger log = LoggerFactory.getLogger(LevelLoader.class);

    private static int[] readUShortArray(DataInputStream data) throws IOException {
        int count = data.readInt();
        int[] arr2 = new int[count/2];

        for (int i = 0; i < count / 2; i++) {
            arr2[i] = data.readUnsignedShort();
        }
        return arr2;
    }

    public static String[] listSaves() {
        Gdx.files.local(Config.GameData + Config.GameSaves).mkdirs();
        FileHandle[] handles = Gdx.files.local(Config.GameData + Config.GameSaves).list(".eelvl");
        String[] saves = new String[handles.length];
        for (int i = 0; i < handles.length; i++) {
            saves[i] = handles[i].nameWithoutExtension();
        }
        return saves;
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

        String owner = data.readUTF();
        String worldName = data.readUTF();
        int width = data.readInt();
        int height = data.readInt();
        Float gravity = data.readFloat();
        Color background = new Color();
        Color.argb8888ToColor(background, data.readInt());
        String description = data.readUTF();
        Boolean campaign = data.readBoolean();
        String crewId = data.readUTF();
        String crewName = data.readUTF();
        int crewStatus = data.readInt();
        Boolean minimap = data.readBoolean();
        String ownerID = data.readUTF();

        Block[][][] layers = new Block[Config.LAYERS][width][height];
        while (data.available() > 0) {

            int blockID = data.readInt();
            int blockLayer = data.readInt();
            int[] xPositions = readUShortArray(data);
            int[] yPositions = readUShortArray(data);

            int rotation = 0; // portal and spikes

            int portalID = 0;		 // portal, world portal spawn and music
            int portalTarget = 0;	 // portal and world portal

            String labelText;	// label
            String labelTextColor;	// label color
            int labelWrapLength;	// label wrap

            String targetWorld; // world portal

            String signText;
            int signType;

            Boolean onStatus; // On/off blocks

            String npcName; //npc
            String npcMessage1;
            String npcMessage2;
            String npcMessage3;

            Block block = new Block(blockID);

            // check if its a rotateable block (note spikes and portals are not included in the decorations)
            if (ItemId.isBlockRotateable(blockID) || ItemId.isNonRotatableHalfBlock(blockID) || ItemId.isBlockNumbered(blockID)
                || blockID == ItemId.GUITAR || blockID == ItemId.DRUMS || blockID == ItemId.PIANO
                || blockID == ItemId.SPIKE || blockID == ItemId.SPIKE_SILVER || blockID == ItemId.SPIKE_BLACK
                || blockID == ItemId.SPIKE_RED || blockID == ItemId.SPIKE_GOLD || blockID == ItemId.SPIKE_GREEN || blockID == ItemId.SPIKE_BLUE) {
                rotation = data.readInt();
                block = new RotateableBlock(blockID, rotation);
            } else if (blockID == ItemId.PORTAL || blockID == ItemId.PORTAL_INVISIBLE) {
                rotation = data.readInt();
                portalID = data.readInt();
                portalTarget = data.readInt();
                block = new PortalBlock(blockID, rotation, portalID, portalTarget);
            } else if (blockID == ItemId.TEXT_SIGN) {
                signText = data.readUTF();
                signType = data.readInt();
                block = new SignBlock(blockID, signText, signType);
            } else if (blockID == ItemId.WORLD_PORTAL) {
                targetWorld = data.readUTF();
                portalTarget = data.readInt();
                block = new WorldPortalBlock(blockID, targetWorld, portalTarget);
            } else if (blockID == ItemId.LABEL) {
                labelText = data.readUTF();
                labelTextColor = data.readUTF();
                labelWrapLength = data.readInt();
                block = new LabelBlock(blockID, labelText, labelTextColor, labelWrapLength);
            } else if (ItemId.isNPC(blockID)) {
                npcName = data.readUTF();
                npcMessage1 = data.readUTF();
                npcMessage2 = data.readUTF();
                npcMessage3 = data.readUTF();
                block = new NpcBlock(blockID, npcName, npcMessage1, npcMessage2, npcMessage3);
            }

            if(xPositions.length != yPositions.length) {
                throw new RuntimeException("Corrupt world data");
            }
            for (int i = 0; i < xPositions.length; i++) {
                layers[blockLayer][xPositions[i]][yPositions[i]] = block;
            }
        }
        return new World(layers, owner, worldName, width, height, gravity, background, description, campaign, crewId, crewName, crewStatus, minimap, ownerID);
    }

    public static class LoaderUtils {
        public static long readUnsignedInt(DataInputStream in) throws IOException {
            return Integer.toUnsignedLong(in.readInt());
        }

    }
}
