package com.costin.eem.game.world.items;

public class ItemTab {
    public static final int BLOCK = 0;
    public static final int ACTION = 1;
    public static final int DECORATIVE = 2;
    public static final int BACKGROUND = 3;

    public static String[] toNamesArray(int id) {
        switch (id) {
            case BLOCK:
                return new String[]{"foreground", "block", "fg"};
            case ACTION:
                return new String[]{"action"};
            case DECORATIVE:
                return new String[]{"decoration", "decorative"};
            case BACKGROUND:
                return new String[]{"background", "bg"};
            default:
                return new String[]{};
        }
    }
}
