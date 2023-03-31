package com.costin.eem.net.handlers;

import com.badlogic.gdx.graphics.Color;
import com.costin.eem.client.LocalConnection;
import com.costin.eem.client.MainClient;
import com.costin.eem.client.screens.WorldScreen;
import com.costin.eem.game.Player;
import com.costin.eem.game.level.World;
import com.costin.eem.net.NetHandler;
import com.costin.eem.net.Packet;
import com.costin.eem.net.protocol.login.client.ClientLoginDonePacket;
import com.costin.eem.net.protocol.login.server.ServerLoginEndPacket;
import com.costin.eem.net.protocol.login.server.ServerPlayerInfoPacket;
import com.costin.eem.net.protocol.login.server.ServerPlayerListPacket;
import com.costin.eem.net.protocol.login.server.ServerWorldDataPacket;
import com.costin.eem.server.MainServer;
import com.costin.eem.server.ServerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class LoginHandler extends NetHandler {
    private static final Logger log = LoggerFactory.getLogger(LoginHandler.class);

    private ServerPlayerInfoPacket serverPlayerInfoPacket;
    private ServerPlayerListPacket serverPlayerListPacket;
    private ServerWorldDataPacket serverWorldDataPacket;

    @Override
    public void clientHandle(Packet packet, LocalConnection client) {
        if (packet instanceof ServerPlayerInfoPacket) {
            serverPlayerInfoPacket = (ServerPlayerInfoPacket) packet;
        } else if (packet instanceof ServerPlayerListPacket) {
            serverPlayerListPacket = (ServerPlayerListPacket) packet;
        } else if (packet instanceof ServerWorldDataPacket) {
            serverWorldDataPacket = (ServerWorldDataPacket) packet;
        } else if (packet instanceof ServerLoginEndPacket) {
            log.info(String.valueOf(serverPlayerListPacket.nicknames.length));

            // player info
            WorldScreen.instance().getPlayer().setNickname(serverPlayerInfoPacket.nickname);
            WorldScreen.instance().getPlayer().setX(serverPlayerInfoPacket.spawnX);
            WorldScreen.instance().getPlayer().setY(serverPlayerInfoPacket.spawnY);
            WorldScreen.instance().getPlayer().setAuraID(serverPlayerInfoPacket.auraID);
            WorldScreen.instance().getPlayer().setSmileyID(serverPlayerInfoPacket.smileyID);
            WorldScreen.instance().getPlayer().setGolden(serverPlayerInfoPacket.goldMode);

            // player list
            ArrayList<Player> players = new ArrayList<>();
            for (int i = 0; i < serverPlayerListPacket.nicknames.length; i++) {
                Player ply = new Player();
                ply.setNickname(serverPlayerListPacket.nicknames[i]);
                ply.setX(serverPlayerListPacket.xPositions[i]);
                ply.setY(serverPlayerListPacket.yPositions[i]);
                ply.setAuraID(serverPlayerListPacket.auraIDs[i]);
                ply.setSmileyID(serverPlayerListPacket.smileyIDs[i]);
                ply.setGolden(serverPlayerListPacket.golden[i]);
                ply.setGodMode(serverPlayerListPacket.godMode[i]);
                ply.setVelX(serverPlayerListPacket.xVelocities[i]);
                ply.setVelY(serverPlayerListPacket.yVelocities[i]);
                players.add(ply);
            }
            WorldScreen.instance().getPlayers().addAll(players);

            // world data
            Color worldColor = new Color();
            Color.argb8888ToColor(worldColor, serverWorldDataPacket.background);
            WorldScreen.instance().setWorld(new World(serverWorldDataPacket.layers, serverWorldDataPacket.owner, serverWorldDataPacket.worldName, serverWorldDataPacket.width, serverWorldDataPacket.height, serverWorldDataPacket.gravity, worldColor, serverWorldDataPacket.description, serverWorldDataPacket.campaign, serverWorldDataPacket.crewId, serverWorldDataPacket.crewName, serverWorldDataPacket.crewStatus, serverWorldDataPacket.minimap, serverWorldDataPacket.ownerID));

            log.info("Done logging in. sending done packet to server..");

            ClientLoginDonePacket clientLoginDonePacket = new ClientLoginDonePacket();
            client.sendPacket(clientLoginDonePacket);

            client.setHandler(new WorldHandler());
            MainClient.setScreen(WorldScreen.instance());
        }
    }

    @Override
    public void serverHandle(Packet packet, ServerConnection client) {
        if (packet instanceof ClientLoginDonePacket) {
            MainServer.getPlayers().add(client);
            client.setHandler(new WorldHandler());
        }
    }
}

