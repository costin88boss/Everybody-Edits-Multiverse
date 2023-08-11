package com.costin.eem.game.world.items.manager;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.costin.eem.Game;
import com.costin.eem.game.world.items.*;

import java.util.ArrayList;

public class ItemManager {
    static ItemManager singleton;
    final ArrayList<ItemSmiley> smilies = new ArrayList<>();
    final ArrayList<ItemAura> auraShapes = new ArrayList<>();
    final ArrayList<ItemNpc> npcs = new ArrayList<>();
    final ArrayList<ItemBrickPackage> brickPackages = new ArrayList<>();
    //Quick lookup for drawing system!
    final TextureRegion[] brickTextures = new TextureRegion[4001];
    final ItemBrick[] bricks = new ItemBrick[4001];
    int highestBrickID;
    boolean texturesPreloaded;
    boolean texturesPostloaded;
    // Misc
    Texture smileysBMD;
    Texture smileyPlatinumSpenderBMD;
    Texture aurasBMD;
    Texture aurasOrnateBMD;
    Texture aurasBubbleBMD;
    Texture aurasGalaxyBMD;
    Texture shopBMD;
    Texture shopWorldsBMD;
    Texture shopAurasBMD;
    Texture favoriteBMD;
    Texture likeBMD;
    Texture allParticles;
    Texture graphicsPreviewBG;
    // Blocks
    Texture blocksBMD;
    Texture decoBlocksBMD;
    Texture bgBlocksBMD;
    Texture specialBlocksBMD;
    Texture shadowBlocksBMD;
    Texture mudBlocksBMD;
    Texture npcBlocksBMD;
    Texture doorBlocksBMD;

    // ===========
    Texture effectBlocksBMD;
    Texture teamBlocksBMD;
    Texture completeBlocksBMD;
    Texture blockNumbersBMD;
    Texture blocksFireworksBMD;
    Texture blocksGoldenEasterEggBMD;
    int normalAuraCount;

    ItemManager() {
    }

    public static ItemManager instance() {
        if (singleton == null) {
            throw new RuntimeException("ItemManager not initialized. use initialize() to initialize.");
        }
        return singleton;
    }

    public static void preloadTextures() {
        singleton = new ItemManager();
        // Misc

        Game.instance().assetLoad("smileys.png", Texture.class);
        Game.instance().assetLoad("smileys_platinumspender.png", Texture.class);
        Game.instance().assetLoad("auras.png", Texture.class);
        Game.instance().assetLoad("auras_ornate.png", Texture.class);
        Game.instance().assetLoad("auras_bubble.png", Texture.class);
        Game.instance().assetLoad("auras_galaxy.png", Texture.class);
        Game.instance().assetLoad("shop.png", Texture.class);
        Game.instance().assetLoad("shop_worlds.png", Texture.class);
        Game.instance().assetLoad("shop_auras.png", Texture.class);
        Game.instance().assetLoad("favorite.png", Texture.class);
        Game.instance().assetLoad("like.png", Texture.class);
        Game.instance().assetLoad("particles.png", Texture.class);
        Game.instance().assetLoad("graphicsPreviewBG.png", Texture.class);

        // Blocks
        Game.instance().assetLoad("blocks.png", Texture.class);
        Game.instance().assetLoad("blocks_deco.png", Texture.class);
        Game.instance().assetLoad("blocks_bg.png", Texture.class);
        Game.instance().assetLoad("blocks_special.png", Texture.class);
        Game.instance().assetLoad("blocks_shadow.png", Texture.class);
        Game.instance().assetLoad("blocks_mud.png", Texture.class);
        Game.instance().assetLoad("blocks_npc.png", Texture.class);
        Game.instance().assetLoad("blocks_door.png", Texture.class);
        Game.instance().assetLoad("blocks_effect.png", Texture.class);
        Game.instance().assetLoad("blocks_team.png", Texture.class);
        Game.instance().assetLoad("blocks_complete.png", Texture.class);
        Game.instance().assetLoad("block_numbers.png", Texture.class);
        Game.instance().assetLoad("blocks_fireworks.png", Texture.class);
        Game.instance().assetLoad("blocks_goldeneasteregg.png", Texture.class);

        singleton.texturesPreloaded = true;
    }

    public static void initialize(boolean withTextures) {
        if (singleton == null) singleton = new ItemManager();

        if (withTextures) {
            // Misc
            singleton.smileysBMD = Game.instance().assetGet("smileys.png");
            singleton.smileyPlatinumSpenderBMD = Game.instance().assetGet("smileys_platinumspender.png");
            singleton.aurasBMD = Game.instance().assetGet("auras.png");
            singleton.aurasOrnateBMD = Game.instance().assetGet("auras_ornate.png");
            singleton.aurasBubbleBMD = Game.instance().assetGet("auras_bubble.png");
            singleton.aurasGalaxyBMD = Game.instance().assetGet("auras_galaxy.png");
            singleton.shopBMD = Game.instance().assetGet("shop.png");
            singleton.shopWorldsBMD = Game.instance().assetGet("shop_worlds.png");
            singleton.shopAurasBMD = Game.instance().assetGet("shop_auras.png");
            singleton.favoriteBMD = Game.instance().assetGet("favorite.png");
            singleton.likeBMD = Game.instance().assetGet("like.png");
            singleton.allParticles = Game.instance().assetGet("particles.png");
            singleton.graphicsPreviewBG = Game.instance().assetGet("graphicsPreviewBG.png");

            // Blocks
            singleton.blocksBMD = Game.instance().assetGet("blocks.png");
            singleton.decoBlocksBMD = Game.instance().assetGet("blocks_deco.png");
            singleton.bgBlocksBMD = Game.instance().assetGet("blocks_bg.png");
            singleton.specialBlocksBMD = Game.instance().assetGet("blocks_special.png");
            singleton.shadowBlocksBMD = Game.instance().assetGet("blocks_shadow.png");
            singleton.mudBlocksBMD = Game.instance().assetGet("blocks_mud.png");
            singleton.npcBlocksBMD = Game.instance().assetGet("blocks_npc.png");
            singleton.doorBlocksBMD = Game.instance().assetGet("blocks_door.png");
            singleton.effectBlocksBMD = Game.instance().assetGet("blocks_effect.png");
            singleton.teamBlocksBMD = Game.instance().assetGet("blocks_team.png");
            singleton.completeBlocksBMD = Game.instance().assetGet("blocks_complete.png");
            singleton.blockNumbersBMD = Game.instance().assetGet("block_numbers.png");
            singleton.blocksFireworksBMD = Game.instance().assetGet("blocks_fireworks.png");
            singleton.blocksGoldenEasterEggBMD = Game.instance().assetGet("blocks_goldeneasteregg.png");

            singleton.texturesPostloaded = true;
        }
        ItemManagerInit.initializeManager();
    }


    ItemBrick createBrick(int id, int layer, Texture base, String payvaultid, String description, int tab, boolean requiresOwnership, boolean shadow, int artoffset, int minimapColor, String[] tags, boolean requiresAdmin, boolean requiresPurchase, int selectorBG) {
        ItemBrick brick;
        if (texturesPostloaded) {
            TextureRegion brickTexture = new TextureRegion(base, 16 * artoffset, 0, 16, 16);

            brickTextures[id] = brickTexture;

            brick = new ItemBrick(id, layer, brickTexture, payvaultid, description, tab, requiresOwnership, requiresAdmin, requiresPurchase, shadow, minimapColor, tags, selectorBG);
        } else
            brick = new ItemBrick(id, layer, null, payvaultid, description, tab, requiresOwnership, requiresAdmin, requiresPurchase, shadow, minimapColor, tags, selectorBG);

        if (bricks[id] != null) throw new RuntimeException("Block ID:" + id + " is already in use");

        bricks[id] = brick;
        if (highestBrickID < id) highestBrickID = id;

        return brick;
    }

    ItemBrick createBrick(int id, int layer, Texture base, String payvaultid, String description, int tab, boolean requiresOwnership, boolean shadow, int artoffset, int minimapColor, String[] tags, boolean requiresAdmin, boolean requiresPurchase) {
        return createBrick(id, layer, base, payvaultid, description, tab, requiresOwnership, shadow, artoffset, minimapColor, tags, requiresAdmin, requiresPurchase, 0);
    }

    ItemBrick createBrick(int id, int layer, Texture base, String payvaultid, String description, int tab, boolean requiresOwnership, boolean shadow, int artoffset, int minimapColor, String[] tags, boolean requiresAdmin) {
        return createBrick(id, layer, base, payvaultid, description, tab, requiresOwnership, shadow, artoffset, minimapColor, tags, requiresAdmin, false);
    }

    ItemBrick createBrick(int id, int layer, Texture base, String payvaultid, String description, int tab, boolean requiresOwnership, boolean shadow, int artoffset, int minimapColor, String[] tags) {
        return createBrick(id, layer, base, payvaultid, description, tab, requiresOwnership, shadow, artoffset, minimapColor, tags, false);
    }

    ItemBrick createBrick(int id, int layer, Texture base, String payvaultid, String description, int tab, boolean requiresOwnership, boolean shadow, int artoffset, int minimapColor) {
        return createBrick(id, layer, base, payvaultid, description, tab, requiresOwnership, shadow, artoffset, minimapColor, null);
    }

    void addNpc(int id, String payvaultid, ItemBrickPackage pack, int frames, String[] tags, float rate, int bubbleOffset) {
        // TODO: 3/28/2023 NPCs
        if (texturesPostloaded) {

        }

    }

    void addNpc(int id, String payvaultid, ItemBrickPackage pack, int frames, String[] tags, float rate) {
        addNpc(id, payvaultid, pack, frames, tags, rate, 0);
    }

    void addNpc(int id, String payvaultid, ItemBrickPackage pack, int frames, String[] tags) {
        addNpc(id, payvaultid, pack, frames, tags, 6.5f);
    }

    void addAura(int id, String name, Texture base, String payvaultid, int frames, float speed, boolean generate) {
        // "createRotationAnimation" is always false in original code, so I deleted it.

        if (texturesPostloaded) {
            TextureRegion auraTextureFrames;
            TextureRegion goldAuraTextureFrames;
            boolean aurasPNG = false;
            if (base.getHeight() == 128 && base.getWidth() == 3392) {
                aurasPNG = true;
                // fix this shitty thing
            }

            if (generate) {
                auraTextureFrames = new TextureRegion(base, aurasPNG ? 64 * normalAuraCount : 0, 0, 64 * frames, 64);
                goldAuraTextureFrames = new TextureRegion(base, aurasPNG ? 64 * normalAuraCount : 64, 64, 64 * frames, 64);
            } else {
                auraTextureFrames = new TextureRegion(base, aurasPNG ? 64 * normalAuraCount : 0, 0, 64 * frames, 64);
                goldAuraTextureFrames = null;
            }
            if (aurasPNG) {
                normalAuraCount += frames;
            }

            TextureRegion[] auraAnimation = new TextureRegion[frames];
            TextureRegion[] goldAuraAnimation = new TextureRegion[frames];

            for (int i = 0; i < frames; i++) {
                auraAnimation[i] = new TextureRegion(auraTextureFrames, 64 * i, 0, 64, 64);
                if (goldAuraTextureFrames != null)
                    goldAuraAnimation[i] = new TextureRegion(goldAuraTextureFrames, 64 * i, 0, 64, 64);
            }

            auraShapes.add(new ItemAura(id, name, payvaultid, auraAnimation, goldAuraAnimation, speed));
        } else auraShapes.add(new ItemAura(id, name, payvaultid, null, null, speed));

    }

    void addAura(int id, String name, Texture base, String payvaultid, int frames, float speed) {
        addAura(id, name, base, payvaultid, frames, speed, true);
    }

    void addAura(int id, String name, Texture base, String payvaultid, int frames) {
        addAura(id, name, base, payvaultid, frames, 0.2f);
    }

    void addAura(int id, String name, Texture base, String payvaultid) {
        addAura(id, name, base, payvaultid, 1);
    }

    void addSmiley(int id, String name, String description, Texture base, String payvaultid, int minimapColor) {
        if (texturesPostloaded) {
            TextureRegion smileyTexture = new TextureRegion(base, 26 * id, 0, 26, 26);
            TextureRegion smileyTextureGold = new TextureRegion(base, 26 * id, 26, 26, 26);

            smilies.add(new ItemSmiley(id, name, description, smileyTexture, payvaultid, minimapColor, smileyTextureGold));
        } else {
            smilies.add(new ItemSmiley(id, name, description, null, payvaultid, minimapColor, null));
        }
    }

    void addSmiley(int id, String name, String description, Texture base, String payvaultid) {
        addSmiley(id, name, description, base, payvaultid, 0xFFFFFFFF);
    }

    public ItemBrick getBrickById(int id) {
        return bricks[id];
    }

    public TextureRegion getBrickTextureById(int id) {
        return brickTextures[id];
    }

    public ItemNpc getNpcByPayvaultId(String payvaultid) {
        //for (int i = 0; i < npcs.size; i++) {
        //    if (npcs[i].payvaultid == payvaultid) return npcs[i];
        //}
        return null;
    }

    public ItemNpc getNpcById(int id) {
        //for (int i = 0; i < npcs.size; i++) {
        //    if (npcs.get(i). == id) return npcs[i];
        //}
        return null;
    }

    public ItemSmiley getSmileyByPayvaultId(String payvaultid) {
        for (ItemSmiley smiley : smilies) {
            if (smiley.getPayvaultid().equals(payvaultid)) return smiley;
        }
        return null;
    }

    public ItemSmiley getSmileyById(int id) {
        for (ItemSmiley smiley : smilies) {
            if (smiley.getId() == id) return smiley;
        }
        return null;
    }

    public ItemAura getAuraShapeByPayVaultId(String payvaultid) {
        for (ItemAura auraShape : auraShapes) {
            if (auraShape.getPayvaultid().equals(payvaultid))
                return auraShape;
        }
        return null;
    }

    public ItemAura getAuraShapeById(int id) {
        for (ItemAura auraShape : auraShapes) {
            if (auraShape.getId() == id)
                return auraShape;
        }
        return null;
    }

    public ItemBrickPackage getBrickPackageByName(String name) {
        for (ItemBrickPackage brickPackage : brickPackages) {
            if (brickPackage.getName().equals(name)) return brickPackage;
        }
        return null;
    }

    public ItemBrickPackage getBrickPackageByDescription(String description) {
        for (ItemBrickPackage brickPackage : brickPackages) {
            if (brickPackage.getDescription().equalsIgnoreCase(description)) return brickPackage;
        }
        return null;
    }

    public ArrayList<ItemBrick> getBricksByPayVaultId(String id) {
        ArrayList<ItemBrick> bricks = new ArrayList<>();
        for (ItemBrickPackage brickPackage : brickPackages) {
            for (ItemBrick brick : brickPackage.getBricks()) {
                if (brick.getPayvaultid().equals(id))
                    bricks.add(brick);
            }
        }
        return bricks;
    }

    public int getBrickPackagesCount() {
        return brickPackages.size();
    }

    public int getAuraCount() {
        return auraShapes.size();
    }

    public int getNpcCount() {
        return npcs.size();
    }

    public int getSmileyCount() {
        return smilies.size();
    }

    public int getHighestBrickID() {
        return highestBrickID;
    }
}
