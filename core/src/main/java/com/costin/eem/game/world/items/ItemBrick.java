package com.costin.eem.game.world.items;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.costin.eem.Game;
import com.costin.eem.game.world.items.manager.ItemManager;
import com.costin.eem.screens.WorldScreen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItemBrick {
    private static final Logger log = LoggerFactory.getLogger(ItemBrick.class);
    private final int id;
    private final String payvaultid;
    private final int layer;
    private final TextureRegion texture;
    private final int tab;
    private final boolean requiresOwnership;
    private final boolean requiresAdmin;
    // Requires that the item is bought. Not useable by Gold Members.
    private final boolean requiresPurchase;
    private final boolean hasShadow;
    private final String description;
    private final String[] tags;
    private final int selectorBG;
    private final int minimapColor;

    public ItemBrick(int id, int layer, TextureRegion base, String payvaultid, String description, int tab, boolean requiresOwnership, boolean requiresAdmin, boolean requiresPurchase, boolean shadow, int minimapColor, String[] tags, int selectorBG) {
        this.id = id;
        this.layer = layer;

        if (base != null) this.minimapColor = minimapColor == -1 ? generateThumbColor(base) : minimapColor;
        else this.minimapColor = 0;

        this.texture = base;
        this.payvaultid = payvaultid;
        this.description = description;
        this.tab = tab;
        this.requiresOwnership = requiresOwnership;
        this.requiresAdmin = requiresAdmin;
        this.requiresPurchase = requiresPurchase;
        this.hasShadow = shadow;
        this.tags = tags;

        this.selectorBG = selectorBG;
    }

    public ItemBrick(int id, int layer, TextureRegion base, String payvaultid, String description, int tab, boolean requiresOwnership, boolean requiresAdmin, boolean requiresPurchase, boolean shadow, int minimapColor, String[] tags) {
        this(id, layer, base, payvaultid, description, tab, requiresOwnership, requiresAdmin, requiresPurchase, shadow, minimapColor, tags, 0);
    }

    public ItemBrick(int id, int layer, TextureRegion base, String payvaultid, String description, int tab, boolean requiresOwnership, boolean requiresAdmin, boolean requiresPurchase, boolean shadow, int minimapColor) {
        this(id, layer, base, payvaultid, description, tab, requiresOwnership, requiresAdmin, requiresPurchase, shadow, minimapColor, new String[]{});
    }

    private static int generateThumbColor(TextureRegion base) {
        // might be a very bad idea to do what I did below, but since it only freezes for 2 seconds, I don't care.
        if(true) return 0;
        if (!base.getTexture().getTextureData().isPrepared()) {
            base.getTexture().getTextureData().prepare();
        }

        Pixmap pixmap = new Pixmap(base.getRegionWidth(), base.getRegionHeight(), Pixmap.Format.RGB888);
        pixmap.drawPixmap(base.getTexture().getTextureData().consumePixmap(), 0, 0, base.getRegionX(), base.getRegionY(), base.getRegionWidth(), base.getRegionHeight());

        int r = 0;
        int g = 0;
        int b = 0;
        for (int y = 0; y < base.getRegionHeight(); y++) {
            for (int x = 0; x < base.getRegionWidth(); x++) {
                int c = pixmap.getPixel(x, y);

                r += (c & 0xff0000) >> 16;
                g += (c & 0x00ff00) >> 8;
                b += (c & 0x0000ff);

            }
        }

        r /= (base.getRegionWidth() * base.getRegionHeight());
        g /= (base.getRegionWidth() * base.getRegionHeight());
        b /= (base.getRegionWidth() * base.getRegionHeight());

        pixmap.dispose();
        return 0xff000000 | (r << 16) | (g << 8) | (b);
    }

    public int getId() {
        return id;
    }

    public String getPayvaultid() {
        return payvaultid;
    }

    public int getLayer() {
        return layer;
    }

    public int getTab() {
        return tab;
    }

    public boolean requiresOwnership() {
        return requiresOwnership;
    }

    public boolean requiresAdmin() {
        return requiresAdmin;
    }

    public boolean requiresPurchase() {
        return requiresPurchase;
    }

    public boolean hasShadow() {
        return hasShadow;
    }

    public String getDescription() {
        return description;
    }

    public String[] getTags() {
        return tags;
    }

    public int getSelectorBG() {
        return selectorBG;
    }

    public int getMinimapColor() {
        return minimapColor;
    }
    public void draw(SpriteBatch batch, int rotation, float x, float y) {
        if (hasShadow) {
            Sprite shadow = new Sprite(ItemManager.instance().getBrickTextureById(id));
            shadow.setColor(0, 0, 0, 0.3f);
            shadow.setOrigin(8, 8);
            shadow.setPosition(x + 2, y - 2);
            shadow.setRotation(rotation);
            Game.instance().getShadowQueue().add(shadow);
        }

        float scX = 1;
        if(id == ItemId.COIN_GOLD || id == ItemId.COIN_BLUE) {
            scX = Game.instance().getCoinRotation();
        }

        batch.draw(ItemManager.instance().getBrickTextureById(id), x, y, 8, 8, 16, 16, scX, 1, rotation);
    }
}
