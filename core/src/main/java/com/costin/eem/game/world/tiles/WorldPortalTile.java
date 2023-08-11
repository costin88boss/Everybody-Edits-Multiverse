package com.costin.eem.game.world.tiles;

public class WorldPortalTile extends BaseTile {
    public String targetWorld;
    public int targetSpawn;

    public WorldPortalTile(int id, String placedBy, String targetWorld, int targetSpawn) {
        super(id, placedBy);
        this.targetWorld = targetWorld;
        this.targetSpawn = targetSpawn;
    }

    @Override
    public boolean tileEquals(BaseTile tile) {
        if ((tile instanceof WorldPortalTile))
            return tile.id == id && ((WorldPortalTile) tile).targetSpawn == targetSpawn && ((WorldPortalTile) tile).targetWorld.equals(targetWorld);
        else return false;
    }
}
