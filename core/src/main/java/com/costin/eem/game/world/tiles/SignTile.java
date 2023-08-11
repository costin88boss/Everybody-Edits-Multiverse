package com.costin.eem.game.world.tiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignTile extends BaseTile {
    private static final Logger log = LoggerFactory.getLogger(SignTile.class);
    public String text;
    public int type;

    public SignTile(int id, String placedBy, String text, int type) {
        super(id, placedBy);
        this.text = text;
        this.type = type;
    }

    @Override
    public boolean tileEquals(BaseTile tile) {
        if ((tile instanceof SignTile))
            return tile.id == id && ((SignTile) tile).text.equals(text) && ((SignTile) tile).type == type;
        else return false;
    }
}
