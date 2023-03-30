package com.costin.eem.net;

import com.costin.eem.client.LocalConnection;
import com.costin.eem.net.protocol.Packet;
import com.costin.eem.server.ServerConnection;

import java.io.IOException;

public abstract class NetHandler {
    public abstract void clientHandle(Packet packet, LocalConnection client);

    public abstract void serverHandle(Packet packet, ServerConnection server);
}
