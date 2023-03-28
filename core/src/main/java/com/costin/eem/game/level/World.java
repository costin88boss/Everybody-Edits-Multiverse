package com.costin.eem.game.level;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class World {
    private static final Logger log = LoggerFactory.getLogger(World.class);
    private final ArrayList<HashMap<Integer, ArrayList<Vector2>>> layers = new ArrayList<>();
    String owner;
    String worldName;
    int width;
    int height;
    Float gravity;
    Color background;
    String description;
    boolean campaign;
    String crewId;
    String crewName;
    int crewStatus;
    boolean minimap;
    String ownerID;


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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Float getGravity() {
        return gravity;
    }

    public void setGravity(Float gravity) {
        this.gravity = gravity;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCampaign() {
        return campaign;
    }

    public void setCampaign(boolean campaign) {
        this.campaign = campaign;
    }

    public String getCrewId() {
        return crewId;
    }

    public void setCrewId(String crewId) {
        this.crewId = crewId;
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public int getCrewStatus() {
        return crewStatus;
    }

    public void setCrewStatus(int crewStatus) {
        this.crewStatus = crewStatus;
    }

    public boolean getMinimap() {
        return minimap;
    }

    public void setMinimap(boolean minimap) {
        this.minimap = minimap;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
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
