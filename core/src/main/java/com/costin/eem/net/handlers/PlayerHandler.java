package com.costin.eem.net.handlers;

import com.costin.eem.client.LocalConnection;
import com.costin.eem.client.MainClient;
import com.costin.eem.client.screens.WorldScreen;
import com.costin.eem.game.Player;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.Packet;
import com.costin.eem.net.protocol.world.client.ClientPlayerMovePacket;
import com.costin.eem.net.protocol.world.server.ServerPlayerJoinPacket;
import com.costin.eem.net.protocol.world.server.ServerPlayerLeftPacket;
import com.costin.eem.net.protocol.world.server.ServerPlayerMovePacket;
import com.costin.eem.server.MainServer;
import com.costin.eem.server.PlayerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.Optional;

public class PlayerHandler extends NetHandler {
    private static final Logger log = LoggerFactory.getLogger(PlayerHandler.class);
    @Override
    public boolean clientHandle(Packet packet, LocalConnection client) {
        if(packet instanceof ServerPlayerJoinPacket) {
            ServerPlayerJoinPacket p = (ServerPlayerJoinPacket) packet;
            Player ply = new Player();
            ply.setNickname(p.nickname);
            ply.getPosition().set(p.spawnX, p.spawnY);
            ply.setAuraID(p.auraID);
            ply.setSmileyID(p.smileyID);
            ply.setGolden(p.goldMode);
            WorldScreen.instance().getPlayers().add(ply);
            log.info("Player {} joined, at pos {} {}", ply.getNickname(), ply.getPosition().x, ply.getPosition().y);
            return true;
        }
        if(packet instanceof ServerPlayerLeftPacket) {
            ServerPlayerLeftPacket p = (ServerPlayerLeftPacket) packet;
            if(!WorldScreen.instance().getPlayers().removeIf(player -> Objects.equals(player.getNickname(), p.nickname))) {
                throw new RuntimeException("Player left, but we have no one to remove? did server do a mistake?");
            }
            log.info("Player {} left", p.nickname);
            // TODO: 4/1/2023 Send in chat p.leftReason if p.suppressMessage is false
            return true;
        }
        if(packet instanceof ServerPlayerMovePacket) {
            ServerPlayerMovePacket p = (ServerPlayerMovePacket) packet;
            log.info("BBBBBBBBBBBBBBBBBBBB");
            if(p.nickname.equals(WorldScreen.instance().getPlayer().getNickname())) return true;
            Optional<Player> opt = WorldScreen.instance().getPlayers().stream().filter(player -> player.getNickname().equals(p.nickname)).findFirst();
            if(!opt.isPresent()) return true;
            Player target = opt.get();
            target.horizontal = p.horizontal;
            target.vertical = p.vertical;
            target.jumping = p.jumping;
            target.justJumped = p.justJumped;
            return true;
        }
        return false;
    }

    @Override
    public boolean serverHandle(Packet packet, PlayerConnection client) {
        if(packet instanceof ClientPlayerMovePacket) {
            ClientPlayerMovePacket p = (ClientPlayerMovePacket) packet;
            client.getPlayer().horizontal = p.horizontal;
            client.getPlayer().vertical = p.vertical;
            client.getPlayer().justJumped = p.justJumped;
            client.getPlayer().jumping = p.jumping;
            MainServer.broadcast(new ServerPlayerMovePacket(client.getPlayer().getNickname(), p.horizontal, p.vertical, p.justJumped, p.jumping));
        }
        return false;
    }
}
