package com.costin.eem.game.level.blocks;

import com.costin.eem.game.level.Block;

public class WorldPortalBlock extends Block {
    public String targetWorld;
    public int targetSpawn;

    public WorldPortalBlock(int id, String placedBy, String targetWorld, int targetSpawn) {
        super(id, placedBy);
        this.targetWorld = targetWorld;
        this.targetSpawn = targetSpawn;
    }
}
