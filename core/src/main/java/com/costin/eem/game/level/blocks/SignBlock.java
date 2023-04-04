package com.costin.eem.game.level.blocks;

import com.costin.eem.game.level.Block;

public class SignBlock extends Block {
    public String text;
    public int type;

    public SignBlock(int id, String placedBy, String text, int type) {
        super(id, placedBy);
        this.text = text;
        this.type = type;
    }
}
