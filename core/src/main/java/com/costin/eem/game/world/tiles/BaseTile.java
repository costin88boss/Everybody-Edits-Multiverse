package com.costin.eem.game.world.tiles;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.costin.eem.game.world.items.manager.ItemManager;
import com.costin.eem.net.client.GameClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTile {
    private static final Logger log = LoggerFactory.getLogger(BaseTile.class);
    public final int id;
    public final String placedBy;

    public BaseTile(int id, String placedBy) {
        this.id = id;
        this.placedBy = placedBy;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof BaseTile)) return false;
        return tileEquals((BaseTile) obj);
    }

    public boolean tileEquals(BaseTile tile) {
        return tile.id == id;
    }
    public void draw(SpriteBatch batch, int x, int y) {
        ItemManager.instance().getBrickById(id).draw(batch, 0, x * 16, (GameClient.getWorld().getHeight() - y - 1) * 16);
    }

    public static void drawEmptiness(SpriteBatch batch, int x, int y) {
        ItemManager.instance().getBrickById(0).draw(batch, 0, x * 16, (GameClient.getWorld().getHeight() - y - 1) * 16);
    }
}
