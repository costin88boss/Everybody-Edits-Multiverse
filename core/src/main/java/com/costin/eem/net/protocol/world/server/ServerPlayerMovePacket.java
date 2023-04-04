package com.costin.eem.net.protocol.world.server;

import com.costin.eem.net.Packet;

public class ServerPlayerMovePacket extends Packet {
    public String nickname;
    public int horizontal;
    public int vertical;
    public boolean justJumped;
    public boolean jumping;

    public ServerPlayerMovePacket(String nickname, int horizontal, int vertical, boolean justJumped, boolean jumping) {
        this.nickname = nickname;
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.justJumped = justJumped;
        this.jumping = jumping;
    }
}
