package com.costin.eem.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.costin.eem.Config;
import com.costin.eem.client.LocalConnection;
import com.costin.eem.game.items.ItemManager;
import com.costin.eem.net.protocol.world.client.ClientPlayerMovePacket;
import com.costin.eem.net.protocol.world.server.ServerPlayerMovePacket;
import com.costin.eem.server.MainServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Player {
    private static final Logger log = LoggerFactory.getLogger(Player.class);
    private String nickname;
    private final Vector2 position, velocity;
    public boolean justJumped, jumping;
    public int horizontal;
    public int vertical;
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

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getVelocity() {
        return velocity;
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
    // decided to use a separate function especially because act(boolean) is called in a laggy way.

    // called by both server and client, main role being to do logic
    public void act(boolean isServer) {
        // TODO: 4/1/2023 add the 2 packets in WorldHandler and handle them when received
        if(!isServer) {
            if(horizontal != 0 || vertical != 0 || justJumped || jumping) {
                ClientPlayerMovePacket packet = new ClientPlayerMovePacket(horizontal, vertical, justJumped, jumping);
                LocalConnection.instance().sendPacket(packet);
            }
        } else {
            // don't uncomment, this should be velocity and position that should be sent instead.
            //ServerPlayerMovePacket packet = new ServerPlayerMovePacket(horizontal, vertical, justJumped, jumping);
            //MainServer.broadcast(packet);
        }
        float modX = horizontal;

        if(velocity.x != 0 || modX != 0){
            velocity.x += modX;
            //if(horizontal == 0){
                velocity.x *= Config.Physics.BASE_DRAG;
                velocity.x *= Config.Physics.NO_MODIFIER_DRAG;
            //} else velocity.x *= Config.Physics.BASE_DRAG;


            if(velocity.x > 16){
                velocity.x = 16;
            }else if(velocity.x < -16){
                velocity.x = -16;
            }else if(velocity.x < 0.0001 && velocity.x > -0.0001){
                velocity.x = 0;
            }
        }

        position.add(velocity);
    }
    public Player() {
        auraColor = Color.WHITE.cpy();
        position = new Vector2();
        velocity = new Vector2();
    }

    // never called by server. supposed to draw and control animations.
    public void draw(SpriteBatch batch, float elapsedTime) {
        auraAnimationTime += Gdx.graphics.getDeltaTime() * 2;

        if(godMode) {
          if(ItemManager.instance().getAuraShapeById(auraID).draw(batch, position.x, position.y, golden, auraAnimationTime, auraColor)) {
              auraAnimationTime = 0;
          }
        }

        // interpolation code not needed since apparently EE's timerate was actually 60 per second, not 10

        ItemManager.instance().getSmileyById(smileyID).draw(batch, position.x, position.y, golden);

    }
}
