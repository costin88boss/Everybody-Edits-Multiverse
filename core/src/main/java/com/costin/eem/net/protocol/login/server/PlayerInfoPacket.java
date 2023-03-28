package com.costin.eem.net.protocol.login.server;

import com.costin.eem.net.protocol.Packet;

public class PlayerInfoPacket extends Packet {
    public String nickname;
    public float spawnX;
    public float spawnY;
    public int smileyID;
    public boolean goldMode;

    public PlayerInfoPacket(String nickname, float spawnX, float spawnY, int smileyID, boolean goldMode) {
        this.nickname = nickname;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.smileyID = smileyID;
        this.goldMode = goldMode;
    }
}
