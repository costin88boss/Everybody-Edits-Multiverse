package com.costin.eem.net.handlers;

import com.costin.eem.client.LocalConnection;
import com.costin.eem.client.screens.WorldScreen;
import com.costin.eem.game.Player;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.Packet;
import com.costin.eem.net.protocol.world.level.SetBlockPacket;
import com.costin.eem.net.protocol.world.server.ServerPlayerJoinPacket;
import com.costin.eem.net.protocol.world.server.ServerPlayerLeftPacket;
import com.costin.eem.server.PlayerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class WorldHandler extends NetHandler {
    private static final Logger log = LoggerFactory.getLogger(WorldHandler.class);

    @Override
    public boolean clientHandle(Packet packet, LocalConnection client) {
       if(packet instanceof SetBlockPacket) {
           SetBlockPacket p = (SetBlockPacket) packet;
           WorldScreen.instance().getWorld().setBlock(p.layer, p.x, p.y, p.newBlock, p.placedBy);
           return true;
       }
        return false;
    }

    @Override
    public boolean serverHandle(Packet packet, PlayerConnection client) {


        return false;
    }
}
