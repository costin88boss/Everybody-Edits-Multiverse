package com.costin.eem.game.level;

import com.badlogic.gdx.graphics.Color;
import com.costin.eem.Config;
import com.costin.eem.game.items.ItemLayer;
import com.costin.eem.net.protocol.world.server.level.ServerSetBlockPacket;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class World {
    private static final Logger log = LoggerFactory.getLogger(World.class);
    private final String owner;
    private final String worldName;
    private final int width;
    private final int height;
    private final Float gravity;
    private final Color background;
    private final String description;
    private final boolean campaign;
    private final String crewId;
    private final String crewName;
    private final int crewStatus;
    private final boolean minimap;
    private final String ownerID;
    private Block[][][] layers;

    public World() {
        owner = "Null";
        worldName = "Null";
        width = 16;
        height = 16;
        gravity = 1f;
        background = new Color(Color.WHITE);
        description = "No Description";
        campaign = false;
        crewId = "";
        crewName = "";
        crewStatus = 0;
        minimap = true;
        ownerID = "Everybody Edits Multiverse";
    }

    public World(Block[][][] layers, String owner, String worldName, int width, int height, Float gravity, Color background, String description, boolean campaign, String crewId, String crewName, int crewStatus, boolean minimap, String ownerID) {
        this.layers = layers;
        this.owner = owner;
        this.worldName = worldName;
        this.width = width;
        this.height = height;
        this.gravity = gravity;
        this.background = background;
        this.description = description;
        this.campaign = campaign;
        this.crewId = crewId;
        this.crewName = crewName;
        this.crewStatus = crewStatus;
        this.minimap = minimap;
        this.ownerID = ownerID;
    }

    public void clearWorld(boolean generateEdges) {
        layers = new Block[Config.LAYERS][width][height];

        if (generateEdges) {
            for (int i = 0; i < width; i++) {
                layers[ItemLayer.FOREGROUND][i][0] = new Block(9);
                layers[ItemLayer.FOREGROUND][i][height - 1] = new Block(9);
            }
            for (int i = 0; i < height; i++) {
                layers[ItemLayer.FOREGROUND][0][i] = new Block(9);
                layers[ItemLayer.FOREGROUND][width - 1][i] = new Block(9);
            }
        }
    }

    public Block getBlock(int layer, int x, int y) {
        return layers[layer][x][y];
    }

    public boolean setBlock(int layer, int x, int y, Block newBlock, String placedBy) {
        // false = didn't set block; true = set block
        if (x >= width || y >= height || x < 0 || y < 0) {
            log.error("Out of bounds position at {} {}. max world size is 0-{} 0-{}", x, y, width - 1, height - 1);
            return false;
        }
        if (layer > layers.length || layer < 0) {
            log.error("Out of bounds layer {}. max layer size is {}", layer, layers.length);
            return false;
        }
        if (newBlock == null) {
            log.error("null block argument. cannot proceed.");
            return false;
        }
        if (layers[layer][x][y] != newBlock) {
            layers[layer][x][y] = newBlock;
            MainServer.broadcast(new ServerSetBlockPacket(newBlock, layer, x, y, placedBy));
            return true;
        } else return false;
    }

    public String getOwner() {
        return owner;
    }

    public String getWorldName() {
        return worldName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Float getGravity() {
        return gravity;
    }

    public Color getBackground() {
        return background;
    }

    public String getDescription() {
        return description;
    }

    public boolean getCampaign() {
        return campaign;
    }

    public String getCrewId() {
        return crewId;
    }

    public String getCrewName() {
        return crewName;
    }

    public int getCrewStatus() {
        return crewStatus;
    }

    public boolean getMinimap() {
        return minimap;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public Block[][][] getLayers() {
        return layers;
    }
}
