package com.costin.eem.game.world.tiles;

public class PortalTile extends NumberedTile {
    public int portalId;
    public int targetId;

    public PortalTile(int id, String placedBy, int rotation, int portalId, int targetId) {
        super(id, placedBy, rotation);
        this.portalId = portalId;
        this.targetId = targetId;
    }

    @Override
    public boolean tileEquals(BaseTile tile) {
        if ((tile instanceof PortalTile))
            return tile.id == id && ((PortalTile) tile).portalId == portalId && ((PortalTile) tile).targetId == targetId;
        else return false;
    }
}
