package com.costin.eem.game.players;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.Vector2;
import com.costin.eem.Config;
import com.costin.eem.game.world.items.manager.ItemManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Player {
    private static final Logger log = LoggerFactory.getLogger(Player.class);
    private final Vector2 pos;
    private Vector2 lastDrawPos;
    private final Vector2 vel;
    private final String nickname;
    private final int playerID;
    private int smileyID, auraID;
    private boolean isGodMode;
    private boolean isGolden;
    private Color auraColor;
    private float auraAnimationTime;

    // controls
    private boolean leftDown = false;
    private boolean rightDown = false;
    private boolean upDown = false;
    private boolean downDown = false;
    private boolean spaceDown = false;
    private boolean spaceJustDown = false;
    private boolean wasSpaceJustDown = false;

    public boolean updateControls(boolean leftDown, boolean rightDown, boolean upDown, boolean downDown, boolean spaceDown) {
        boolean updated = this.leftDown != leftDown ||
            this.rightDown != rightDown ||
            this.upDown != upDown ||
            this.downDown != downDown ||
            this.spaceDown != spaceDown;

        this.leftDown = leftDown;
        this.rightDown = rightDown;
        this.upDown = upDown;
        this.downDown = downDown;
        this.spaceDown = spaceDown;
        this.spaceJustDown = spaceDown && !wasSpaceJustDown;
        wasSpaceJustDown = spaceDown;
        return updated;
    }
    public Player(String nickname, int playerID) {
        this.nickname = nickname;
        this.playerID = playerID;
        pos = new Vector2();
        lastDrawPos = null;
        vel = new Vector2();
    }

    public boolean isGodMode() {
        return isGodMode;
    }

    public void setGodMode(boolean godMode) {
        isGodMode = godMode;
    }

    public Vector2 getPos() {
        return pos;
    }
    public void cancelInterpolation() {
        lastDrawPos = null;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPlayerID() {
        return playerID;
    }

    public Vector2 getVel() {
        return vel;
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
        return isGolden;
    }

    public void setGolden(boolean golden) {
        isGolden = golden;
    }

    public Color getAuraColor() {
        return auraColor;
    }

    public void setAuraColor(Color auraColor) {
        this.auraColor = auraColor;
    }
    public boolean updateMyPacket;
    public boolean hasMoved() {
        return !vel.isZero(); // may change for teleportation?
    }

    private final float test = 0.1f;

    public void logic(boolean isServer) {

        float modX = leftDown ? -test : rightDown ? test : 0;
        vel.x += modX;
        // TODO: 6/26/2023 improve movement
        if(vel.x != 0) {
            if(modX == 0) {
                vel.x *= Config.baseDrag;
                vel.x *= Config.noModDrag;
            } else {
                vel.x *= Config.baseDrag;
            }

            if(vel.x > 16){
                vel.x = 16;
            }else if(vel.x < -16){
                vel.x = -16;
            }else if(vel.x < 0.0001f && vel.x > -0.0001f){
                vel.x = 0;
            }
        }

        pos.x += vel.x;

        spaceJustDown = false;
    }

    public void draw(SpriteBatch batch) {
        auraAnimationTime += Gdx.graphics.getDeltaTime() * 2;

        // interpolation
        if(lastDrawPos == null) lastDrawPos = pos.cpy();

        Vector2 drawPos = lastDrawPos.cpy();
        drawPos.interpolate(pos, 0.5f, Interpolation.linear);
        lastDrawPos = drawPos.cpy();
        //log.debug(String.valueOf(1f / Gdx.graphics.getFramesPerSecond()));


        if (isGodMode) {
            if (ItemManager.instance().getAuraShapeById(auraID).draw(batch, drawPos.x, drawPos.y, isGolden, auraAnimationTime, auraColor)) {
                auraAnimationTime = 0;
            }
        }


        ItemManager.instance().getSmileyById(smileyID).draw(batch, drawPos.x, drawPos.y, isGolden, 0);
    }
}
