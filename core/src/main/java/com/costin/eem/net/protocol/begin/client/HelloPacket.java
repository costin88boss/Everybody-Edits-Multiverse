package com.costin.eem.net.protocol.begin.client;

import com.costin.eem.net.protocol.Packet;

public class HelloPacket extends Packet {
    public int clientVersion;

    public HelloPacket(int clientVersion) {
        this.clientVersion = clientVersion;
    }
}
