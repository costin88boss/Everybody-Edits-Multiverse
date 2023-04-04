package com.costin.eem.game.level.blocks;

import com.costin.eem.game.level.Block;

public class LabelBlock extends Block {
    public String text;
    public String textColor;
    public int wrapLength;

    public LabelBlock(int id, String placedBy, String text, String textColor, int wrapLength) {
        super(id, placedBy);
        this.text = text;
        this.textColor = textColor;
        this.wrapLength = wrapLength;
    }
}
