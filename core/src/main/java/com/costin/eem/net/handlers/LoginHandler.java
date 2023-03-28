package com.costin.eem.net.handlers;

import com.costin.eem.client.LocalConnection;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.protocol.Packet;
import com.costin.eem.server.ServerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class LoginHandler extends NetHandler {
    private static final Logger log = LoggerFactory.getLogger(LoginHandler.class);

    @Override
    public void clientHandle(Packet packet, LocalConnection client) throws IOException {
        log.info("A");
    }

    @Override
    public void serverHandle(Packet packet, ServerConnection server) throws IOException {
        log.info("B");

    }
}

