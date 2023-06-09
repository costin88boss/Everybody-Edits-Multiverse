package com.costin.eem.game.items;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ItemSmiley {
    private final int id;
    private final String name;
    private final String payvaultid;
    private final String description;
    private final TextureRegion texture;
    private final int minimapcolor;
    private final TextureRegion textureGold;

    public ItemSmiley(int id, String name, String description, TextureRegion texture, String payvaultid, int minimapcolor, TextureRegion textureGold) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.texture = texture;
        this.payvaultid = payvaultid;
        this.minimapcolor = minimapcolor;
        this.textureGold = textureGold;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPayvaultid() {
        return payvaultid;
    }

    public String getDescription() {
        return description;
    }

    public int getMinimapcolor() {
        return minimapcolor;
    }

    public void draw(SpriteBatch batch, float x, float y, boolean gold) {
        // TextureRegion region, float x, float y, float originX, float originY, float width, float height,
        //		float scaleX, float scaleY, float rotation
        x -= 5;
        y -= 5;
        if (!gold) batch.draw(texture, x, y);
        else batch.draw(textureGold, x, y);
    }
}
