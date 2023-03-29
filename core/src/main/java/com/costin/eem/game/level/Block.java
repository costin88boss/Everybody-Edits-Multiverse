package com.costin.eem.game.level;

import java.io.Serializable;

public class Block implements Serializable {
    // lazy to do all the shit in packets, so just made this serializable
    public final int id;

    public Block(int id) {
        this.id = id;
    }
}
