package com.costin.eem.net;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.EndPoint;

public class Network {
    public static final int defaultPort = 33466;

    public static void register(EndPoint endPoint) {
        Kryo kryo = endPoint.getKryo();

        // data
        kryo.register(PlayerInfo.class);
        kryo.register(PlayerInfo[].class);
        kryo.register(byte[].class);

        // client > server packets
        kryo.register(Join.class);
        kryo.register(ReadyJoin.class);
        kryo.register(LocalPlayerUpdate.class);

        // server > client packets
        kryo.register(JoinAccepted.class);
        kryo.register(NewPlayer.class);
        kryo.register(PlayerUpdate.class);
        kryo.register(PlayerMovementSync.class);
        kryo.register(PlayerLeft.class);
    }

    public static class Join {
        public String desiredNickname;
        public int desiredSmiley;
        public int desiredAura;
    }

    public static class PlayerInfo {
        public String nickname;
        public int id;
        public int smiley;
        public int aura;
        public boolean isGodMode;
        public float x, y;
    }

    public static class JoinAccepted {
        public PlayerInfo playerInfo;
        public PlayerInfo[] players;
        public byte[] worldData; // I'm too lazy to serialize 50 more classes
    }

    public static class ReadyJoin {

    }

    public static class NewPlayer {
        public PlayerInfo playerInfo;
    }

    public static class LocalPlayerUpdate {
        public boolean leftDown;
        public boolean rightDown;
        public boolean upDown;
        public boolean downDown;
        public boolean spaceDown;
    }
    public static class PlayerUpdate {

        public int playerID;
        public boolean leftDown;
        public boolean rightDown;
        public boolean upDown;
        public boolean downDown;
        public boolean spaceDown;
    }
    public static class PlayerMovementSync {
        public int playerID;
        public boolean interpolate = true;
        public float x, y;
        public float vX, vY;

    }
    public static class PlayerLeft {
        public int playerID;
        public String reason;
    }
}
