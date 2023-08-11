package com.costin.eem.game.world.tiles;

import java.util.Objects;

public class LabelTile extends BaseTile {
    public String text;
    public String textColor;
    public int wrapLength;

    public LabelTile(int id, String placedBy, String text, String textColor, int wrapLength) {
        super(id, placedBy);
        this.text = text;
        this.textColor = textColor;
        this.wrapLength = wrapLength;
    }

    @Override
    public boolean tileEquals(BaseTile tile) {
        if ((tile instanceof LabelTile))
            return tile.id == id && Objects.equals(((LabelTile) tile).text, text) && Objects.equals(((LabelTile) tile).textColor, textColor) && ((LabelTile) tile).wrapLength == wrapLength;
        else return false;
    }
}
