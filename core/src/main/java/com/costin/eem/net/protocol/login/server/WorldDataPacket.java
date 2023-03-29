package com.costin.eem.net.protocol.login.server;

import com.badlogic.gdx.graphics.Color;
import com.costin.eem.game.level.Block;
import com.costin.eem.net.protocol.Packet;

public class WorldDataPacket extends Packet {
    public Block[][][] layers;
    public String owner;
    public String worldName;
    public int width;
    public int height;
    public Float gravity;
    public int background;
    public String description;
    public boolean campaign;
    public String crewId;
    public String crewName;
    public int crewStatus;
    public boolean minimap;
    public String ownerID;

    public WorldDataPacket(Block[][][] layers, String owner, String worldName, int width, int height, Float gravity, Color background, String description, boolean campaign, String crewId, String crewName, int crewStatus, boolean minimap, String ownerID) {
        this.layers = layers;
        this.owner = owner;
        this.worldName = worldName;
        this.width = width;
        this.height = height;
        this.gravity = gravity;
        this.background = Color.argb8888(background);
        this.description = description;
        this.campaign = campaign;
        this.crewId = crewId;
        this.crewName = crewName;
        this.crewStatus = crewStatus;
        this.minimap = minimap;
        this.ownerID = ownerID;
    }
}
