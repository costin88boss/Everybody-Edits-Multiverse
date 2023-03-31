package com.costin.eem.net.protocol.world.server.level;

import com.costin.eem.game.level.Block;
import com.costin.eem.net.Packet;

public class ServerSetBlockPacket extends Packet {
    public Block newBlock;
    public int layer;
    public int x;
    public int y;
    public String placedBy;

    public ServerSetBlockPacket(Block newBlock, int layer, int x, int y, String placedBy) {
        this.newBlock = newBlock;
        this.layer = layer;
        this.x = x;
        this.y = y;
        this.placedBy = placedBy;
    }
}
