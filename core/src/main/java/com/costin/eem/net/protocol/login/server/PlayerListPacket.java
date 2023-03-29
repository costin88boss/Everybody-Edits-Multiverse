package com.costin.eem.net.protocol.login.server;

public class PlayerListPacket {
    public String[] nicknames;
    public int[] xPositions;
    public int[] yPositions;
    public int[] smileyIDs;
    public int[] auraIDs;
    public boolean[] golden;
    public boolean[] godMode;

    public PlayerListPacket(String[] nicknames, int[] xPositions, int[] yPositions, int[] smileyIDs, int[] auraIDs, boolean[] golden, boolean[] godMode) {
        this.nicknames = nicknames;
        this.xPositions = xPositions;
        this.yPositions = yPositions;
        this.smileyIDs = smileyIDs;
        this.auraIDs = auraIDs;
        this.golden = golden;
        this.godMode = godMode;
    }
}
