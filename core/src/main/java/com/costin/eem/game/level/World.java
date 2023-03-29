package com.costin.eem.game.level;

import com.badlogic.gdx.graphics.Color;
import com.costin.eem.Config;
import com.costin.eem.net.protocol.world.server.SetBlockPacket;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class World {
    private static final Logger log = LoggerFactory.getLogger(World.class);
    private Block[][][] layers;
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

    public void clearWorld() {
        layers = new Block[Config.LAYERS][width][height];

        // TODO: 3/29/2023 clear world thing
    }
    private Block[][] getLayer(int layer) {
        return layers[layer];
    }
    public boolean setBlock(int layer, int x, int y, Block newBlock, String placedBy) {
        // false = didn't set block; true = set block
        if(x >= width || y >= height || x < 0 || y < 0) {
            log.error("Out of bounds position at {} {}. max world size is 0-{} 0-{}", x, y, width-1, height-1);
            return false;
        }
        if(layer > layers.length || layer < 0) {
            log.error("Out of bounds layer {}. max layer size is {}", layer, layers.length);
            return false;
        }
        if(newBlock == null) {
            log.error("null block argument. cannot proceed.");
            return false;
        }
        if(layers[layer][x][y] != newBlock) {
            layers[layer][x][y] = newBlock;
            MainServer.broadcast(new SetBlockPacket(newBlock, layer, x, y, placedBy));
            return true;
        }
        else return false;
    }
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
    public Block[][][] getBlockData() {
        return layers;
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
    public void printWorldInfo() {
        log.info("=== World Info ===");
        log.info("owner => " + owner);
        log.info("worldName => " + worldName);
        log.info("width => " + width);
        log.info("height => " + height);
        log.info("gravity => " + gravity);
        log.info("background => " + background);
        log.info("description => " + description);
        log.info("campaign => " + campaign);
        log.info("crewId => " + crewId);
        log.info("crewName => " + crewName);
        log.info("crewStatus => " + crewStatus);
        log.info("minimap => " + minimap);
        log.info("ownerID => " + ownerID);
        log.info("=== World Info ===");
    }

}
