package com.costin.eem.net.protocol.world.client;

import com.costin.eem.net.Packet;

public class ClientPlayerMovePacket extends Packet {
    public int horizontal;
    public int vertical;
    public boolean justJumped;
    public boolean jumping;

    public ClientPlayerMovePacket(int horizontal, int vertical, boolean justJumped, boolean jumping) {
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.justJumped = justJumped;
        this.jumping = jumping;
    }
}
