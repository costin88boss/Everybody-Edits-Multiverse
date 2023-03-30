package com.costin.eem.net.handlers;

import com.costin.eem.client.LocalConnection;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.Packet;
import com.costin.eem.server.ServerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginHandler extends NetHandler {
    private static final Logger log = LoggerFactory.getLogger(LoginHandler.class);
    @Override
    public void clientHandle(Packet packet, LocalConnection client) {
        log.info("{}", packet.toString());
    }

    @Override
    public void serverHandle(Packet packet, ServerConnection server) {
        log.info("{}", packet.toString());
    }
}

