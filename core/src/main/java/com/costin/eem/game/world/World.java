package com.costin.eem.game.world;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.costin.eem.Config;
import com.costin.eem.game.world.items.ItemId;
import com.costin.eem.game.world.items.ItemLayer;
import com.costin.eem.game.world.tiles.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class World {
    private static final Logger log = LoggerFactory.getLogger(World.class);
    // disclaimer: if blocks is null, then world is unloaded
    private BaseTile[][][] tiles; // layer-x-y
    private String owner;
    private String worldName;
    private int width;
    private int height;
    private float gravity;
    private Color background;
    private String description;
    private boolean campaign;
    private String crewId;
    private String crewName;
    private int crewStatus;
    private boolean minimap;
    private String ownerID;
    private String worldFile = "";

    private World() {

    }

    private static void writeUShortArray(DataOutputStream data, List<Integer> ushorts) throws IOException {
        data.writeInt(ushorts.size() * 2);
        for (int ushort :
            ushorts) {
            data.writeShort(ushort);
        }
    }

    private static int[] readUShortArray(DataInputStream data) throws IOException {
        int count = data.readInt();
        int[] arr2 = new int[count / 2];

        for (int i = 0; i < count / 2; i++) {
            arr2[i] = data.readUnsignedShort();
        }
        return arr2;
    }

    public static World loadWorld(byte[] rawData) throws IOException {
        DataInputStream data = new DataInputStream(new InflaterInputStream(new ByteArrayInputStream(rawData), new Inflater(true)));

        World world = new World();

        world.owner = data.readUTF();
        world.worldName = data.readUTF();
        world.width = data.readInt();
        world.height = data.readInt();
        world.gravity = data.readFloat();
        world.background = new Color();
        Color.argb8888ToColor(world.background, data.readInt());
        world.description = data.readUTF();
        world.campaign = data.readBoolean();
        world.crewId = data.readUTF();
        world.crewName = data.readUTF();
        world.crewStatus = data.readInt();
        world.minimap = data.readBoolean();
        world.ownerID = data.readUTF();

        BaseTile[][][] layers = new BaseTile[ItemLayer.maxLayers][world.width][world.height];

        String placedBy = "World";

        while (data.available() > 0) {

            int blockID = data.readInt();
            int blockLayer = data.readInt();

            int[] xPositions = readUShortArray(data);
            int[] yPositions = readUShortArray(data);

            int rotation = 0; // portal and spikes

            int portalID = 0;         // portal, world portal spawn and music
            int portalTarget = 0;     // portal and world portal

            String labelText;    // label
            String labelTextColor;    // label color
            int labelWrapLength;    // label wrap

            String targetWorld; // world portal

            String signText;
            int signType;

            String npcName; //npc
            String npcMessage1;
            String npcMessage2;
            String npcMessage3;

            BaseTile block = new BaseTile(blockID, placedBy);

            // check if it's a rotateable block (note spikes and portals are not included in the decorations)
            if (ItemId.isBlockRotateable(blockID) || ItemId.isNonRotatableHalfBlock(blockID) || ItemId.isBlockNumbered(blockID)
                || blockID == ItemId.GUITAR || blockID == ItemId.DRUMS || blockID == ItemId.PIANO
                || blockID == ItemId.SPIKE || blockID == ItemId.SPIKE_SILVER || blockID == ItemId.SPIKE_BLACK
                || blockID == ItemId.SPIKE_RED || blockID == ItemId.SPIKE_GOLD || blockID == ItemId.SPIKE_GREEN || blockID == ItemId.SPIKE_BLUE) {
                rotation = data.readInt();
                block = new NumberedTile(blockID, placedBy, rotation);
            } else if (blockID == ItemId.PORTAL || blockID == ItemId.PORTAL_INVISIBLE) {
                rotation = data.readInt();
                portalID = data.readInt();
                portalTarget = data.readInt();
                block = new PortalTile(blockID, placedBy, rotation, portalID, portalTarget);
            } else if (blockID == ItemId.TEXT_SIGN) {
                signText = data.readUTF();
                signType = data.readInt();
                block = new SignTile(blockID, placedBy, signText, signType);
            } else if (blockID == ItemId.WORLD_PORTAL) {
                targetWorld = data.readUTF();
                portalTarget = data.readInt();
                block = new WorldPortalTile(blockID, placedBy, targetWorld, portalTarget);
            } else if (blockID == ItemId.LABEL) {
                labelText = data.readUTF();
                labelTextColor = data.readUTF();
                labelWrapLength = data.readInt();
                block = new LabelTile(blockID, placedBy, labelText, labelTextColor, labelWrapLength);
            } else if (ItemId.isNPC(blockID)) {
                npcName = data.readUTF();
                npcMessage1 = data.readUTF();
                npcMessage2 = data.readUTF();
                npcMessage3 = data.readUTF();
                block = new NpcTile(blockID, placedBy, npcName, npcMessage1, npcMessage2, npcMessage3);
            }

            if (xPositions.length != yPositions.length) {
                throw new RuntimeException("Corrupt world data");
            }
            for (int i = 0; i < xPositions.length; i++) {
                layers[blockLayer][xPositions[i]][yPositions[i]] = block;
            }

            log.debug("Block info: " + blockID + "|" + blockLayer + "|" + rotation + "|" + block);
        }

        world.tiles = layers;
        return world;
    }

    public static World loadWorld(String fn) throws IOException {
        World world = loadWorld(Gdx.files.internal(fn).readBytes());
        world.worldFile = fn;
        return world;
    }

    public static String[] listSaves() {
        FileHandle[] list = Gdx.files.internal(Config.rootFolder + "saves/").list();
        String[] saves = new String[list.length];

        for (int i = 0; i < list.length; i++) {
            saves[i] = list[i].nameWithoutExtension();
        }
        return saves;
    }

    public boolean saveAs(String fn) {
        byte[] data = getWorldAsBytes();
        File file = Gdx.files.internal(fn).file();
        try {
            file.delete();
            if (file.createNewFile()) {
                FileOutputStream stream = new FileOutputStream(file);
                stream.write(data);
                stream.flush();
                stream.close();
            } else return false;
        } catch (IOException e) {
            return false;
        }
        return false;
    }

    public boolean saveWorld() {
        if (worldFile.equals("")) return false;
        return saveAs(worldFile);
    }

    public byte[] getWorldAsBytes() {
        try {
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            DataOutputStream data = new DataOutputStream(byteArrayStream);

            data.writeUTF(owner);
            data.writeUTF(worldName);
            data.writeInt(width);
            data.writeInt(height);
            data.writeFloat(gravity);
            data.writeInt(Color.argb8888(background));
            data.writeUTF(description);
            data.writeBoolean(campaign);
            data.writeUTF(crewId);
            data.writeUTF(crewName);
            data.writeInt(crewStatus);
            data.writeBoolean(minimap);
            data.writeUTF(ownerID);

            ArrayList<ArrayList<TileArr>> orderedTiles = new ArrayList<>();
            for (int i = 0; i < ItemLayer.maxLayers; i++) {
                orderedTiles.add(new ArrayList<>());
            }

            for (int layer = 0; layer < tiles.length; layer++) {
                for (int x = 0; x < tiles[layer].length; x++) {
                    for (int y = 0; y < tiles[layer][x].length; y++) {
                        BaseTile tile_ = tiles[layer][x][y];
                        if (tile_ == null) continue;
                        int blockID = tile_.id;
                        String placedBy = "";

                        TileArr tileArr = null;

                        int tileIndex = -1;

                        for (int i = 0; i < orderedTiles.get(layer).size(); i++) {
                            tileArr = orderedTiles.get(layer).get(i);
                            if (tileArr.tile.equals(tile_)) {
                                tileIndex = i;
                                break;
                            }
                        }

                        if (tileIndex == -1) {
                            tileArr = new TileArr(new BaseTile(blockID, placedBy));

                            int rotation = 0; // portal and spikes

                            int portalID = 0;         // portal, world portal spawn and music
                            int portalTarget = 0;     // portal and world portal

                            String labelText;    // label
                            String labelTextColor;    // label color
                            int labelWrapLength;    // label wrap

                            String targetWorld; // world portal

                            String signText;
                            int signType;

                            String npcName; //npc
                            String npcMessage1;
                            String npcMessage2;
                            String npcMessage3;

                            // check if it's a rotateable block (note spikes and portals are not included in the decorations)
                            if (ItemId.isBlockRotateable(blockID) || ItemId.isNonRotatableHalfBlock(blockID) || ItemId.isBlockNumbered(blockID)
                                || blockID == ItemId.GUITAR || blockID == ItemId.DRUMS || blockID == ItemId.PIANO
                                || blockID == ItemId.SPIKE || blockID == ItemId.SPIKE_SILVER || blockID == ItemId.SPIKE_BLACK
                                || blockID == ItemId.SPIKE_RED || blockID == ItemId.SPIKE_GOLD || blockID == ItemId.SPIKE_GREEN || blockID == ItemId.SPIKE_BLUE) {
                                rotation = ((NumberedTile) tile_).rotation;
                                tileArr.tile = new NumberedTile(blockID, placedBy, rotation);
                            } else if (blockID == ItemId.PORTAL || blockID == ItemId.PORTAL_INVISIBLE) {
                                rotation = ((PortalTile) tile_).rotation;
                                portalID = ((PortalTile) tile_).portalId;
                                portalTarget = ((PortalTile) tile_).targetId;
                                tileArr.tile = new PortalTile(blockID, placedBy, rotation, portalID, portalTarget);
                            } else if (blockID == ItemId.TEXT_SIGN) {
                                signText = ((SignTile) tile_).text;
                                signType = ((SignTile) tile_).type;
                                tileArr.tile = new SignTile(blockID, placedBy, signText, signType);
                            } else if (blockID == ItemId.WORLD_PORTAL) {
                                targetWorld = ((WorldPortalTile) tile_).targetWorld;
                                portalTarget = ((WorldPortalTile) tile_).targetSpawn;
                                tileArr.tile = new WorldPortalTile(blockID, placedBy, targetWorld, portalTarget);
                            } else if (blockID == ItemId.LABEL) {
                                labelText = ((LabelTile) tile_).text;
                                labelTextColor = ((LabelTile) tile_).textColor;
                                labelWrapLength = ((LabelTile) tile_).wrapLength;
                                tileArr.tile = new LabelTile(blockID, placedBy, labelText, labelTextColor, labelWrapLength);
                            } else if (ItemId.isNPC(blockID)) {
                                npcName = ((NpcTile) tile_).name;
                                npcMessage1 = ((NpcTile) tile_).message1;
                                npcMessage2 = ((NpcTile) tile_).message2;
                                npcMessage3 = ((NpcTile) tile_).message3;
                                tileArr.tile = new NpcTile(blockID, placedBy, npcName, npcMessage1, npcMessage2, npcMessage3);
                            }
                            orderedTiles.get(layer).add(tileArr);
                        }

                        tileArr.xPos.add(x);
                        tileArr.yPos.add(y);
                    }
                }
            }

            for (int layer = 0; layer < orderedTiles.size(); layer++) {
                for (int i = 0; i < orderedTiles.get(layer).size(); i++) {
                    TileArr tileArr = orderedTiles.get(layer).get(i);
                    int blockID = tileArr.tile.id;

                    data.writeInt(tileArr.tile.id);
                    data.writeInt(layer);
                    writeUShortArray(data, tileArr.xPos);
                    writeUShortArray(data, tileArr.yPos);

                    // check if it's a rotateable block (note spikes and portals are not included in the decorations)
                    if (ItemId.isBlockRotateable(blockID) || ItemId.isNonRotatableHalfBlock(blockID) || ItemId.isBlockNumbered(blockID)
                        || blockID == ItemId.GUITAR || blockID == ItemId.DRUMS || blockID == ItemId.PIANO
                        || blockID == ItemId.SPIKE || blockID == ItemId.SPIKE_SILVER || blockID == ItemId.SPIKE_BLACK
                        || blockID == ItemId.SPIKE_RED || blockID == ItemId.SPIKE_GOLD || blockID == ItemId.SPIKE_GREEN || blockID == ItemId.SPIKE_BLUE) {
                        data.writeInt(((NumberedTile) tileArr.tile).rotation);
                    } else if (blockID == ItemId.PORTAL || blockID == ItemId.PORTAL_INVISIBLE) {
                        data.writeInt(((PortalTile) tileArr.tile).rotation);
                        data.writeInt(((PortalTile) tileArr.tile).portalId);
                        data.writeInt(((PortalTile) tileArr.tile).targetId);
                    } else if (blockID == ItemId.TEXT_SIGN) {
                        data.writeUTF(((SignTile) tileArr.tile).text);
                        data.writeInt(((SignTile) tileArr.tile).type);
                    } else if (blockID == ItemId.WORLD_PORTAL) {
                        data.writeUTF(((WorldPortalTile) tileArr.tile).targetWorld);
                        data.writeInt(((WorldPortalTile) tileArr.tile).targetSpawn);
                    } else if (blockID == ItemId.LABEL) {
                        data.writeUTF(((LabelTile) tileArr.tile).text);
                        data.writeUTF(((LabelTile) tileArr.tile).textColor);
                        data.writeInt(((LabelTile) tileArr.tile).wrapLength);
                    } else if (ItemId.isNPC(blockID)) {
                        data.writeUTF(((NpcTile) tileArr.tile).name);
                        data.writeUTF(((NpcTile) tileArr.tile).message1);
                        data.writeUTF(((NpcTile) tileArr.tile).message2);
                        data.writeUTF(((NpcTile) tileArr.tile).message3);
                    }
                }
            }
            data.flush();
            byte[] stuff = byteArrayStream.toByteArray();
            data.close();

            byteArrayStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayStream, new Deflater(Deflater.DEFAULT_COMPRESSION, true));

            deflaterOutputStream.write(stuff);
            deflaterOutputStream.flush();
            deflaterOutputStream.finish();
            byte[] output = byteArrayStream.toByteArray();
            deflaterOutputStream.close();

            return output;
        } catch (IOException ex) {
            return new byte[]{};
        }
    }

    public int getHeight() {
        return tiles[0][0].length;
    }
    public int getWidth() {
        return tiles[0].length;
    }

    public BaseTile[][][] getTiles() {
        return tiles;
    }

    private static class TileArr {
        public BaseTile tile;
        public ArrayList<Integer> xPos;
        public ArrayList<Integer> yPos;

        public TileArr(BaseTile tile) {
            this.tile = tile;
            xPos = new ArrayList<>();
            yPos = new ArrayList<>();
        }
    }
}
