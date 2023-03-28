package com.costin.eem.game.items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

public class ItemAura
{
    private final int id;
    private final String name;
    private final String payvaultid;
    private final Animation<TextureRegion> anim;
    private final Animation<TextureRegion> animGold;

    public ItemAura(int id, String name, String payvaultid, TextureRegion[] textures, TextureRegion[] goldTextures, float speed) {
        this.id = id;
        this.name = name;
        this.payvaultid = payvaultid;
        this.anim = new Animation<>(speed, textures);
        this.anim.setPlayMode(Animation.PlayMode.LOOP);
        if(goldTextures == null) this.animGold = null;
        else {
            this.animGold = new Animation<>(speed, goldTextures);
            this.animGold.setPlayMode(Animation.PlayMode.LOOP);
        }
    }

    public void draw(SpriteBatch batch, int x, int y, boolean gold, float animTime) {
        if(gold && animGold != null) batch.draw(animGold.getKeyFrame(animTime), x, y);
        else batch.draw(anim.getKeyFrame(animTime), x, y);
    }
}
