package com.costin.eem.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.costin.eem.Config;
import com.costin.eem.Game;
import com.costin.eem.game.world.items.ItemLayer;
import com.costin.eem.game.world.tiles.BaseTile;
import com.costin.eem.net.client.GameClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class WorldScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(WorldScreen.class);
    private InputMultiplexer multiplexer;
    private WorldScreenInput input;
    private Stage stage;

    @Override
    public void preload() {

    }

    @Override
    public void postload() {
        multiplexer = new InputMultiplexer();
        input = new WorldScreenInput();
        stage = new Stage();

        multiplexer.addProcessor(stage);
        multiplexer.addProcessor(input);
    }

    @Override
    public void start() {
        Gdx.input.setInputProcessor(multiplexer);
        Game.instance().getCamera().position.set(GameClient.getThisPlayer().getPos().x + 8, GameClient.getThisPlayer().getPos().y + 8, 0);
    }

    @Override
    public void logic() {
        input.tick();
        GameClient.getThisPlayer().logic(false);
        for (int i = 0; i < GameClient.getOtherPlayers().size(); i++) {
            GameClient.getOtherPlayers().get(i).logic(false);
        }
    }

    @Override
    public void render(SpriteBatch batch) {
        stage.act(); // can't put in logic as it's tick-based and limited

        batch.begin();

        for (int i = 0; i < GameClient.getWorld().getWidth(); i++) {
            for (int j = 0; j < GameClient.getWorld().getHeight(); j++) {
                int layer = ItemLayer.BACKGROUND;

                if(GameClient.getWorld().getTiles()[layer][i][j] == null) {
                    BaseTile.drawEmptiness(batch, i, j);
                }
            }
        }

        for (Sprite shadow :
            Game.instance().getShadowQueue()) {
            shadow.draw(batch);
        }
        Game.instance().getShadowQueue().clear();

        for (int i = 0; i < GameClient.getWorld().getWidth(); i++) {
            for (int j = 0; j < GameClient.getWorld().getHeight(); j++) {
                int layer = ItemLayer.BACKGROUND;

                if(GameClient.getWorld().getTiles()[layer][i][j] == null) {
                    continue;
                }

                GameClient.getWorld().getTiles()[layer][i][j].draw(batch, i, j);
            }
        }

        for (int i = 0; i < GameClient.getWorld().getWidth(); i++) {
            for (int j = 0; j < GameClient.getWorld().getHeight(); j++) {
                int layer = ItemLayer.DECORATION;

                if(GameClient.getWorld().getTiles()[layer][i][j] == null) continue;

                GameClient.getWorld().getTiles()[layer][i][j].draw(batch, i, j);
            }
        }

        for (int i = 0; i < GameClient.getWorld().getWidth(); i++) {
            for (int j = 0; j < GameClient.getWorld().getHeight(); j++) {
                int layer = ItemLayer.FOREGROUND;

                if(GameClient.getWorld().getTiles()[layer][i][j] == null) continue;

                GameClient.getWorld().getTiles()[layer][i][j].draw(batch, i, j);
            }
        }

        for (int i = 0; i < GameClient.getOtherPlayers().size(); i++) {
            GameClient.getOtherPlayers().get(i).draw(batch);
        }

        Vector2 camPos = new Vector2(); //new Vector2(getPosition()).lerp(new Vector2(getPosition()).add(getVelocity()), interpolation);
        camPos.set(GameClient.getThisPlayer().getPos().cpy());
        //camPos.lerp(GameClient.getThisPlayer().getPos().cpy().add(GameClient.getThisPlayer().getVel()), 0.5f);
        //Game.instance().getCamera().position.lerp(new Vector3(camPos.x + 8, camPos.y + 8, 0), Config.CAMERA_LAG);
        //Game.instance().getCamera().position.x--;

        //camPos.set(GameClient.getThisPlayer().getPos());

        //Game.instance().getCamera().position.set(camPos, 0);

        Game.instance().getCamera().position.lerp(new Vector3(camPos.x + 8, camPos.y + 8, 0), Config.CAMERA_LAG);

        //GameClient.getThisPlayer().getPos().x ++;
        GameClient.getThisPlayer().draw(batch);


        for (int i = 0; i < GameClient.getWorld().getWidth(); i++) {
            for (int j = 0; j < GameClient.getWorld().getHeight(); j++) {
                int layer = ItemLayer.ABOVE;

                if(GameClient.getWorld().getTiles()[layer][i][j] == null) continue;

                GameClient.getWorld().getTiles()[layer][i][j].draw(batch, i, j);
            }
        }

        batch.end();
        stage.draw();
    }

    @Override
    public void end() {

    }

    @Override
    public void gameClose() {

    }
}
