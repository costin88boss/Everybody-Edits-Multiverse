package com.costin.eem.game.level.blocks;

public class PortalBlock extends NumberedBlock {
    public int portalId;
    public int targetId;

    public PortalBlock(int id, String placedBy, int rotation, int portalId, int targetId) {
        super(id, placedBy, rotation);
        this.portalId = portalId;
        this.targetId = targetId;
    }
}
