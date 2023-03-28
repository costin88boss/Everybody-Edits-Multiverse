package com.costin.eem.net.protocol.begin.server;

import com.costin.eem.net.protocol.Packet;

public class HelloBackPacket extends Packet {
    public boolean accepted;
    public String kickReason;

    public HelloBackPacket(boolean accepted, String kickReason) {
        this.accepted = accepted;
        this.kickReason = kickReason;
    }
}
