package com.costin.eem.net.protocol.login.server;

import com.costin.eem.net.protocol.Packet;

public class PlayerListPacket extends Packet {
    public String[] nicknames;
    public float[] xPositions;
    public float[] yPositions;
    public float[] xVelocities;
    public float[] yVelocities;
    public int[] smileyIDs;
    public int[] auraIDs;
    public boolean[] golden;
    public boolean[] godMode;

    public PlayerListPacket(String[] nicknames, float[] xPositions, float[] yPositions, float[] xVelocities, float[] yVelocities, int[] smileyIDs, int[] auraIDs, boolean[] golden, boolean[] godMode) {
        this.nicknames = nicknames;
        this.xPositions = xPositions;
        this.yPositions = yPositions;
        this.xVelocities = xVelocities;
        this.yVelocities = yVelocities;
        this.smileyIDs = smileyIDs;
        this.auraIDs = auraIDs;
        this.golden = golden;
        this.godMode = godMode;
    }
}
