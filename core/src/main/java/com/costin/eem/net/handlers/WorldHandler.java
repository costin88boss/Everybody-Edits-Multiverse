package com.costin.eem.net.handlers;

import com.costin.eem.client.LocalConnection;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.Packet;
import com.costin.eem.server.ServerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldHandler extends NetHandler {
    private static final Logger log = LoggerFactory.getLogger(WorldHandler.class);

    @Override
    public void clientHandle(Packet packet, LocalConnection client) {
    }

    @Override
    public void serverHandle(Packet packet, ServerConnection client) {

    }
}
