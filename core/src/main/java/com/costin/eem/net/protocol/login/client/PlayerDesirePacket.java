package com.costin.eem.net.protocol.login.client;

public class PlayerDesirePacket {
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
