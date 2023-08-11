package com.costin.eem.net.server;

import com.costin.eem.game.players.Player;
import com.costin.eem.game.world.items.manager.ItemManager;
import com.costin.eem.net.Network;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class ServerListener implements Listener {
    private static final Logger log = LoggerFactory.getLogger(ServerListener.class);
    private final TypeListener typeListener;

    public ServerListener() {
        typeListener = new TypeListener();
        initializeTypeHandlers();
    }

    private void initializeTypeHandlers() {
        typeListener.addTypeHandler(Network.Join.class, (c, obj) -> {
            PlayerConnection con = (PlayerConnection) c;

            if (con.player != null) {
                log.warn("Logged in user {} unexpectedly sent a Join packet.", con.player.getNickname());
                if(!GameServer.getPlayers().contains(con)) {
                    con.close();
                }
                return;
            }

            if (obj.desiredNickname.length() > 16 || obj.desiredNickname.length() == 0 || obj.desiredAura < 0 || obj.desiredAura >= ItemManager.instance().getAuraCount() || obj.desiredSmiley >= ItemManager.instance().getSmileyCount() || !obj.desiredNickname.matches("[A-Za-z0-9]+")) {
                con.close(); // fuck you
                return;
            }

            con.player = new Player(obj.desiredNickname, c.getID());
            con.player.setAuraID(obj.desiredAura);
            con.player.setSmileyID(obj.desiredSmiley);

            con.player.getPos().set(16, GameServer.getWorld().getHeight() * 16 - 32 - 128);

            Network.JoinAccepted joinAccepted = new Network.JoinAccepted();
            joinAccepted.playerInfo = new Network.PlayerInfo();

            joinAccepted.playerInfo.id = con.player.getPlayerID();
            joinAccepted.playerInfo.smiley = con.player.getSmileyID();
            joinAccepted.playerInfo.nickname = con.player.getNickname();
            joinAccepted.playerInfo.smiley = con.player.getSmileyID();
            joinAccepted.playerInfo.aura = con.player.getAuraID();
            joinAccepted.playerInfo.x = con.player.getPos().x;
            joinAccepted.playerInfo.y = con.player.getPos().y;
            joinAccepted.playerInfo.isGodMode = con.player.isGodMode();

            Collection<PlayerConnection> plyConnections = GameServer.getPlayers();

            joinAccepted.players = new Network.PlayerInfo[plyConnections.size()];

            int i = 0;
            for (PlayerConnection plyConnection :
                plyConnections) {
                joinAccepted.players[i] = new Network.PlayerInfo();
                joinAccepted.players[i].id = plyConnection.player.getPlayerID();
                joinAccepted.players[i].nickname = plyConnection.player.getNickname();
                joinAccepted.players[i].smiley = plyConnection.player.getSmileyID();
                joinAccepted.players[i].aura = plyConnection.player.getAuraID();
                log.info("sending x " + plyConnection.player.getPos().x);
                joinAccepted.players[i].x = plyConnection.player.getPos().x;
                joinAccepted.players[i].y = plyConnection.player.getPos().y;
                joinAccepted.players[i].isGodMode = plyConnection.player.isGodMode();
                i++;
            }

            joinAccepted.worldData = GameServer.getWorld().getWorldAsBytes();

            con.sendTCP(joinAccepted);
        });
        typeListener.addTypeHandler(Network.ReadyJoin.class, (c, obj) -> {
            PlayerConnection con = (PlayerConnection) c;

            if (con.player == null) {
                con.close();
                return;
            }

            if (GameServer.getPlayers().contains(con)) {
                log.warn("Logged in user {} unexpectedly sent a ReadyJoin packet.", con.player.getNickname());
                return;
            }

            GameServer.getPlayers().add(con);
            Network.NewPlayer newPlayer = new Network.NewPlayer();
            newPlayer.playerInfo = new Network.PlayerInfo();
            newPlayer.playerInfo.id = con.player.getPlayerID();
            newPlayer.playerInfo.nickname = con.player.getNickname();
            newPlayer.playerInfo.aura = con.player.getAuraID();
            newPlayer.playerInfo.smiley = con.player.getSmileyID();
            newPlayer.playerInfo.isGodMode = con.player.isGodMode();
            newPlayer.playerInfo.x = con.player.getPos().x;
            newPlayer.playerInfo.y = con.player.getPos().y;
            GameServer.getEndpoint().sendToAllExceptTCP(con.getID(), newPlayer);
        });
        typeListener.addTypeHandler(Network.LocalPlayerUpdate.class, (c, obj) -> {
            PlayerConnection con = (PlayerConnection) c;

            if (con.player == null) {
                con.close();
                return;
            }

            if (!GameServer.getPlayers().contains(con)) {
                log.warn("New user {} unexpectedly sent a LocalPlayerUpdate packet.", con.player.getNickname());
                return;
            }

            con.player.updateControls(obj.leftDown, obj.rightDown, obj.upDown, obj.downDown, obj.spaceDown);
            Network.PlayerUpdate update = new Network.PlayerUpdate();
            update.playerID = con.player.getPlayerID();
            update.leftDown = obj.leftDown;
            update.rightDown = obj.rightDown;
            update.upDown = obj.upDown;
            update.downDown = obj.downDown;
            update.spaceDown = obj.spaceDown;
            GameServer.getEndpoint().sendToAllExceptTCP(con.getID(), update);
        });
    }

    @Override
    public void received(Connection c, Object o) {
        typeListener.received(c, o);
    }

    @Override
    public void idle(Connection c) {
        PlayerConnection con = (PlayerConnection) c;

    }

    @Override
    public void connected(Connection c) {
        PlayerConnection con = (PlayerConnection) c;

    }

    @Override
    public void disconnected(Connection c) {
        PlayerConnection con = (PlayerConnection) c;

        removePlayer(con, "disconnected");
    }
    // made this function planning to have the disconnecting player "notify" the server why it's leaving. the only reason would be simply disconnecting.
    private void removePlayer(PlayerConnection con, String reason) {
        if(GameServer.getPlayers().remove(con)) {
            Network.PlayerLeft packet = new Network.PlayerLeft();
            packet.playerID = con.player.getPlayerID();
            packet.reason = reason;
            GameServer.getEndpoint().sendToAllExceptTCP(con.getID(), packet);
        }
    }
}
