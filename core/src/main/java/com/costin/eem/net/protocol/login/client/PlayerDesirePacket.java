package com.costin.eem.net.protocol.login.client;

import com.costin.eem.net.protocol.Packet;

public class PlayerDesirePacket extends Packet {
    public String nickname;
    public int smileyID;
    public int auraID;
    public boolean goldMode;

    public PlayerDesirePacket(String nickname, int smileyID, int auraID, boolean goldMode) {
        this.nickname = nickname;
        this.smileyID = smileyID;
        this.auraID = auraID;
        this.goldMode = goldMode;
    }
}
