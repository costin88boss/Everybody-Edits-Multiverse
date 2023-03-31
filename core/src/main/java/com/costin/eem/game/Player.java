package com.costin.eem.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.costin.eem.Config;
import com.costin.eem.game.items.ItemManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Player {
    private static final Logger log = LoggerFactory.getLogger(Player.class);
    private String nickname;
    private float x, y, velX, velY;
    private int smileyID, auraID;
    private boolean golden, godMode;
    private Color auraColor;
    private float auraAnimationTime;

    public Color getAuraColor() {
        return auraColor;
    }

    public void setAuraColor(Color auraColor) {
        this.auraColor = auraColor;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public int getSmileyID() {
        return smileyID;
    }

    public void setSmileyID(int smileyID) {
        this.smileyID = smileyID;
    }

    public int getAuraID() {
        return auraID;
    }

    public void setAuraID(int auraID) {
        this.auraID = auraID;
    }

    public boolean isGolden() {
        return golden;
    }

    public void setGolden(boolean golden) {
        this.golden = golden;
    }

    public boolean isGodMode() {
        return godMode;
    }

    public void setGodMode(boolean godMode) {
        this.godMode = godMode;
    }

    public void act() {

    }
    public Player() {
        auraColor = Color.WHITE.cpy();
    }

    public void draw(SpriteBatch batch) {
        auraAnimationTime += Gdx.graphics.getDeltaTime() * 2;

        auraID = 12;
        //if(godMode) {
            if(ItemManager.instance().getAuraShapeById(auraID).draw(batch, x, y, golden, auraAnimationTime, auraColor)) {
                auraAnimationTime = 0;
            }
        //}
        ItemManager.instance().getSmileyById(smileyID).draw(batch, x, y, golden);

    }
}
