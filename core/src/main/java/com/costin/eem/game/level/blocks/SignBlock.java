package com.costin.eem.game.level.blocks;

import com.costin.eem.game.level.Block;

public class SignBlock extends Block {
    public String text;
    public int type;

    public SignBlock(int id, String text, int type) {
        super(id);
        this.text = text;
        this.type = type;
    }
}
