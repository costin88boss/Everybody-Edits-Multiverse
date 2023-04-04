package com.costin.eem.net.protocol.world.server;

import com.costin.eem.net.Packet;

public class ServerPlayerLeftPacket extends Packet {
    public String nickname;
    public boolean suppressMessage;
    public String leftReason;

    public ServerPlayerLeftPacket(String nickname, boolean suppressMessage, String leftReason) {
        this.nickname = nickname;
        this.suppressMessage = suppressMessage;
        this.leftReason = leftReason;
    }
}
