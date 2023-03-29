package com.costin.eem.game.level.blocks;

import com.costin.eem.game.level.Block;

public class RotateableBlock extends Block {
    public int rotation;

    public RotateableBlock(int id, int rotation) {
        super(id);
        this.rotation = rotation;
    }
}
