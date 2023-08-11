package com.costin.eem.net.client;

import com.costin.eem.Config;
import com.costin.eem.Game;
import com.costin.eem.game.players.Player;
import com.costin.eem.game.world.World;
import com.costin.eem.net.Network;
import com.costin.eem.screens.Screen;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.FrameworkMessage;
import com.esotericsoftware.kryonet.Listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

public class ClientListener implements Listener {
    private static final Logger log = LoggerFactory.getLogger(ClientListener.class);
    private final TypeListener typeListener;

    private int testPing;

    public ClientListener() {
        typeListener = new TypeListener();
        initializeTypeHandlers();
    }

    private void initializeTypeHandlers() {
        typeListener.addTypeHandler(Network.JoinAccepted.class, (con, obj) -> {
            GameClient.thisPlayer = new Player(obj.playerInfo.nickname, obj.playerInfo.id);
            GameClient.getThisPlayer().setSmileyID(obj.playerInfo.smiley);
            GameClient.getThisPlayer().setAuraID(obj.playerInfo.aura);
            GameClient.getThisPlayer().getPos().x = obj.playerInfo.x;
            GameClient.getThisPlayer().getPos().y = obj.playerInfo.y;
            GameClient.getThisPlayer().setGodMode(obj.playerInfo.isGodMode);

            GameClient.otherPlayers = new ArrayList<>();

            for (Network.PlayerInfo plyInfo :
                obj.players) {
                Player ply = new Player(plyInfo.nickname, plyInfo.id);
                ply.setSmileyID(plyInfo.smiley);
                ply.setAuraID(plyInfo.aura);
                ply.getPos().x = plyInfo.x;
                ply.getPos().y = plyInfo.y;
                ply.setGodMode(plyInfo.isGodMode);

                GameClient.getOtherPlayers().add(ply);
            }

            try {
                GameClient.world = World.loadWorld(obj.worldData);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            con.sendTCP(new Network.ReadyJoin());

            Game.instance().changeScreen(Screen.Type.WORLD);
        });
        typeListener.addTypeHandler(Network.NewPlayer.class, (con, obj) -> {
            Player newPlayer = new Player(obj.playerInfo.nickname, obj.playerInfo.id);
            newPlayer.setSmileyID(obj.playerInfo.smiley);
            newPlayer.setAuraID(obj.playerInfo.aura);
            newPlayer.getPos().x = obj.playerInfo.x;
            newPlayer.getPos().y = obj.playerInfo.y;
            newPlayer.setGodMode(obj.playerInfo.isGodMode);

            log.info("New player connected: " + newPlayer.getNickname());
            GameClient.getOtherPlayers().add(newPlayer);
        });
        typeListener.addTypeHandler(Network.PlayerUpdate.class, (con, obj) -> {
            for (Player otherPlayer : GameClient.getOtherPlayers()) {
                if(otherPlayer.getPlayerID() == obj.playerID) {
                    otherPlayer.updateControls(obj.leftDown, obj.rightDown, obj.upDown, obj.downDown, obj.spaceDown);
                }
            }
        });
        typeListener.addTypeHandler(Network.PlayerMovementSync.class, (con, obj) -> {
            for (Player otherPlayer : GameClient.getOtherPlayers()) {
                if (otherPlayer.getPlayerID() == obj.playerID) {
                    if(!obj.interpolate) otherPlayer.cancelInterpolation();
                    otherPlayer.getPos().set(obj.x, obj.y);
                    otherPlayer.getVel().set(obj.vX, obj.vY);
                    return;
                }
            }
            if(obj.playerID == GameClient.getThisPlayer().getPlayerID()) {
                if(!obj.interpolate) GameClient.getThisPlayer().cancelInterpolation();
                GameClient.getThisPlayer().getPos().set(obj.x, obj.y);
                GameClient.getThisPlayer().getVel().set(obj.vX, obj.vY);
            }
        });
        typeListener.addTypeHandler(Network.PlayerLeft.class, (con, obj) -> {
            GameClient.getOtherPlayers().removeIf(otherPlayer -> otherPlayer.getPlayerID() == obj.playerID);
            //obj.reason
        });
    }

    @Override
    public void received(Connection c, Object o) {
        typeListener.received(c, o);
    }

    @Override
    public void idle(Connection connection) {
    }

    @Override
    public void connected(Connection c) {
        Network.Join join = new Network.Join();
        join.desiredNickname = "Guy";
        join.desiredSmiley = 0;
        join.desiredAura = 0;
        c.sendTCP(join);
    }

    @Override
    public void disconnected(Connection c) {
        log.info("Disconnecting from server");
        Screen.Type.MENU.showInfoWindow("Disconnected", "Server has either closed or you have lost connection.");
        Game.instance().changeScreen(Screen.Type.MENU);
    }
}
