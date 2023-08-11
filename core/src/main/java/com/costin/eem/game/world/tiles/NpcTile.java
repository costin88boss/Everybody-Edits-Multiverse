package com.costin.eem.game.world.tiles;

import java.util.Objects;

public class NpcTile extends BaseTile {
    public String name;
    public String message1;
    public String message2;
    public String message3;

    public NpcTile(int id, String placedBy, String name, String message1, String message2, String message3) {
        super(id, placedBy);
        this.name = name;
        this.message1 = message1;
        this.message2 = message2;
        this.message3 = message3;
    }

    @Override
    public boolean tileEquals(BaseTile tile) {
        if ((tile instanceof NpcTile))
            return tile.id == id && Objects.equals(((NpcTile) tile).name, name) && Objects.equals(((NpcTile) tile).message1, message1) && Objects.equals(((NpcTile) tile).message2, message2) && Objects.equals(((NpcTile) tile).message3, message3);
        else return false;
    }
}
