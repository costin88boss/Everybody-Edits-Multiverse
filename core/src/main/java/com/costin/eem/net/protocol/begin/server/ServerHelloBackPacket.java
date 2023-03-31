package com.costin.eem.net.protocol.begin.server;

import com.costin.eem.net.Packet;

public class ServerHelloBackPacket extends Packet {
    public boolean accepted;
    public String kickReason;

    public ServerHelloBackPacket(boolean accepted, String kickReason) {
        this.accepted = accepted;
        this.kickReason = kickReason;
    }
}
