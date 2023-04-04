package com.costin.eem.game.level.blocks;

import com.costin.eem.game.level.Block;

public class NpcBlock extends Block {
    String name;
    String message1;
    String message2;
    String message3;

    public NpcBlock(int id, String placedBy, String name, String message1, String message2, String message3) {
        super(id, placedBy);
        this.name = name;
        this.message1 = message1;
        this.message2 = message2;
        this.message3 = message3;
    }
}
