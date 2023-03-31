package com.costin.eem.game.level;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.costin.eem.client.screens.WorldScreen;
import com.costin.eem.game.items.ItemManager;

import java.io.Serializable;

public class Block implements Serializable {
    // lazy to do all the shit in packets, so just made this serializable
    public final int id;

    public Block(int id) {
        this.id = id;
    }
    public void draw(SpriteBatch batch, int x, int y) {
        ItemManager.instance().getBrickById(id).draw(batch, 0, x * 16, (WorldScreen.instance().getWorld().getHeight() - y) * 16);
    }
}
