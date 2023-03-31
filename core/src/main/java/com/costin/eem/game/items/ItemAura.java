package com.costin.eem.game.items;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ItemAura {
    private final int id;
    private final String name;
    private final String payvaultid;
    private final Animation<TextureRegion> anim;
    private final Animation<TextureRegion> animGold;

    public ItemAura(int id, String name, String payvaultid, TextureRegion[] textures, TextureRegion[] goldTextures, float speed) {
        this.id = id;
        this.name = name;
        this.payvaultid = payvaultid;
        if (textures != null) {
            this.anim = new Animation<>(speed, textures);
            this.anim.setPlayMode(Animation.PlayMode.LOOP);
        } else this.anim = null;
        if (goldTextures != null) {
            this.animGold = new Animation<>(speed, goldTextures);
            this.animGold.setPlayMode(Animation.PlayMode.LOOP);
        } else this.animGold = null;
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

    public boolean draw(SpriteBatch batch, float x, float y, boolean gold, float animTime, Color color) {
        x -= 64/2f - 8;
        y -= 64/2f - 8;
        batch.setColor(color);
        if (gold && animGold != null) {
            batch.draw(animGold.getKeyFrame(animTime), x, y);
            return animTime >= animGold.getAnimationDuration();
        }
        else if (anim != null) {
            batch.draw(anim.getKeyFrame(animTime), x, y);
            return animTime >= anim.getAnimationDuration();
        }
        batch.setColor(1,1,1,1);
        return true;
    }
}
