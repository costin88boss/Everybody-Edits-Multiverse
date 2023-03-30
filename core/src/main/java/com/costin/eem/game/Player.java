package com.costin.eem.game;

import com.costin.eem.server.ServerConnection;

public class Player {
    private String nickname;
    private float x, y, velX, velY;
    private int smileyID, auraID;
    private boolean golden, godMode;


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
}
