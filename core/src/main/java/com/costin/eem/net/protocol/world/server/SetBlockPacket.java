package com.costin.eem.net.protocol.world.server;

import com.costin.eem.game.level.Block;
import com.costin.eem.net.Packet;

public class SetBlockPacket extends Packet {
    public Block newBlock;
    public int layer;
    public int x;
    public int y;
    public String placedBy;

    public SetBlockPacket(Block newBlock, int layer, int x, int y, String placedBy) {
        this.newBlock = newBlock;
        this.layer = layer;
        this.x = x;
        this.y = y;
        this.placedBy = placedBy;
    }
}
