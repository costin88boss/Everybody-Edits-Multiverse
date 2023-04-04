package com.costin.eem.client.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.costin.eem.Config;
import com.costin.eem.client.LocalConnection;
import com.costin.eem.game.Player;
import com.costin.eem.game.items.ItemLayer;
import com.costin.eem.game.items.ItemManager;
import com.costin.eem.game.level.Block;
import com.costin.eem.game.level.World;
import com.costin.eem.net.protocol.world.KeepAlivePacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class WorldScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(WorldScreen.class);
    private static WorldScreen singleton;
    float keepAlive = 5;
    private Player player;
    private final ArrayList<Player> players;
    private World world;

    private WorldScreen() {
        players = new ArrayList<>();
        player = new Player();
    }

    public static WorldScreen instance() {
        if (singleton == null) {
            singleton = new WorldScreen();
        }
        return singleton;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    @Override
    public void start() {
        Gdx.input.setInputProcessor(this);
        viewport.getCamera().position.set(player.getPosition().x + 8, player.getPosition().y + 8, 0);
    }

    @Override
    public void tick() {
        keepAlive -= 1f / 60;
        if (keepAlive <= 0) {
            LocalConnection.instance().sendPacket(new KeepAlivePacket());
            keepAlive = 5;
            log.info("Keeping alive..");
        }

        player.act(false);
    }

    @Override
    public void render(float elapsedTime) {
        if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            player.horizontal = -1;
        } else if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            player.horizontal = 1;
        } else player.horizontal = 0;
        if(Gdx.input.isKeyPressed(Input.Keys.S)) {
            player.vertical = -1;
        } else if(Gdx.input.isKeyPressed(Input.Keys.W)) {
            player.vertical = 1;
        } else player.vertical = 0;
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            player.jumping = true;
        } else player.jumping = false;
        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            player.justJumped = true;
        } else player.justJumped = false;

        batch.begin();
        // (empty background) > BACKGROUND > DECORATION > FOREGROUND > (player) > ABOVE > (ui)


        // BACKGROUND
        for (int x = 0; x < world.getWidth(); x++) {
            for (int y = 0; y < world.getHeight(); y++) {
                Block block = world.getBlock(ItemLayer.BACKGROUND, x, y);
                if (block == null) {
                    batch.draw(ItemManager.instance().getBrickTextureById(0), x * 16, (world.getHeight() - y) * 16, 16, 16);
                    continue;
                }
                block.draw(batch, x, y);
            }
        }

        // BACKGROUND, DECORATION, FOREGROUND
        for (int x = 0; x < world.getWidth(); x++) {
            for (int y = 0; y < world.getHeight(); y++) {
                Block backgroundBlock = world.getBlock(ItemLayer.BACKGROUND, x, y);
                if (backgroundBlock == null) {
                    batch.draw(ItemManager.instance().getBrickTextureById(0), x * 16, (world.getHeight() - y) * 16, 16, 16);
                } else backgroundBlock.draw(batch, x, y);

                Block decorationBlock = world.getBlock(ItemLayer.DECORATION, x, y);
                if (decorationBlock != null) decorationBlock.draw(batch, x, y);

                Block foregroundBlock = world.getBlock(ItemLayer.FOREGROUND, x, y);
                if (foregroundBlock != null) foregroundBlock.draw(batch, x, y);
            }
        }

        player.draw(batch, elapsedTime);
        Vector2 camPos = new Vector2(); //new Vector2(getPosition()).lerp(new Vector2(getPosition()).add(getVelocity()), interpolation);
        camPos.set(player.getPosition());
        camPos.lerp(player.getPosition().cpy().add(player.getVelocity()), elapsedTime);
        viewport.getCamera().position.lerp(new Vector3(camPos.x + 8, camPos.y + 8, 0), Config.PlayerProperties.CAMERA_LAG);

        for (Player otherPlayer :
            players) {
            otherPlayer.draw(batch, elapsedTime);
        }

        // ABOVE
        for (int x = 0; x < world.getWidth(); x++) {
            for (int y = 0; y < world.getHeight(); y++) {
                Block block = world.getBlock(ItemLayer.ABOVE, x, y);
                if (block == null) continue;
                block.draw(batch, x, y);
            }
        }

        batch.end();
    }

    public void clearData() {
        world = null;
        players.clear();
    }
}
