package com.costin.eem.game.items;

public class ItemLayer {
    public static final int FOREGROUND = 0;
    public static final int BACKGROUND = 1;
    public static final int DECORATION = 2;
    public static final int ABOVE = 3;

    // (empty background) > BACKGROUND > DECORATION > FOREGROUND > (player) > ABOVE > (ui)
}
