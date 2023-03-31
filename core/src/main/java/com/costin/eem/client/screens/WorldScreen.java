package com.costin.eem.client.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector3;
import com.costin.eem.Config;
import com.costin.eem.client.LocalConnection;
import com.costin.eem.game.Player;
import com.costin.eem.game.items.ItemLayer;
import com.costin.eem.game.items.ItemManager;
import com.costin.eem.game.level.Block;
import com.costin.eem.game.level.World;
import com.costin.eem.net.protocol.world.server.KeepAlivePacket;
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
        viewport.getCamera().position.set(player.getX(), player.getY(), 0);
    }

    @Override
    public void tick() {
        keepAlive -= Config.TIMERATE;
        if (keepAlive <= 0) {
            LocalConnection.instance().sendPacket(new KeepAlivePacket());
            keepAlive = 5;
        }

        player.act();
    }

    @Override
    public void render(double elapsedTime) {
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

        player.draw(batch);
        viewport.getCamera().position.lerp(new Vector3(player.getX() + 26/2f, player.getY() + 26/2f, 0), Config.camera_lag);

        for (Player otherPlayer :
            players) {
            otherPlayer.draw(batch);
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
