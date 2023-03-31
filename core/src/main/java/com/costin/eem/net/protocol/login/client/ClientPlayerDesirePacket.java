package com.costin.eem.net.protocol.login.client;

import com.costin.eem.net.Packet;

public class ClientPlayerDesirePacket extends Packet {
    public String nickname;
    public int smileyID;
    public int auraID;
    public boolean goldMode;

    public ClientPlayerDesirePacket(String nickname, int smileyID, int auraID, boolean goldMode) {
        this.nickname = nickname;
        this.smileyID = smileyID;
        this.auraID = auraID;
        this.goldMode = goldMode;
    }
}
