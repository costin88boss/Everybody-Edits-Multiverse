package com.costin.eem.game.items;

import java.util.ArrayList;

public class ItemBrickPackage {
    public String name;
    public String description;
    public String[] tags;
    public ArrayList<ItemBrick> bricks;

    public ItemBrickPackage(String name, String description, String[] tags) {
        this.name = name;
        this.description = description;
        this.tags = tags;
    }

    public ItemBrickPackage(String name, String description) {
        this(name, description, new String[]{});
    }

    public void addBrick(ItemBrick item) {
        bricks.add(item);
    }
}
