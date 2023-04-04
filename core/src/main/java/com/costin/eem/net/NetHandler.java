package com.costin.eem.net;

import com.costin.eem.client.LocalConnection;
import com.costin.eem.server.PlayerConnection;

public abstract class NetHandler {
    public abstract boolean clientHandle(Packet packet, LocalConnection client);

    public abstract boolean serverHandle(Packet packet, PlayerConnection client);
}
