package com.costin.eem.net.protocol.begin.client;

import com.costin.eem.net.Packet;

public class ClientHelloPacket extends Packet {
    public int clientVersion;

    public ClientHelloPacket(int clientVersion) {
        this.clientVersion = clientVersion;
    }
}
