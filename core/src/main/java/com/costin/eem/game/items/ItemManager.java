package com.costin.eem.game.items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

public class ItemManager {
    private static ItemManager singleton;

    // Misc
    private Texture smileysBMD;
    private Texture smileyPlatinumSpenderBMD;
    private Texture aurasBMD;
    private Texture aurasOrnateBMD;
    private Texture aurasBubbleBMD;
    private Texture aurasGalaxyBMD;
    private Texture shopBMD;
    private Texture shopWorldsBMD;
    private Texture shopAurasBMD;
    private Texture favoriteBMD;
    private Texture likeBMD;
    private Texture allParticles;
    private Texture graphicsPreviewBG;

    // Blocks
    private Texture blocksBMD;
    private Texture decoBlocksBMD;
    private Texture bgBlocksBMD;
    private Texture specialBlocksBMD;
    private Texture shadowBlocksBMD;
    private Texture mudBlocksBMD;
    private Texture npcBlocksBMD;
    private Texture doorBlocksBMD;
    private Texture effectBlocksBMD;
    private Texture teamBlocksBMD;
    private Texture completeBlocksBMD;
    private Texture blockNumbersBMD;
    private Texture blocksFireworksBMD;
    private Texture blocksGoldenEasterEggBMD;

    // ===========

    private ArrayList<ItemSmiley> smilies = new ArrayList<>();
    private ArrayList<ItemAura> auraShapes = new ArrayList<>();
    private ArrayList<ItemNpc> npcs = new ArrayList();
    private ArrayList<ItemBrickPackage> brickPackages = new ArrayList<>();

    private void initializeManager() {
        /* Define and declare smilies */
        //Free
        addSmiley(0,	"Smiley", "", smileysBMD, "");
        addSmiley(1,	"Grin", "", smileysBMD, "");
        addSmiley(2,	"Tongue", "", smileysBMD, "");
        addSmiley(3,	"Happy", "", smileysBMD, "");
        addSmiley(4,	"Annoyed", "", smileysBMD, "");
        addSmiley(5,	"Sad", "", smileysBMD, "");

        //Beta / Pro smilies
        addSmiley(6,	"Crying", "", smileysBMD, "pro");
        addSmiley(7,	"Wink", "", smileysBMD, "pro");
        addSmiley(8,	"Frustrated", "", smileysBMD, "pro");
        addSmiley(9,	"Shades", "", smileysBMD, "pro");
        addSmiley(10,	"Devil", "", smileysBMD, "pro");
        addSmiley(11,	"Inquisitive", "", smileysBMD, "pro");

        //Other
        addSmiley(12,	"Ninja", "", smileysBMD, "smileyninja", 0x0);
        addSmiley(13,	"Santa", "", smileysBMD, "smileysanta");
        addSmiley(14,	"Worker", "", smileysBMD, "");
        addSmiley(15,	"Big Spender", "", smileysBMD, "smileybigspender");
        addSmiley(16,	"Superman", "", smileysBMD, "smileysuper");
        addSmiley(17,	"Surprise", "", smileysBMD, "smileysupprice");
        addSmiley(18,	"Indifferent", "", smileysBMD, ""); //In the middle free smiley :D
        addSmiley(19,	"Girl", "", smileysBMD, "");
        addSmiley(20,	"New Year 2010", "", smileysBMD, "mixednewyear2010");
        addSmiley(21,	"Coy", "", smileysBMD, "");
        addSmiley(22,	"Wizard", "", smileysBMD, "smileywizard");

        addSmiley(23,	"Fan Boy", "", smileysBMD, "smileyfanboy");
        addSmiley(24,	"Terminator", "", smileysBMD, "");
        addSmiley(25,	"Extra Grin", "", smileysBMD, "smileyxd");

        addSmiley(26,	"Bully", "", smileysBMD, "smileybully");
        addSmiley(27,	"Commando", "", smileysBMD, "smileycommando");
        addSmiley(28,	"Kissing", "", smileysBMD, "smileyvalentines2011");
        addSmiley(29,	"Bird", "", smileysBMD, "smileybird");
        addSmiley(30,	"Bunny", "", smileysBMD, "smileybunni");

        addSmiley(31,	"Diamond Touch", "", smileysBMD, "unobtainable");
        addSmiley(32,	"Fire Wizard", "", smileysBMD, "smileywizard2");
        addSmiley(33,	"Extra Tongue", "", smileysBMD, "smileyxdp");
        addSmiley(34,	"Postman", "", smileysBMD, "smileypostman");
        addSmiley(35,	"Templar", "", smileysBMD, "smileytemplar");
        addSmiley(36,	"Angel", "", smileysBMD, "");
        addSmiley(37,	"Nurse", "", smileysBMD, "smileynurse");
        addSmiley(38,	"Vampire", "", smileysBMD, "smileyhw2011vampire");
        addSmiley(39,	"Ghost", "", smileysBMD, "smileyhw2011ghost");
        addSmiley(40,	"Frankenstein", "", smileysBMD, "smileyhw2011frankenstein");
        addSmiley(41,	"Witch", "", smileysBMD, "smileywitch");

        addSmiley(42,	"Indian", "", smileysBMD, "smileytg2011indian");
        addSmiley(43,	"Pilgrim", "", smileysBMD, "smileytg2011pilgrim");

        addSmiley(44,	"Pumpkin", "", smileysBMD, "smileypumpkin1");
        addSmiley(45,	"Lit Pumpkin", "", smileysBMD, "smileypumpkin2");

        addSmiley(46,	"Snowman", "", smileysBMD, "smileyxmassnowman");
        addSmiley(47,	"Reindeer", "", smileysBMD, "smileyxmasreindeer");
        addSmiley(48,	"Grinch", "", smileysBMD, "smileyxmasgrinch");
        addSmiley(49,	"Maestro", "", smileysBMD, "bricknode");
        addSmiley(50,	"DJ", "", smileysBMD, "brickdrums");
        addSmiley(51,	"Sigh", "", smileysBMD, "");
        addSmiley(52,	"Robber", "", smileysBMD, "", 0x0);
        addSmiley(53,	"Police", "", smileysBMD, "", 0xFF0c64f6);
        addSmiley(54,	"Purple Ghost", "", smileysBMD, "smileypurpleghost");
        addSmiley(55,	"Pirate", "", smileysBMD, "");
        addSmiley(56,	"Viking", "", smileysBMD, "");
        addSmiley(57,	"Karate", "", smileysBMD, "");
        addSmiley(58,	"Cowboy", "", smileysBMD, "");
        addSmiley(59,	"Diver", "", smileysBMD, "smileydiver");
        addSmiley(60,	"Tanned", "", smileysBMD, "smileytanned");
        addSmiley(61,	"Propeller Hat", "", smileysBMD, "");
        addSmiley(62,	"Hard Hat", "", smileysBMD, "smileyhardhat");
        addSmiley(63,	"Gas Mask", "", smileysBMD, "smileygasmask");
        addSmiley(64,	"Robot", "", smileysBMD, "");
        addSmiley(65,	"Peasant", "", smileysBMD, "");
        addSmiley(66,	"Guard", "", smileysBMD, "");
        addSmiley(67,	"Blacksmith", "", smileysBMD, "");
        addSmiley(68,	"LOL", "", smileysBMD, "");
        addSmiley(69,	"Dog", "", smileysBMD, "");
        addSmiley(70,	"Alien", "", smileysBMD, "smileyalien");
        addSmiley(71,	"Astronaut", "", smileysBMD, "smileyastronaut");
        addSmiley(72,	"PartyOrange", "", smileysBMD, "unobtainable");
        addSmiley(73,	"PartyGreen", "", smileysBMD, "unobtainable");
        addSmiley(74,	"PartyBlue", "", smileysBMD, "unobtainable");
        addSmiley(75,	"PartyRed", "", smileysBMD, "unobtainable");
        addSmiley(76,	"Daredevil", "", smileysBMD, "");
        addSmiley(77,	"Monster", "", smileysBMD, "smileymonster");
        addSmiley(78,	"Skeleton", "", smileysBMD, "smileyskeleton");
        addSmiley(79,	"Mad Scientist", "", smileysBMD, "smileymadscientist");
        addSmiley(80,	"Headhunter", "", smileysBMD, "smileyheadhunter");
        addSmiley(81,	"Safari", "", smileysBMD, "smileysafari");
        addSmiley(82,	"Archaeologist", "", smileysBMD, "smileyarchaeologist");
        addSmiley(83,	"New Year 2013", "", smileysBMD, "smileynewyear2012");
        addSmiley(84,	"Winter Hat", "", smileysBMD, "smileywinter");
        addSmiley(85, 	"Fire demon", "", smileysBMD, "smileyfiredeamon");
        addSmiley(86, 	"Bishop", "", smileysBMD, "smileybishop");
        addSmiley(87, 	"Zombie", "", smileysBMD, "unobtainable");
        addSmiley(88, 	"Bruce", "", smileysBMD, "smileyzombieslayer");
        addSmiley(89, 	"Unit", "", smileysBMD, "smileyunit");
        addSmiley(90,	"Spartan", "", smileysBMD, "smileyspartan");
        addSmiley(91,	"Lady", "", smileysBMD, "smileyhelen");
        addSmiley(92,	"Cow", "", smileysBMD, "smileycow");
        addSmiley(93, 	"Scarecrow", "", smileysBMD, "smileyscarecrow");
        addSmiley(94,	"Dark Wizard", "", smileysBMD, "smileydarkwizard");
        addSmiley(95,	"Kung Fu Master", "", smileysBMD, "smileykungfumaster");
        addSmiley(96,	"Fox", "", smileysBMD, "smileyfox");
        addSmiley(97,	"Night Vision", "", smileysBMD, "smileynightvision");
        addSmiley(98,	"Summer Girl", "", smileysBMD, "smileysummergirl");
        addSmiley(99,	"Fan Boy II", "", smileysBMD, "smileyfanboy2");
        addSmiley(100,  "Sci-Fi Hologram", "", smileysBMD, "unobtainable");
        addSmiley(101,  "Gingerbread", "", smileysBMD, "smileygingerbread");
        addSmiley(102,  "Caroler", "", smileysBMD, "smileycaroler");
        addSmiley(103,  "Elf", "", smileysBMD, "smileyelf");
        addSmiley(104,  "Nutcracker", "", smileysBMD, "smileynutcracker");
        addSmiley(105,  "Blushing", "", smileysBMD, "brickvalentines2015");
        addSmiley(106,	"Artist", "", smileysBMD, "smileyartist"); // Loading screen contest prize
        addSmiley(107,	"Princess", "", smileysBMD, "");
        addSmiley(108,	"Chef", "", smileysBMD, "");
        addSmiley(109,	"Clown", "", smileysBMD, "");
        addSmiley(110,	"Red Ninja", "", smileysBMD, "smileyninjared");
        addSmiley(111,	"3D Glasses", "", smileysBMD, "smiley3dglasses");
        addSmiley(112,	"Sunburned", "", smileysBMD, "smileysunburned");
        addSmiley(113,	"Tourist", "", smileysBMD, "smileytourist");
        addSmiley(114,  "Graduate", "", smileysBMD, "smileygraduate");
        addSmiley(115,  "Sombrero", "", smileysBMD, "smileysombrero");
        addSmiley(116,  "Cat", "", smileysBMD, "");
        addSmiley(117,  "Scared", "", smileysBMD, ""); // FREE!
        addSmiley(118,  "Ghoul", "", smileysBMD, "smileyghoul");
        addSmiley(119,  "Mummy", "", smileysBMD, "smileymummy");
        addSmiley(120,  "Bat", "", smileysBMD, "smileybat");
        addSmiley(121,  "Eyeball", "", smileysBMD, "smileyeyeball"); // Halloween campaign prize
        addSmiley(122,	"Light Wizard", "", smileysBMD, "smileylightwizard");
        addSmiley(123,  "Hooded", "", smileysBMD, "smileyhooded");
        addSmiley(124,  "Earmuffs", "", smileysBMD, "smileyearmuffs");
        addSmiley(125,  "Penguin", "", smileysBMD, "smileypenguin");
        addSmiley(126,	"Gold Smiley", "", smileysBMD, "goldmember");
        addSmiley(127,	"Gold Ninja", "", smileysBMD, "goldmember");
        addSmiley(128,	"Gold Robot", "", smileysBMD, "goldmember");
        addSmiley(129,	"Gold Top Hat", "", smileysBMD, "goldmember");
        addSmiley(130,	"Sick", "", smileysBMD, "");
        addSmiley(131,	"Unsure", "", smileysBMD, "");
        addSmiley(132,	"Goofy", "", smileysBMD, "smileygoofy");
        addSmiley(133,  "Raindrop", "", smileysBMD, "smileyraindrop");
        addSmiley(134,  "Bee", "", smileysBMD, "smileybee");
        addSmiley(135,  "Butterfly", "", smileysBMD, "smileybutterfly");
        addSmiley(136,  "Sea Captain", "", smileysBMD, "smileyseacaptain");
        addSmiley(137,  "Soda Clerk", "", smileysBMD, "smileysodaclerk");
        addSmiley(138,  "Lifeguard", "", smileysBMD, "smileylifeguard");
        addSmiley(139,  "Aviator", "", smileysBMD, "smileyaviator");
        addSmiley(140,  "Sleepy", "", smileysBMD, "smileysleepy");
        addSmiley(141,  "Seagull", "", smileysBMD, "smileyseagull");
        addSmiley(142,  "Werewolf", "", smileysBMD, "smileywerewolf");
        addSmiley(143,  "Swamp Creature", "", smileysBMD, "smileyswampcreature");
        addSmiley(144,  "Fairy", "", smileysBMD, "smileyfairy");
        addSmiley(145,  "Firefighter", "", smileysBMD, "smileyfirefighter");
        addSmiley(146,  "Spy", "", smileysBMD, "smileyspy", 0x0);
        addSmiley(147,  "Devil Skull", "", smileysBMD, "smileydevilskull");
        addSmiley(148,  "Clockwork Robot", "", smileysBMD, "smileyclockwork");
        addSmiley(149,  "Teddy Bear", "", smileysBMD, "smileyteddybear");
        addSmiley(150,  "Christmas Soldier", "", smileysBMD, "smileychristmassoldier");
        addSmiley(151,  "Scrooge", "", smileysBMD, "smileyscrooge");
        addSmiley(152,  "Boy", "", smileysBMD, "");
        addSmiley(153,	"Pigtails", "", smileysBMD, "smileypigtails");
        addSmiley(154,	"Doctor", "", smileysBMD, "smileydoctor");
        addSmiley(155,	"Turban", "", smileysBMD, "smileyturban");
        addSmiley(156,	"Hazmat Suit", "", smileysBMD, "smileyhazmatsuit");
        addSmiley(157,	"Leprechaun", "", smileysBMD, "smileyleprechaun");
        addSmiley(158,	"Angry", "", smileysBMD, "smileyangry");
        addSmiley(159,	"Smirk", "", smileysBMD, "smileysmirk");
        addSmiley(160,	"Sweat", "", smileysBMD, "smileysweat");
        addSmiley(161,	"Country Singer", "", smileysBMD, "brickguitar");
        addSmiley(162,	"Thor", "", smileysBMD, "smileythor");
        addSmiley(163,	"Cowgirl", "", smileysBMD, "");
        addSmiley(164,	"Raccoon", "", smileysBMD, "smileyraccoon");
        addSmiley(165,	"Lion", "", smileysBMD, "smileylion");
        addSmiley(166,	"Laika", "", smileysBMD, "smileylaiika");
        addSmiley(167,	"Fishbowl", "", smileysBMD, "smileyfishbowl");
        addSmiley(168,	"Slime", "", smileysBMD, "smileyslime");
        addSmiley(169,	"Designer", "", smileysBMD, "smileydesigner");
        addSmiley(170,	"Frozen", "", smileysBMD, "smileyfrozen");
        addSmiley(171,	"Masquerade", "", smileysBMD, "smileymasquerade");
        addSmiley(172,	"Polar Bear", "", smileysBMD, "smileypolarbear");
        addSmiley(173,	"Baseball Cap", "", smileysBMD, "smileybaseball");
        addSmiley(174,	"Golfer", "", smileysBMD, "smileygolfer");
        addSmiley(ItemId.SMILEY_PLATINUM_SPENDER, "Platinum Big Spender", "", smileysBMD, "smileyplatinumspender");
        addSmiley(176,	"Green Dragon", "", smileysBMD, "smileydragongreen");
        addSmiley(177,	"Red Dragon", "", smileysBMD, "smileydragonred");
        addSmiley(178,	"Executioner", "", smileysBMD, "smileyexecutioner");
        addSmiley(179,	"Gargoyle", "", smileysBMD, "smileygargoyle");
        addSmiley(180,	"Banshee", "", smileysBMD, "smileybanshee");
        addSmiley(181,	"Golem", "", smileysBMD, "smileygolem");
        addSmiley(182,	"Frost Dragon", "", smileysBMD, "smileyfrostdragon");
        addSmiley(183,	"Squirrel", "", smileysBMD, "smileysquirrel");
        addSmiley(184,  "Golden Dragon", "", smileysBMD, "smileygoldendragon");
        addSmiley(185,  "Robot Mk II", "", smileysBMD, "smileyrobot2");
        addSmiley(186,  "Black Dragon", "", smileysBMD, "smileydragonblack");
        addSmiley(187,  "Silver Dragon", "", smileysBMD, "smileydragonsilver");

        addAura(0, "Default", aurasBMD, "");
        addAura(1, "Pinwheel", aurasBMD, "aurashapepinwheel", 6);
        addAura(2, "Torus", aurasBMD, "aurashapetorus");
        addAura(3, "Ornate", aurasBMD, "goldmember", 6);
        addAura(4, "Spiral", aurasBMD, "aurashapespiral", 6, 0.15f);
        addAura(5, "Star", aurasBMD, "aurashapestar");
        addAura(6, "Snowflake", aurasBMD, "aurashapesnowflake");
        addAura(7, "Atom", aurasBMD, "aurashapeatom", 8, 0.175f);
        addAura(8, "Sawblade", aurasBMD, "aurashapesawblade", 6, 0.2f);
        addAura(9, "Target", aurasBMD, "aurashapetarget", 6, 0.15f);
        addAura(10, "Bubble", aurasBubbleBMD, "aurabubble", 8, .1f, false);
        addAura(11, "Galaxy", aurasGalaxyBMD, "auragalaxy", 12, .15f, false);
        addAura(12, "Heart", aurasBMD, "aurashapeheart", 10, 0.125f);
        addAura(13, "Flower", aurasBMD, "aurashapesunflower");

        /* Define and declare Npcs */
        ItemBrickPackage npc = new ItemBrickPackage("NPCs", "idk, npcs are npcs.", new String[] {"npc"});
        addNpc(ItemId.NPC_SMILE, "npcsmile", npc, 2, new String[] {"Smile", "Happy", "Yellow"});
        addNpc(ItemId.NPC_SAD, "npcsad", npc, 2, new String[] {"Sad", "Yellow"});
        addNpc(ItemId.NPC_OLD, "npcold", npc, 2, new String[] {"Old", "Yellow"});
        addNpc(ItemId.NPC_ANGRY, "npcangry", npc, 2, new String[] {"Angry", "Mad", "Red"});
        addNpc(ItemId.NPC_SLIME, "npcslime", npc, 2, new String[] {"Slime", "Lime", "Green"});
        addNpc(ItemId.NPC_ROBOT, "npcrobot", npc, 2, new String[] {"Robot", "Grey"});
        addNpc(ItemId.NPC_KNIGHT, "npcknight", npc, 2, new String[] {"Knight", "War", "Grey"});
        addNpc(ItemId.NPC_MEH, "npcmeh", npc, 2, new String[] {"Meh", "Yellow"});
        addNpc(ItemId.NPC_COW, "npccow", npc, 2, new String[] {"Cow", "Brown"});
        addNpc(ItemId.NPC_FROG, "npcfrog", npc, 9, new String[] {"Frog", "Green"}, 6.5f / 3f, -7);
        addNpc(ItemId.NPC_BRUCE, "npcbruce", npc, 2, new String[] {"Bruce", "Yellow"});
        addNpc(ItemId.NPC_STARFISH, "npcstarfish", npc, 2, new String[] {"Starfish", "Pink", "Ocean"});
        addNpc(ItemId.NPC_DT, "npcdt", npc, 2, new String[] {"Computer", "???"});
        addNpc(ItemId.NPC_SKELETON, "npcskeleton", npc, 2, new String[] {"Skeleton"});
        addNpc(ItemId.NPC_ZOMBIE, "npczombie", npc, 2, new String[] {"Zombie"});
        addNpc(ItemId.NPC_GHOST, "npcghost", npc, 6, new String[] {"Ghost"}, 6.5f / 1.25f);
        addNpc(ItemId.NPC_ASTRONAUT, "npcastronaut", npc, 9, new String[] {"Astronaut", "Space", "Sci-fi"}, 4.5f);
        addNpc(ItemId.NPC_SANTA, "npcsanta", npc, 2, new String[] {"Santa", "Christmas", "Holiday", "Yellow"}, 7);
        addNpc(ItemId.NPC_SNOWMAN, "npcsnowman", npc, 4, new String[] {"Snowman", "Christmas", "Holiday"}, 7);
        addNpc(ItemId.NPC_WALRUS, "npcwalrus", npc, 3, new String[] {"Walrus"});
        addNpc(ItemId.NPC_CRAB, "npccrab", npc, 10, new String[] {"Hermit", "Crab", "Shell"});

        /* Define and declare bricks */
        //BRICKs
        ItemBrickPackage basic = new ItemBrickPackage("basic", "Basic Blocks", new String[] {"Primary", "Simple", "Standard", "Default"});
        basic.addBrick(createBrick(1088,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,260,-1, 		  new String[] {"White", "Light"}));
        basic.addBrick(createBrick(9,   ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,9,  0xFF6E6E6E, new String[] {"Grey", "Gray", "Taupe"}));
        basic.addBrick(createBrick(182, ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,156,0xFF282828, new String[] {"Black", "Dark", "Coal", "Road"}));
        basic.addBrick(createBrick(12,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,12, 0xFFA83554, new String[] {"Red", "Magenta", "Vermillion", "Ruby"}));
        basic.addBrick(createBrick(1018,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,205,-1,		  new String[] {"Orange", "Persimmon", "Copper"}));
        basic.addBrick(createBrick(13,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,13, 0xFF93A835, new String[] {"Yellow", "Lime", "Chartreuse", "Light green", "Citrine", "Citrus"}));
        basic.addBrick(createBrick(14,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,14, 0xFF42A836, new String[] {"Green", "Kelly", "Emerald", "Grass"}));
        basic.addBrick(createBrick(15,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,15, 0xFF359EA6, new String[] {"Blue", "Cyan", "Light Blue", "Aquamarine", "Sky Blue"}));
        basic.addBrick(createBrick(10,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,10, 0xFF3552A8, new String[] {"Blue", "Dark Blue", "Cobalt"}));
        basic.addBrick(createBrick(11,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,11, 0xFF9735A7, new String[] {"Purple", "Pink", "Plum", "Violet"}));
        brickPackages.add(basic);

        ItemBrickPackage beta = new ItemBrickPackage("beta", "Beta Access", new String[] {"Exclusive"});
        beta.addBrick(createBrick(1089,ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,261,0xFFE5E5E5, new String[] {"White", "Light"}));
        beta.addBrick(createBrick(42,  ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,42, 0xFF999999, new String[] {"Grey", "Gray", "Taupe"}));
        beta.addBrick(createBrick(1021,ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,208,0xFF474747, new String[] {"Black", "Dark", "Onyx"}));
        beta.addBrick(createBrick(40,  ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,40, 0xFFCF6650, new String[] {"Red", "Ruby", "Garnet"}));
        beta.addBrick(createBrick(1020,ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,207,0xFFCE7E50, new String[] {"Orange", "Copper"}));
        beta.addBrick(createBrick(41,  ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,41, 0xFFD2A945, new String[] {"Yellow", "Gold", "Jasmine"}));
        beta.addBrick(createBrick(38,  ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,38, 0xFF4AC882, new String[] {"Green", "Emerald", "Malachite"}));
        beta.addBrick(createBrick(1019,ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,206,0xFF49C2C6, new String[] {"Blue", "Cyan", "Light blue", "Aquamarine", "Turquoise"}));
        beta.addBrick(createBrick(39,  ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,39, 0xFF4D84C6, new String[] {"Blue", "Sapphire"}));
        beta.addBrick(createBrick(37,  ItemLayer.FORGROUND,blocksBMD,"pro","",ItemTab.BLOCK,false,true,37, 0xFFCE62CF, new String[] {"Purple", "Pink", "Magenta", "Violet", "Amethyst"}));
        brickPackages.add(beta);

        ItemBrickPackage brick = new ItemBrickPackage("brick", "Brick Blocks", new String[] {"Standard", "Wall"});
        brick.addBrick(createBrick(1090,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,262, 0xFF888888, new String[] {"White", "Light"}));
        brick.addBrick(createBrick(1022,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,209, 0xFF4C4C4C, new String[] {"Gray", "Grey", "Concrete", "Stone"}));
        brick.addBrick(createBrick(1024,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,211, -1, 		   new String[] {"Black", "Dark", "Coal"}));
        brick.addBrick(createBrick(20,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,20,  0xFF6F2429, new String[] {"Red", "Maroon", "Hell"}));
        brick.addBrick(createBrick(16,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,16,  0xFF8B3E09, new String[] {"Brown", "Orange", "Soil", "Dirt", "Mahogany"}));
        brick.addBrick(createBrick(21,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,21,  0xFF6F5D24, new String[] {"Beige", "Tan", "Olive", "Brown", "Ecru", "Yellow"}));
        brick.addBrick(createBrick(19,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,19,  0xFF438310, new String[] {"Green", "Grass"}));
        brick.addBrick(createBrick(17,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,17,  0xFF246F4D, new String[] {"Blue", "Cyan", "Turquoise", "Teal", "Skobeloff", "Dark Green"}));
        brick.addBrick(createBrick(1023,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,210, -1, 		   new String[] {"Blue", "Dark", "Zaffre"}));
        brick.addBrick(createBrick(18,  ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,18,  0xFF4E246F, new String[] {"Purple", "Dark", "Violet"}));
        brickPackages.add(brick);

        ItemBrickPackage metal = new ItemBrickPackage("metal", "Metal Blocks", new String[] {"Ore", "Standard"});
        metal.addBrick(createBrick(29,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,29,0xFFA1A3A5, new String[] {"Silver", "White", "Iron", "Platinum"}));
        metal.addBrick(createBrick(30,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,30,0xFFDF7A41, new String[] {"Orange", "Bronze", "Amber"}));
        metal.addBrick(createBrick(31,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,31,0xFFF0A927, new String[] {"Yellow", "Gold", "Jasmine"}));
        brickPackages.add(metal);

        ItemBrickPackage grass = new ItemBrickPackage("grass", "Grass Blocks", new String[] {"Environment", "Nature", "Standard", "Soil", "Ground", "Dirt", "Flora"});
        grass.addBrick(createBrick(34,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,34,0xFF456313, new String[] {"Left", "Soil"}));
        grass.addBrick(createBrick(35,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,35,0xFF456313, new String[] {"Middle", "Soil"}));
        grass.addBrick(createBrick(36,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,36,0xFF456313, new String[] {"Right", "Soil"}));
        brickPackages.add(grass);

        ItemBrickPackage generic = new ItemBrickPackage("generic", "Generic Blocks", new String[] {"Special"});
        generic.addBrick(createBrick(22,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,22,0xFF895B12, new String[] {"Caution", "Warning", "Hazard", "Stripes", "Yellow", "Black", "Standard"}));
        generic.addBrick(createBrick(1057,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,235,-1, new String[] {"Neutral", "Yellow", "Body", "No face"}));
        generic.addBrick(createBrick(32,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,32,0xFFCF9022, new String[] {"Face", "Smiley", "Yellow", "Standard"}));
        generic.addBrick(createBrick(1058,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,236,-1, new String[] {"Caution", "Warning", "Hazard", "Stripes", "Black", "Yellow"}));
        generic.addBrick(createBrick(33,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,33,0xFF000000, new String[] {"Black", "Dark", "Standard"}));
        brickPackages.add(generic);

        ItemBrickPackage brickfactorypack = new ItemBrickPackage("factory", "Factory Package");
        brickfactorypack.addBrick(createBrick(45,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,45,0xFF72614B, new String[] {"X", "Crate", "Metal", "Box", "Wood"}));
        brickfactorypack.addBrick(createBrick(46,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,46,0xFF6E6B60, new String[] {"Concrete", "Grey", "Gray", "Stone", "Slate", "X"}));
        brickfactorypack.addBrick(createBrick(47,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,47,0xFF8E734F, new String[] {"Wood", "Tree", "Wooden", "House", "Planks", "Flooring", "Parquet"}));
        brickfactorypack.addBrick(createBrick(48,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,48,0xFF7F4F2B, new String[] {"X", "Crate", "Wooden", "Box", "Wood", "Storage"}));
        brickfactorypack.addBrick(createBrick(49,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,49,0xFF757575, new String[] {"Silver", "Metal", "Scales"}));
        brickPackages.add(brickfactorypack);

        ItemBrickPackage secret = new ItemBrickPackage("secrets", "Secret Bricks", new String[] {"Hidden", "Invisible"});
        secret.addBrick(createBrick(44,ItemLayer.FORGROUND,blocksBMD,"","completely black, makes minimap invisible",ItemTab.BLOCK,false,true,44,0x01000000, new String[] {"Black", "Pure", "Old", "Solid"})); //Black block is in the special range
        secret.addBrick(createBrick(50,ItemLayer.DECORATION,specialBlocksBMD,"","",ItemTab.BLOCK,false,true,139,0x0, new String[] {"Appear"}));
        secret.addBrick(createBrick(243,ItemLayer.DECORATION,specialBlocksBMD,"","",ItemTab.BLOCK,false,true,140,0x01000000, new String[] {"Blank", "Hidden"}));
        secret.addBrick(createBrick(136,ItemLayer.DECORATION,specialBlocksBMD,"","",ItemTab.BLOCK,false,false,141,0x0, new String[] {"Disappear"}));
        brickPackages.add(secret);

        ItemBrickPackage glass = new ItemBrickPackage("glass", "Glass bricks", new String[] {"Bright", "Light", "Shine", "Polish", "Neon"});
        glass.addBrick(createBrick(51,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,51,0xFFF89299, new String[] {"Red", "Light red", "Pink", "Ruby"}));
        glass.addBrick(createBrick(58,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,58,0xFFF6BA94, new String[] {"Orange", "Light orange", "Topaz"}));
        glass.addBrick(createBrick(57,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,57,0xFFF8DA8C, new String[] {"Yellow", "Light yellow", "Jasmine"}));
        glass.addBrick(createBrick(56,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,56,0xFF92FBAA, new String[] {"Green", "Light green", "Emerald"}));
        glass.addBrick(createBrick(55,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,55,0xFF95DCF6, new String[] {"Cyan", "Light blue", "Diamond"}));
        glass.addBrick(createBrick(54,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,54,0xFF7E99F6, new String[] {"Blue", "Sapphire"}));
        glass.addBrick(createBrick(53,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,53,0xFFA789F6, new String[] {"Purple", "Violet", "Amethyst"}));
        glass.addBrick(createBrick(52,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,52,0xFFE98BF6, new String[] {"Pink", "Magenta", "Purple", "Quartz"}));
        brickPackages.add(glass);

        ItemBrickPackage mineral = new ItemBrickPackage("minerals", "Minerals", new String[] {"Neon", "Pure", "Bright"});
        mineral.addBrick(createBrick(70,ItemLayer.FORGROUND,blocksBMD,"brickminiral","",ItemTab.BLOCK,false,true,70,0xFFEE0000, new String[] {"Red", "Ruby"}));
        mineral.addBrick(createBrick(76,ItemLayer.FORGROUND,blocksBMD,"brickminiral","",ItemTab.BLOCK,false,true,76,0xFFEE7700, new String[] {"Orange", "Topaz"}));
        mineral.addBrick(createBrick(75,ItemLayer.FORGROUND,blocksBMD,"brickminiral","",ItemTab.BLOCK,false,true,75,0xFFEEEE00, new String[] {"Yellow", "Jasmine"}));
        mineral.addBrick(createBrick(74,ItemLayer.FORGROUND,blocksBMD,"brickminiral","",ItemTab.BLOCK,false,true,74,0xFF00EE00, new String[] {"Green", "Lime", "Emerald", "Peridot"}));
        mineral.addBrick(createBrick(73,ItemLayer.FORGROUND,blocksBMD,"brickminiral","",ItemTab.BLOCK,false,true,73,0xFF00EEEE, new String[] {"Cyan", "Light blue", "Aquamarine", "Turquoise"}));
        mineral.addBrick(createBrick(72,ItemLayer.FORGROUND,blocksBMD,"brickminiral","",ItemTab.BLOCK,false,true,72,0xFF0000EE, new String[] {"Blue", "Indigo", "Sapphire", "Lapis"}));
        mineral.addBrick(createBrick(71,ItemLayer.FORGROUND,blocksBMD,"brickminiral","",ItemTab.BLOCK,false,true,71,0xFFEE00EE, new String[] {"Pink", "Magenta", "Purple", "Amethyst"}));
        brickPackages.add(mineral);

        ItemBrickPackage xmas2011 = new ItemBrickPackage("christmas 2011", "Christmas 2011 bricks", new String[] {"Holiday", "Wrapping Paper", "Gift", "Present"});
        xmas2011.addBrick(createBrick(78,ItemLayer.FORGROUND,blocksBMD,"brickxmas2011","",ItemTab.BLOCK,false,true,78,-1, new String[] {"Yellow"}));
        xmas2011.addBrick(createBrick(79,ItemLayer.FORGROUND,blocksBMD,"brickxmas2011","",ItemTab.BLOCK,false,true,79,-1, new String[] {"White"}));
        xmas2011.addBrick(createBrick(80,ItemLayer.FORGROUND,blocksBMD,"brickxmas2011","",ItemTab.BLOCK,false,true,80,-1, new String[] {"Red"}));
        xmas2011.addBrick(createBrick(81,ItemLayer.FORGROUND,blocksBMD,"brickxmas2011","",ItemTab.BLOCK,false,true,81,-1, new String[] {"Blue"}));
        xmas2011.addBrick(createBrick(82,ItemLayer.FORGROUND,blocksBMD,"brickxmas2011","",ItemTab.BLOCK,false,true,82,-1, new String[] {"Green"}));
        brickPackages.add(xmas2011);

        //ACTIONs
        ItemBrickPackage gravity = new ItemBrickPackage("gravity", "Gravity Modifying Arrows", new String[] {"Physics", "Motion", "Action", "Standard"});
        gravity.addBrick(createBrick(0, ItemLayer.BACKGROUND, blocksBMD, "","", ItemTab.ACTION,false,false,0,0xff000000, new String[] {"Clear", "Empty", "Delete", "Nothing", "Erase"}));
        gravity.addBrick(createBrick(1, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,false,1,0x0, new String[] {"Left", "Arrow"}));
        gravity.addBrick(createBrick(2, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,false,2,0x0, new String[] {"Up", "Arrow"}));
        gravity.addBrick(createBrick(3, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,false,3,0x0, new String[] {"Right", "Arrow"}));
        gravity.addBrick(createBrick(1518, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,false,285,0x0, new String[] {"Down", "Arrow"}));
        gravity.addBrick(createBrick(4, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,false,4,0x0, new String[] {"Dot"}));
        gravity.addBrick(createBrick(ItemId.SLOW_DOT, ItemLayer.DECORATION, blocksBMD, "", "", ItemTab.ACTION,false,false,233,0x0, new String[] {"Slow", "Dot", "Climbable", "Physics"}));
        gravity.addBrick(createBrick(411, ItemLayer.DECORATION, specialBlocksBMD, "","", ItemTab.ACTION,false,false,312,0x0, new String[] {"Invisible", "Left", "Arrow"}));
        gravity.addBrick(createBrick(412, ItemLayer.DECORATION, specialBlocksBMD, "","", ItemTab.ACTION,false,false,317,0x0, new String[] {"Invisible", "Up", "Arrow"}));
        gravity.addBrick(createBrick(413, ItemLayer.DECORATION, specialBlocksBMD, "","", ItemTab.ACTION,false,false,322,0x0, new String[] {"Invisible", "Right", "Arrow"}));
        gravity.addBrick(createBrick(1519, ItemLayer.DECORATION, specialBlocksBMD, "","", ItemTab.ACTION,false,false,652,0x0, new String[] {"Invisible", "Down", "Arrow"}));
        gravity.addBrick(createBrick(414, ItemLayer.DECORATION, specialBlocksBMD, "","", ItemTab.ACTION,false,false,327,0x0, new String[] {"Invisible", "Dot"}));
        gravity.addBrick(createBrick(ItemId.SLOW_DOT_INVISIBLE, ItemLayer.DECORATION, specialBlocksBMD, "","", ItemTab.ACTION,false,false,466,0x0, new String[] {"Slow", "Dot", "Climbable", "Physics", "Invisible"}));
        brickPackages.add(gravity);

        ItemBrickPackage keys = new ItemBrickPackage("keys", "Key Blocks", new String[] {"Key", "Lock", "Button", "Action", "Standard"});
        keys.addBrick(createBrick(6,ItemLayer.DECORATION,blocksBMD,"","hit to activate key doors and gates for everyone for 6 seconds",ItemTab.ACTION,false,false,6,0xFF2C1A1A, new String[] {"Red", "Key", "Magenta"}));
        keys.addBrick(createBrick(7,ItemLayer.DECORATION,blocksBMD,"","hit to activate key doors and gates for everyone for 6 seconds",ItemTab.ACTION,false,false,7,0xFF1A2C1A, new String[] {"Green", "Key"}));
        keys.addBrick(createBrick(8,ItemLayer.DECORATION,blocksBMD,"","hit to activate key doors and gates for everyone for 6 seconds",ItemTab.ACTION,false,false,8,0xFF1A1A2C, new String[] {"Blue", "Key"}));
        keys.addBrick(createBrick(408,ItemLayer.DECORATION,blocksBMD,"","hit to activate key doors and gates for everyone for 6 seconds",ItemTab.ACTION,false, false, 189, 0xFF0C2D3D, new String[] {"Cyan", "Teal"}));
        keys.addBrick(createBrick(409,ItemLayer.DECORATION,blocksBMD,"","hit to activate key doors and gates for everyone for 6 seconds",ItemTab.ACTION,false, false, 190, 0xFF400C40, new String[] {"Pink", "Violet", "Purple"}));
        keys.addBrick(createBrick(410,ItemLayer.DECORATION,blocksBMD,"","hit to activate key doors and gates for everyone for 6 seconds",ItemTab.ACTION,false, false, 191, 0xFF2C330A, new String[] {"Yellow", "Key"}));
        brickPackages.add(keys);

        ItemBrickPackage gates = new ItemBrickPackage("gates", "Gate Blocks", new String[] {"Key", "Lock", "Action", "Standard"});
        gates.addBrick(createBrick(26,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,false,26,0xFF9C2D46, new String[] {"Red", "Magenta"}));
        gates.addBrick(createBrick(27,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,false,27,0xFF379C30, new String[] {"Green"}));
        gates.addBrick(createBrick(28,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,false,28,0xFF2D449C, new String[] {"Blue"}));
        gates.addBrick(createBrick(1008,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,false,195,0xFF2D8D99, new String[] {"Cyan", "Teal"}));
        gates.addBrick(createBrick(1009,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,false,196,0xFF912D99, new String[] {"Pink", "Purple", "Violet"}));
        gates.addBrick(createBrick(1010,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,false,197,0xFF97922D, new String[] {"Yellow"}));
        brickPackages.add(gates);

        ItemBrickPackage doors = new ItemBrickPackage("doors", "Door Blocks", new String[] {"Key", "Lock", "Action", "Standard"});
        doors.addBrick(createBrick(23,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,true,23,0xFF9C2D46, new String[] {"Red", "Magenta"}));
        doors.addBrick(createBrick(24,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,true,24,0xFF379C30, new String[] {"Green"}));
        doors.addBrick(createBrick(25,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,true,25,0xFF2D449C, new String[] {"Blue"}));
        doors.addBrick(createBrick(1005,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,true,192,0xFF2D8D99, new String[] {"Cyan", "Teal"}));
        doors.addBrick(createBrick(1006,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,true,193,0xFF912D99, new String[] {"Pink", "Purple", "Violet"}));
        doors.addBrick(createBrick(1007,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.ACTION,false,true,194,0xFF97922D, new String[] {"Yellow"}));
        brickPackages.add(doors);

        ItemBrickPackage coins = new ItemBrickPackage("coins", "Coin Blocks");
        coins.addBrick(createBrick(100, ItemLayer.ABOVE, specialBlocksBMD, "","", ItemTab.ACTION,false,false,0,0x0, new String[] {"Gold", "G-Coins", "Yellow", "Money", "Primary", "Collect", "Magic", "Value", "Standard"}));
        coins.addBrick(createBrick(101, ItemLayer.ABOVE, specialBlocksBMD, "","", ItemTab.ACTION,false,false,13,0x0, new String[] {"Blue", "B-Coin", "Secondary", "Money", "Optional", "Collect", "Magic", "Value", "Standard"}));
        coins.addBrick(createBrick(110, ItemLayer.DECORATION, specialBlocksBMD, "hidden","", ItemTab.ACTION,false,false,26,0x0,new String[] {},true,true));
        coins.addBrick(createBrick(111, ItemLayer.DECORATION, specialBlocksBMD, "hidden","", ItemTab.ACTION,false,false,39,0x0,new String[] {},true,true));
        coins.addBrick(createBrick(ItemId.COINGATE, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,false,139,0xFFB88E15, new String[] {"Gate", "Yellow", "Gold", "Primary", "Lock"}));
        coins.addBrick(createBrick(ItemId.COINDOOR, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,true,43,0xFFB88E15, new String[] {"Door", "Yellow", "Gold", "Primary", "Lock"}));
        coins.addBrick(createBrick(ItemId.BLUECOINGATE, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,true,186,0xFF1C60F4, new String[] {"Gate", "Blue", "Optional", "Lock"}));
        coins.addBrick(createBrick(ItemId.BLUECOINDOOR, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,true,185,0xFF1C60F4, new String[] {"Door", "Blue", "Optional", "Lock"}));
        brickPackages.add(coins);

        ItemBrickPackage tools = new ItemBrickPackage("tools", "Tool Blocks");
        tools.addBrick(createBrick(255,ItemLayer.DECORATION,decoBlocksBMD,"","players spawn here",ItemTab.ACTION,false,false,255-128,0x0, new String[] {"Spawn", "Start", "Beginning", "Enter"}));
        tools.addBrick(createBrick(ItemId.WORLD_PORTAL_SPAWN,ItemLayer.DECORATION,decoBlocksBMD,"brickworldportal","a spawn point targetable by world portals",ItemTab.ACTION,true,false,354,0x0, new String[] {"Spawn", "Start", "Beginning", "Enter", "World", "Red"}));
        tools.addBrick(createBrick(ItemId.CHECKPOINT, ItemLayer.DECORATION, specialBlocksBMD, "","players respawn here when they die", ItemTab.ACTION,false,false,154,0x0, new String[] {"Checkpoint", "Respawn", "Safe", "Enter", "Save"}));
        tools.addBrick(createBrick(ItemId.RESET_POINT, ItemLayer.ABOVE, decoBlocksBMD, "", "resets the player's progress", ItemTab.ACTION, false, false, 288, 0x0, new String[] {"Reset", "Restart", "Retry"}));
        tools.addBrick(createBrick(ItemId.GOD_BLOCK, ItemLayer.ABOVE, decoBlocksBMD, "brickgodblock", "gives the player god mode privileges", ItemTab.ACTION, true, false, 320, 0x0, new String[] {"God"}));
        tools.addBrick(createBrick(ItemId.MAP_BLOCK, ItemLayer.ABOVE, decoBlocksBMD, "brickmapblock", "allows the player to use the minimap when disabled", ItemTab.ACTION, true, false, 355, 0x0, new String[] {"Map", "Minimap"}));
        brickPackages.add(tools);

        ItemBrickPackage crown = new ItemBrickPackage("crown", "Crown");
        crown.addBrick(createBrick(5,ItemLayer.DECORATION,blocksBMD,"","awards the player a golden crown",ItemTab.ACTION,false,true,5,0xFF43391F, new String[] {"Crown", "King", "Gold", "Action", "Prize", "Reward"}));
        crown.addBrick(createBrick(ItemId.CROWNGATE,ItemLayer.DECORATION,doorBlocksBMD,"brickcrowndoor","",ItemTab.ACTION,false,true,40,0x0, new String[] {"Crown", "Gate", "Gold", "Yellow", "Lock"}));
        crown.addBrick(createBrick(ItemId.CROWNDOOR,ItemLayer.DECORATION,doorBlocksBMD,"brickcrowndoor","",ItemTab.ACTION,false,true,41,0x0, new String[] {"Crown", "Door", "Gold", "Yellow", "Lock"}));
        crown.addBrick(createBrick(ItemId.BRICK_COMPLETE, ItemLayer.ABOVE, completeBlocksBMD, "","gives the player a silver crown, displays a win message", ItemTab.ACTION,false,false,0,0x0, new String[] {"Crown", "Trophy", "Win", "Complete", "Finish", "End", "Reward"}));
        crown.addBrick(createBrick(ItemId.SILVERCROWNGATE,ItemLayer.DECORATION,doorBlocksBMD,"brickcrowndoor","",ItemTab.ACTION,false,true,42,0x0, new String[] {"Crown", "Gate", "Silver", "Lock"}));
        crown.addBrick(createBrick(ItemId.SILVERCROWNDOOR,ItemLayer.DECORATION,doorBlocksBMD,"brickcrowndoor","",ItemTab.ACTION,false,true,43,0x0, new String[] {"Crown", "Door", "Silver", "Lock"}));
        brickPackages.add(crown);

        ItemBrickPackage speed = new ItemBrickPackage("boost", "Boost Arrows", new String[] {"Speed", "Fast", "Friction", "Arrow", "Motion", "Action", "Physics"});
        speed.addBrick(createBrick(ItemId.SPEED_LEFT, ItemLayer.DECORATION, blocksBMD, "brickboost","", ItemTab.ACTION,false,false,157,0x0, new String[] {"Left"}));
        speed.addBrick(createBrick(ItemId.SPEED_UP, ItemLayer.DECORATION, blocksBMD, "brickboost","", ItemTab.ACTION,false,false,159,0x0, new String[] {"Up", "Above"}));
        speed.addBrick(createBrick(ItemId.SPEED_RIGHT, ItemLayer.DECORATION, blocksBMD, "brickboost","", ItemTab.ACTION,false,false,158,0x0, new String[] {"Right"}));
        speed.addBrick(createBrick(ItemId.SPEED_DOWN, ItemLayer.DECORATION, blocksBMD, "brickboost","", ItemTab.ACTION,false,false,160,0x0, new String[] {"Down", "Below"}));
        brickPackages.add(speed);

        ItemBrickPackage ladders = new ItemBrickPackage("climbable", "Climbable Blocks", new String[] {"Transportation", "No", "Gravity", "Slow"});
        ladders.addBrick(createBrick(ItemId.CHAIN, ItemLayer.DECORATION, blocksBMD, "brickmedieval", "", ItemTab.ACTION, false, true, 135, 0x0, new String[] {"Chain", "Vertical", "Ninja"}));
        ladders.addBrick(createBrick(ItemId.METAL_LADDER, ItemLayer.DECORATION, decoBlocksBMD, "brickindustrial", "", ItemTab.ACTION, false, true, 331, 0x0, new String[] {"Ladder", "Vertical", "Metal", "Industrial"}));
        ladders.addBrick(createBrick(ItemId.NINJA_LADDER, ItemLayer.DECORATION, blocksBMD, "brickninja", "", ItemTab.ACTION, false, true, 98, 0x0, new String[] {"Ladder", "Vertical", "Ninja"}));
        ladders.addBrick(createBrick(ItemId.VINE_V, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,true,174,0x0, new String[] {"Vine", "Vertical", "Jungle", "Environment"}));
        ladders.addBrick(createBrick(ItemId.VINE_H, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.ACTION,false,true,175,0x0, new String[] {"Vine", "Horizontal", "Jungle", "Environment"}));
        ladders.addBrick(createBrick(ItemId.ROPE,ItemLayer.DECORATION,decoBlocksBMD,"brickcowboy","",ItemTab.ACTION,false,true,266,0x0, new String[] {"Rope", "Vertical", "Medieval", "Ninja"}));
        ladders.addBrick(createBrick(ItemId.FAIRYTALE_LADDER, ItemLayer.DECORATION, blocksBMD, "brickfairytale", "", ItemTab.ACTION, false, false, 252, 0x0, new String[] {"Ladder", "Vine", "Fairytale"}));
        ladders.addBrick(createBrick(ItemId.GARDEN_LATTICE_VINES, ItemLayer.DECORATION, blocksBMD, "brickgarden", "", ItemTab.ACTION, false, true, 303, 0x0, new String[] {"Ladder", "Vine", "Lattice", "Fence", "Brown", "Leaf", "Leaves", "Lattice", "Wood", "Garden"}));
        ladders.addBrick(createBrick(ItemId.GARDEN_STALK, ItemLayer.DECORATION, blocksBMD, "brickgarden", "", ItemTab.ACTION, false, true, 307, 0x0, new String[] {"Ladder", "Stalk", "Vine", "Vertical", "Green", "Bean", "Garden"}));
        ladders.addBrick(createBrick(ItemId.DUNGEON_CHAIN, ItemLayer.DECORATION, blocksBMD, "brickdungeon", "", ItemTab.ACTION, false, true, 315, 0x0, new String[] {"Halloween", "Dungeon", "Chain"}));
        brickPackages.add(ladders);

        ItemBrickPackage switches = new ItemBrickPackage("switches", "Switches", new String[] {"Lock", "Action"});
        switches.addBrick(createBrick(ItemId.SWITCH_PURPLE, ItemLayer.DECORATION, specialBlocksBMD, "brickswitchpurple","", ItemTab.ACTION, false, true, 310, 0x0, new String[] {"Switch", "Lever", "Button", "Purple", "Violet"}));
        switches.addBrick(createBrick(ItemId.RESET_PURPLE, ItemLayer.DECORATION, specialBlocksBMD, "brickswitchpurple","", ItemTab.ACTION, false, true, 866, 0x0, new String[] {"Reset", "Off", "Switch", "Lever", "Button", "Purple", "Violet"}));
        switches.addBrick(createBrick(ItemId.GATE_PURPLE, ItemLayer.DECORATION, doorBlocksBMD, "brickswitchpurple","", ItemTab.ACTION, false, false, 8, -10206822, new String[] {"Switch", "Gate", "Purple", "Violet"}));
        switches.addBrick(createBrick(ItemId.DOOR_PURPLE, ItemLayer.DECORATION, doorBlocksBMD, "brickswitchpurple","", ItemTab.ACTION, false, false, 9, -10206822, new String[] {"Switch", "Door", "Purple", "Violet"}));
        switches.addBrick(createBrick(ItemId.SWITCH_ORANGE, ItemLayer.DECORATION, specialBlocksBMD, "brickswitchorange","", ItemTab.ACTION, false, true, 422, 0x0, new String[] {"Switch", "Lever", "Button", "Orange"}));
        switches.addBrick(createBrick(ItemId.RESET_ORANGE, ItemLayer.DECORATION, specialBlocksBMD, "brickswitchorange","", ItemTab.ACTION, false, true, 867, 0x0, new String[] {"Reset", "Off", "Switch", "Lever", "Button", "Orange"}));
        switches.addBrick(createBrick(ItemId.GATE_ORANGE, ItemLayer.DECORATION, doorBlocksBMD, "brickswitchorange","", ItemTab.ACTION, false, false, 38, 0xFFD7642F, new String[] {"Switch", "Gate", "Orange"}));
        switches.addBrick(createBrick(ItemId.DOOR_ORANGE, ItemLayer.DECORATION, doorBlocksBMD, "brickswitchorange","", ItemTab.ACTION, false, false, 39, 0xFFD7642F, new String[] {"Switch", "Door", "Orange"}));
        brickPackages.add(switches);

        ItemBrickPackage death = new ItemBrickPackage("death", "Death Doors/Gates (+10)", new String[] {"Lock", "Die", "Skull", "Curse"});
        death.addBrick(createBrick(ItemId.DEATH_GATE, ItemLayer.DECORATION, blocksBMD, "brickdeathdoor","", ItemTab.ACTION, false, false, 198, 0xFFA9A9A9, new String[] {"Gate", "Off"}));
        death.addBrick(createBrick(ItemId.DEATH_DOOR, ItemLayer.DECORATION, blocksBMD, "brickdeathdoor","", ItemTab.ACTION, false, false, 199, 0xFFA9A9A9, new String[] {"Door", "On"}));
        brickPackages.add(death);

        ItemBrickPackage zombie = new ItemBrickPackage("zombie", "Zombie Blocks", new String[] {"Blue", "Grey", "Gray"});
        zombie.addBrick(createBrick(ItemId.EFFECT_ZOMBIE, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectzombie","infects the player with a horrible disease", ItemTab.ACTION, false, false, 5, 0x0, new String[] {"Effect", "Death", "Slow"}));
        zombie.addBrick(createBrick(ItemId.ZOMBIE_GATE, ItemLayer.DECORATION, doorBlocksBMD, "brickeffectzombie","", ItemTab.ACTION, false, false, 12, 0xFF62747F, new String[] {"Gate"}));
        zombie.addBrick(createBrick(ItemId.ZOMBIE_DOOR, ItemLayer.DECORATION, doorBlocksBMD, "brickeffectzombie","", ItemTab.ACTION, false, false, 13, 0xFF62747F, new String[] {"Door"}));
        brickPackages.add(zombie);

        ItemBrickPackage teams = new ItemBrickPackage("teams", "Team effect (+10)", new String[] {"Team", "Grey", "Gray"});
        teams.addBrick(createBrick(ItemId.EFFECT_TEAM, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectteam","sets the player's team to the specified color", ItemTab.ACTION, false, false, 6, 0x0, new String[] {"Effect", "Separation"}));
        teams.addBrick(createBrick(ItemId.TEAM_GATE, ItemLayer.DECORATION, doorBlocksBMD, "brickeffectteam","", ItemTab.ACTION, false, false, 29, 0x0, new String[] {"Gate", "Lock", "Off"}));
        teams.addBrick(createBrick(ItemId.TEAM_DOOR, ItemLayer.DECORATION, doorBlocksBMD, "brickeffectteam","", ItemTab.ACTION, false, false, 22, 0x0, new String[] {"Door", "Lock", "On"}));
        brickPackages.add(teams);

        ItemBrickPackage timed = new ItemBrickPackage("timed", "Timed Doors (+10)", new String[] {"Lock", "Wait", "Door", "Gate", "Grey", "Gray"});
        timed.addBrick(createBrick(ItemId.TIMEGATE, ItemLayer.DECORATION, specialBlocksBMD, "bricktimeddoor","", ItemTab.ACTION,false,false,337,-1, new String[] {"Off"}));
        timed.addBrick(createBrick(ItemId.TIMEDOOR, ItemLayer.DECORATION, specialBlocksBMD, "bricktimeddoor","", ItemTab.ACTION,false,true,332,-1, new String[] {"On"}));
        brickPackages.add(timed);

        ItemBrickPackage music = new ItemBrickPackage("music", "Music Blocks", new String[] {"Sound", "Entertainment", "Note", "Melody", "Instrument"});
        music.addBrick(createBrick(77, ItemLayer.DECORATION, blocksBMD, "bricknode","plays a sound when touched", ItemTab.ACTION,false,false,77,0x0, new String[] {"Piano", "Maestro"}));
        music.addBrick(createBrick(83, ItemLayer.DECORATION, blocksBMD, "brickdrums", "plays a sound when touched", ItemTab.ACTION, false, false, 83, 0x0, new String[] {"Drums"}));
        music.addBrick(createBrick(1520, ItemLayer.DECORATION, blocksBMD, "brickguitar","plays a sound when touched", ItemTab.ACTION, false, false, 286, 0x0, new String[] {"Guitar"}));
        brickPackages.add(music);

        ItemBrickPackage hazards = new ItemBrickPackage("hazards", "Hazard Blocks", new String[] {"Kill", "Die", "Respawn", "Death", "Trap", "Fatal", "Deadly"});
        hazards.addBrick(createBrick(ItemId.SPIKE,				 ItemLayer.DECORATION, specialBlocksBMD, "brickspike",		 "kills the player", ItemTab.ACTION, false, false, 157, 0x0, new String[] {"Spikes", "Morphable"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_CENTER,		 ItemLayer.DECORATION, specialBlocksBMD, "brickspike",		 "kills the player", ItemTab.ACTION, false, false, 739, 0x0, new String[] {"Spikes", "Floating", "Centre", "Center", "Central", "Mine", "Hover"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_SILVER,		 ItemLayer.DECORATION, specialBlocksBMD, "brickspikesilver", "kills the player", ItemTab.ACTION, false, false, 869, 0x0, new String[] {"Spikes","Morphable"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_SILVER_CENTER, ItemLayer.DECORATION, specialBlocksBMD, "brickspikesilver", "kills the player", ItemTab.ACTION, false, false, 872, 0x0, new String[] {"Spikes","Floating","Centre","Center","Central","Mine","Hover"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_BLACK,		 ItemLayer.DECORATION, specialBlocksBMD, "brickspikeblack",	 "kills the player", ItemTab.ACTION, false, false, 874, 0x0, new String[] {"Spikes","Morphable","Silver","Light","White","Gray","Grey"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_BLACK_CENTER,	 ItemLayer.DECORATION, specialBlocksBMD, "brickspikeblack",	 "kills the player", ItemTab.ACTION, false, false, 877, 0x0, new String[] {"Spikes","Floating","Centre","Center","Central","Mine","Hover","Silver","Light","White","Gray","Grey"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_RED,			 ItemLayer.DECORATION, specialBlocksBMD, "brickspikered",	 "kills the player", ItemTab.ACTION, false, false, 879, 0x0, new String[] {"Spikes","Morphable","Black","Dark","Gray","Grey"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_RED_CENTER,	 ItemLayer.DECORATION, specialBlocksBMD, "brickspikered",	 "kills the player", ItemTab.ACTION, false, false, 882, 0x0, new String[] {"Spikes","Floating","Centre","Center","Central","Mine","Hover","Black","Dark","Gray","Grey"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_GOLD,			 ItemLayer.DECORATION, specialBlocksBMD, "brickspikegold",	 "kills the player", ItemTab.ACTION, false, false, 884, 0x0, new String[] {"Spikes","Morphable","Yellow","Gold"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_GOLD_CENTER,	 ItemLayer.DECORATION, specialBlocksBMD, "brickspikegold",	 "kills the player", ItemTab.ACTION, false, false, 887, 0x0, new String[] {"Spikes","Floating","Centre","Center","Central","Mine","Hover","Yellow","Gold"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_GREEN,		 ItemLayer.DECORATION, specialBlocksBMD, "brickspikegreen",	 "kills the player", ItemTab.ACTION, false, false, 889, 0x0, new String[] {"Spikes","Morphable","Green"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_GREEN_CENTER,	 ItemLayer.DECORATION, specialBlocksBMD, "brickspikegreen",	 "kills the player", ItemTab.ACTION, false, false, 892, 0x0, new String[] {"Spikes","Floating","Centre","Center","Central","Mine","Hover","Green"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_BLUE,			 ItemLayer.DECORATION, specialBlocksBMD, "brickspikeblue",	 "kills the player", ItemTab.ACTION, false, false, 894, 0x0, new String[] {"Spikes","Morphable","Blue"}));
        hazards.addBrick(createBrick(ItemId.SPIKE_BLUE_CENTER,	 ItemLayer.DECORATION, specialBlocksBMD, "brickspikeblue",	 "kills the player", ItemTab.ACTION, false, false, 897, 0x0, new String[] {"Spikes","Floating","Centre","Center","Central","Mine","Hover","Blue"}));
        hazards.addBrick(createBrick(ItemId.FIRE,ItemLayer.ABOVE, specialBlocksBMD,"brickfire","kills the player",ItemTab.ACTION,false,false,188,0x0, new String[] {"Fire", "Burn", "Flames", "Animated", "Hell"}));
        brickPackages.add(hazards);

        ItemBrickPackage liquid = new ItemBrickPackage("liquids", "Liquid Blocks", new String[] {"Transportation", "Swim", "Fluid", "Action", "Environment"});
        liquid.addBrick(createBrick(ItemId.WATER, ItemLayer.ABOVE, specialBlocksBMD, "","", ItemTab.ACTION,false,false,196,0x0, new String[] {"Water", "Blue", "Up", "Float"}));
        liquid.addBrick(createBrick(ItemId.LAVA, ItemLayer.ABOVE, specialBlocksBMD, "bricklava","sets the player on fire and kills", ItemTab.ACTION,false,false,218,0x0, new String[] {"Lava", "Hazard", "Die", "Orange", "Death", "Burn", "Sink", "Hell"}));
        liquid.addBrick(createBrick(ItemId.MUD, ItemLayer.ABOVE, mudBlocksBMD, "brickswamp","slows the player down", ItemTab.ACTION,false,false,0,0x0, new String[] {"Mud", "Swamp", "Bog", "Slow", "Brown", "Sink"}));
        liquid.addBrick(createBrick(ItemId.TOXIC_WASTE, ItemLayer.ABOVE, specialBlocksBMD, "bricktoxic", "kills the player instantly on touch", ItemTab.ACTION, false, false, 746, 0x0, new String[] {"Toxic", "Waste", "Slow", "Green"}));
        brickPackages.add(liquid);

        ItemBrickPackage portal = new ItemBrickPackage("portals", "Portal Blocks", new String[] {"Teleport"});
        portal.addBrick(createBrick(ItemId.PORTAL_INVISIBLE,ItemLayer.DECORATION,specialBlocksBMD,"brickinvisibleportal","teleports the player to another portal",ItemTab.ACTION,false,true,138,0x0, new String[] {"Invisible", "Secrets", "Hidden"}));
        portal.addBrick(createBrick(242,ItemLayer.DECORATION,specialBlocksBMD,"brickportal","teleports the player to another portal",ItemTab.ACTION,false,true,52,-1, new String[] {"Visible", "Blue"}));
        portal.addBrick(createBrick(ItemId.WORLD_PORTAL,ItemLayer.DECORATION,specialBlocksBMD,"brickworldportal","teleports the player to another world",ItemTab.ACTION,true,true,113,-1, new String[] {"World", "Red"}));
        brickPackages.add(portal);

        ItemBrickPackage diamond = new ItemBrickPackage("diamond", "Diamond (+1)", new String[] {"Exclusive"});
        diamond.addBrick(createBrick(ItemId.DIAMOND,ItemLayer.DECORATION,decoBlocksBMD,"brickdiamond","changes the player's smiley to diamond",ItemTab.ACTION,true,true,241-128,-1,new String[] {"Luxury", "Smiley", "Expensive", "Gray", "Animated", "Shiny", "Grey"},false,true));
        brickPackages.add(diamond);

        ItemBrickPackage cake = new ItemBrickPackage("cake", "Cake");
        cake.addBrick(createBrick(ItemId.CAKE,ItemLayer.DECORATION,specialBlocksBMD,"brickcake","changes the player's smiley to party hat",ItemTab.ACTION,true,true,298,0x0, new String[] {"Party", "Birthday", "Smiley", "Hat", "Animated", "Food"}));
        brickPackages.add(cake);

        ItemBrickPackage hologram = new ItemBrickPackage("hologram", "Hologram");
        hologram.addBrick(createBrick(ItemId.HOLOGRAM,ItemLayer.DECORATION,specialBlocksBMD,"brickhologram","changes the player's smiley to hologram",ItemTab.ACTION,true,true,279,0x6666FFFF, new String[] {"Sci-fi", "Blue", "Transparent", "Smiley", "Future", "Animated"}));
        brickPackages.add(hologram);

        //DECORATIVEs
        ItemBrickPackage christmas2010 = new ItemBrickPackage("christmas 2010", "Christmas 2010 Blocks", new String[] {"Holiday", "Xmas", "Winter"});
        christmas2010.addBrick(createBrick(249,ItemLayer.ABOVE,decoBlocksBMD,"brickchristmas2010","",ItemTab.DECORATIVE,false,false,249-128,0x0, new String[] {"Snow", "Left", "Corner", "Snowdrift", "Environment"}));
        christmas2010.addBrick(createBrick(250,ItemLayer.ABOVE,decoBlocksBMD,"brickchristmas2010","",ItemTab.DECORATIVE,false,false,250-128,0x0, new String[] {"Snow", "Right", "Corner", "Snowdrift", "Environment"}));
        christmas2010.addBrick(createBrick(251,ItemLayer.ABOVE,decoBlocksBMD,"brickchristmas2010","",ItemTab.DECORATIVE,false,false,251-128,0x0, new String[] {"Tree", "Plant", "Nature", "Spruce", "Environment"}));
        christmas2010.addBrick(createBrick(252,ItemLayer.ABOVE,decoBlocksBMD,"brickchristmas2010","",ItemTab.DECORATIVE,false,false,252-128,0x0, new String[] {"Tree", "Snow", "Plant", "Lights", "Spruce", "Nature", "Environment"}));
        christmas2010.addBrick(createBrick(253,ItemLayer.ABOVE,decoBlocksBMD,"brickchristmas2010","",ItemTab.DECORATIVE,false,false,253-128,0x0, new String[] {"Fence", "Snow", "Wood"}));
        christmas2010.addBrick(createBrick(254,ItemLayer.ABOVE,decoBlocksBMD,"brickchristmas2010","",ItemTab.DECORATIVE,false,false,254-128,0x0, new String[] {"Fence", "Wood"}));
        brickPackages.add(christmas2010);

        ItemBrickPackage newyear2010 = new ItemBrickPackage("new year 2010", "New Year 2010", new String[] {"Holiday", "Baubles", "Ornament", "Light", "Bulb"});
        newyear2010.addBrick(createBrick(244,ItemLayer.DECORATION,decoBlocksBMD,"mixednewyear2010","",ItemTab.DECORATIVE,false,true,244-128,0x0, new String[] {"Pink", "Violet", "Purple"}));
        newyear2010.addBrick(createBrick(245,ItemLayer.DECORATION,decoBlocksBMD,"mixednewyear2010","",ItemTab.DECORATIVE,false,true,245-128,0x0, new String[] {"Yellow"}));
        newyear2010.addBrick(createBrick(246,ItemLayer.DECORATION,decoBlocksBMD,"mixednewyear2010","",ItemTab.DECORATIVE,false,true,246-128,0x0, new String[] {"Blue"}));
        newyear2010.addBrick(createBrick(247,ItemLayer.DECORATION,decoBlocksBMD,"mixednewyear2010","",ItemTab.DECORATIVE,false,true,247-128,0x0, new String[] {"Red"}));
        newyear2010.addBrick(createBrick(248,ItemLayer.DECORATION,decoBlocksBMD,"mixednewyear2010","",ItemTab.DECORATIVE,false,true,248-128,0x0, new String[] {"Green"}));
        brickPackages.add(newyear2010);

        ItemBrickPackage spring2011 = new ItemBrickPackage("spring 2011", "Spring package 2011", new String[] {"Season", "Nature", "Plant", "Environment"});
        spring2011.addBrick(createBrick(233,ItemLayer.ABOVE,decoBlocksBMD,"brickspring2011","",ItemTab.DECORATIVE,false,false,233-128,0x0, new String[] {"Grass", "Left", "Grass", "Short"}));
        spring2011.addBrick(createBrick(234,ItemLayer.ABOVE,decoBlocksBMD,"brickspring2011","",ItemTab.DECORATIVE,false,false,234-128,0x0, new String[] {"Grass", "Middle", "Short"}));
        spring2011.addBrick(createBrick(235,ItemLayer.ABOVE,decoBlocksBMD,"brickspring2011","",ItemTab.DECORATIVE,false,false,235-128,0x0, new String[] {"Grass", "Right", "Short"}));
        spring2011.addBrick(createBrick(236,ItemLayer.ABOVE,decoBlocksBMD,"brickspring2011","",ItemTab.DECORATIVE,false,false,236-128,0x0, new String[] {"Grass", "Hedge", "Left", "Big", "Tall Grass", "Bush"}));
        spring2011.addBrick(createBrick(237,ItemLayer.ABOVE,decoBlocksBMD,"brickspring2011","",ItemTab.DECORATIVE,false,false,237-128,0x0, new String[] {"Grass", "Hedge", "Middle", "Big", "Tall Grass", "Bush"}));
        spring2011.addBrick(createBrick(238,ItemLayer.ABOVE,decoBlocksBMD,"brickspring2011","",ItemTab.DECORATIVE,false,false,238-128,0x0, new String[] {"Grass", "Hedge", "Right", "Big", "Tall Grass", "Bush"}));
        spring2011.addBrick(createBrick(239,ItemLayer.ABOVE,decoBlocksBMD,"brickspring2011","",ItemTab.DECORATIVE,false,false,239-128,0x0, new String[] {"Flower", "Sun", "Yellow", "Flora"}));
        spring2011.addBrick(createBrick(240,ItemLayer.ABOVE,decoBlocksBMD,"brickspring2011","",ItemTab.DECORATIVE,false,false,240-128,0x0, new String[] {"Bush", "Plant", "Shrub", "Flora"}));
        brickPackages.add(spring2011);

        ItemBrickPackage prizes = new ItemBrickPackage("Prizes", "Your Prizes", new String[] {"Prize"});
        prizes.addBrick(createBrick(223,ItemLayer.ABOVE,decoBlocksBMD,"brickhwtrophy","trophy for the Halloween 2011 contest winners",ItemTab.DECORATIVE,false,false,95,0x0,new String[] {"Cup", "Trophy", "Halloween", "Gold", "Thanel"},false,true));
        prizes.addBrick(createBrick(478,ItemLayer.ABOVE,decoBlocksBMD,"brickspringtrophybronze","prize for winning third place in the Spring 2016 contest",ItemTab.DECORATIVE,false,false,298,0x0,new String[] {"Trophy", "Bronze", "Spring", "Flower"},false,true));
        prizes.addBrick(createBrick(479,ItemLayer.ABOVE,decoBlocksBMD,"brickspringtrophysilver","prize for winning second place in the Spring 2016 contest ",ItemTab.DECORATIVE,false,false,297,0x0,new String[] {"Trophy", "Silver", "Spring", "Flower"},false,true));
        prizes.addBrick(createBrick(480,ItemLayer.ABOVE,decoBlocksBMD,"brickspringtrophygold","prize for winning first place in the Spring 2016 contest",ItemTab.DECORATIVE,false,false,296,0x0,new String[] {"Trophy", "Gold", "Spring", "Flower"},false,true));
        prizes.addBrick(createBrick(484,ItemLayer.ABOVE,decoBlocksBMD,"bricksummertrophybronze","prize for winning third place in the Summer 2016 contest",ItemTab.DECORATIVE,false,false,301,0x0,new String[] {"Trophy", "Bronze", "Summer", "Sun"},false,true));
        prizes.addBrick(createBrick(485,ItemLayer.ABOVE,decoBlocksBMD,"bricksummertrophysilver","prize for winning second place in the Summer 2016 contest ",ItemTab.DECORATIVE,false,false,300,0x0,new String[] {"Trophy", "Silver", "Summer", "Sun"},false,true));
        prizes.addBrick(createBrick(486,ItemLayer.ABOVE,decoBlocksBMD,"bricksummertrophygold","prize for winning first place in the Summer 2016 contest",ItemTab.DECORATIVE,false,false,299,0x0,new String[] {"Trophy", "Gold", "Summer", "Sun"},false,true));
        prizes.addBrick(createBrick(1540,ItemLayer.ABOVE,decoBlocksBMD,"brickdesigntrophybronze","prize for winning third place in the Design contest",ItemTab.DECORATIVE,false,false,338,0x0,new String[] {"Trophy", "Bronze", "Design"},false,true));
        prizes.addBrick(createBrick(1541,ItemLayer.ABOVE,decoBlocksBMD,"brickdesigntrophysilver","prize for winning second place in the Design contest",ItemTab.DECORATIVE,false,false,337,0x0,new String[] {"Trophy", "Silver", "Design"},false,true));
        prizes.addBrick(createBrick(1542,ItemLayer.ABOVE,decoBlocksBMD,"brickdesigntrophygold","prize for winning first place in the Design contest",ItemTab.DECORATIVE,false,false,336,0x0,new String[] {"Trophy", "Gold", "Design"},false,true));
        brickPackages.add(prizes);

        ItemBrickPackage easter_2012 = new ItemBrickPackage("easter 2012", "Easter  decorations 2012" , new String[] {"Holiday", "Decor", "Egg"});
        easter_2012.addBrick(createBrick(256,ItemLayer.ABOVE,decoBlocksBMD,"brickeaster2012","",ItemTab.DECORATIVE,false,false,256-128,0x0, new String[] {"Cyan", "Teal", "Wavy"}));
        easter_2012.addBrick(createBrick(257,ItemLayer.ABOVE,decoBlocksBMD,"brickeaster2012","",ItemTab.DECORATIVE,false,false,257-128,0x0, new String[] {"Pink", "Wavy"}));
        easter_2012.addBrick(createBrick(258,ItemLayer.ABOVE,decoBlocksBMD,"brickeaster2012","",ItemTab.DECORATIVE,false,false,258-128,0x0, new String[] {"Green", "Line", "Yellow"}));
        easter_2012.addBrick(createBrick(259,ItemLayer.ABOVE,decoBlocksBMD,"brickeaster2012","",ItemTab.DECORATIVE,false,false,259-128,0x0, new String[] {"Pink", "Stripes"}));
        easter_2012.addBrick(createBrick(260,ItemLayer.ABOVE,decoBlocksBMD,"brickeaster2012","",ItemTab.DECORATIVE,false,false,260-128,0x0, new String[] {"Green", "Dots"}));
        brickPackages.add(easter_2012);

        //BACKGROUNDs

        ItemBrickPackage basicbg = new ItemBrickPackage("basic", "Basic Background Blocks");
        basicbg.addBrick(createBrick(715,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,209,-1, new String[] {"White", "Light"}));
        basicbg.addBrick(createBrick(500,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,500-500,-1, new String[] {"Gray", "Grey"}));
        basicbg.addBrick(createBrick(645,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,139,-1, new String[] {"Black", "Dark", "Shadow"}));
        basicbg.addBrick(createBrick(503,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,503-500,-1, new String[] {"Red"}));
        basicbg.addBrick(createBrick(644,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,138,-1, new String[] {"Orange"}));
        basicbg.addBrick(createBrick(504,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,504-500,-1, new String[] {"Yellow", "Lime", "Green"}));
        basicbg.addBrick(createBrick(505,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,505-500,-1, new String[] {"Green", "Backdrop"}));
        basicbg.addBrick(createBrick(506,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,506-500,-1, new String[] {"Cyan", "Teal", "Turquoise", "Blue"}));
        basicbg.addBrick(createBrick(501,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,501-500,-1, new String[] {"Blue"}));
        basicbg.addBrick(createBrick(502,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,502-500,-1, new String[] {"Purple", "Magenta", "Pink", "Violet"}));
        brickPackages.add(basicbg);

        ItemBrickPackage betabg = new ItemBrickPackage("beta", "Beta Access", new String[] {"Exclusive"});
        betabg.addBrick(createBrick(743,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,237,-1, new String[] {"White", "Light"}));
        betabg.addBrick(createBrick(744,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,238,-1, new String[] {"Grey", "Gray", "Taupe"}));
        betabg.addBrick(createBrick(745,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,239,-1, new String[] {"Black", "Dark", "Onyx"}));
        betabg.addBrick(createBrick(746,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,240,-1, new String[] {"Red", "Ruby", "Garnet"}));
        betabg.addBrick(createBrick(747,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,241,-1, new String[] {"Orange", "Copper"}));
        betabg.addBrick(createBrick(748,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,242,-1, new String[] {"Yellow", "Gold", "Jasmine"}));
        betabg.addBrick(createBrick(749,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,243,-1, new String[] {"Green", "Emerald", "Malachite"}));
        betabg.addBrick(createBrick(750,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,244,-1, new String[] {"Blue", "Cyan", "Light blue", "Aquamarine", "Turquoise"}));
        betabg.addBrick(createBrick(751,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,245,-1, new String[] {"Blue", "Sapphire"}));
        betabg.addBrick(createBrick(752,ItemLayer.BACKGROUND,bgBlocksBMD,"pro","",ItemTab.BACKGROUND,false,true,246,-1, new String[] {"Purple", "Pink", "Magenta", "Violet", "Amethyst"}));
        brickPackages.add(betabg);

        ItemBrickPackage brickbg = new ItemBrickPackage("brick", "Brick Background Blocks");
        brickbg.addBrick(createBrick(716,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,210,0xFF5B5B5B, new String[] {"White", "Light"}));
        brickbg.addBrick(createBrick(646,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,140,0xFF282828, new String[] {"Gray", "Grey"}));
        brickbg.addBrick(createBrick(648,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,142,0xFF0F0F0F, new String[] {"Black", "Dark", "Shadow"}));
        brickbg.addBrick(createBrick(511,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,11,-1, new String[] {"Red"}));
        brickbg.addBrick(createBrick(507,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,7,-1, new String[] {"Orange", "Brown", "Dirt", "Soil"}));
        brickbg.addBrick(createBrick(512,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,12,-1, new String[] {"Yellow", "Soil", "Brown"}));
        brickbg.addBrick(createBrick(510,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,10,-1, new String[] {"Green", "Lime"}));
        brickbg.addBrick(createBrick(508,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,8,-1, new String[] {"Cyan", "Teal", "Turquoise", "Blue"}));
        brickbg.addBrick(createBrick(647,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,141,-1, new String[] {"Blue"}));
        brickbg.addBrick(createBrick(509,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,9,-1, new String[] {"Magenta", "Purple", "Violet"}));
        brickPackages.add(brickbg);

        ItemBrickPackage checker = new ItemBrickPackage("checker", "Checker Backgrounds", new String[] {"Checkered"});
        checker.addBrick(createBrick(718,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,212,-1, new String[] {"White", "Light"}));
        checker.addBrick(createBrick(513,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,513-500,-1, new String[] {"Gray", "Grey", "Shadow"}));
        checker.addBrick(createBrick(650,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,144,-1, new String[] {"Black", "Dark", "Shadow"}));
        checker.addBrick(createBrick(516,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,516-500,-1, new String[] {"Red", "Pink"}));
        checker.addBrick(createBrick(649,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,143,-1, new String[] {"Orange"}));
        checker.addBrick(createBrick(517,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,517-500,-1 , new String[] {"Yellow", "Lime"}));
        checker.addBrick(createBrick(518,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,518-500,-1, new String[] {"Green"}));
        checker.addBrick(createBrick(519,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,519-500,-1, new String[] {"Cyan", "Teal", "Turquoise", "Blue"}));
        checker.addBrick(createBrick(514,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,514-500,-1, new String[] {"Blue"}));
        checker.addBrick(createBrick(515,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,515-500,-1, new String[] {"Purple", "Magenta", "Pink", "Violet"}));
        brickPackages.add(checker);

        ItemBrickPackage dark = new ItemBrickPackage("dark", "Solid Dark Backgrounds", new String[] {"Solid"});
        dark.addBrick(createBrick(719,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,213,-1, new String[] {"White", "Light"}));
        dark.addBrick(createBrick(520,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,520-500,-1, new String[] {"Gray", "Grey", "Shadow"}));
        dark.addBrick(createBrick(652,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,146,-1, new String[] {"Black", "Dark", "Shadow"}));
        dark.addBrick(createBrick(523,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,523-500,-1, new String[] {"Red"}));
        dark.addBrick(createBrick(651,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,145,-1, new String[] {"Orange"}));
        dark.addBrick(createBrick(524,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,524-500,-1, new String[] {"Yellow", "Lime"}));
        dark.addBrick(createBrick(525,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,525-500,-1, new String[] {"Green"}));
        dark.addBrick(createBrick(526,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,526-500,-1, new String[] {"Cyan", "Teal", "Turquoise", "Blue"}));
        dark.addBrick(createBrick(521,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,521-500,-1, new String[] {"Blue"}));
        dark.addBrick(createBrick(522,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,522-500,-1, new String[] {"Purple", "Magenta", "Pink", "Violet"}));
        brickPackages.add(dark);

        ItemBrickPackage normalbackgrounds = new ItemBrickPackage("normal", "Solid backrounds", new String[] {"Solid"});
        normalbackgrounds.addBrick(createBrick(717,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,211,-1,new String[] {"White", "Light"}));
        normalbackgrounds.addBrick(createBrick(610,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,110,-1, new String[] {"Gray", "Grey", "Shadow"}));
        normalbackgrounds.addBrick(createBrick(654,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,148,-1, new String[] {"Black", "Dark", "Shadow"}));
        normalbackgrounds.addBrick(createBrick(613,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,113,-1, new String[] {"Red"}));
        normalbackgrounds.addBrick(createBrick(653,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,147,-1, new String[] {"Orange"}));
        normalbackgrounds.addBrick(createBrick(614,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,114,-1, new String[] {"Yellow", "Lime"}));
        normalbackgrounds.addBrick(createBrick(615,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,115,-1, new String[] {"Green"}));
        normalbackgrounds.addBrick(createBrick(616,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,116,-1, new String[] {"Cyan", "Teal", "Turquoise", "Blue"}));
        normalbackgrounds.addBrick(createBrick(611,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,111,-1, new String[] {"Blue"}));
        normalbackgrounds.addBrick(createBrick(612,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,112,-1, new String[] {"Purple", "Magenta", "Pink", "Violet"}));
        brickPackages.add(normalbackgrounds);

        ItemBrickPackage pastel = new ItemBrickPackage("pastel", "Pretty Pastel Backgrounds", new String[] {"Solid", "Bright"});
        pastel.addBrick(createBrick(532,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,32,-1, new String[] {"Pink", "Red", "Magenta"}));
        pastel.addBrick(createBrick(676,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,170,-1, new String[] {"Orange"}));
        pastel.addBrick(createBrick(527,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,27,-1, new String[] {"Yellow"}));
        pastel.addBrick(createBrick(529,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,29,-1, new String[] {"Yellow", "Green", "Lime"}));
        pastel.addBrick(createBrick(528,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,28,-1, new String[] {"Green"}));
        pastel.addBrick(createBrick(530,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,30,-1, new String[] {"Cyan", "Light Blue", "Sky"}));
        pastel.addBrick(createBrick(531,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,31,-1, new String[] {"Blue", "Sky"}));
        pastel.addBrick(createBrick(677,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,false,171,-1, new String[] {"Purple"}));
        brickPackages.add(pastel);


        ItemBrickPackage canvas = new ItemBrickPackage("canvas", "Canvas Backgrounds", new String[] {"Rough", "Textured"});
        canvas.addBrick(createBrick(538, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,38,-1, new String[] {"Gray", "Grey"}));
        canvas.addBrick(createBrick(671, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,165,-1, new String[] {"Red"}));
        canvas.addBrick(createBrick(533, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,33,-1, new String[] {"Orange"}));
        canvas.addBrick(createBrick(534, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,34,-1, new String[] {"Beige", "Brown", "Tan"}));
        canvas.addBrick(createBrick(535, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,35,-1, new String[] {"Yellow"}));
        canvas.addBrick(createBrick(536, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,36,-1, new String[] {"Green"}));
        canvas.addBrick(createBrick(537, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,37,-1, new String[] {"Cyan", "Light Blue", "Water"}));
        canvas.addBrick(createBrick(606, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,106,-1, new String[] {"Blue"}));
        canvas.addBrick(createBrick(672, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcanvas","", ItemTab.BACKGROUND,false,false,166,-1, new String[] {"Purple", "Violet"}));

        brickPackages.add(canvas);

        ItemBrickPackage carnival = new ItemBrickPackage("carnival", "Carnival backgrounds");
        carnival.addBrick(createBrick(545, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcarnival","", ItemTab.BACKGROUND,false,false,45,-1, new String[] {"Stripes", "Red", "Yellow", "McDonald's"}));
        carnival.addBrick(createBrick(546, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcarnival","", ItemTab.BACKGROUND,false,false,46,-1, new String[] {"Stripes", "Purple", "Violet", "Dark"}));
        carnival.addBrick(createBrick(547, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcarnival","", ItemTab.BACKGROUND,false,false,47,-1, new String[] {"Magenta", "Pink"}));
        carnival.addBrick(createBrick(548, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcarnival","", ItemTab.BACKGROUND,false,false,48,-1, new String[] {"Checker", "Black", "White", "Double"}));
        carnival.addBrick(createBrick(549, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcarnival","", ItemTab.BACKGROUND,false,false,49,-1, new String[] {"Green"}));
        carnival.addBrick(createBrick(558, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcarnival","", ItemTab.BACKGROUND,false,false,58,-1 , new String[] {"Yellow"}));
        carnival.addBrick(createBrick(563, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcarnival","", ItemTab.BACKGROUND,false,false,63,-1, new String[] {"Poland", "Stripes", "Red", "White"}));
        carnival.addBrick(createBrick(607, ItemLayer.BACKGROUND, bgBlocksBMD, "brickbgcarnival","", ItemTab.BACKGROUND,false,false,107,-1, new String[] {"Blue", "Solid"}));
        brickPackages.add(carnival);

        ItemBrickPackage candy = new ItemBrickPackage("candy", "CandyLand", new String[] {"Sweet", "Sugar", "Food"});
        candy.addBrick(createBrick(60,ItemLayer.FORGROUND,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,60,-1, new String[] {"Pink", "Cotton Candy", "Fairy Floss", "Stripes", "Pastel"}));
        candy.addBrick(createBrick(1154,ItemLayer.FORGROUND,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,310,-1, new String[] {"Blue", "Cotton Candy", "Fairy Floss", "Stripes", "Pastel"}));
        candy.addBrick(createBrick(61,ItemLayer.DECORATION,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,61,-1, new String[] {"Platform", "Magenta", "Pink", "One-Way"}));
        candy.addBrick(createBrick(62,ItemLayer.DECORATION,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,62,-1, new String[] {"Platform", "Red", "One-Way", "One way"}));
        candy.addBrick(createBrick(63,ItemLayer.DECORATION,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,63,-1, new String[] {"Platform", "Cyan", "One-Way", "One way"}));
        candy.addBrick(createBrick(64,ItemLayer.DECORATION,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,64,-1, new String[] {"Platform", "Green", "One-Way", "One way"}));
        candy.addBrick(createBrick(65,ItemLayer.DECORATION,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,65,-1, new String[] {"Candy", "Cane", "Red", "White", "Stripes"}));
        candy.addBrick(createBrick(66,ItemLayer.DECORATION,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,66,-1, new String[] {"Cake", "Licorice", "Hamburger", "Sandwich", "Stripes"}));
        candy.addBrick(createBrick(67,ItemLayer.DECORATION,blocksBMD,"brickcandy","",ItemTab.BLOCK,false,true,67,-1, new String[] {"Gingerbread", "Chocolate", "Brown", "Cake", "Dirt"}));
        candy.addBrick(createBrick(227,ItemLayer.ABOVE,decoBlocksBMD,"brickcandy","",ItemTab.DECORATIVE,false,false,99,0x0, new String[] {"Cream", "Small", "Creme", "Whipped Topping", "White"}));
        candy.addBrick(createBrick(431,ItemLayer.ABOVE,decoBlocksBMD,"brickcandy","",ItemTab.DECORATIVE,false,false,273,0x0, new String[] {"Cream", "Big", "Creme", "Whipped Topping", "White"}));
        candy.addBrick(createBrick(432,ItemLayer.ABOVE,decoBlocksBMD,"brickcandy","",ItemTab.DECORATIVE,false,false,274,0x0, new String[] {"Gumdrop", "Red"}));
        candy.addBrick(createBrick(433,ItemLayer.ABOVE,decoBlocksBMD,"brickcandy","",ItemTab.DECORATIVE,false,false,275,0x0, new String[] {"Gumdrop", "Green"}));
        candy.addBrick(createBrick(434,ItemLayer.ABOVE,decoBlocksBMD,"brickcandy","",ItemTab.DECORATIVE,false,false,276,0x0, new String[] {"Gumdrop", "Pink"}));
        candy.addBrick(createBrick(539,ItemLayer.BACKGROUND,bgBlocksBMD,"brickcandy","",ItemTab.BACKGROUND,false,false,39,-1, new String[] {"Stripes", "Pink", "Pastel"}));
        candy.addBrick(createBrick(540,ItemLayer.BACKGROUND,bgBlocksBMD,"brickcandy","",ItemTab.BACKGROUND,false,false,40,-1, new String[] {"Stripes", "Blue", "Pastel"}));
        brickPackages.add(candy);

        ItemBrickPackage summer2011 = new ItemBrickPackage("summer 2011", "Summer package 2011", new String[] {"Season", "Hot", "Beach"});
        summer2011.addBrick(createBrick(59,ItemLayer.FORGROUND,blocksBMD,"bricksummer2011","",ItemTab.BLOCK,false,true,59,-1, new String[] {"Sand", "Environment"}));
        summer2011.addBrick(createBrick(228,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2011","",ItemTab.DECORATIVE,false,false,228-128,0x0, new String[] {"Umbrella", "Parasol", "Beach", "Sun"}));
        summer2011.addBrick(createBrick(229,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2011","",ItemTab.DECORATIVE,false,false,229-128,0x0, new String[] {"Left", "Sand", "Corner", "Dune", "Environment"}));
        summer2011.addBrick(createBrick(230,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2011","",ItemTab.DECORATIVE,false,false,230-128,0x0, new String[] {"Right", "Sand", "Corner", "Dune", "Environment"}));
        summer2011.addBrick(createBrick(231,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2011","",ItemTab.DECORATIVE,false,false,231-128,0x0, new String[] {"Rock", "Stone", "Environment"}));
        summer2011.addBrick(createBrick(232,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2011","",ItemTab.DECORATIVE,false,false,232-128,0x0, new String[] {"Bush", "Nature", "Plant", "Yellow", "Dead", "Tumbleweed", "Environment"}));
        brickPackages.add(summer2011);


        ItemBrickPackage halloween2011 = new ItemBrickPackage("halloween 2011", "Halloween pack", new String[] {"Scary", "Holiday", "Creepy"});
        halloween2011.addBrick(createBrick(68,ItemLayer.FORGROUND,blocksBMD,"brickhw2011","",ItemTab.BLOCK,false,true,68,-1, new String[] {"Brick", "Gray", "Grey", "Bloody", "Wall", "House"}));
        halloween2011.addBrick(createBrick(69,ItemLayer.FORGROUND,blocksBMD,"brickhw2011","",ItemTab.BLOCK,false,true,69,-1, new String[] {"Basic", "Gray", "Grey"}));
        halloween2011.addBrick(createBrick(224,ItemLayer.ABOVE,decoBlocksBMD,"brickhw2011","",ItemTab.DECORATIVE,false,false,224-128,0x0, new String[] {"Grave", "Tombstone", "Headstone", "Marker", "Dead"}));
        halloween2011.addBrick(createBrick(225,ItemLayer.ABOVE,decoBlocksBMD,"brickhw2011","",ItemTab.DECORATIVE,false,true,225-128,0x0, new String[] {"Cobweb", "Spider Web", "Right", "Corner"}));
        halloween2011.addBrick(createBrick(226,ItemLayer.ABOVE,decoBlocksBMD,"brickhw2011","",ItemTab.DECORATIVE,false,true,226-128,0x0, new String[] {"Cobweb", "Spider Web", "Left", "Corner"}));
        halloween2011.addBrick(createBrick(541,ItemLayer.BACKGROUND,bgBlocksBMD,"brickhw2011","",ItemTab.BACKGROUND,false,false,541-500,-1, new String[] {"Stone", "Gray", "Grey"}));
        halloween2011.addBrick(createBrick(542,ItemLayer.BACKGROUND,bgBlocksBMD,"brickhw2011","",ItemTab.BACKGROUND,false,false,542-500,-1, new String[] {"Brick", "Gray", "Grey", "House"}));
        halloween2011.addBrick(createBrick(543,ItemLayer.BACKGROUND,bgBlocksBMD,"brickhw2011","",ItemTab.BACKGROUND,false,false,543-500,-1, new String[] {"Brick", "Damaged", "Right", "Ruins", "Corner", "House"}));
        halloween2011.addBrick(createBrick(544,ItemLayer.BACKGROUND,bgBlocksBMD,"brickhw2011","",ItemTab.BACKGROUND,false,false,544-500,-1, new String[] {"Brick", "Damaged", "Left", "Ruins", "Corner", "House"}));
        brickPackages.add(halloween2011);


        ItemBrickPackage christmas2011 = new ItemBrickPackage("christmas 2011", "XMAS  decorations", new String[] {"2011", "Xmas", "Bauble", "Ornament", "Holiday"});
        christmas2011.addBrick(createBrick(218,ItemLayer.DECORATION,decoBlocksBMD,"brickxmas2011","",ItemTab.DECORATIVE,false,true,218-128,0x0, new String[] {"Red", "Bulb", "Round", "Holiday", "Circle"}));
        christmas2011.addBrick(createBrick(219,ItemLayer.DECORATION,decoBlocksBMD,"brickxmas2011","",ItemTab.DECORATIVE,false,true,219-128,0x0, new String[] {"Green", "Bulb", "Round", "Holiday", "Circle"}));
        christmas2011.addBrick(createBrick(220,ItemLayer.DECORATION,decoBlocksBMD,"brickxmas2011","",ItemTab.DECORATIVE,false,true,220-128,0x0, new String[] {"Blue", "Bulb", "Round", "Holiday", "Circle"}));
        christmas2011.addBrick(createBrick(221,ItemLayer.DECORATION,decoBlocksBMD,"brickxmas2011","",ItemTab.DECORATIVE,false,true,221-128,0x0, new String[] {"Circle", "Wreath", "Garland", "Holiday", "Green"}));
        christmas2011.addBrick(createBrick(222,ItemLayer.DECORATION,decoBlocksBMD,"brickxmas2011","",ItemTab.DECORATIVE,false,true,222-128,0x0, new String[] {"Star", "Yellow", "Night", "Sky"}));
        brickPackages.add(christmas2011);

        ItemBrickPackage scifi = new ItemBrickPackage("sci-fi", "Sci-Fi Package", new String[] {"Future", "Science Fiction", "Alien", "UFO"});
        scifi.addBrick(createBrick(84,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,84,-1, new String[] {"Red", "Screen", "Panel"}));
        scifi.addBrick(createBrick(85,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,85,-1, new String[] {"Blue", "Screen", "Panel"}));
        scifi.addBrick(createBrick(1150,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,308,-1, new String[] {"Green", "Screen", "Panel"}));
        scifi.addBrick(createBrick(1151,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,309,-1, new String[] {"Yellow", "Screen", "Panel"}));
        scifi.addBrick(createBrick(1162,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,317,-1, new String[] {"Magenta","Pink","Purple","Screen","Panel"}));
        scifi.addBrick(createBrick(1163,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,318,-1, new String[] {"Cyan","Screen","Panel"}));
        scifi.addBrick(createBrick(86,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,86,-1, new String[] {"Metal", "Gray", "Bumpy", "Grey"}));
        scifi.addBrick(createBrick(87,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,87,0xFFFFFFFF, new String[] {"Metal", "White", "Grey", "Gray"}));
        scifi.addBrick(createBrick(88,ItemLayer.FORGROUND,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,88,-1, new String[] {"Brown", "Camouflauge", "Leopard", "Carpet"}));
        scifi.addBrick(createBrick(89,ItemLayer.DECORATION,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,89,-1, new String[] {"Platform", "Red", "One-way", "One way"}));
        scifi.addBrick(createBrick(90,ItemLayer.DECORATION,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,90,-1, new String[] {"Platform", "Blue", "One-way", "One way"}));
        scifi.addBrick(createBrick(91,ItemLayer.DECORATION,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,91,-1, new String[] {"Platform", "Green", "One-way", "One way"}));
        scifi.addBrick(createBrick(ItemId.ONEWAY_SCIFI_YELLOW,ItemLayer.DECORATION,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,234,-1, new String[] {"Platform", "Yellow", "One-way", "One way"}));
        scifi.addBrick(createBrick(ItemId.ONEWAY_SCIFI_MAGENTA,ItemLayer.DECORATION,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,319,-1,new String[] {"Platform","Magenta","Pink","Purple","One-way","One way"}));
        scifi.addBrick(createBrick(ItemId.ONEWAY_SCIFI_CYAN,ItemLayer.DECORATION,blocksBMD,"brickscifi","",ItemTab.BLOCK,false,true,320,-1,   new String[] {"Platform","Cyan","One-way","One way"}));
        scifi.addBrick(createBrick(ItemId.GLOWYLINE_BLUE_SLOPE,ItemLayer.DECORATION,specialBlocksBMD,"brickscifi","",ItemTab.DECORATIVE,false,true,177,0x0, new String[] {"Morphable", "Laser", "Neon", "Blue", "Flourescent", "Corner"}));
        scifi.addBrick(createBrick(ItemId.GLOWY_LINE_BLUE_STRAIGHT,ItemLayer.DECORATION,specialBlocksBMD,"brickscifi","",ItemTab.DECORATIVE,false,true,181,0x0, new String[] {"Morphable", "Laser", "Neon", "Blue", "Flourescent", "Middle"}));
        scifi.addBrick(createBrick(ItemId.GLOWY_LINE_GREEN_SLOPE,ItemLayer.DECORATION,specialBlocksBMD,"brickscifi","",ItemTab.DECORATIVE,false,true,169,0x0, new String[] {"Morphable", "Laser", "Neon", "Green", "Flourescent", "Corner"}));
        scifi.addBrick(createBrick(ItemId.GLOWY_LINE_GREEN_STRAIGHT,ItemLayer.DECORATION,specialBlocksBMD,"brickscifi","",ItemTab.DECORATIVE,false,true,173,0x0, new String[] {"Morphable", "Laser", "Neon", "Green", "Flourescent", "Middle"}));
        scifi.addBrick(createBrick(ItemId.GLOWY_LINE_YELLOW_SLOPE,ItemLayer.DECORATION,specialBlocksBMD,"brickscifi","",ItemTab.DECORATIVE,false,true,161,0x0, new String[] {"Morphable", "Laser", "Neon", "Yellow", "Orange", "Flourescent", "Corner"}));
        scifi.addBrick(createBrick(ItemId.GLOWY_LINE_YELLOW_STRAIGHT,ItemLayer.DECORATION,specialBlocksBMD,"brickscifi","",ItemTab.DECORATIVE,false,true,165,0x0, new String[] {"Morphable", "Laser", "Neon", "Yellow", "Orange", "Flourescent", "Middle"}));
        scifi.addBrick(createBrick(ItemId.GLOWY_LINE_RED_SLOPE,ItemLayer.DECORATION,specialBlocksBMD,"brickscifi","",ItemTab.DECORATIVE,false,true,409,0x0, new String[] {"Morphable", "Laser", "Neon", "Red", "Pink", "Flourescent", "Corner"}));
        scifi.addBrick(createBrick(ItemId.GLOWY_LINE_RED_STRAIGHT,ItemLayer.DECORATION,specialBlocksBMD,"brickscifi","",ItemTab.DECORATIVE,false,true,413,0x0, new String[] {"Morphable", "Laser", "Neon", "Red", "Pink", "Flourescent", "Middle"}));
        scifi.addBrick(createBrick(637,ItemLayer.BACKGROUND,bgBlocksBMD,"brickscifi","",ItemTab.BACKGROUND,false,true,131,0xff737D81, new String[] {"Gray", "Outline", "Grey"}));
        brickPackages.add(scifi);

        ItemBrickPackage prison = new ItemBrickPackage("prison", "Prison", new String[] {"Cell", "Jail"});
        prison.addBrick(createBrick(261,ItemLayer.ABOVE,decoBlocksBMD,"brickprison","",ItemTab.DECORATIVE,false,false,261-128,0x0, new String[] {"Bars", "Metal"}));
        prison.addBrick(createBrick(92,ItemLayer.FORGROUND,blocksBMD,"brickprison","",ItemTab.BLOCK,false,true,92,-1, new String[] {"Wall", "Brick", "Grey", "Gray", "House"}));
        prison.addBrick(createBrick(550,ItemLayer.BACKGROUND,bgBlocksBMD,"brickprison","",ItemTab.BACKGROUND,false,true,50,-1, new String[] {"Wall", "Brick", "Background", "Grey", "Gray", "House"}));
        prison.addBrick(createBrick(551,ItemLayer.BACKGROUND,bgBlocksBMD,"brickprison","",ItemTab.BACKGROUND,false,true,51,-1, new String[] {"Window", "Light", "Orange", "Brick"}));
        prison.addBrick(createBrick(552,ItemLayer.BACKGROUND,bgBlocksBMD,"brickprison","",ItemTab.BACKGROUND,false,true,52,-1, new String[] {"Window", "Light", "Blue", "Brick"}));
        prison.addBrick(createBrick(553,ItemLayer.BACKGROUND,bgBlocksBMD,"brickprison","",ItemTab.BACKGROUND,false,true,53,-1, new String[] {"Window", "Dark", "Vent", "Brick", "Grey", "Gray", "Drain"}));
        brickPackages.add(prison);

        ItemBrickPackage windows = new ItemBrickPackage("windows", "Colored Windows", new String[] {"Glass"});
        windows.addBrick(createBrick(262,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,262-128,0x0, new String[] {"Transparent", "Clear", "Black", "Dark"}));
        windows.addBrick(createBrick(268,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,268-128,0x0, new String[] {"Transparent", "Red", "Pink"}));
        windows.addBrick(createBrick(269,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,269-128,0x0, new String[] {"Transparent", "Orange"}));
        windows.addBrick(createBrick(270,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,270-128,0x0, new String[] {"Transparent", "Yellow"}));
        windows.addBrick(createBrick(263,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,263-128,0x0, new String[] {"Transparent", "Green"}));
        windows.addBrick(createBrick(264,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,264-128,0x0, new String[] {"Transparent", "Turquoise", "Cyan", "Teal", "Blue", "Green"}));
        windows.addBrick(createBrick(265,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,265-128,0x0, new String[] {"Transparent", "Blue"}));
        windows.addBrick(createBrick(266,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,266-128,0x0, new String[] {"Transparent", "Purple", "Violet", "Indigo"}));
        windows.addBrick(createBrick(267,ItemLayer.ABOVE,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,267-128,0x0, new String[] {"Transparent", "Pink", "Magenta"}));
        brickPackages.add(windows);

        ItemBrickPackage pirate = new ItemBrickPackage("pirate", "Pirate Pack");
        pirate.addBrick(createBrick(93,ItemLayer.FORGROUND,blocksBMD,"brickpirate","",ItemTab.BLOCK,false,true,93,-1, new String[] {"Wood", "Planks", "Board", "Siding", "Navy", "House"}));
        pirate.addBrick(createBrick(94,ItemLayer.FORGROUND,blocksBMD,"brickpirate","",ItemTab.BLOCK,false,true,94,-1, new String[] {"Chest", "Treasure", "Loot", "Booty", "Navy"}));
        pirate.addBrick(createBrick(154, ItemLayer.DECORATION, blocksBMD, "brickpirate","", ItemTab.BLOCK,false,true,131,0x0, new String[] {"Platform", "Wood", "Ship", "Navy", "One Way", "One-Way"}));
        pirate.addBrick(createBrick(271,ItemLayer.DECORATION,decoBlocksBMD,"brickpirate","",ItemTab.DECORATIVE,false,true,143,0x0, new String[] {"Wood", "Decoration", "Navy"}));
        pirate.addBrick(createBrick(272,ItemLayer.ABOVE,decoBlocksBMD,"brickpirate","",ItemTab.DECORATIVE,false,true,144,0x0, new String[] {"Skull", "Head", "Skeleton", "Creepy", "Death"}));
        pirate.addBrick(createBrick(435,ItemLayer.DECORATION,decoBlocksBMD,"brickpirate","",ItemTab.DECORATIVE,false,false,277,0x0, new String[] {"Cannon", "Sea war", "Gun", "Ship", "Navy"}));
        pirate.addBrick(createBrick(436,ItemLayer.DECORATION,decoBlocksBMD,"brickpirate","",ItemTab.DECORATIVE,false,false,278,0x0, new String[] {"Port Window", "Porthole", "Ship", "Navy"}));
        pirate.addBrick(createBrick(554,ItemLayer.BACKGROUND,bgBlocksBMD,"brickpirate","",ItemTab.BACKGROUND,false,false,54,-1, new String[] {"Wood", "Dark", "Planks", "Board", "Ship", "House", "Siding", "Navy"}));
        pirate.addBrick(createBrick(555,ItemLayer.BACKGROUND,bgBlocksBMD,"brickpirate","",ItemTab.BACKGROUND,false,false,55,-1, new String[] {"Wood", "Light", "Planks", "Board", "Ship", "House", "Siding", "Navy"}));
        pirate.addBrick(createBrick(559,ItemLayer.BACKGROUND,bgBlocksBMD,"brickpirate","",ItemTab.BACKGROUND,false,false,59,-1, new String[] {"Wood", "Dark", "Planks", "Board", "Ship", "House", "Siding", "Navy"}));
        pirate.addBrick(createBrick(560,ItemLayer.BACKGROUND,bgBlocksBMD,"brickpirate","",ItemTab.BACKGROUND,false,false,60,-1, new String[] {"Flag", "Jolly Roger", "Skull", "Ship", "Navy"}));
        brickPackages.add(pirate);

        ItemBrickPackage stone = new ItemBrickPackage("stone", "Stone Pack", new String[] {"Cave", "Rocks", "Environment", "House"});
        stone.addBrick(createBrick(95,ItemLayer.FORGROUND,blocksBMD,"brickstone","",ItemTab.BLOCK,false,true,95,-1, new String[] {"Gray", "Grey"}));
        stone.addBrick(createBrick(1044,ItemLayer.FORGROUND,blocksBMD,"brickstone","",ItemTab.BLOCK,false,true,226,-1, new String[] {"Green", "Limestone"}));
        stone.addBrick(createBrick(1045,ItemLayer.FORGROUND,blocksBMD,"brickstone","",ItemTab.BLOCK,false,true,227,-1, new String[] {"Brown", "Dirt"}));
        stone.addBrick(createBrick(1046,ItemLayer.FORGROUND,blocksBMD,"brickstone","",ItemTab.BLOCK,false,true,228,-1, new String[] {"Blue"}));
        stone.addBrick(createBrick(561,ItemLayer.BACKGROUND,bgBlocksBMD,"brickstone","",ItemTab.BACKGROUND,false,false,61,-1, new String[] {"Dark", "Gray", "Grey"}));
        stone.addBrick(createBrick(562,ItemLayer.BACKGROUND,bgBlocksBMD,"brickstone","",ItemTab.BACKGROUND,false,false,62,-1, new String[] {"Half", "Dark", "Gray", "Grey"}));
        stone.addBrick(createBrick(688,ItemLayer.BACKGROUND,bgBlocksBMD,"brickstone","",ItemTab.BACKGROUND,false,false,182,-1, new String[] {"Green", "Limestone"}));
        stone.addBrick(createBrick(689,ItemLayer.BACKGROUND,bgBlocksBMD,"brickstone","",ItemTab.BACKGROUND,false,false,183,-1, new String[] {"Half", "Limestone"}));
        stone.addBrick(createBrick(690,ItemLayer.BACKGROUND,bgBlocksBMD,"brickstone","",ItemTab.BACKGROUND,false,false,184,-1, new String[] {"Brown"}));
        stone.addBrick(createBrick(691,ItemLayer.BACKGROUND,bgBlocksBMD,"brickstone","",ItemTab.BACKGROUND,false,false,185,-1, new String[] {"Half", "Brown"}));
        stone.addBrick(createBrick(692,ItemLayer.BACKGROUND,bgBlocksBMD,"brickstone","",ItemTab.BACKGROUND,false,false,186,-1, new String[] {"Blue"}));
        stone.addBrick(createBrick(693,ItemLayer.BACKGROUND,bgBlocksBMD,"brickstone","",ItemTab.BACKGROUND,false,false,187,-1, new String[] {"Half"}));
        brickPackages.add(stone);


        ItemBrickPackage dojo = new ItemBrickPackage("dojo", "Dojo Pack", new String[] {"Ninja", "Asian", "Japanese", "Kung Fu"});
        dojo.addBrick(createBrick(96,ItemLayer.DECORATION,blocksBMD,"brickninja","",ItemTab.BLOCK,false,true,96,0x0, new String[] {"Platform", "White", "One-way", "One way"}));
        dojo.addBrick(createBrick(97,ItemLayer.DECORATION,blocksBMD,"brickninja","",ItemTab.BLOCK,false,true,97,0x0, new String[] {"Platform", "Gray", "Grey", "One-way", "One way"}));
        dojo.addBrick(createBrick(564,ItemLayer.BACKGROUND,bgBlocksBMD,"brickninja","",ItemTab.BACKGROUND,false,true,64,-1, new String[] {"White"}));
        dojo.addBrick(createBrick(565,ItemLayer.BACKGROUND,bgBlocksBMD,"brickninja","",ItemTab.BACKGROUND,false,true,65,-1, new String[] {"Grey", "Gray"}));
        dojo.addBrick(createBrick(566,ItemLayer.BACKGROUND,bgBlocksBMD,"brickninja","",ItemTab.BACKGROUND,false,true,66,-1, new String[] {"Roof", "Blue", "Tile", "Shingles", "House"}));
        dojo.addBrick(createBrick(567,ItemLayer.BACKGROUND,bgBlocksBMD,"brickninja","",ItemTab.BACKGROUND,false,true,67,-1, new String[] {"Roof", "Blue", "Dark", "Tile", "Shingles", "House"}));
        dojo.addBrick(createBrick(667,ItemLayer.BACKGROUND,bgBlocksBMD,"brickninja","",ItemTab.BACKGROUND,false,false,161,-1, new String[] {"Roof", "Red", "Tile", "Shingles", "House"}));
        dojo.addBrick(createBrick(668,ItemLayer.BACKGROUND,bgBlocksBMD,"brickninja","",ItemTab.BACKGROUND,false,false,162,-1, new String[] {"Roof", "Red", "Dark", "Tile", "Shingles", "House"}));
        dojo.addBrick(createBrick(669,ItemLayer.BACKGROUND,bgBlocksBMD,"brickninja","",ItemTab.BACKGROUND,false,false,163,-1, new String[] {"Roof", "Green", "Tile", "Shingles", "House"}));
        dojo.addBrick(createBrick(670,ItemLayer.BACKGROUND,bgBlocksBMD,"brickninja","",ItemTab.BACKGROUND,false,false,164,-1, new String[] {"Roof", "Green", "Dark", "Tile", "Shingles", "House"}));
        dojo.addBrick(createBrick(ItemId.DOJO_LIGHT_LEFT,ItemLayer.DECORATION,specialBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,389,0x0, new String[] {"Morphable", "Fin", "Left", "Blue", "Green", "Red", "Corner"}));
        dojo.addBrick(createBrick(ItemId.DOJO_LIGHT_RIGHT,ItemLayer.DECORATION,specialBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,392,0x0, new String[] {"Morphable", "Fin", "Right", "Blue", "Green", "Red", "Corner"}));
        dojo.addBrick(createBrick(278,ItemLayer.DECORATION,decoBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,278-128,0x0, new String[] {"Window", "Open", "House"}));
        dojo.addBrick(createBrick(ItemId.DOJO_DARK_LEFT,ItemLayer.DECORATION,specialBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,395,0x0, new String[] {"Morphable", "Fin", "Left", "Dark", "Blue", "Green", "Red", "Corner"}));
        dojo.addBrick(createBrick(ItemId.DOJO_DARK_RIGHT,ItemLayer.DECORATION,specialBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,398,0x0, new String[] {"Morphable", "Fin", "Right", "Dark", "Blue", "Green", "Red", "Corner"}));
        dojo.addBrick(createBrick(281,ItemLayer.DECORATION,decoBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,281-128,0x0, new String[] {"Window", "Dark", "Open", "House"}));
        dojo.addBrick(createBrick(282,ItemLayer.DECORATION,decoBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,282-128,0x0, new String[] {"Character", "Chinese"}));
        dojo.addBrick(createBrick(283,ItemLayer.DECORATION,decoBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,283-128,0x0, new String[] {"Character", "Chinese"}));
        dojo.addBrick(createBrick(284,ItemLayer.DECORATION,decoBlocksBMD,"brickninja","",ItemTab.DECORATIVE,false,false,284-128,0x0, new String[] {"Yin Yang", "Chinese", "White", "Black white"}));
        brickPackages.add(dojo);

        ItemBrickPackage cowboy = new ItemBrickPackage("wild west", "Wild West Pack", new String[] {"Cowboy", "Western", "House"});
        cowboy.addBrick(createBrick(122,ItemLayer.DECORATION,blocksBMD,"brickcowboy","",ItemTab.BLOCK,false,true,99,0x0, new String[] {"Brown", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(createBrick(123,ItemLayer.DECORATION,blocksBMD,"brickcowboy","",ItemTab.BLOCK,false,true,100,0x0, new String[] {"Red", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(createBrick(124,ItemLayer.DECORATION,blocksBMD,"brickcowboy","",ItemTab.BLOCK,false,true,101,0x0, new String[] {"Blue", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(createBrick(125,ItemLayer.DECORATION,blocksBMD,"brickcowboy","",ItemTab.BLOCK,false,true,102,0x0, new String[] {"Dark", "Brown", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(createBrick(126,ItemLayer.DECORATION,blocksBMD,"brickcowboy","",ItemTab.BLOCK,false,true,103,0x0, new String[] {"Dark", "Red", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(createBrick(127,ItemLayer.DECORATION,blocksBMD,"brickcowboy","",ItemTab.BLOCK,false,true,104,0x0, new String[] {"Dark", "Blue", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(createBrick(568,ItemLayer.BACKGROUND,bgBlocksBMD,"brickcowboy","",ItemTab.BACKGROUND,false,true,68,-1, new String[] {"Siding", "Wood", "Brown", "Planks", "Ship", "Board"}));
        cowboy.addBrick(createBrick(569,ItemLayer.BACKGROUND,bgBlocksBMD,"brickcowboy","",ItemTab.BACKGROUND,false,true,69,-1, new String[] {"Siding", "Wood", "Dark Brown", "Planks", "Ship", "Board"}));
        cowboy.addBrick(createBrick(570,ItemLayer.BACKGROUND,bgBlocksBMD,"brickcowboy","",ItemTab.BACKGROUND,false,true,70,-1, new String[] {"Siding", "Wood", "Red", "Planks", "Board", "Board"}));
        cowboy.addBrick(createBrick(571,ItemLayer.BACKGROUND,bgBlocksBMD,"brickcowboy","",ItemTab.BACKGROUND,false,true,71,-1, new String[] {"Siding", "Wood", "Dark Red", "Planks", "Board"}));
        cowboy.addBrick(createBrick(572,ItemLayer.BACKGROUND,bgBlocksBMD,"brickcowboy","",ItemTab.BACKGROUND,false,true,72,-1, new String[] {"Siding", "Wood", "Blue", "Planks", "Board"}));
        cowboy.addBrick(createBrick(573,ItemLayer.BACKGROUND,bgBlocksBMD,"brickcowboy","",ItemTab.BACKGROUND,false,true,73,-1, new String[] {"Siding", "Wood", "Dark Blue", "Planks", "Board"}));
        cowboy.addBrick(createBrick(285,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,true,285-128,0x0, new String[] {"Pole", "White"}));
        cowboy.addBrick(createBrick(286, ItemLayer.ABOVE, decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, true, 286 - 128, 0x0, new String[] {"Pole", "Gray", "Dark", "Grey"}));
        cowboy.addBrick(createBrick(1521,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,true,321,0x0, new String[] {"Pole", "White"}));
        cowboy.addBrick(createBrick(1522,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,true,322,0x0, new String[] {"Pole", "Gray", "Dark", "Grey"}));
        cowboy.addBrick(createBrick(287,ItemLayer.DECORATION,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,287-128,0x0, new String[] {"Door", "Wood", "Brown", "Left"}));
        cowboy.addBrick(createBrick(288,ItemLayer.DECORATION,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,288-128,0x0, new String[] {"Door", "Wood", "Brown", "Right"}));
        cowboy.addBrick(createBrick(289,ItemLayer.DECORATION,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,289-128,0x0, new String[] {"Door", "Wood", "Red", "Left"}));
        cowboy.addBrick(createBrick(290,ItemLayer.DECORATION,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,290-128,0x0, new String[] {"Door", "Wood", "Red", "Right"}));
        cowboy.addBrick(createBrick(291,ItemLayer.DECORATION,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,291-128,0x0, new String[] {"Door", "Wood", "Blue", "Left"}));
        cowboy.addBrick(createBrick(292,ItemLayer.DECORATION,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,292-128,0x0, new String[] {"Door", "Wood", "Blue", "Right"}));
        cowboy.addBrick(createBrick(293,ItemLayer.DECORATION,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,293-128,0x0, new String[] {"Window", "Curtains"}));
        cowboy.addBrick(createBrick(294,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,294-128,0x0, new String[] {"Fence", "Wood", "Brown"}));
        cowboy.addBrick(createBrick(295,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,295-128,0x0, new String[] {"Fence", "Wood", "Brown"}));
        cowboy.addBrick(createBrick(296,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,296-128,0x0, new String[] {"Fence", "Wood", "Red"}));
        cowboy.addBrick(createBrick(297,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,297-128,0x0, new String[] {"Fence", "Wood", "Red"}));
        cowboy.addBrick(createBrick(298,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,298-128,0x0, new String[] {"Fence", "Wood", "Blue"}));
        cowboy.addBrick(createBrick(299,ItemLayer.ABOVE,decoBlocksBMD,"brickcowboy","",ItemTab.DECORATIVE,false,false,299-128,0x0, new String[] {"Fence", "Wood", "Blue"}));
        brickPackages.add(cowboy);

        ItemBrickPackage plastic = new ItemBrickPackage("plastic", "Plastic Pack", new String[] {"Neon", "Bright"});
        plastic.addBrick(createBrick(129,ItemLayer.DECORATION,blocksBMD,"brickplastic","",ItemTab.BLOCK,false,true,106,-1, new String[] {"Red"}));
        plastic.addBrick(createBrick(135,ItemLayer.DECORATION,blocksBMD,"brickplastic","",ItemTab.BLOCK,false,true,112,-1, new String[] {"Orange"}));
        plastic.addBrick(createBrick(130,ItemLayer.DECORATION,blocksBMD,"brickplastic","",ItemTab.BLOCK,false,true,107,-1, new String[] {"Yellow"}));
        plastic.addBrick(createBrick(128,ItemLayer.DECORATION,blocksBMD,"brickplastic","",ItemTab.BLOCK,false,true,105,-1, new String[] {"Green", "Light Green", "Lime"}));
        plastic.addBrick(createBrick(134,ItemLayer.DECORATION,blocksBMD,"brickplastic","",ItemTab.BLOCK,false,true,111,-1, new String[] {"Green"}));
        plastic.addBrick(createBrick(131,ItemLayer.DECORATION,blocksBMD,"brickplastic","",ItemTab.BLOCK,false,true,108,-1, new String[] {"Light Blue", "Cyan"}));
        plastic.addBrick(createBrick(132,ItemLayer.DECORATION,blocksBMD,"brickplastic","",ItemTab.BLOCK,false,true,109,-1, new String[] {"Blue", "Indigo"}));
        plastic.addBrick(createBrick(133,ItemLayer.DECORATION,blocksBMD,"brickplastic","",ItemTab.BLOCK,false,true,110,-1, new String[] {"Purple", "Magenta", "Pink"}));
        brickPackages.add(plastic);

        ItemBrickPackage water = new ItemBrickPackage("water", "Water pack", new String[] {"Sea", "Ocean", "Nature", "Environment"});
//			water.addBrick(createBrick(ItemId.WATER, ItemLayer.ABOVE, waterBMD, "", ItemTab.ACTION,false,false,0,0x0))
        water.addBrick(createBrick(ItemId.WAVE, ItemLayer.ABOVE, specialBlocksBMD,"","", ItemTab.DECORATIVE,false,false,234,0x0, new String[] {"Waves", "Animated"}));
        water.addBrick(createBrick(574,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,74,0xFF75DAE7));
        water.addBrick(createBrick(575,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,75,0xFF75DAE7, new String[] {"Octopus", "Squid"}));
        water.addBrick(createBrick(576,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,76,0xFF75DAE7, new String[] {"Fish"}));
        water.addBrick(createBrick(577,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,77,0xFF75DAE7, new String[] {"Seahorse"}));
        water.addBrick(createBrick(578,ItemLayer.BACKGROUND,bgBlocksBMD,"","",ItemTab.BACKGROUND,false,true,78,0xFF75DAE7, new String[] {"Seaweed", "Plant", "Algae"}));
        brickPackages.add(water);

        ItemBrickPackage sand = new ItemBrickPackage("sand", "Sand Pack", new String[] {"Desert", "Beach", "Environment", "Soil"});
        sand.addBrick(createBrick(137, ItemLayer.FORGROUND, blocksBMD, "bricksand","", ItemTab.BLOCK,false,true,114,-1, new String[] {"White", "Beige"}));
        sand.addBrick(createBrick(138, ItemLayer.FORGROUND, blocksBMD, "bricksand","", ItemTab.BLOCK,false,true,115,-1, new String[] {"Grey", "Gray"}));
        sand.addBrick(createBrick(139, ItemLayer.FORGROUND, blocksBMD, "bricksand","", ItemTab.BLOCK,false,true,116,-1, new String[] {"Yellow"}));
        sand.addBrick(createBrick(140, ItemLayer.FORGROUND, blocksBMD, "bricksand","", ItemTab.BLOCK,false,true,117,-1, new String[] {"Yellow", "Orange"}));
        sand.addBrick(createBrick(141, ItemLayer.FORGROUND, blocksBMD, "bricksand","", ItemTab.BLOCK,false,true,118,-1, new String[] {"Brown", "Light"}));
        sand.addBrick(createBrick(142, ItemLayer.FORGROUND, blocksBMD, "bricksand","", ItemTab.BLOCK,false,true,119,-1, new String[] {"Brown", "Dark", "Dirt"}));
        sand.addBrick(createBrick(579, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksand","", ItemTab.BACKGROUND,false,false,79,-1, new String[] {"Off-white"}));
        sand.addBrick(createBrick(580, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksand","", ItemTab.BACKGROUND,false,false,80,-1, new String[] {"Gray", "Grey"}));
        sand.addBrick(createBrick(581, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksand","", ItemTab.BACKGROUND,false,false,81,-1, new String[] {"Yellow"}));
        sand.addBrick(createBrick(582, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksand","", ItemTab.BACKGROUND,false,false,82,-1, new String[] {"Orange", "Yellow"}));
        sand.addBrick(createBrick(583, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksand","", ItemTab.BACKGROUND,false,false,83,-1, new String[] {"Brown", "Light"}));
        sand.addBrick(createBrick(584, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksand","", ItemTab.BACKGROUND,false,false,84,-1, new String[] {"Brown", "Dark"}));
        sand.addBrick(createBrick(301,ItemLayer.ABOVE,decoBlocksBMD,"bricksand","",ItemTab.DECORATIVE,false,false,300-128,0x0, new String[] {"White"}));
        sand.addBrick(createBrick(302,ItemLayer.ABOVE,decoBlocksBMD,"bricksand","",ItemTab.DECORATIVE,false,false,301-128,0x0, new String[] {"Gray", "Grey"}));
        sand.addBrick(createBrick(303,ItemLayer.ABOVE,decoBlocksBMD,"bricksand","",ItemTab.DECORATIVE,false,false,302-128,0x0, new String[] {"Yellow"}));
        sand.addBrick(createBrick(304,ItemLayer.ABOVE,decoBlocksBMD,"bricksand","",ItemTab.DECORATIVE,false,false,303-128,0x0, new String[] {"Yellow", "Orange"}));
        sand.addBrick(createBrick(305,ItemLayer.ABOVE,decoBlocksBMD,"bricksand","",ItemTab.DECORATIVE,false,false,304-128,0x0, new String[] {"Brown", "Light"}));
        sand.addBrick(createBrick(306,ItemLayer.ABOVE,decoBlocksBMD,"bricksand","",ItemTab.DECORATIVE,false,false,305-128,0x0, new String[] {"Brown", "Dark"}));
        brickPackages.add(sand);

        ItemBrickPackage summer2012 = new ItemBrickPackage("summer 2012", "Summer pack 2012", new String[] {"Season", "Beach"});
        summer2012.addBrick(createBrick(307,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2012","",ItemTab.DECORATIVE,false,false,306-128,0x0, new String[] {"Beach", "Ball", "Toy", "Ball"}));
        summer2012.addBrick(createBrick(308,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2012","",ItemTab.DECORATIVE,false,false,307-128,0x0, new String[] {"Pail", "Bucket", "Toy", "Sand"}));
        summer2012.addBrick(createBrick(309,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2012","",ItemTab.DECORATIVE,false,false,308-128,0x0, new String[] {"Shovel", "Dig", "Toy", "Sand"}));
        summer2012.addBrick(createBrick(310,ItemLayer.ABOVE,decoBlocksBMD,"bricksummer2012","",ItemTab.DECORATIVE,false,false,309-128,0x0, new String[] {"Drink", "Margarita", "Umbrella", "Cocktail", "Glass", "Cup"}));
        brickPackages.add(summer2012);

        ItemBrickPackage cloud = new ItemBrickPackage("cloud", "Cloud Pack", new String[] {"Sky", "Environment"});
        cloud.addBrick(createBrick(143,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,false,120,-1, new String[] {"Center", "Middle", "White"}));
        cloud.addBrick(createBrick(311,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,310-128,0x0, new String[] {"Top", "Side", "White"}));
        cloud.addBrick(createBrick(312,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,311-128,0x0, new String[] {"Bottom", "Side", "White"}));
        cloud.addBrick(createBrick(313,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,312-128,0x0, new String[] {"Left", "Side", "White"}));
        cloud.addBrick(createBrick(314,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,313-128,0x0, new String[] {"Right", "Side", "White"}));
        cloud.addBrick(createBrick(315,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,314-128,0x0, new String[] {"Top right", "Corner", "White"}));
        cloud.addBrick(createBrick(316,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,315-128,0x0, new String[] {"Top left", "Corner", "White"}));
        cloud.addBrick(createBrick(317,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,316-128,0x0, new String[] {"Bottom left", "Corner", "White"}));
        cloud.addBrick(createBrick(318, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 317 - 128, 0x0, new String[] {"Bottom right", "Corner", "White"}));

        cloud.addBrick(createBrick(1126, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, false, 287, -1, new String[] {"Center", "Middle", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(createBrick(1523,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,323,0x0, new String[] {"Top", "Side", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(createBrick(1524,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,324,0x0, new String[] {"Bottom", "Side", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(createBrick(1525,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,325,0x0, new String[] {"Left", "Side", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(createBrick(1526,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,326,0x0, new String[] {"Right", "Side", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(createBrick(1527,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,327,0x0, new String[] {"Top right", "Corner", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(createBrick(1528,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,328,0x0, new String[] {"Top left", "Corner", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(createBrick(1529,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.DECORATIVE,false,false,329,0x0, new String[] {"Bottom left", "Corner", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(createBrick(1530, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 330, 0x0, new String[] {"Bottom right", "Corner", "Dark", "Grey", "Gray", "Storm"}));
        brickPackages.add(cloud);

        ItemBrickPackage industrial = new ItemBrickPackage("industrial", "Industrial Package", new String[] {"Factory"});
        industrial.addBrick(createBrick(144, ItemLayer.FORGROUND, blocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,121,-1, new String[] {"Diamond plating", "Plate", "Metal"}));
        industrial.addBrick(createBrick(145, ItemLayer.FORGROUND, blocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,122,-1, new String[] {"Wiring", "Wires", "Metal"}));
        industrial.addBrick(createBrick(585, ItemLayer.BACKGROUND, bgBlocksBMD, "brickindustrial","", ItemTab.BACKGROUND,false,false,85,-1, new String[] {"Plate", "Metal"}));
        industrial.addBrick(createBrick(586, ItemLayer.BACKGROUND, bgBlocksBMD, "brickindustrial","", ItemTab.BACKGROUND,false,false,86,-1, new String[] {"Gray", "Steel", "Plate", "Metal"}));
        industrial.addBrick(createBrick(587, ItemLayer.BACKGROUND, bgBlocksBMD, "brickindustrial","", ItemTab.BACKGROUND,false,false,87,-1, new String[] {"Blue", "Cyan", "Plate", "Metal"}));
        industrial.addBrick(createBrick(588, ItemLayer.BACKGROUND, bgBlocksBMD, "brickindustrial","", ItemTab.BACKGROUND,false,false,88,-1, new String[] {"Green", "Plate", "Metal"}));
        industrial.addBrick(createBrick(589, ItemLayer.BACKGROUND, bgBlocksBMD, "brickindustrial","", ItemTab.BACKGROUND,false,false,89,-1, new String[] {"Yellow", "Orange", "Plate", "Metal"}));
        industrial.addBrick(createBrick(146, ItemLayer.DECORATION, blocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,123,0x0, new String[] {"Platform", "One-Way", "One Way", "Metal"}));
        industrial.addBrick(createBrick(147, ItemLayer.DECORATION, blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 124, 0x0, new String[] {"Scissor", "Scaffolding", "X", "Metal"}));
        industrial.addBrick(createBrick(1133, ItemLayer.DECORATION, blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 294, 0x0, new String[] {"Scissor", "Scaffolding", "X", "Metal"}));
        industrial.addBrick(createBrick(148, ItemLayer.DECORATION, blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 125, 0x0, new String[] {"Lift", "Table", "Piston", "Metal"}));
        industrial.addBrick(createBrick(ItemId.INDUSTRIAL_TABLE, ItemLayer.DECORATION, specialBlocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,712,0x0, new String[] {"Lift", "Table", "Piston", "Metal", "Morphable"}));
        industrial.addBrick(createBrick(149, ItemLayer.FORGROUND, blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 126, -1, new String[] {"Tube", "Plate", "Piston", "Metal"}));
        industrial.addBrick(createBrick(1127, ItemLayer.FORGROUND, blocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,288,-1, new String[] {"Tube", "Plate", "Piston", "Metal"}));
        industrial.addBrick(createBrick(ItemId.INDUSTRIAL_PIPE_THICK, ItemLayer.DECORATION, specialBlocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 710, 0x0, new String[] {"Thick", "Pipe", "Metal", "Morphable"}));
        industrial.addBrick(createBrick(150, ItemLayer.DECORATION, blocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,127,-1, new String[] {"Conveyor belt", "Left", "Metal"}));
        industrial.addBrick(createBrick(151, ItemLayer.DECORATION, blocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,128,-1, new String[] {"Conveyor belt", "Middle", "Metal"}));
        industrial.addBrick(createBrick(152, ItemLayer.DECORATION, blocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,129,-1, new String[] {"Conveyor belt", "Middle", "Metal"}));
        industrial.addBrick(createBrick(153, ItemLayer.DECORATION, blocksBMD, "brickindustrial","", ItemTab.BLOCK,false,true,130,-1, new String[] {"Conveyor belt", "Right", "Metal"}));
        industrial.addBrick(createBrick(319, ItemLayer.ABOVE, decoBlocksBMD, "brickindustrial","", ItemTab.DECORATIVE,false,true,190,0x0, new String[] {"Caution", "Warning", "Fire", "Flame", "Sign", "Alert"}));
        industrial.addBrick(createBrick(320, ItemLayer.ABOVE, decoBlocksBMD, "brickindustrial","", ItemTab.DECORATIVE,false,true,191,0x0, new String[] {"Caution", "Warning", "Death", "Toxin", "Poison", "Sign", "Alert"}));
        industrial.addBrick(createBrick(321, ItemLayer.ABOVE, decoBlocksBMD, "brickindustrial","", ItemTab.DECORATIVE,false,true,192,0x0, new String[] {"Caution", "Warning", "Electricity", "Lightning", "Sign", "Alert"}));
        industrial.addBrick(createBrick(322, ItemLayer.ABOVE, decoBlocksBMD, "brickindustrial","", ItemTab.DECORATIVE,false,true,193,0x0, new String[] {"Caution", "Warning", "No", "Do not enter", "X", "Sign", "Alert"}));
        industrial.addBrick(createBrick(323, ItemLayer.DECORATION, decoBlocksBMD, "brickindustrial","", ItemTab.DECORATIVE,false,true,194,0x0, new String[] {"Caution", "Warning", "Horizontal", "Stripes", "Hazard", "Pole", "Alert"}));
        industrial.addBrick(createBrick(324, ItemLayer.DECORATION, decoBlocksBMD, "brickindustrial", "", ItemTab.DECORATIVE, false, true, 195, 0x0, new String[] {"Caution", "Warning", "Vertical", "Stripes", "Hazard", "Pole", "Alert"}));
        industrial.addBrick(createBrick(ItemId.INDUSTRIAL_PIPE_THIN, ItemLayer.DECORATION, specialBlocksBMD, "brickindustrial","", ItemTab.DECORATIVE,false,true,708,0x0, new String[] {"Thin", "Pipe", "Metal", "Morphable"}));

        brickPackages.add(industrial);

        ItemBrickPackage clay = new ItemBrickPackage("clay", "Clay Backgrounds", new String[] {"House"});
        clay.addBrick(createBrick(594, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,false,94,-1, new String[] {"White", "Tile", "Bathroom"}));
        clay.addBrick(createBrick(595, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,false,95,-1, new String[] {"Brick", "Tile", "Bathroom"}));
        clay.addBrick(createBrick(596, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,false,96,-1, new String[] {"Diamond", "Chisel", "Tile", "Bathroom"}));
        clay.addBrick(createBrick(597, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,false,97,-1, new String[] {"X", "Cross", "Chisel", "Bathroom", "Tile"}));
        clay.addBrick(createBrick(598, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,false,98,-1, new String[] {"Rough", "Natural"}));
        brickPackages.add(clay);

        ItemBrickPackage medieval = new ItemBrickPackage("medieval", "Medieval", new String[] {"Castle"});
        medieval.addBrick(createBrick(158, ItemLayer.DECORATION, blocksBMD, "brickmedieval","", ItemTab.BLOCK,false,true,132,0x0, new String[] {"Platform", "Stone"}));
        medieval.addBrick(createBrick(159, ItemLayer.FORGROUND, blocksBMD, "brickmedieval","", ItemTab.BLOCK,false,true,133,-1, new String[] {"Brick", "Stone"}));
        medieval.addBrick(createBrick(160, ItemLayer.FORGROUND, blocksBMD, "brickmedieval","", ItemTab.BLOCK,false,true,134,-1, new String[] {"Brick", "Arrow slit", "Stone", "Window"}));
        medieval.addBrick(createBrick(599, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmedieval","", ItemTab.BACKGROUND,false,false,99,-1, new String[] {"Anvil", "Blacksmith"}));
        medieval.addBrick(createBrick(325, ItemLayer.ABOVE, decoBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,true,196,0x0, new String[] {"Brick", "Stone", "House"}));
        medieval.addBrick(createBrick(326, ItemLayer.ABOVE, decoBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,false,197,-1, new String[] {"Top", "Display", "Stone"}));
        medieval.addBrick(createBrick(162, ItemLayer.DECORATION, blocksBMD, "brickmedieval","", ItemTab.BLOCK,false,true,136,0x0, new String[] {"Parapet", "Stone"}));
        medieval.addBrick(createBrick(163, ItemLayer.DECORATION, blocksBMD, "brickmedieval","", ItemTab.BLOCK,false,true,137,0x0, new String[] {"Barrel", "Keg"}));
        medieval.addBrick(createBrick(437, ItemLayer.DECORATION, decoBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,false,279,0x0, new String[] {"Window", "Wood", "House"}));
        medieval.addBrick(createBrick(600, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmedieval","", ItemTab.BACKGROUND,false,false,100,-1, new String[] {"Wood", "Planks", "Vertical", "Brown", "House"}));
        medieval.addBrick(createBrick(590, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmedieval","", ItemTab.BACKGROUND,false,false,90,-1, new String[] {"Straw", "Hay", "Roof", "House"}));
        medieval.addBrick(createBrick(591, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmedieval","", ItemTab.BACKGROUND,false,false,91,-1, new String[] {"Roof", "Shingles", "Scales", "Red", "House"}));
        medieval.addBrick(createBrick(592, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmedieval","", ItemTab.BACKGROUND,false,false,92,-1, new String[] {"Roof", "Shingles", "Scales", "Green", "House"}));
        medieval.addBrick(createBrick(556, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmedieval","", ItemTab.BACKGROUND,false,false,56,-1, new String[] {"Roof", "Shingles", "Scales", "Brown", "House"}));
        medieval.addBrick(createBrick(593, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmedieval","", ItemTab.BACKGROUND,false,false,93,-1, new String[] {"Gray", "Dry wall", "Stucco", "Grey", "House", "Beige"}));
        medieval.addBrick(createBrick(ItemId.MEDIEVAL_TIMBER, ItemLayer.DECORATION, specialBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,false,417,0x0, new String[] {"Scaffolding", "Wood", "Morphable", "Fence", "House", "Design"}));
        medieval.addBrick(createBrick(330, ItemLayer.DECORATION, decoBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,true,201,0x0, new String[] {"Shield", "Warrior", "Weapon"}));
        medieval.addBrick(createBrick(ItemId.MEDIEVAL_AXE, ItemLayer.DECORATION, specialBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,true,365,0x0, new String[] {"Axe", "Morphable", "Warrior", "Weapon"}));
        medieval.addBrick(createBrick(ItemId.MEDIEVAL_SWORD, ItemLayer.DECORATION, specialBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,true,377,0x0, new String[] {"Sword", "Morphable", "Warrior", "Weapon"}));
        medieval.addBrick(createBrick(ItemId.MEDIEVAL_SHIELD, ItemLayer.DECORATION, specialBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,true,373,0x0, new String[] {"Shield", "Morphable", "Blue", "Green", "Yellow", "Red", "Circle"}));
        medieval.addBrick(createBrick(ItemId.MEDIEVAL_COATOFARMS, ItemLayer.DECORATION, specialBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,true,405,0x0, new String[] {"Shield", "Morphable", "Blue", "Green", "Yellow", "Red"}));
        medieval.addBrick(createBrick(ItemId.MEDIEVAL_BANNER, ItemLayer.DECORATION, specialBlocksBMD, "brickmedieval","", ItemTab.DECORATIVE,false,true,369,0x0, new String[] {"Banner", "Morphable", "Blue", "Green", "Yellow", "Red", "Flag"}));
        brickPackages.add(medieval);

        ItemBrickPackage plasticpipes = new ItemBrickPackage("pipes", "Pipes", new String[] {"Orange"});
        plasticpipes.addBrick(createBrick(166, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,140,-1, new String[] {"Left"}));
        plasticpipes.addBrick(createBrick(167, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,141,-1, new String[] {"Horizontal"}));
        plasticpipes.addBrick(createBrick(168, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,142,-1, new String[] {"Right"}));
        plasticpipes.addBrick(createBrick(169, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,143,-1, new String[] {"Up"}));
        plasticpipes.addBrick(createBrick(170, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,144,-1, new String[] {"Vertical"}));
        plasticpipes.addBrick(createBrick(171, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,145,-1, new String[] {"Down"}));
        brickPackages.add(plasticpipes);

        ItemBrickPackage outerSpace = new ItemBrickPackage("outer space", "Outer Space", new String[] {"Ship", "Aliens", "UFO", "Sci-Fi", "Science Fiction", "Void"});
        outerSpace.addBrick(createBrick(172, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,146,-1, new String[] {"White", "Metal", "Plate"}));
        outerSpace.addBrick(createBrick(173, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,147,-1, new String[] {"Blue", "Metal", "Plate"}));
        outerSpace.addBrick(createBrick(174, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,148,-1, new String[] {"Green", "Metal", "Plate"}));
        outerSpace.addBrick(createBrick(175, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,149,-1, new String[] {"Red", "Magenta", "Metal", "Plate", "Pink"}));
        outerSpace.addBrick(createBrick(176, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,150,0xFFFFAB44, new String[] {"Sand", "Mars", "Orange"}));
        outerSpace.addBrick(createBrick(1029, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,214,-1, new String[] {"Moon", "Rock", "Stone", "Metal", "Grey", "Gray"}));
        outerSpace.addBrick(createBrick(601, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,101,-1, new String[] {"White", "Grey", "Gray", "Metal"}));
        outerSpace.addBrick(createBrick(602, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,102,-1, new String[] {"Blue", "Metal"}));
        outerSpace.addBrick(createBrick(603, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,103,-1, new String[] {"Green", "Metal"}));
        outerSpace.addBrick(createBrick(604, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,104,-1, new String[] {"Red", "Metal"}));
        outerSpace.addBrick(createBrick(332, ItemLayer.DECORATION, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,203,0x0, new String[] {"Sign", "Panel", "Computer", "Green"}));
        outerSpace.addBrick(createBrick(333, ItemLayer.DECORATION, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,204,0x0, new String[] {"Red", "Dot", "Light", "Lamp", "Circle"}));
        outerSpace.addBrick(createBrick(334, ItemLayer.DECORATION, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,205,0x0, new String[] {"Blue", "Dot", "Light", "Lamp", "Circle"}));
        outerSpace.addBrick(createBrick(1567, ItemLayer.DECORATION, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,352,0x0, new String[] {"Green", "Dot", "Light", "Lamp", "Circle"}));
        outerSpace.addBrick(createBrick(1568, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 353, 0x0, new String[] {"Yellow", "Dot", "Light", "Lamp", "Circle"}));
        outerSpace.addBrick(createBrick(1623, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 366, 0x0, new String[] {"Magenta", "Pink", "Purple", "Dot", "Light", "Lamp", "Circle", "Orb", "Button"}));
        outerSpace.addBrick(createBrick(1624, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 367, 0x0, new String[] {"Cyan", "Dot", "Light", "Lamp", "Circle", "Orb", "Button"}));
        outerSpace.addBrick(createBrick(335, ItemLayer.DECORATION, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,206,0x0, new String[] {"Computer", "Control panel", "System"}));
        outerSpace.addBrick(createBrick(428, ItemLayer.DECORATION, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,270,0x0, new String[] {"Star", "Shiny", "Red", "Light", "Night", "Sky", "Big"}));
        outerSpace.addBrick(createBrick(429, ItemLayer.DECORATION, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,271,0x0, new String[] {"Star", "Shiny", "Blue", "Light", "Night", "Sky", "Medium"}));
        outerSpace.addBrick(createBrick(430, ItemLayer.DECORATION, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,272,0x0, new String[] {"Star", "Shiny", "Yellow", "Light", "Night", "Sky", "Small"}));
        outerSpace.addBrick(createBrick(331, ItemLayer.ABOVE, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,202,0x0, new String[] {"Rock", "Hard", "Gray", "Grey", "Boulder", "Stone", "Environment"}));
        brickPackages.add(outerSpace);

        ItemBrickPackage desert = new ItemBrickPackage("desert", "Desert Pack", new String[] {"Environment"});
        desert.addBrick(createBrick(177, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,151,0xFFDD943B, new String[] {"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(createBrick(178, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,152,0xFFC68534, new String[] {"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(createBrick(179, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,153,0xFF916127, new String[] {"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(createBrick(180, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,154,-1, new String[] {"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(createBrick(181, ItemLayer.FORGROUND, blocksBMD, "","", ItemTab.BLOCK,false,true,155,-1, new String[] {"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(createBrick(336, ItemLayer.ABOVE, decoBlocksBMD, "","", ItemTab.DECORATIVE, false, false, 207, 0x0 , new String[] {"Rock", "Orange", "Sandstone", "Boulder", "Space"}));
        desert.addBrick(createBrick(425, ItemLayer.ABOVE, decoBlocksBMD, "","", ItemTab.DECORATIVE, false, false, 267, 0x0, new String[] {"Cactus", "Nature", "Plant", "Western"}));
        desert.addBrick(createBrick(426, ItemLayer.ABOVE, decoBlocksBMD, "","", ItemTab.DECORATIVE, false, false, 268, 0x0, new String[] {"Bush", "Cactus", "Nature", "Plant", "Western"}));
        desert.addBrick(createBrick(427, ItemLayer.ABOVE, decoBlocksBMD, "","", ItemTab.DECORATIVE, false, false, 269, 0x0, new String[] {"Tree", "Nature", "Plant", "Bush", "Western", "Bonsai"}));
        desert.addBrick(createBrick(699, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 193,-1, new String[] {"Brown", "Dirt", "Soil", "Sandstone"}));
        desert.addBrick(createBrick(700, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 194,-1, new String[] {"Brown", "Dirt", "Soil", "Sandstone"}));
        desert.addBrick(createBrick(701, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 195,-1, new String[] {"Brown", "Dirt", "Soil", "Sandstone"}));
        brickPackages.add(desert);

        ItemBrickPackage neon = new ItemBrickPackage("neon", "Neon Backgrounds", new String[] {"Solid"});
        neon.addBrick(createBrick(675, ItemLayer.BACKGROUND, bgBlocksBMD, "brickneon","", ItemTab.BACKGROUND,false,true,169,-1, new String[] {"Magenta", "Pink", "Red"}));
        neon.addBrick(createBrick(673, ItemLayer.BACKGROUND, bgBlocksBMD, "brickneon","", ItemTab.BACKGROUND,false,true,167,-1, new String[] {"Orange", "Fire"}));
        neon.addBrick(createBrick(697, ItemLayer.BACKGROUND, bgBlocksBMD, "brickneon","", ItemTab.BACKGROUND,false,true,191,-1, new String[] {"Yellow"}));
        neon.addBrick(createBrick(674, ItemLayer.BACKGROUND, bgBlocksBMD, "brickneon","", ItemTab.BACKGROUND,false,true,168,-1, new String[] {"Green", "Jungle"}));
        neon.addBrick(createBrick(698, ItemLayer.BACKGROUND, bgBlocksBMD, "brickneon","", ItemTab.BACKGROUND,false,true,192,-1, new String[] {"Cyan"}));
        neon.addBrick(createBrick(605, ItemLayer.BACKGROUND, bgBlocksBMD, "brickneon","", ItemTab.BACKGROUND,false,true,105,-1, new String[] {"Blue", "Night", "Sky", "Dark"}));
        brickPackages.add(neon);

        ItemBrickPackage monster = new ItemBrickPackage("monster", "Monster", new String[] {"Creature"});
        monster.addBrick(createBrick(608, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmonster","", ItemTab.BACKGROUND,false,true,108,0xFFA0A061, new String[] {"Green", "Grass"}));
        monster.addBrick(createBrick(609, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmonster","", ItemTab.BACKGROUND,false,true,109,0xFF707044, new String[] {"Green", "Dark", "Grass"}));
        monster.addBrick(createBrick(663, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmonster","", ItemTab.BACKGROUND,false,true,157,-1, new String[] {"Red", "Pink", "Scales"}));
        monster.addBrick(createBrick(664, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmonster","", ItemTab.BACKGROUND,false,false,158,-1, new String[] {"Red", "Pink", "Dark", "Scales"}));
        monster.addBrick(createBrick(665, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmonster","", ItemTab.BACKGROUND,false,false,159,-1, new String[] {"Purple", "Scales", "Violet"}));
        monster.addBrick(createBrick(666, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmonster","", ItemTab.BACKGROUND,false,false,160,-1, new String[] {"Purple", "Scales", "Dark", "Violet"}));
        monster.addBrick(createBrick(ItemId.TOOTH_BIG, ItemLayer.DECORATION, specialBlocksBMD, "brickmonster","", ItemTab.DECORATIVE,false,false,385,0x0, new String[] {"Teeth", "Tooth", "Creepy", "Morphable", "Scary"}));
        monster.addBrick(createBrick(ItemId.TOOTH_SMALL, ItemLayer.DECORATION, specialBlocksBMD, "brickmonster","", ItemTab.DECORATIVE,false,false,381,0x0, new String[] {"Teeth", "Tooth", "Creepy", "Morphable", "Scary"}));
        monster.addBrick(createBrick(ItemId.TOOTH_TRIPLE, ItemLayer.DECORATION, specialBlocksBMD, "brickmonster","", ItemTab.DECORATIVE,false,false,401,0x0, new String[] {"Teeth", "Tooth", "Creepy", "Morphable", "Scary"}));
        monster.addBrick(createBrick(274, ItemLayer.DECORATION, decoBlocksBMD, "brickmonster","", ItemTab.DECORATIVE,false,false,146,0x0, new String[] {"Eye", "Purple", "Circle", "Creepy", "Ball", "Scary"}));
        monster.addBrick(createBrick(341, ItemLayer.DECORATION, decoBlocksBMD, "brickmonster","", ItemTab.DECORATIVE,false,false,211,0x0, new String[] {"Eye", "Yellow", "Circle", "Creepy", "Ball", "Scary"}));
        monster.addBrick(createBrick(342, ItemLayer.DECORATION, decoBlocksBMD, "brickmonster","", ItemTab.DECORATIVE,false,false,212,0x0, new String[] {"Eye", "Blue", "Circle", "Creepy", "Ball", "Scary"}));
        brickPackages.add(monster);

        ItemBrickPackage fog = new ItemBrickPackage("fog", "Fog", new String[] {"Mist", "Transparent", "Damp", "Environment"});
        fog.addBrick(createBrick(343, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,213,0x0, new String[] {"Center", "Middle"}));
        fog.addBrick(createBrick(344, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,214,0x0, new String[] {"Bottom", "Side"}));
        fog.addBrick(createBrick(345, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,215,0x0, new String[] {"Top", "Side"}));
        fog.addBrick(createBrick(346, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,216,0x0, new String[] {"Left", "Side"}));
        fog.addBrick(createBrick(347, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,217,0x0, new String[] {"Right", "Side"}));
        fog.addBrick(createBrick(348, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,218,0x0, new String[] {"Top Right", "Corner"}));
        fog.addBrick(createBrick(349, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,219,0x0, new String[] {"Top Left", "Corner"}));
        fog.addBrick(createBrick(350, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,220,0x0, new String[] {"Bottom Left", "Corner"}));
        fog.addBrick(createBrick(351, ItemLayer.ABOVE, decoBlocksBMD, "brickfog","", ItemTab.DECORATIVE,false,false,221,0x0, new String[] {"Bottom Right", "Corner"}));
        brickPackages.add(fog);

        ItemBrickPackage halloween2012 = new ItemBrickPackage("halloween 2012", "Halloween 2012", new String[] {"Holiday", "Spooky"});
        halloween2012.addBrick(createBrick(352,ItemLayer.ABOVE,decoBlocksBMD,"brickhw2012","",ItemTab.DECORATIVE,false,true,222,0x0, new String[] {"Head", "Transfer", "Lamp", "Top"}));
        halloween2012.addBrick(createBrick(353,ItemLayer.DECORATION,decoBlocksBMD,"brickhw2012","",ItemTab.DECORATIVE,false,false,223,0x0, new String[] {"Antenna", "Tesla coil", "Middle"}));
        halloween2012.addBrick(createBrick(354,ItemLayer.DECORATION,decoBlocksBMD,"brickhw2012","",ItemTab.DECORATIVE,false,true,224,0x0, new String[] {"Wire", "Blue", "Red", "Electricity", "Wiring", "Power", "Vertical"}));
        halloween2012.addBrick(createBrick(355,ItemLayer.DECORATION,decoBlocksBMD,"brickhw2012","",ItemTab.DECORATIVE,false,true,225,0x0, new String[] {"Wire", "Blue", "Red", "Electricity", "Wiring", "Power", "Horizontal"}));
        halloween2012.addBrick(createBrick(356,ItemLayer.ABOVE,decoBlocksBMD,"brickhw2012","",ItemTab.DECORATIVE,false,false,226,0x0, new String[] {"Lightning", "Storm", "Electricity", "Environment"}));
        brickPackages.add(halloween2012);

        ItemBrickPackage brickchecker = new ItemBrickPackage("checker", "Checker Blocks", new String[] {"Checkered"});
        brickchecker.addBrick(createBrick(1091,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,263, 0xFFBFBFBF, new String[] {"White", "Light"}));
        brickchecker.addBrick(createBrick(186,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,161,0xff6B6B6B, new String[] {"Gray", "Grey"}));
        brickchecker.addBrick(createBrick(1026,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,213,-1, new String[] {"Black", "Dark", "Gray", "Grey"}));
        brickchecker.addBrick(createBrick(189,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,164,0xffA8193F, new String[] {"Red", "Magenta"}));
        brickchecker.addBrick(createBrick(1025,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,212,-1, new String[] {"Orange"}));
        brickchecker.addBrick(createBrick(190,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,165,0xffABB333, new String[] {"Yellow", "Lime"}));
        brickchecker.addBrick(createBrick(191,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,166,0xff45A337, new String[] {"Green"}));
        brickchecker.addBrick(createBrick(192,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,167,0xff3CB2AC, new String[] {"Cyan", "Blue"}));
        brickchecker.addBrick(createBrick(187,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,162,0xff2F5391, new String[] {"Blue"}));
        brickchecker.addBrick(createBrick(188,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,163,0xff803D91, new String[] {"Purple", "Magenta", "Pink", "Violet"}));
        brickPackages.add(brickchecker);

        ItemBrickPackage jungle = new ItemBrickPackage("jungle", "Jungle");
        jungle.addBrick(createBrick(193,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,168,0x0, new String[] {"Idol", "Face", "Brick", "No show", "Statue", "Totem", "Ruins"}));
        jungle.addBrick(createBrick(194,ItemLayer.DECORATION,blocksBMD,"","",ItemTab.BLOCK,false,true,169,0x0, new String[] {"Platform", "Old", "Mossy", "Ruins", "Stone"}));
        jungle.addBrick(createBrick(195,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,170,0xff99997A, new String[] {"Brick", "Grey", "Gray", "Ruins", "Stone"}));
        jungle.addBrick(createBrick(196,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,171,0xffAC7061, new String[] {"Brick", "Red", "Pink", "Ruins", "Stone"}));
        jungle.addBrick(createBrick(197,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,172,0xff62889A, new String[] {"Brick", "Blue", "Ruins", "Stone"}));
        jungle.addBrick(createBrick(198,ItemLayer.FORGROUND,blocksBMD,"","",ItemTab.BLOCK,false,true,173,0xff878441, new String[] {"Brick", "Yellow", "Olive", "Ruins", "Stone", "Green"}));
        jungle.addBrick(createBrick(617, ItemLayer.BACKGROUND, bgBlocksBMD, "", "",ItemTab.BACKGROUND,false,true,117,0xff666651, new String[] {"Brick", "Grey", "Gray", "Ruins", "Stone"}));
        jungle.addBrick(createBrick(618, ItemLayer.BACKGROUND, bgBlocksBMD, "", "",ItemTab.BACKGROUND,false,true,118,0xff774E44, new String[] {"Brick", "Red", "Pink", "Ruins", "Stone"}));
        jungle.addBrick(createBrick(619, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,119,0xff415A66, new String[] {"Brick", "Blue", "Ruins", "Stone"}));
        jungle.addBrick(createBrick(620, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,120,0xff6B6834, new String[] {"Brick", "Yellow", "Olive", "Ruins", "Stone", "Green"}));
        jungle.addBrick(createBrick(199, ItemLayer.DECORATION, blocksBMD, "","", ItemTab.BLOCK,false,true,176,0x0, new String[] {"Pot", "Jar", "Clay", "Ruins", "Urn"}));
        jungle.addBrick(createBrick(621, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,121,0xff688403, new String[] {"Leaves", "Green", "Grass", "Environment", "Nature"}));
        jungle.addBrick(createBrick(622, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,122,0xff587003, new String[] {"Leaves", "Green", "Grass", "Environment", "Nature"}));
        jungle.addBrick(createBrick(623, ItemLayer.BACKGROUND, bgBlocksBMD, "","", ItemTab.BACKGROUND,false,true,123,0xff425402, new String[] {"Leaves", "Green", "Grass", "Environment", "Nature"}));
        jungle.addBrick(createBrick(357, ItemLayer.ABOVE, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,227,0x0, new String[] {"Bush", "Plant", "Nature", "Environment"}));
        jungle.addBrick(createBrick(358, ItemLayer.ABOVE, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,228,0x0, new String[] {"Rock", "Pot", "Jar", "Basket", "Ruins", "Clay"}));
        jungle.addBrick(createBrick(359, ItemLayer.ABOVE, decoBlocksBMD, "","", ItemTab.DECORATIVE,false,false,229,0x0, new String[] {"Idol", "Statue", "Gold", "Trophy", "Artifact", "Artefact", "Yellow", "Ruins"}));
        brickPackages.add(jungle);

        ItemBrickPackage christmas2012 = new ItemBrickPackage("christmas 2012", "Christmas 2012", new String[] {"Xmas", "Holiday"});
        christmas2012.addBrick(createBrick(624, ItemLayer.BACKGROUND, bgBlocksBMD, "brickxmas2012","", ItemTab.BACKGROUND,false,true,124,0xffD88A19, new String[] {"Wrapping paper", "Yellow", "Stripes"}));
        christmas2012.addBrick(createBrick(625, ItemLayer.BACKGROUND, bgBlocksBMD, "brickxmas2012","", ItemTab.BACKGROUND,false,true,125,0xff54840D, new String[] {"Wrapping paper", "Green", "Stripes"}));
        christmas2012.addBrick(createBrick(626, ItemLayer.BACKGROUND, bgBlocksBMD, "brickxmas2012","", ItemTab.BACKGROUND,false,true,126,0xff1F39D8, new String[] {"Wrapping paper", "Blue", "Purple", "Dots", "Spots"}));
        christmas2012.addBrick(createBrick(362, ItemLayer.DECORATION, decoBlocksBMD, "brickxmas2012","", ItemTab.DECORATIVE,false,true,230,0x0, new String[] {"Ribbon", "Blue", "Vertical"}));
        christmas2012.addBrick(createBrick(363, ItemLayer.DECORATION, decoBlocksBMD, "brickxmas2012","", ItemTab.DECORATIVE,false,true,231,0x0, new String[] {"Ribbon", "Blue", "Horizontal"}));
        christmas2012.addBrick(createBrick(364, ItemLayer.DECORATION, decoBlocksBMD, "brickxmas2012","", ItemTab.DECORATIVE,false,true,232,0x0, new String[] {"Ribbon", "Blue", "Cross", "Middle"}));
        christmas2012.addBrick(createBrick(365, ItemLayer.DECORATION, decoBlocksBMD, "brickxmas2012","", ItemTab.DECORATIVE,false,true,233,0x0, new String[] {"Ribbon", "Purple", "Vertical", "Magenta", "Red"}));
        christmas2012.addBrick(createBrick(366, ItemLayer.DECORATION, decoBlocksBMD, "brickxmas2012","", ItemTab.DECORATIVE,false,true,234,0x0, new String[] {"Ribbon", "Purple", "Horizontal", "Magenta", "Red"}));
        christmas2012.addBrick(createBrick(367, ItemLayer.DECORATION, decoBlocksBMD, "brickxmas2012","", ItemTab.DECORATIVE,false,true,235,0x0, new String[] {"Ribbon", "Purple", "Cross", "Middle", "Magenta", "Red"}));
        brickPackages.add(christmas2012);

        ItemBrickPackage lavaPackage = new ItemBrickPackage("lava", "Lava", new String[] {"Hell", "Hot", "Environment", "Heat"});
        lavaPackage.addBrick(createBrick(202, ItemLayer.FORGROUND, blocksBMD, "bricklava","", ItemTab.BLOCK, false, true, 177, 0xffFFCE3E, new String[] {"Yellow"}));
        lavaPackage.addBrick(createBrick(203, ItemLayer.FORGROUND, blocksBMD, "bricklava","", ItemTab.BLOCK, false, true, 178, 0xffFA970E, new String[] {"Orange"}));
        lavaPackage.addBrick(createBrick(204, ItemLayer.FORGROUND, blocksBMD, "bricklava","", ItemTab.BLOCK, false, true, 179, 0xffFF5F00, new String[] {"Orange", "Red"}));
        lavaPackage.addBrick(createBrick(627, ItemLayer.BACKGROUND, bgBlocksBMD, "bricklava","", ItemTab.BACKGROUND, false, true, 127, 0xffCCA333, new String[] {"Yellow"}));
        lavaPackage.addBrick(createBrick(628, ItemLayer.BACKGROUND, bgBlocksBMD, "bricklava","", ItemTab.BACKGROUND, false, true, 128, 0xffC6750B, new String[] {"Orange"}));
        lavaPackage.addBrick(createBrick(629, ItemLayer.BACKGROUND, bgBlocksBMD, "bricklava","", ItemTab.BACKGROUND, false, true, 129, 0xffB73A00, new String[] {"Red", "Orange"}));
        lavaPackage.addBrick(createBrick(415, ItemLayer.ABOVE, decoBlocksBMD, "bricklava","", ItemTab.DECORATIVE, false, false, 264, 0x0, new String[] {"Fire", "Glow", "Orange"}));
        brickPackages.add(lavaPackage);

        ItemBrickPackage swamp = new ItemBrickPackage("swamp", "Swamp");
        swamp.addBrick(createBrick(370, ItemLayer.ABOVE, specialBlocksBMD, "brickswamp","", ItemTab.DECORATIVE, false, false, 249, 0x0, new String[] {"Mud", "Bubbles", "Gas", "Nature", "Environment", "Animated"}));
        swamp.addBrick(createBrick(371, ItemLayer.ABOVE, decoBlocksBMD, "brickswamp","", ItemTab.DECORATIVE, false, false, 236, 0x0, new String[] {"Grass", "Thick", "Nature", "Plant", "Environment"}));
        swamp.addBrick(createBrick(372, ItemLayer.ABOVE, decoBlocksBMD, "brickswamp","", ItemTab.DECORATIVE, false, false, 237, 0x0, new String[] {"Wood", "Nature", "Log", "Environment"}));
        swamp.addBrick(createBrick(373, ItemLayer.ABOVE, decoBlocksBMD, "brickswamp","", ItemTab.DECORATIVE, false, false, 238, 0x0, new String[] {"Danger", "Sign", "Caution", "Radioactive", "Nuclear"}));
        swamp.addBrick(createBrick(557, ItemLayer.BACKGROUND, bgBlocksBMD, "brickswamp","", ItemTab.BACKGROUND, false, false, 57,-1, new String[] {"Mud", "Quicksand", "Environment", "Soil"}));
        swamp.addBrick(createBrick(630, ItemLayer.BACKGROUND, bgBlocksBMD, "brickswamp","", ItemTab.BACKGROUND, false, false, 130, 0xff605A24, new String[] {"Green", "Grass", "Environment", "Soil"}));
        brickPackages.add(swamp);

        ItemBrickPackage sparta = new ItemBrickPackage("marble", "Sparta", new String[] {"Rome", "Sparta", "House", "Greece", "Roman"});
        sparta.addBrick(createBrick(382, ItemLayer.DECORATION, decoBlocksBMD, "bricksparta","", ItemTab.DECORATIVE, false, true, 239, 0x0, new String[] {"Column", "Top", "Ancient"}));
        sparta.addBrick(createBrick(383, ItemLayer.DECORATION, decoBlocksBMD, "bricksparta","", ItemTab.DECORATIVE, false, true, 240, 0x0, new String[] {"Column", "Middle", "Ancient"}));
        sparta.addBrick(createBrick(384, ItemLayer.DECORATION, decoBlocksBMD, "bricksparta","", ItemTab.DECORATIVE, false, true, 241, 0x0, new String[] {"Column", "Bottom", "Ancient"}));
        sparta.addBrick(createBrick(208, ItemLayer.FORGROUND, blocksBMD, "bricksparta","", ItemTab.BLOCK, false, true, 180, 0xffCDD1D3, new String[] {"Brick", "White", "Ancient", "Grey", "Gray"}));
        sparta.addBrick(createBrick(209, ItemLayer.FORGROUND, blocksBMD, "bricksparta","", ItemTab.BLOCK, false, true, 181, 0xffC1DCB9, new String[] {"Brick", "Green", "Ancient"}));
        sparta.addBrick(createBrick(210, ItemLayer.FORGROUND, blocksBMD, "bricksparta","", ItemTab.BLOCK, false, true, 182, 0xffE5C6CF, new String[] {"Brick", "Red", "Pink", "Ancient"}));
        sparta.addBrick(createBrick(211, ItemLayer.DECORATION, blocksBMD, "bricksparta","", ItemTab.BLOCK, false, true, 183, 0x0, new String[] {"Column", "Platform", "Top", "Ancient", "One-Way", "One Way"}));
        sparta.addBrick(createBrick(638, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksparta","", ItemTab.BACKGROUND, false, false, 132, 0xff777B7D, new String[] {"Brick", "White", "Ancient", "Grey", "Gray"}));
        sparta.addBrick(createBrick(639, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksparta","", ItemTab.BACKGROUND, false, false, 133, 0xff70816F, new String[] {"Brick", "Green", "Ancient"}));
        sparta.addBrick(createBrick(640, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksparta","", ItemTab.BACKGROUND, false, false, 134, 0xff83767B, new String[] {"Brick", "Red", "Pink", "Ancient"}));

        brickPackages.add(sparta);

        ItemBrickPackage admin = new ItemBrickPackage("Label", "Admin Blocks");
        admin.addBrick(createBrick(ItemId.LABEL,ItemLayer.DECORATION,decoBlocksBMD,"","",ItemTab.ACTION,false,true,265,0x0,new String[] {"Text", "Words", "ModText"}, true));
        brickPackages.add(admin);

        ItemBrickPackage textSign = new ItemBrickPackage("sign", "Signs (+1)");
        textSign.addBrick(createBrick(ItemId.TEXT_SIGN, ItemLayer.ABOVE, specialBlocksBMD, "bricksign","players will see a custom message when they touch this block", ItemTab.ACTION, false, true, 513, 0x0, new String[] {"Morphable", "Write", "Text", "Wood", "Info"}));
        brickPackages.add(textSign);

        ItemBrickPackage farm = new ItemBrickPackage("farm", "Farm");
        farm.addBrick(createBrick(386,ItemLayer.ABOVE,decoBlocksBMD,"brickfarm","",ItemTab.DECORATIVE,false,false,243,-1, new String[] {"Wheat", "Nature", "Plant", "Environment"}));
        farm.addBrick(createBrick(387,ItemLayer.ABOVE,decoBlocksBMD,"brickfarm","",ItemTab.DECORATIVE,false,false,244,-1, new String[] {"Corn", "Nature", "Plant", "Environment"}));
        farm.addBrick(createBrick(388, ItemLayer.ABOVE, decoBlocksBMD, "brickfarm", "", ItemTab.DECORATIVE, false, true, 245, -1, new String[] {"Fence", "Wood", "Left"}));
        farm.addBrick(createBrick(1531,ItemLayer.ABOVE,decoBlocksBMD,"brickfarm","",ItemTab.DECORATIVE,false,true,332, -1, new String[] {"Fence", "Wood", "Center", "Middle"}));
        farm.addBrick(createBrick(389,ItemLayer.ABOVE,decoBlocksBMD,"brickfarm","",ItemTab.DECORATIVE,false,true,246,-1, new String[] {"Fence", "Wood", "Right"}));
        farm.addBrick(createBrick(212, ItemLayer.DECORATION, blocksBMD, "brickfarm","", ItemTab.BLOCK, false, true, 184, 0xffCCBE75, new String[] {"Hay", "Yellow", "Haybale", "Straw"}));

        brickPackages.add(farm);

        ItemBrickPackage autumn2014 = new ItemBrickPackage("autumn 2014", "Autumn 2014", new String[] {"Nature", "Environment", "Season", "Fall"});
        autumn2014.addBrick(createBrick(390, ItemLayer.ABOVE, decoBlocksBMD, "brickautumn2014","", ItemTab.DECORATIVE, false, false, 247,-1, new String[] {"Leaves", "Left", "Orange"}));
        autumn2014.addBrick(createBrick(391, ItemLayer.ABOVE, decoBlocksBMD, "brickautumn2014","", ItemTab.DECORATIVE, false, false, 248,-1, new String[] {"Leaves", "Right", "Orange"}));
        autumn2014.addBrick(createBrick(392, ItemLayer.ABOVE, decoBlocksBMD, "brickautumn2014","", ItemTab.DECORATIVE, false, false, 249,-1, new String[] {"Grass", "Left"}));
        autumn2014.addBrick(createBrick(393, ItemLayer.ABOVE, decoBlocksBMD, "brickautumn2014","", ItemTab.DECORATIVE, false, false, 250,-1, new String[] {"Grass", "Middle"}));
        autumn2014.addBrick(createBrick(394, ItemLayer.ABOVE, decoBlocksBMD, "brickautumn2014","", ItemTab.DECORATIVE, false, false, 251,-1, new String[] {"Grass", "Right"}));
        autumn2014.addBrick(createBrick(395, ItemLayer.ABOVE, decoBlocksBMD, "brickautumn2014","", ItemTab.DECORATIVE, false, false, 252,-1, new String[] {"Acorn", "Nut", "Brown"}));
        autumn2014.addBrick(createBrick(396, ItemLayer.ABOVE, decoBlocksBMD, "brickautumn2014","", ItemTab.DECORATIVE, false, false, 253,-1, new String[] {"Pumpkin", "Halloween", "Food", "Orange"}));
        autumn2014.addBrick(createBrick(641, ItemLayer.BACKGROUND, bgBlocksBMD, "brickautumn2014","", ItemTab.BACKGROUND, false, true, 135,-1, new String[] {"Leaves", "Yellow"}));
        autumn2014.addBrick(createBrick(642, ItemLayer.BACKGROUND, bgBlocksBMD, "brickautumn2014","", ItemTab.BACKGROUND, false, true, 136,-1, new String[] {"Leaves", "Orange"}));
        autumn2014.addBrick(createBrick(643, ItemLayer.BACKGROUND, bgBlocksBMD, "brickautumn2014","", ItemTab.BACKGROUND, false, true, 137,-1, new String[] {"Leaves", "Red"}));
        brickPackages.add(autumn2014);

        ItemBrickPackage christmas2014 = new ItemBrickPackage("christmas 2014", "Christmas 2014", new String[] {"Xmas", "Holiday"});
        christmas2014.addBrick(createBrick(215, ItemLayer.FORGROUND, blocksBMD, "brickchristmas2014","", ItemTab.BLOCK, false, true, 187,-1, new String[] {"Snow", "Environment"}));
        christmas2014.addBrick(createBrick(216, ItemLayer.DECORATION, blocksBMD, "brickchristmas2014","", ItemTab.BLOCK, false, true, 188,-1, new String[] {"Ice", "Snow", "Platform", "Icicle", "Top", "Environment", "One-Way", "One Way"}));
        christmas2014.addBrick(createBrick(398, ItemLayer.ABOVE, decoBlocksBMD, "brickchristmas2014","", ItemTab.DECORATIVE, false, false, 254,-1, new String[] {"Snow", "Fluff", "Left", "Snowdrift", "Environment"}));
        christmas2014.addBrick(createBrick(399, ItemLayer.ABOVE, decoBlocksBMD, "brickchristmas2014","", ItemTab.DECORATIVE, false, false, 255,-1, new String[] {"Snow", "Fluff", "Middle", "Snowdrift", "Environment"}));
        christmas2014.addBrick(createBrick(400, ItemLayer.ABOVE, decoBlocksBMD, "brickchristmas2014","", ItemTab.DECORATIVE, false, false, 256,-1, new String[] {"Snow", "Fluff", "Right", "Snowdrift", "Environment"}));
        christmas2014.addBrick(createBrick(401, ItemLayer.ABOVE, decoBlocksBMD, "brickchristmas2014","", ItemTab.DECORATIVE, false, false, 257, 0x0, new String[] {"Candy cane", "Stripes"}));
        christmas2014.addBrick(createBrick(402, ItemLayer.DECORATION, decoBlocksBMD, "brickchristmas2014","", ItemTab.DECORATIVE, false, true, 258, 0x0, new String[] {"Tinsel", "Nature", "Garland", "Top"}));
        christmas2014.addBrick(createBrick(403, ItemLayer.DECORATION, decoBlocksBMD, "brickchristmas2014","", ItemTab.DECORATIVE, false, true, 259, 0x0, new String[] {"Stocking", "Sock", "Red", "Holiday"}));
        christmas2014.addBrick(createBrick(404, ItemLayer.DECORATION, decoBlocksBMD, "brickchristmas2014","", ItemTab.DECORATIVE, false, true, 260, 0x0, new String[] {"Bow", "Ribbon", "Red"}));
        brickPackages.add(christmas2014);

        ItemBrickPackage oneway = new ItemBrickPackage("one-way", "One-way Blocks", new String[] {"Platform"});
        oneway.addBrick(createBrick(ItemId.ONEWAY_WHITE, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 566,-1, new String[] {"One way", "White", "Light", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_GRAY, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 472,-1, new String[] {"One way", "Gray", "Grey", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_BLACK, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 488,-1, new String[] {"One way", "Black", "Dark", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_RED, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 480,-1, new String[] {"One way", "Red", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_ORANGE, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 272,-1, new String[] {"One way", "Orange", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_YELLOW, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 268,-1, new String[] {"One way", "Yellow", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_GREEN, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 484,-1, new String[] {"One way", "Green", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_CYAN, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 264,-1, new String[] {"One way", "Cyan", "Blue", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_BLUE, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 476,-1, new String[] {"One way", "Blue", "Dark", "Morphable", "One-way"}));
        oneway.addBrick(createBrick(ItemId.ONEWAY_PINK, ItemLayer.DECORATION, specialBlocksBMD, "brickoneway","", ItemTab.BLOCK, false, false, 276,-1, new String[] {"One way", "Purple", "Pink", "Morphable", "One-way"}));
        brickPackages.add(oneway);

        ItemBrickPackage valentines2015 = new ItemBrickPackage("valentines 2015", "Valentines 2015", new String[] {"Kiss", "Holiday", "Love", "Heart", "<3"});
        valentines2015.addBrick(createBrick(405, ItemLayer.DECORATION, decoBlocksBMD, "brickvalentines2015","", ItemTab.DECORATIVE, false, true, 261, 0x0, new String[] {"Red"}));
        valentines2015.addBrick(createBrick(406, ItemLayer.DECORATION, decoBlocksBMD, "brickvalentines2015","", ItemTab.DECORATIVE, false, true, 262, 0x0, new String[] {"Purple", "Pink"}));
        valentines2015.addBrick(createBrick(407, ItemLayer.DECORATION, decoBlocksBMD, "brickvalentines2015","", ItemTab.DECORATIVE, false, true, 263, 0x0, new String[] {"Pink"}));
        brickPackages.add(valentines2015);

        ItemBrickPackage magic = new ItemBrickPackage("magic", "Magic Blocks" , new String[] {"Rare"});
        magic.addBrick(createBrick(1013, ItemLayer.FORGROUND, blocksBMD, "brickmagic", "the first magic block", ItemTab.BLOCK, false, true, 200, -1, new String[] {"Green", "Emerald", "Peridot"}));
        magic.addBrick(createBrick(1014, ItemLayer.FORGROUND, blocksBMD, "brickmagic2", "the second magic block", ItemTab.BLOCK, false, true, 201, -1, new String[] {"Purple", "Violet", "Amethyst"}));
        magic.addBrick(createBrick(1015, ItemLayer.FORGROUND, blocksBMD, "brickmagic3", "the third magic block", ItemTab.BLOCK, false, true, 202, -1, new String[] {"Yellow", "Orange", "Amber", "Topaz"}));
        magic.addBrick(createBrick(1016, ItemLayer.FORGROUND, blocksBMD, "brickmagic4", "the fourth magic block", ItemTab.BLOCK, false, true, 203, -1, new String[] {"Blue", "Sapphire"}));
        magic.addBrick(createBrick(1017, ItemLayer.FORGROUND, blocksBMD, "brickmagic5", "the fifth magic block", ItemTab.BLOCK, false, true, 204, -1, new String[] {"Red", "Ruby", "Garnet"}));
        magic.addBrick(createBrick(1132, ItemLayer.FORGROUND, blocksBMD, "brickmagic6", "the sixth magic block", ItemTab.BLOCK, false, true, 293, -1, new String[] {"Cyan", "Aquamarine", "Turquoise"}));
        magic.addBrick(createBrick(1142, ItemLayer.FORGROUND, blocksBMD, "brickmagic7", "the seventh magic block", ItemTab.BLOCK, false, true, 299, -1, new String[] {"White", "Opal", "Pearl"}));
        magic.addBrick(createBrick(1161, ItemLayer.FORGROUND, blocksBMD, "brickmagic8", "the eighth magic block", ItemTab.BLOCK, false, true, 316, -1, new String[] {"Black", "Onyx"}));
        brickPackages.add(magic);

        ItemBrickPackage effect = new ItemBrickPackage("effect", "Effect Blocks", new String[] {"Powers", "Action", "Physics"});
        effect.addBrick(createBrick(ItemId.EFFECT_JUMP, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectjump","jump effect: players jump twice or half as high", ItemTab.ACTION, false ,false, 0, 0x0, new String[] {"Jump", "Boost", "High", "Low"}));
        effect.addBrick(createBrick(ItemId.EFFECT_FLY, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectfly","fly effect: players can levitate by holding space", ItemTab.ACTION, false, false, 1, 0x0, new String[] {"Fly", "Hover", "Levitate"}));
        effect.addBrick(createBrick(ItemId.EFFECT_RUN, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectspeed","speed effect: players move 50% faster or slower", ItemTab.ACTION, false, false, 2, 0x0, new String[] {"Speed", "Fast", "Run", "Slow"}));
        effect.addBrick(createBrick(ItemId.EFFECT_LOW_GRAVITY, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectlowgravity","low gravity effect: player gravity is reduced", ItemTab.ACTION, false, false, 13, 0x0, new String[] {"Gravity", "Moon", "Low gravity", "Space", "Slow fall", "Float"}));
        effect.addBrick(createBrick(ItemId.EFFECT_PROTECTION, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectprotection","protection effect: players are safe from hazards and cured from curses/zombies", ItemTab.ACTION, false, false, 3, 0x0, new String[] {"Invincible", "Health", "Plus", "Immortal", "Protection"}));
        effect.addBrick(createBrick(ItemId.EFFECT_CURSE, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectcurse","players die after X seconds, spreads on contact, maximum of 3 curses at a time", ItemTab.ACTION, false, false, 4, 0x0, new String[] {"Curse", "Skull", "Skeleton", "Timed", "Death", "Die", "Kill"}));
        effect.addBrick(createBrick(ItemId.EFFECT_MULTIJUMP, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectmultijump","multijump effect: players can jump X times", ItemTab.ACTION, false, false, 15, 0x0, new String[] {"Double", "Jump", "Twice", "Powers", "Action", "Physics"}));
        effect.addBrick(createBrick(ItemId.EFFECT_GRAVITY, ItemLayer.DECORATION, specialBlocksBMD, "brickeffectgravity","gravity effect: player gravity is rotated", ItemTab.ACTION, false, false, 657, 0x0, new String[] {"Gravity", "Reverse", "Action", "Physics"}));
        effect.addBrick(createBrick(ItemId.EFFECT_POISON, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectpoison","poison effect: players die after X seconds, does not spread", ItemTab.ACTION, false, false, 23, 0x0, new String[] {"Poison", "Toxic", "Action", "Timed", "Death", "Die", "Kill"}));
        effect.addBrick(createBrick(ItemId.EFFECT_RESET, ItemLayer.DECORATION, effectBlocksBMD, "brickeffectreset","reset effect: resets all non-timed effects", ItemTab.ACTION, false, false, 26, 0x0, new String[] {"Reset", "Action", "Physics"}));
        brickPackages.add(effect);

        // TODO: Add tags
        ItemBrickPackage gm = new ItemBrickPackage("gold", "Gold Membership Blocks", new String[] {"Shiny", "Yellow"});
        gm.addBrick(createBrick(1065, ItemLayer.FORGROUND, blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 242, -1, new String[] {}));
        gm.addBrick(createBrick(1066, ItemLayer.FORGROUND, blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 243, -1, new String[] {}));
        gm.addBrick(createBrick(1067, ItemLayer.FORGROUND, blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 244, -1, new String[] {}));
        gm.addBrick(createBrick(1068, ItemLayer.FORGROUND, blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 245, -1, new String[] {}));
        gm.addBrick(createBrick(1069, ItemLayer.DECORATION, blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 246, 0x0, new String[] {}));
        gm.addBrick(createBrick(709, ItemLayer.BACKGROUND, bgBlocksBMD, "goldmember", "", ItemTab.BACKGROUND, true, false, 198, -1, new String[] {}));
        gm.addBrick(createBrick(710, ItemLayer.BACKGROUND, bgBlocksBMD, "goldmember", "", ItemTab.BACKGROUND, true, false, 199, -1, new String[] {}));
        gm.addBrick(createBrick(711, ItemLayer.BACKGROUND, bgBlocksBMD, "goldmember", "", ItemTab.BACKGROUND, true, false, 200, -1, new String[] {}));
        gm.addBrick(createBrick(ItemId.GATE_GOLD,ItemLayer.DECORATION,doorBlocksBMD,"goldmember","allows white-border smilies to pass",ItemTab.ACTION,true,false,10, -1, new String[] {}));
        gm.addBrick(createBrick(ItemId.DOOR_GOLD,ItemLayer.DECORATION,doorBlocksBMD,"goldmember","allows gold-border smilies to pass", ItemTab.ACTION,true,false,11, -1, new String[] {}));
        brickPackages.add(gm);

        ItemBrickPackage cave = new ItemBrickPackage("cave", "Cave Backgrounds", new String[] {"Environment"});
        cave.addBrick(createBrick(766, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 259, -1, new String[] {"Dark", "Grey", "Gray"}));
        cave.addBrick(createBrick(767, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 260, -1, new String[] {"Dark", "Grey", "Gray"}));
        cave.addBrick(createBrick(768, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 261, -1, new String[] {"Dark", "Grey", "Gray", "Black"}));
        cave.addBrick(createBrick(662, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 156, -1, new String[] {"Dark", "Red"}));
        cave.addBrick(createBrick(660, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 154, -1, new String[] {"Dark", "Orange", "Brown"}));
        cave.addBrick(createBrick(661, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 155, -1, new String[] {"Dark", "Yellow", "Olive"}));
        cave.addBrick(createBrick(659, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 153, -1, new String[] {"Dark", "Green"}));
        cave.addBrick(createBrick(656, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 150, -1, new String[] {"Dark", "Cyan"}));
        cave.addBrick(createBrick(657, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 151, -1, new String[] {"Dark", "Blue", "Night", "Sky"}));
        cave.addBrick(createBrick(655, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 149, -1, new String[] {"Dark", "Purple"}));
        cave.addBrick(createBrick(658, ItemLayer.BACKGROUND, bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 152, -1, new String[] {"Dark", "Pink", "Magenta", "Violet"}));
        brickPackages.add(cave);

        ItemBrickPackage summer2015 = new ItemBrickPackage("summer 2015", "Summer 2015", new String[] {"Season"});
        summer2015.addBrick(createBrick(441, ItemLayer.ABOVE, decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, true, 280, 0x0, new String[] {"Life preserver", "Life saver", "Circle", "Life buoy", "Ring"}));
        summer2015.addBrick(createBrick(442, ItemLayer.DECORATION, decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, true, 281, 0x0, new String[] {"Anchor", "Metal", "Ship", "Water"}));
        summer2015.addBrick(createBrick(443, ItemLayer.ABOVE, decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, false, 282, 0x0, new String[] {"Rope", "Left", "Dock"}));
        summer2015.addBrick(createBrick(444, ItemLayer.ABOVE, decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, false, 283, 0x0, new String[] {"Rope", "Right", "Dock"}));
        summer2015.addBrick(createBrick(445, ItemLayer.ABOVE, decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, false, 284, 0x0, new String[] {"Tree", "Nature", "Palm", "Plant", "Environment"}));
        brickPackages.add(summer2015);

        ItemBrickPackage environment = new ItemBrickPackage("environment", "Environment", new String[] {"Nature"});
        environment.addBrick(createBrick(1030, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 215,-1, new String[] {"Wood", "Tree", "Brown"}));
        environment.addBrick(createBrick(1031, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 216,-1, new String[] {"Leaves", "Grass", "Green", "Plant"}));
        environment.addBrick(createBrick(1032, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 217,-1, new String[] {"Bamboo", "Wood", "Yellow"}));
        environment.addBrick(createBrick(1033, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 218,-1, new String[] {"Obsidian", "Rock", "Ice", "Grey", "Gray"}));
        environment.addBrick(createBrick(1034, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 219,-1, new String[] {"Fire", "Lava", "Hot"}));
        environment.addBrick(createBrick(678, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 172,-1, new String[] {"Wood", "Tree", "Brown"}));
        environment.addBrick(createBrick(679, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 173,-1, new String[] {"Leaves", "Grass", "Green"}));
        environment.addBrick(createBrick(680, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 174,-1, new String[] {"Bamboo", "Wood"}));
        environment.addBrick(createBrick(681, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 175,-1, new String[] {"Obsidian", "Rock", "Ice", "Grey", "Gray"}));
        environment.addBrick(createBrick(682, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 176,-1, new String[] {"Fire", "Lava", "Hot", "Molten"}));
        brickPackages.add(environment);

        ItemBrickPackage domestic = new ItemBrickPackage("domestic", "Domestic", new String[] {"House"});
        domestic.addBrick(createBrick(1035, ItemLayer.FORGROUND, blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 220,-1, new String[] {"Tile", "Double", "Floor", "Parquet", "Checkered"}));
        domestic.addBrick(createBrick(1036, ItemLayer.FORGROUND, blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 221,-1, new String[] {"Wood", "Brown", "Floor"}));
        domestic.addBrick(createBrick(1037, ItemLayer.FORGROUND, blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 222,-1, new String[] {"Red", "Carpet"}));
        domestic.addBrick(createBrick(1038, ItemLayer.FORGROUND, blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 223,-1, new String[] {"Blue", "Carpet"}));
        domestic.addBrick(createBrick(1039, ItemLayer.FORGROUND, blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 224,-1, new String[] {"Green", "Carpet", "Grass"}));
        domestic.addBrick(createBrick(1040, ItemLayer.FORGROUND, blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 225,-1, new String[] {"White", "Marble", "Box", "Square"}));
        domestic.addBrick(createBrick(683, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 177,-1, new String[] {"Wallpaper", "Yellow", "Dark yellow", "Brown"}));
        domestic.addBrick(createBrick(684, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 178,-1, new String[] {"Wallpaper", "Brown", "Dark brown"}));
        domestic.addBrick(createBrick(685, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 179,-1, new String[] {"Wallpaper", "Red", "Dark red"}));
        domestic.addBrick(createBrick(686, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 180,-1, new String[] {"Wallpaper", "Blue", "Dark blue"}));
        domestic.addBrick(createBrick(687, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 181,-1, new String[] {"Wallpaper", "Green", "Dark green", "Stripes"}));
        domestic.addBrick(createBrick(446, ItemLayer.DECORATION, decoBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 285, 0x0, new String[] {"Light", "Lampshade"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_LIGHT_BULB, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 425, 0x0, new String[] {"Light", "Bulb", "Morphable"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_TAP, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, true, 429, 0x0, new String[] {"Pipe", "Tube", "Mario", "Corner", "Morphable"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_PIPE_STRAIGHT, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 715, 0x0, new String[] {"Pipe", "Tube", "Mario", "Morphable"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_PIPE_T, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 717, 0x0, new String[] {"Pipe", "Tube", "Mario", "Corner", "Morphable"}));
        domestic.addBrick(createBrick(1539, ItemLayer.DECORATION, decoBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, true, 335,0x0, new String[] {"Pipe", "Tube", "Mario", "Corner"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_PAINTING, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 433, 0x0, new String[] {"Picture", "Painting", "Frame", "Morphable"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_VASE, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 437, 0x0, new String[] {"Flower", "Nature", "Plant", "Vase"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_TV, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 441, 0x0, new String[] {"Television", "TV", "Morphable", "Screen", "CRT", "Box", "LCD", "Electronic"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_WINDOW, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 445, 0x0, new String[] {"Window", "Morphable"}));
        domestic.addBrick(createBrick(ItemId.HALFBLOCK_DOMESTIC_YELLOW, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, false, 449,-1, new String[] {"Half block", "Yellow", "Morphable", "Gold"}));
        domestic.addBrick(createBrick(ItemId.HALFBLOCK_DOMESTIC_BROWN, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, false, 453,-1, new String[] {"Half block", "Brown", "Morphable", "Wood"}));
        domestic.addBrick(createBrick(ItemId.HALFBLOCK_DOMESTIC_WHITE, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, false, 457, -1, new String[] {"Half block", "White", "Morphable", "Marble"}));
        domestic.addBrick(createBrick(ItemId.DOMESTIC_FRAME_BORDER, ItemLayer.DECORATION, specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 720, 0x0, new String[] {"Picture", "Painting", "Frame", "Morphable"}));
        brickPackages.add(domestic);

        ItemBrickPackage halloween2015 = new ItemBrickPackage("halloween 2015", "Halloween 2015", new String[] {"Holiday", "House", "Scary", "Creepy"});
        halloween2015.addBrick(createBrick(1047, ItemLayer.FORGROUND, blocksBMD, "brickhalloween2015", "", ItemTab.BLOCK, false, true, 229,-1, new String[] {"Mossy", "Green", "Brick", "Old", "Sewer", "Ghost"}));
        halloween2015.addBrick(createBrick(1048, ItemLayer.FORGROUND, blocksBMD, "brickhalloween2015", "", ItemTab.BLOCK, false, true, 230,-1, new String[] {"Siding", "Light gray"}));
        halloween2015.addBrick(createBrick(1049, ItemLayer.FORGROUND, blocksBMD, "brickhalloween2015", "", ItemTab.BLOCK, false, true, 231,-1, new String[] {"Mossy", "Gray", "Green", "Grey", "Roof", "Catacomb", "Brick", "Tomb"}));
        halloween2015.addBrick(createBrick(ItemId.HALLOWEEN_2015_ONEWAY, ItemLayer.DECORATION, blocksBMD, "brickhalloween2015", "", ItemTab.BLOCK, false, true, 232, 0x0, new String[] {"Platform", "Gray", "Grey", "Stone", "Corner", "One Way", "One-Way"}));
        halloween2015.addBrick(createBrick(454, ItemLayer.ABOVE, decoBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 286, 0x0, new String[] {"Bush", "Nature", "Plant", "Dead", "Shrub", "Environment"}));
        halloween2015.addBrick(createBrick(455, ItemLayer.ABOVE, decoBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 287, 0x0, new String[] {"Fence", "Spikes"}));
        halloween2015.addBrick(createBrick(ItemId.HALLOWEEN_2015_WINDOW_RECT, ItemLayer.DECORATION, specialBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 461, 0x0, new String[] {"Window", "Morphable", "Wood", "Arched"}));
        halloween2015.addBrick(createBrick(ItemId.HALLOWEEN_2015_WINDOW_CIRCLE, ItemLayer.DECORATION, specialBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 463, 0x0, new String[] {"Window", "Morphable", "Round", "Circle", "Wood"}));
        halloween2015.addBrick(createBrick(ItemId.HALLOWEEN_2015_LAMP, ItemLayer.DECORATION, specialBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 465, 0x0, new String[] {"Light", "Morphable", "Lamp", "Lantern"}));
        halloween2015.addBrick(createBrick(694, ItemLayer.BACKGROUND, bgBlocksBMD, "brickhalloween2015", "", ItemTab.BACKGROUND, false, false, 188,-1, new String[] {"Mossy", "Green", "Brick", "Stone", "Sewer"}));
        halloween2015.addBrick(createBrick(695, ItemLayer.BACKGROUND, bgBlocksBMD, "brickhalloween2015", "", ItemTab.BACKGROUND, false, false, 189,-1, new String[] {"Sliding", "Gray", "Grey", "Slabs", "Sewer"}));
        halloween2015.addBrick(createBrick(696, ItemLayer.BACKGROUND, bgBlocksBMD, "brickhalloween2015", "", ItemTab.BACKGROUND, false, false, 190,-1, new String[] {"Mossy", "Gray", "Grey", "Roof", "Catacomb", "Tomb"}));
        brickPackages.add(halloween2015);

        ItemBrickPackage arctic = new ItemBrickPackage("arctic", "Arctic", new String[] {"Snow", "Cold", "Blue", "Frozen", "Freeze"});
        arctic.addBrick(createBrick(1059, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 237,-1, new String[] {"Ice"}));
        arctic.addBrick(createBrick(1060, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 238,-1));
        arctic.addBrick(createBrick(1061, ItemLayer.DECORATION, blocksBMD, "", "", ItemTab.BLOCK, false, true, 239,-1, new String[] {"Left"}));
        arctic.addBrick(createBrick(1062, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 240,-1, new String[] {"Middle"}));
        arctic.addBrick(createBrick(1063, ItemLayer.DECORATION, blocksBMD, "", "", ItemTab.BLOCK, false, true, 241,-1, new String[] {"Right"}));
        arctic.addBrick(createBrick(702, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 196,-1));
        arctic.addBrick(createBrick(703, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 197,-1));
        brickPackages.add(arctic);

        ItemBrickPackage newYear2015 = new ItemBrickPackage("new year 2015", "New Year 2015", new String[] {"Holiday"});
        newYear2015.addBrick(createBrick(462, ItemLayer.DECORATION, decoBlocksBMD, "bricknewyear2015", "", ItemTab.DECORATIVE, false, true, 289, 0x0, new String[] {"Glass", "Wine", "Drink"}));
        newYear2015.addBrick(createBrick(463, ItemLayer.DECORATION, decoBlocksBMD, "bricknewyear2015", "", ItemTab.DECORATIVE, false, true, 290, 0x0, new String[] {"Bottle", "Champagne", "Drink"}));
        newYear2015.addBrick(createBrick(ItemId.NEW_YEAR_2015_BALLOON, ItemLayer.DECORATION, specialBlocksBMD, "bricknewyear2015", "", ItemTab.DECORATIVE, false, true, 492, 0x0, new String[] {"Balloon", "Morphable"}));
        newYear2015.addBrick(createBrick(ItemId.NEW_YEAR_2015_STREAMER, ItemLayer.DECORATION, specialBlocksBMD, "bricknewyear2015", "", ItemTab.DECORATIVE, false, true, 497, 0x0, new String[] {"String", "Morphable", "Streamer"}));
        brickPackages.add(newYear2015);

        ItemBrickPackage ice = new ItemBrickPackage("ice", "Ice");
        ice.addBrick(createBrick(ItemId.ICE, ItemLayer.DECORATION, specialBlocksBMD, "brickice2", "", ItemTab.ACTION, false, true, 501, -1, new String[] {"Slippery", "Physics", "Slide"}));
        brickPackages.add(ice);

        ItemBrickPackage fairytale = new ItemBrickPackage("fairytale", "Fairytale", new String[] {"Mythical", "Fiction"});
        fairytale.addBrick(createBrick(1070, ItemLayer.FORGROUND, blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 247, -1, new String[] {"Cobblestone", "Pebbles"}));
        fairytale.addBrick(createBrick(1071, ItemLayer.FORGROUND, blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 248, -1, new String[] {"Orange", "Tree"}));
        fairytale.addBrick(createBrick(1072, ItemLayer.FORGROUND, blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 249, -1, new String[] {"Green", "Moss"}));
        fairytale.addBrick(createBrick(1073, ItemLayer.DECORATION, blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 250, -1, new String[] {"Blue", "Cloud"}));
        fairytale.addBrick(createBrick(1074, ItemLayer.DECORATION, blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 251, -1, new String[] {"Red", "Mushroom", "Spotted"}));
        fairytale.addBrick(createBrick(468, ItemLayer.DECORATION, decoBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 291, 0x0, new String[] {"Green", "Plant", "Vine"}));
        fairytale.addBrick(createBrick(469, ItemLayer.DECORATION, decoBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 292, 0x0, new String[] {"Mushroom", "Orange"}));
        fairytale.addBrick(createBrick(1622, ItemLayer.DECORATION, decoBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 365, 0x0, new String[] {"Mushroom", "Red", "Spotted"}));
        fairytale.addBrick(createBrick(470, ItemLayer.DECORATION, decoBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 293, 0x0, new String[] {"Dew Drop", "Transparent", "Water"}));
        fairytale.addBrick(createBrick(704, ItemLayer.BACKGROUND, bgBlocksBMD, "brickfairytale", "", ItemTab.BACKGROUND, false, false, 201,-1, new String[] {"Orange", "Mist", "Fog", "Swirl"}));
        fairytale.addBrick(createBrick(705, ItemLayer.BACKGROUND, bgBlocksBMD, "brickfairytale", "", ItemTab.BACKGROUND, false, false, 202,-1, new String[] {"Green", "Mist", "Fog", "Swirl"}));
        fairytale.addBrick(createBrick(706, ItemLayer.BACKGROUND, bgBlocksBMD, "brickfairytale", "", ItemTab.BACKGROUND, false, false, 203,-1, new String[] {"Blue", "Mist", "Fog", "Swirl"}));
        fairytale.addBrick(createBrick(707, ItemLayer.BACKGROUND, bgBlocksBMD, "brickfairytale", "", ItemTab.BACKGROUND, false, false, 204,-1, new String[] {"Pink", "Mist", "Fog", "Swirl"}));
        fairytale.addBrick(createBrick(ItemId.HALFBLOCK_FAIRYTALE_ORANGE, ItemLayer.DECORATION, specialBlocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, false, 522, -1, new String[] {"Half block", "Gemstone", "Crystal", "Orange"}));
        fairytale.addBrick(createBrick(ItemId.HALFBLOCK_FAIRYTALE_GREEN, ItemLayer.DECORATION, specialBlocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, false, 526, -1, new String[] {"Half block", "Gemstone", "Crystal", "Green"}));
        fairytale.addBrick(createBrick(ItemId.HALFBLOCK_FAIRYTALE_BLUE, ItemLayer.DECORATION, specialBlocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, false, 530, -1, new String[] {"Half block", "Gemstone", "Crystal", "Blue"}));
        fairytale.addBrick(createBrick(ItemId.HALFBLOCK_FAIRYTALE_PINK, ItemLayer.DECORATION, specialBlocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, false, 534, -1, new String[] {"Half block", "Gemstone", "Crystal", "Pink"}));
        fairytale.addBrick(createBrick(ItemId.FAIRYTALE_FLOWERS, ItemLayer.DECORATION, specialBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 538, 0x0, new String[] {"Morphable", "Green", "Blue", "Orange", "Pink", "Plant", "Flower"}));
        brickPackages.add(fairytale);

        ItemBrickPackage spring2016 = new ItemBrickPackage("spring 2016", "Spring 2016");
        spring2016.addBrick(createBrick(1081, ItemLayer.FORGROUND, blocksBMD, "brickspring2016", "", ItemTab.BLOCK, false, true, 253, -1, new String[] {"Dirt", "Brown", "Soil", "Nature"}));
        spring2016.addBrick(createBrick(1082, ItemLayer.FORGROUND, blocksBMD, "brickspring2016", "", ItemTab.BLOCK, false, true, 254, -1, new String[] {"Hedge", "Green", "Leaf", "Nature", "Plant"}));
        spring2016.addBrick(createBrick(473, ItemLayer.ABOVE, decoBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 294, 0x0, new String[] {"Dirt", "Brown", "Soil", "Slope", "Left"}));
        spring2016.addBrick(createBrick(474, ItemLayer.ABOVE, decoBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 295, 0x0, new String[] {"Dirt", "Brown", "Soil", "Slope", "Right"}));
        spring2016.addBrick(createBrick(ItemId.SPRING_DAISY, ItemLayer.DECORATION, specialBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 541, 0x0, new String[] {"Daisy", "Flower", "Plant", "Nature", "White", "Blue", "Pink"}));
        spring2016.addBrick(createBrick(ItemId.SPRING_TULIP, ItemLayer.DECORATION, specialBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 544, 0x0, new String[] {"Tulip", "Flower", "Plant", "Nature", "Red", "Yellow", "Pink"}));
        spring2016.addBrick(createBrick(ItemId.SPRING_DAFFODIL, ItemLayer.DECORATION, specialBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 547, 0x0, new String[] {"Daffodil", "Flower", "Plant", "Nature", "Yellow", "White", "Orange"}));
        brickPackages.add(spring2016);

        ItemBrickPackage summer2016 = new ItemBrickPackage("summer 2016", "Summer 2016");
        summer2016.addBrick(createBrick(1083, ItemLayer.FORGROUND, blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 255, -1, new String[] {"Thatched", "Straw", "Seasonal", "Beige", "Tan"}));
        summer2016.addBrick(createBrick(1084, ItemLayer.FORGROUND, blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 256, -1, new String[] {"Planks", "Wood", "Seasonal", "Purple"}));
        summer2016.addBrick(createBrick(1085, ItemLayer.FORGROUND, blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 257, -1, new String[] {"Planks", "Wood", "Seasonal", "Yellow"}));
        summer2016.addBrick(createBrick(1086, ItemLayer.FORGROUND, blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 258, -1, new String[] {"Planks", "Wood", "Seasonal", "Teal"}));
        summer2016.addBrick(createBrick(1087, ItemLayer.DECORATION, blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 259, 0x0, new String[] {"Platform", "Dock", "Wood", "Seasonal", "One Way", "One-Way", "Brown"}));
        summer2016.addBrick(createBrick(708, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksummer2016", "", ItemTab.BACKGROUND, false, false, 205,-1, new String[] {"Thatched", "Straw", "Seasonal", "Beige", "Tan"}));
        summer2016.addBrick(createBrick(712, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksummer2016", "", ItemTab.BACKGROUND, false, false, 206,-1, new String[] {"Planks", "Wood", "Seasonal", "Purple"}));
        summer2016.addBrick(createBrick(713, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksummer2016", "", ItemTab.BACKGROUND, false, false, 207,-1, new String[] {"Planks", "Wood", "Seasonal", "Yellow"}));
        summer2016.addBrick(createBrick(714, ItemLayer.BACKGROUND, bgBlocksBMD, "bricksummer2016", "", ItemTab.BACKGROUND, false, false, 208,-1, new String[] {"Planks", "Wood", "Seasonal", "Teal"}));
        summer2016.addBrick(createBrick(ItemId.SUMMER_FLAG, ItemLayer.DECORATION, specialBlocksBMD, "bricksummer2016", "", ItemTab.DECORATIVE, false, false, 550, 0x0, new String[] {"Flag", "Seasonal", "Red", "Yellow", "Green", "Cyan", "Blue", "Purple"}));
        summer2016.addBrick(createBrick(ItemId.SUMMER_AWNING, ItemLayer.DECORATION, specialBlocksBMD, "bricksummer2016", "", ItemTab.DECORATIVE, false, false, 556, 0x0, new String[] {"Awning", "Striped", "Seasonal", "White", "Red", "Yellow", "Green", "Cyan", "Blue", "Purple"}));
        summer2016.addBrick(createBrick(ItemId.SUMMER_ICECREAM, ItemLayer.DECORATION, specialBlocksBMD, "bricksummer2016", "", ItemTab.DECORATIVE, false, false, 562, 0x0, new String[] {"Ice Cream", "Food", "Vanilla", "Chocolate", "Strawberry", "Mint", "Beige", "Brown", "Pink", "Green"}));
        brickPackages.add(summer2016);

        ItemBrickPackage minepack = new ItemBrickPackage("mine", "Mine");
        minepack.addBrick(createBrick(1093, ItemLayer.FORGROUND, blocksBMD, "brickmine", "", ItemTab.BLOCK, false, true, 264, -1, new String[] {"Stone", "Brown", "Tan", "Rock"}));
        minepack.addBrick(createBrick(720, ItemLayer.BACKGROUND, bgBlocksBMD, "brickmine", "", ItemTab.BACKGROUND, false, true, 219, -1, new String[] {"Stone", "Brown", "Tan", "Rock", "Dark"}));
        minepack.addBrick(createBrick(495, ItemLayer.DECORATION, decoBlocksBMD, "brickmine", "", ItemTab.DECORATIVE, false, true, 307, 0x0, new String[] {"Stalagmite", "Stone", "Brown", "Tan", "Rock"}));
        minepack.addBrick(createBrick(496, ItemLayer.DECORATION, decoBlocksBMD, "brickmine", "", ItemTab.DECORATIVE, false, true, 308, 0x0, new String[] {"Stalagtite", "Stone", "Brown", "Tan", "Rock"}));
        minepack.addBrick(createBrick(ItemId.CAVE_CRYSTAL, ItemLayer.DECORATION, specialBlocksBMD, "brickmine", "", ItemTab.DECORATIVE, false, true, 570, 0x0, new String[] {"Crystal", "Gemstone", "Red", "Yellow", "Green", "Cyan", "Blue", "Purple"}));
        minepack.addBrick(createBrick(ItemId.CAVE_TORCH, ItemLayer.DECORATION, specialBlocksBMD, "brickmine", "", ItemTab.DECORATIVE, false, false, 576, 0x0, new String[] {"Torch", "Fire", "Animated"}));
        brickPackages.add(minepack);

        ItemBrickPackage restaurant = new ItemBrickPackage("restaurant", "Restaurant");
        restaurant.addBrick(createBrick(487, ItemLayer.DECORATION, decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 302, 0x0, new String[] {"Hamburger", "Sandwich", "Food"}));
        restaurant.addBrick(createBrick(488, ItemLayer.DECORATION, decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 303, 0x0, new String[] {"Hot Dog", "Sausage", "Food"}));
        restaurant.addBrick(createBrick(489, ItemLayer.DECORATION, decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 304, 0x0, new String[] {"Sub", "Sandwich", "Ham", "Food"}));
        restaurant.addBrick(createBrick(490, ItemLayer.DECORATION, decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 305, 0x0, new String[] {"Soda", "Drink", "Beverage", "Red"}));
        restaurant.addBrick(createBrick(491, ItemLayer.DECORATION, decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 306, 0x0, new String[] {"French Fries", "Chips", "Food", "Red", "Yellow"}));
        restaurant.addBrick(createBrick(ItemId.RESTAURANT_CUP, ItemLayer.DECORATION, specialBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 588, 0x0, new String[] {"Glass", "Cup", "Drink", "Water", "Milk", "Orange Juice", "Beverage"}));
        restaurant.addBrick(createBrick(ItemId.RESTAURANT_PLATE, ItemLayer.DECORATION, specialBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 592, 0x0, new String[] {"Plate", "Chicken", "Ham", "Fish", "Food"}));
        restaurant.addBrick(createBrick(ItemId.RESTAURANT_BOWL, ItemLayer.DECORATION, specialBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 597, 0x0, new String[] {"Bowl", "Salad", "Spaghetti", "Pasta", "Ice Cream", "Food"}));
        brickPackages.add(restaurant);

        ItemBrickPackage textile = new ItemBrickPackage("textile", "Textile");
        textile.addBrick(createBrick(721, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 214, -1, new String[] {"Cloth", "Fabric", "Pattern", "White", "Green", "Plaid", "Checker"}));
        textile.addBrick(createBrick(722, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 215, -1, new String[] {"Cloth", "Fabric", "Pattern", "White", "Blue", "Chevron", "Zigzag"}));
        textile.addBrick(createBrick(723, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 216, -1, new String[] {"Cloth", "Fabric", "Pattern", "White", "Pink", "Polka Dots", "Spots"}));
        textile.addBrick(createBrick(724, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 217, -1, new String[] {"Cloth", "Fabric", "Pattern", "White", "Yellow", "Stripes", "Horizontal"}));
        textile.addBrick(createBrick(725, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 218, -1, new String[] {"Cloth", "Fabric", "Pattern", "White", "Red", "Plaid", "Diamond"}));
        brickPackages.add(textile);

        ItemBrickPackage halloween2016 = new ItemBrickPackage("halloween 2016", "Halloween 2016");
        halloween2016.addBrick(createBrick(ItemId.HALLOWEEN_2016_ROTATABLE, ItemLayer.DECORATION, specialBlocksBMD, "brickhalloween2016", "", ItemTab.DECORATIVE, false, false, 601, 0x0, new String[] {"Branch", "Root", "Wood", "Slope", "Black", "Rotatable", "Morphable", "Seasonal", "Holiday"}));
        halloween2016.addBrick(createBrick(ItemId.HALLOWEEN_2016_PUMPKIN, ItemLayer.DECORATION, specialBlocksBMD, "brickhalloween2016", "", ItemTab.DECORATIVE, false, false, 605, 0x0, new String[] {"Pumpkin", "Jack o Lantern", "Orange", "Morphable", "Seasonal", "Holiday"}));
        halloween2016.addBrick(createBrick(1501, ItemLayer.ABOVE, decoBlocksBMD, "brickhalloween2016", "", ItemTab.DECORATIVE, false, false, 309, 0x0, new String[] {"Grass", "Plant", "Purple", "Seasonal", "Holiday"}));
        halloween2016.addBrick(createBrick(ItemId.HALLOWEEN_2016_EYES, ItemLayer.DECORATION, specialBlocksBMD, "brickhalloween2016", "", ItemTab.DECORATIVE, false, false, 612, 0x0, new String[] {"Eyes", "Orange", "Purple", "Green", "Yellow", "Morphable", "Seasonal", "Holiday"}));
        halloween2016.addBrick(createBrick(726, ItemLayer.BACKGROUND, bgBlocksBMD, "brickhalloween2016", "", ItemTab.BACKGROUND, false, false, 220, -1, new String[] {"Tree", "Wood", "Black", "Seasonal", "Holiday"}));
        halloween2016.addBrick(createBrick(727, ItemLayer.BACKGROUND, bgBlocksBMD, "brickhalloween2016", "", ItemTab.BACKGROUND, false, false, 221, -1, new String[] {"Leaves", "Plant", "Purple", "Seasonal", "Holiday"}));
        brickPackages.add(halloween2016);

        ItemBrickPackage construction = new ItemBrickPackage("construction", "Construction");
        construction.addBrick(createBrick(1096, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 265, -1, new String[] {"Plywood", "Wood", "Brown", "Tan"}));
        construction.addBrick(createBrick(1097, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 266, -1, new String[] {"Gravel", "Stone", "Gray", "Grey"}));
        construction.addBrick(createBrick(1098, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 267, -1, new String[] {"Cement", "Stone", "Beige"}));
        construction.addBrick(createBrick(1099, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 268, -1, new String[] {"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(createBrick(1130, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 291, -1, new String[] {"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(createBrick(1128, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 289, -1, new String[] {"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(createBrick(1129, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 290, -1, new String[] {"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(createBrick(1131, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 292, -1, new String[] {"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(createBrick(1100, ItemLayer.FORGROUND, blocksBMD, "", "", ItemTab.BLOCK, false, true, 269, -1, new String[] {"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(createBrick(1503, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 310, 0x0, new String[] {"Sawhorse", "Orange", "White", "Caution", "Sign", "Stripes", "Horizontal"}));
        construction.addBrick(createBrick(1504, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 311, 0x0, new String[] {"Cone", "Orange", "White"}));
        construction.addBrick(createBrick(1505, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 312, 0x0, new String[] {"Sign", "Orange", "Caution", "Warning"}));
        construction.addBrick(createBrick(1532, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 333, 0x0, new String[] {"Sign", "Red", "Caution", "Warning", "Stop"}));
        construction.addBrick(createBrick(1533, ItemLayer.DECORATION, decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 334, 0x0, new String[] {"Red", "Fire", "Hydrant"}));
        construction.addBrick(createBrick(728, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 222, -1, new String[] {"Plywood", "Wood", "Brown", "Tan"}));
        construction.addBrick(createBrick(729, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 223, -1, new String[] {"Gravel", "Stone", "Gray", "Grey"}));
        construction.addBrick(createBrick(730, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 224, -1, new String[] {"Cement", "Stone", "Beige"}));
        construction.addBrick(createBrick(731, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 225, -1, new String[] {"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(createBrick(755, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 249, -1, new String[] {"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(createBrick(753, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 247, -1, new String[] {"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(createBrick(754, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 248, -1, new String[] {"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(createBrick(756, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 250, -1, new String[] {"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(createBrick(732, ItemLayer.BACKGROUND, bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 226, -1, new String[] {"Beam", "Metal", "Red", "Vertical"}));
        brickPackages.add(construction);

        ItemBrickPackage christmas2016 = new ItemBrickPackage("christmas 2016", "Christmas 2016");
        christmas2016.addBrick(createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_RED, ItemLayer.DECORATION, blocksBMD , "brickchristmas2016", "", ItemTab.BLOCK, false, true, 270, -1, new String[] {"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "Red"}));
        christmas2016.addBrick(createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_GREEN, ItemLayer.DECORATION, blocksBMD , "brickchristmas2016", "", ItemTab.BLOCK, false, true, 271, -1, new String[] {"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "Green"}));
        christmas2016.addBrick(createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_WHITE, ItemLayer.DECORATION, blocksBMD , "brickchristmas2016", "", ItemTab.BLOCK, false, true, 272, -1, new String[] {"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "White"}));
        christmas2016.addBrick(createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_BLUE, ItemLayer.DECORATION, blocksBMD , "brickchristmas2016", "", ItemTab.BLOCK, false, true, 273, -1, new String[] {"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "Blue"}));
        christmas2016.addBrick(createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_YELLOW, ItemLayer.DECORATION, blocksBMD , "brickchristmas2016", "", ItemTab.BLOCK, false, true, 274, -1, new String[] {"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "Yellow"}));
        christmas2016.addBrick(createBrick(ItemId.CHRISTMAS_2016_LIGHTS_DOWN, ItemLayer.DECORATION, specialBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 631, 0x0, new String[] {"Light", "String", "Wire", "Bulb", "Holiday", "Morphable", "Red", "Green", "Yellow", "Blue", "Purple"}));
        christmas2016.addBrick(createBrick(ItemId.CHRISTMAS_2016_LIGHTS_UP, ItemLayer.DECORATION, specialBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 636, 0x0, new String[] {"Light", "String", "Wire", "Bulb", "Holiday", "Morphable", "Red", "Green", "Yellow", "Blue", "Purple"}));
        christmas2016.addBrick(createBrick(1508, ItemLayer.DECORATION, decoBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 313, 0x0, new String[] {"Bell", "Bow", "Holiday", "Yellow", "Gold"}));
        christmas2016.addBrick(createBrick(1509, ItemLayer.DECORATION, decoBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 314, 0x0, new String[] {"Holly Berries", "Holiday", "Nature", "Plant", "Red", "Green"}));
        christmas2016.addBrick(createBrick(ItemId.CHRISTMAS_2016_CANDLE, ItemLayer.DECORATION, specialBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 640, 0x0, new String[] {"Candle", "Fire", "Flame", "Holiday", "Animated", "Red"}));
        brickPackages.add(christmas2016);

        ItemBrickPackage tiles = new ItemBrickPackage("tiles", "Tiles", new String[] {"Tile"});
        tiles.addBrick(createBrick(1106, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 275, -1, new String[] {"White"}));
        tiles.addBrick(createBrick(1107, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 276, -1, new String[] {"Gray", "Grey"}));
        tiles.addBrick(createBrick(1108, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 277, -1, new String[] {"Black", "Gray", "Grey"}));
        tiles.addBrick(createBrick(1109, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 278, -1, new String[] {"Red"}));
        tiles.addBrick(createBrick(1110, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 279, -1, new String[] {"Orange"}));
        tiles.addBrick(createBrick(1111, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 280, -1, new String[] {"Yellow"}));
        tiles.addBrick(createBrick(1112, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 281, -1, new String[] {"Green"}));
        tiles.addBrick(createBrick(1113, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 282, -1, new String[] {"Cyan"}));
        tiles.addBrick(createBrick(1114, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 283, -1, new String[] {"Blue"}));
        tiles.addBrick(createBrick(1115, ItemLayer.FORGROUND, blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 284, -1, new String[] {"Purple"}));
        tiles.addBrick(createBrick(733, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 227, -1, new String[] {"White"}));
        tiles.addBrick(createBrick(734, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 228, -1, new String[] {"Gray", "Grey"}));
        tiles.addBrick(createBrick(735, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 229, -1, new String[] {"Black", "Gray", "Grey"}));
        tiles.addBrick(createBrick(736, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 230, -1, new String[] {"Red"}));
        tiles.addBrick(createBrick(737, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 231, -1, new String[] {"Orange"}));
        tiles.addBrick(createBrick(738, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 232, -1, new String[] {"Yellow"}));
        tiles.addBrick(createBrick(739, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 233, -1, new String[] {"Green"}));
        tiles.addBrick(createBrick(740, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 234, -1, new String[] {"Cyan"}));
        tiles.addBrick(createBrick(741, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 235, -1, new String[] {"Blue"}));
        tiles.addBrick(createBrick(742, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 236, -1, new String[] {"Purple"}));
        brickPackages.add(tiles);

        ItemBrickPackage stpattyday2017 = new ItemBrickPackage("St. Patricks 2017", "St. Patricks 2017");
        stpattyday2017.addBrick(createBrick(1511, ItemLayer.ABOVE, 		decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 315, 0x0, new String[] {"Shamrock", "Clover", "Green", "Plant", "Nature"}));
        stpattyday2017.addBrick(createBrick(1512, ItemLayer.ABOVE, 		decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 316, 0x0, new String[] {"Pot of Gold"}));
        stpattyday2017.addBrick(createBrick(1513, ItemLayer.DECORATION, decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 317, 0x0, new String[] {"Horseshoe", "Gold"}));
        stpattyday2017.addBrick(createBrick(1514, ItemLayer.DECORATION, decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 318, 0x0, new String[] {"Rainbow", "Left"}));
        stpattyday2017.addBrick(createBrick(1515, ItemLayer.DECORATION, decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 319, 0x0, new String[] {"Rainbow", "Right"}));
        brickPackages.add(stpattyday2017);

        ItemBrickPackage halfBlockPack = new ItemBrickPackage("Half Blocks", "Half Blocks");
        halfBlockPack.addBrick(createBrick(1116, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 668, -1, new String[] {"White"}));
        halfBlockPack.addBrick(createBrick(1117, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 672, -1, new String[] {"Gray", "Grey"}));
        halfBlockPack.addBrick(createBrick(1118, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 676, -1, new String[] {"Black", "Gray", "Grey"}));
        halfBlockPack.addBrick(createBrick(1119, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 680, -1, new String[] {"Red"}));
        halfBlockPack.addBrick(createBrick(1120, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 684, -1, new String[] {"Orange"}));
        halfBlockPack.addBrick(createBrick(1121, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 688, -1, new String[] {"Yellow"}));
        halfBlockPack.addBrick(createBrick(1122, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 692, -1, new String[] {"Green"}));
        halfBlockPack.addBrick(createBrick(1123, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 696, -1, new String[] {"Cyan"}));
        halfBlockPack.addBrick(createBrick(1124, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 700, -1, new String[] {"Blue"}));
        halfBlockPack.addBrick(createBrick(1125, ItemLayer.DECORATION, specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 704, -1, new String[] {"Purple"}));
        brickPackages.add(halfBlockPack);

        ItemBrickPackage winter2018 = new ItemBrickPackage("Winter 2018", "Winter 2018", new String[] {"Winter"});
        winter2018.addBrick(createBrick(1136, ItemLayer.FORGROUND, blocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 295, -1, new String[] {"Ice", "Brick", "Cyan", "Snow"}));
        winter2018.addBrick(createBrick(1137, ItemLayer.FORGROUND, blocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 296, -1, new String[] {"Snow", "Pile", "Grey", "Gray", "White"}));
        winter2018.addBrick(createBrick(1138, ItemLayer.FORGROUND, blocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 297, -1, new String[] {"Glacier", "Snow", "Ice", "Cyan", "Blue"}));
        winter2018.addBrick(createBrick(1139, ItemLayer.FORGROUND, blocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 298, -1, new String[] {"Slate", "Grey", "Gray"}));
        winter2018.addBrick(createBrick(ItemId.HALFBLOCK_WINTER2018_SNOW, ItemLayer.DECORATION, specialBlocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 732, -1, new String[] {"Half Block", "Morphable", "Snow", "Pile", "Grey", "Gray", "White"}));
        winter2018.addBrick(createBrick(ItemId.HALFBLOCK_WINTER2018_GLACIER, ItemLayer.DECORATION, specialBlocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 736, -1, new String[] {"Half Block", "Morphable", "Glacier", "Snow", "Ice", "Cyan", "Blue"}));
        winter2018.addBrick(createBrick(1543, ItemLayer.ABOVE, decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 339, 0x0, new String[] {"Snow", "Pile", "Small", "White", "Grey", "Gray"}));
        winter2018.addBrick(createBrick(1544, ItemLayer.ABOVE, decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 340, 0x0, new String[] {"Snow", "Pile", "Left", "White", "Grey", "Gray"}));
        winter2018.addBrick(createBrick(1545, ItemLayer.ABOVE, decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 341, 0x0, new String[] {"Snow", "Pile", "Right", "White", "Grey", "Gray"}));
        winter2018.addBrick(createBrick(1546, ItemLayer.ABOVE, decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, true, 342, 0x0, new String[] {"Snowman", "Hat", "Carrot", "Scarf", "White", "Grey", "Gray"}));
        winter2018.addBrick(createBrick(1547, ItemLayer.DECORATION, decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, true, 343, 0x0, new String[] {"Tree", "Wood", "Snow", "Brown", "White"}));
        winter2018.addBrick(createBrick(1548, ItemLayer.DECORATION, decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 344, 0x0, new String[] {"Snowflake", "Large", "Sky"}));
        winter2018.addBrick(createBrick(1549, ItemLayer.DECORATION, decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 345, 0x0, new String[] {"Snowflake", "Small", "Sky"}));
        winter2018.addBrick(createBrick(757, ItemLayer.BACKGROUND, bgBlocksBMD, "brickwinter2018", "", ItemTab.BACKGROUND, false, true, 251, -1, new String[] {"Ice", "Brick", "Cyan", "Snow"}));
        winter2018.addBrick(createBrick(758, ItemLayer.BACKGROUND, bgBlocksBMD, "brickwinter2018", "", ItemTab.BACKGROUND, false, true, 252, -1, new String[] {"Snow", "Pile", "Grey", "Gray", "White"}));
        winter2018.addBrick(createBrick(759, ItemLayer.BACKGROUND, bgBlocksBMD, "brickwinter2018", "", ItemTab.BACKGROUND, false, true, 253, -1, new String[] {"Glacier", "Snow", "Ice", "Cyan", "Blue"}));
        winter2018.addBrick(createBrick(760, ItemLayer.BACKGROUND, bgBlocksBMD, "brickwinter2018", "", ItemTab.BACKGROUND, false, true, 254, -1, new String[] {"Slate", "Grey", "Gray", "Winter"}));
        brickPackages.add(winter2018);

        ItemBrickPackage garden = new ItemBrickPackage("Garden", "Garden", new String[] {"Garden"});
        garden.addBrick(createBrick(1143, ItemLayer.FORGROUND, blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 300, -1, new String[] {"Rock", "Environment", "Brown", "Soil", "Dark", "Dirt"}));
        garden.addBrick(createBrick(1144, ItemLayer.FORGROUND, blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 301, -1, new String[] {"Grass", "Moss", "Environment", "Brown", "Soil", "Dark", "Dirt"}));
        garden.addBrick(createBrick(1145, ItemLayer.FORGROUND, blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 302, -1, new String[] {"Leaves", "Green", "Leaf", "Nature", "Plant"}));
        garden.addBrick(createBrick(1560, ItemLayer.ABOVE, decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 346, 0x0, new String[] {"Grass", "Green", "Nature", "Plant", "Short"}));
        garden.addBrick(createBrick(1561, ItemLayer.ABOVE, decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 347, 0x0, new String[] {"Fence", "White", "Short", "Post"}));
        garden.addBrick(createBrick(1562, ItemLayer.DECORATION, decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 348, 0x0, new String[] {"Fence", "Brown", "Lattice", "Wood"}));
        garden.addBrick(createBrick(ItemId.GARDEN_ONEWAY_FLOWER, ItemLayer.DECORATION, blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 304, 0x0, new String[] {"Flower", "Green", "Pink", "Vine", "Bean", "Stalk"}));
        garden.addBrick(createBrick(ItemId.GARDEN_ONEWAY_LEAF_L, ItemLayer.DECORATION, blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 305, 0x0, new String[] {"Leaf", "Green", "Bean", "Stalk", "Left"}));
        garden.addBrick(createBrick(ItemId.GARDEN_ONEWAY_LEAF_R, ItemLayer.DECORATION, blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 306, 0x0, new String[] {"Leaf", "Green", "Bean", "Stalk", "Right"}));
        garden.addBrick(createBrick(1564, ItemLayer.DECORATION, decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 349, 0x0, new String[] {"Snail", "Shell"}));
        garden.addBrick(createBrick(1565, ItemLayer.DECORATION, decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 350, 0x0, new String[] {"Butterfly"}));
        garden.addBrick(createBrick(761, ItemLayer.BACKGROUND, bgBlocksBMD, "brickgarden", "", ItemTab.BACKGROUND, false, true, 255, -1, new String[] {"Rock", "Environment", "Brown", "Soil", "Dark", "Dirt", "Rock"}));
        garden.addBrick(createBrick(762, ItemLayer.BACKGROUND, bgBlocksBMD, "brickgarden", "", ItemTab.BACKGROUND, false, true, 256, -1, new String[] {"Grass", "Moss", "Environment", "Brown", "Soil", "Dark", "Dirt"}));
        garden.addBrick(createBrick(763, ItemLayer.BACKGROUND, bgBlocksBMD, "brickgarden", "", ItemTab.BACKGROUND, false, true, 257, -1, new String[] {"Leaves", "Green", "Leaf", "Nature", "Plant"}));
        garden.addBrick(createBrick(1566, ItemLayer.ABOVE, decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 351, 0x0, new String[] {"Wood", "Frame", "Window", "Brown", "Peep", "Hole"}));
        brickPackages.add(garden);

        ItemBrickPackage fireworks = new ItemBrickPackage("Fireworks", "Fireworks");
        fireworks.addBrick(createBrick(ItemId.FIREWORKS, ItemLayer.DECORATION, specialBlocksBMD, "brickfirework", "", ItemTab.DECORATIVE, false, false, 741, 0x0, new String[] {"Fireworks", "Purple", "White", "Red", "Blue", "Green", "Yellow", "Magenta", "Gold", "Morphable", "Seasonal", "Holiday"}));
        brickPackages.add(fireworks);

        ItemBrickPackage toxic = new ItemBrickPackage("Toxic", "Toxic", new String[] {"Toxic"});
        toxic.addBrick(createBrick(ItemId.TOXIC_WASTE_SURFACE, ItemLayer.ABOVE, specialBlocksBMD, "bricktoxic", "", ItemTab.DECORATIVE, false, false, 774, 0x0, new String[] {"Toxic", "Waste", "Green", "Glow"}));
        toxic.addBrick(createBrick(ItemId.TOXIC_WASTE_BARREL, ItemLayer.DECORATION, specialBlocksBMD, "bricktoxic", "", ItemTab.DECORATIVE, false, true, 788, 0x0, new String[] {"Toxic", "Waste", "Barrel", "Leaking", "Green", "Glow", "Morphable"}));
        toxic.addBrick(createBrick(ItemId.SEWER_PIPE, ItemLayer.DECORATION, specialBlocksBMD, "bricktoxic", "", ItemTab.DECORATIVE, false, false, 789, 0x0, new String[] {"Sewer", "Pipe", "Drain", "Water", "Blue", "Lava", "Orange", "Mud", "Swamp", "Bog", "Brown", "Toxic", "Waste", "Green", "Morphable"}));
        toxic.addBrick(createBrick(ItemId.TOXIC_WASTE_BG, ItemLayer.BACKGROUND, bgBlocksBMD, "bricktoxic", "", ItemTab.BACKGROUND, false, false, 258, -1, new String[] {"Toxic", "Waste", "Green"}));
        toxic.addBrick(createBrick(ItemId.RUSTED_LADDER, ItemLayer.DECORATION, decoBlocksBMD, "bricktoxic","", ItemTab.DECORATIVE, false, true, 356, 0x0, new String[] {"Rusty", "Rusted", "Broken", "Metal", "Ladder", "Vertical", "Industrial"}));
        toxic.addBrick(createBrick(ItemId.GUARD_RAIL, ItemLayer.ABOVE, decoBlocksBMD, "bricktoxic","", ItemTab.DECORATIVE, false, false, 357, 0x0, new String[] {"Rusty", "Rusted", "Metal", "Guard", "Rail"}));
        toxic.addBrick(createBrick(ItemId.METAL_PLATFORM, ItemLayer.DECORATION, specialBlocksBMD, "bricktoxic","", ItemTab.BLOCK, false, true, 795, -1, new String[] {"Rusty", "Rusted", "One way", "One-way", "Metal", "Platform", "Morphable"}));
        brickPackages.add(toxic);

        ItemBrickPackage special = new ItemBrickPackage("Special", "Special");
        special.addBrick(createBrick(ItemId.GOLDEN_EASTER_EGG, ItemLayer.ABOVE, decoBlocksBMD, "blockgoldenegg", "", ItemTab.DECORATIVE, true, false, 358, -1));
        special.addBrick(createBrick(ItemId.GREEN_SPACE, ItemLayer.DECORATION, decoBlocksBMD, "brickgreenspace", "", ItemTab.DECORATIVE, false, true, 363, -1));
        special.addBrick(createBrick(ItemId.GOLD_SACK, ItemLayer.DECORATION, decoBlocksBMD, "brickgoldsack", "", ItemTab.DECORATIVE, false, true, 364, -1));
        brickPackages.add(special);

        ItemBrickPackage dungeon = new ItemBrickPackage("Dungeon", "Dungeon", new String[] {"Halloween", "Dungeon"});
        dungeon.addBrick(createBrick(ItemId.GREY_DUNGEON_BRICK, ItemLayer.FORGROUND, blocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 311, -1, new String[] {"Grey", "Gray", "Dungeon", "Brick"}));
        dungeon.addBrick(createBrick(ItemId.GREEN_DUNGEON_BRICK, ItemLayer.FORGROUND, blocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 312, -1, new String[] {"Green", "Dungeon", "Brick"}));
        dungeon.addBrick(createBrick(ItemId.BLUE_DUNGEON_BRICK, ItemLayer.FORGROUND, blocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 313, -1, new String[] {"Blue", "Dungeon", "Brick"}));
        dungeon.addBrick(createBrick(ItemId.PURPLE_DUNGEON_BRICK, ItemLayer.FORGROUND, blocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 314, -1, new String[] {"Purple", "Dungeon", "Brick"}));
        dungeon.addBrick(createBrick(ItemId.GREY_DUNGEON_BG, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdungeon", "", ItemTab.BACKGROUND, false, false, 262, -1, new String[] {"Grey", "Gray", "Dungeon", "Brick"}));
        dungeon.addBrick(createBrick(ItemId.GREEN_DUNGEON_BG, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdungeon", "", ItemTab.BACKGROUND, false, false, 263, -1, new String[] {"Green", "Dungeon", "Brick"}));
        dungeon.addBrick(createBrick(ItemId.BLUE_DUNGEON_BG, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdungeon", "", ItemTab.BACKGROUND, false, false, 264, -1, new String[] {"Blue", "Dungeon", "Brick"}));
        dungeon.addBrick(createBrick(ItemId.PURPLE_DUNGEON_BG, ItemLayer.BACKGROUND, bgBlocksBMD, "brickdungeon", "", ItemTab.BACKGROUND, false, false, 265, -1, new String[] {"Purple", "Dungeon", "Brick"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_PILLAR_BOTTOM, ItemLayer.DECORATION, specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 799, 0x0, new String[] {"Dungeon", "Brick", "Pillar", "Bottom", "Morphable"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_PILLAR_MIDDLE, ItemLayer.DECORATION, specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 803, 0x0, new String[] {"Dungeon", "Brick", "Pillar", "Middle", "Morphable"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_PILLAR_TOP, ItemLayer.DECORATION, specialBlocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 807, 0x0, new String[] {"Dungeon", "Brick", "Pillar", "Top", "Morphable"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_ARCH_LEFT, ItemLayer.DECORATION, specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 811, 0x0, new String[] {"Dungeon", "Brick", "Arch", "Left", "Morphable"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_ARCH_RIGHT, ItemLayer.DECORATION, specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 815, 0x0, new String[] {"Dungeon", "Brick", "Arch", "Right", "Morphable"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_TORCH, ItemLayer.DECORATION, specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, false, 830, 0x0, new String[] {"Dungeon", "Torch", "Fire", "Morphable"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_BARS, ItemLayer.DECORATION, decoBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, false, 359, 0x0, new String[] {"Dungeon", "Bars", "Window"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_RING, ItemLayer.DECORATION, decoBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 360, 0x0, new String[] {"Dungeon", "Chain", "Ring"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_HOOK, ItemLayer.DECORATION, decoBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 361, 0x0, new String[] {"Dungeon", "Chain", "Hook"}));
        dungeon.addBrick(createBrick(ItemId.DUNGEON_LOCK, ItemLayer.DECORATION, decoBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 362, 0x0, new String[] {"Dungeon", "Lock", "Padlock"}));
        brickPackages.add(dungeon);

        int shadowSelectorBG = 610;
        ItemBrickPackage shadows = new ItemBrickPackage("Shadows", "Shadows", new String[] {"Shadows", "Dark", "Glow"});
        shadows.addBrick(createBrick(ItemId.SHADOW_A, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 1, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_B, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 5, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_C, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 9, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_D, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 11, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_E, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 14, 0x0, new String[] {}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_F, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 16, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_G, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 20, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_H, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 24, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_I, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 26, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_J, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 29, 0x0, new String[] {}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_K, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 31, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_L, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 35, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_M, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 39, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(createBrick(ItemId.SHADOW_N, ItemLayer.DECORATION, shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 43, 0x0, new String[] {"Morphable"}, false, false, shadowSelectorBG));
        brickPackages.add(shadows);

        //add npcs brick package declared earlier, so they will end up in the end of Action tab.
        brickPackages.add(npc);

        // Free IDs:

        // Smiley: 183

        // Background: 773
        // Solid: 1156
        // Decoration: 1623

        // NPCs are 1550-1559 and 1569-1579 :P

        // Art offsets:
        // decorationsBMD: 358
        // backgroundBricksBMD: 259
        // forgroundBricksBMD: 311
        // specialBricksBMD: 797
    }

    private ItemBrick createBrick(int shadowA, int decoration, Texture shadowBlocksBMD, String s, String s1, int decorative, boolean b, boolean b1, int i, int i1, String[] strings, boolean b2, boolean b3, int shadowSelectorBG) {
        return null;
    }
    private ItemBrick createBrick(int i, int decoration, Texture specialBlocksBMD, String hidden, String s, int action, boolean b, boolean b1, int i1, int i2, String[] strings, boolean b2, boolean b3) {
        return null;
    }
    private ItemBrick createBrick(int label, int decoration, Texture decoBlocksBMD, String s, String s1, int action, boolean b, boolean b1, int i, int i1, String[] strings, boolean b2) {
        return null;
    }
    private ItemBrick createBrick(int i, int forground, Texture blocksBMD, String s, String s1, int block, boolean b, boolean b1, int i1, int i2, String[] strings) {
        return null;
    }
    private ItemBrick createBrick(int i, int background, Texture bgBlocksBMD, String s, String s1, int background1, boolean b, boolean b1, int i1, int i2) {
        return null;
    }

    private void addNpc(int id, String payvaultid, ItemBrickPackage pack, int frames, String[] tags, float rate, int bubbleOffset) {
        // TODO: 3/28/2023
    }
    private void addNpc(int id, String payvaultid, ItemBrickPackage pack, int frames, String[] tags, float rate) {
        addNpc(id, payvaultid, pack, frames, tags, rate, 0);
    }
    private void addNpc(int id, String payvaultid, ItemBrickPackage pack, int frames, String[] tags) {
        addNpc(id, payvaultid, pack, frames, tags, 6.5f);
    }

    private int animatedAuraCount;
    private void addAura(int id, String name, Texture base, String payvaultid, int frames, float speed, boolean generate) {
        // "createRotationAnimation" is always false in original code, so I deleted it.

        TextureRegion auraTextureFrames;
        TextureRegion goldAuraTextureFrames;

        if(generate) {
            auraTextureFrames = new TextureRegion(base, 64 * animatedAuraCount, 0, 64 * frames, 64);
            goldAuraTextureFrames = new TextureRegion(base, 64 * animatedAuraCount, 64, 64 * frames, 64);
            animatedAuraCount++;
        } else {
            auraTextureFrames = new TextureRegion(base, 64 * frames, 64);
            goldAuraTextureFrames = null;
        }

        TextureRegion[] auraAnimation = new TextureRegion[frames];
        TextureRegion[] goldAuraAnimation = new TextureRegion[frames];

        for (int i = 0; i < frames; i++) {
            auraAnimation[i] = new TextureRegion(auraTextureFrames, 64 * i, 0, 64, 64);
            if(goldAuraTextureFrames != null) goldAuraAnimation[i] = new TextureRegion(goldAuraTextureFrames, 64 * i, 0, 64, 64);
        }

        auraShapes.add(new ItemAura(id, name, payvaultid, auraAnimation, goldAuraAnimation, speed));
    }

    private void addAura(int id, String name, Texture base, String payvaultid, int frames, float speed) {
        addAura(id, name, base, payvaultid, frames, speed, true);
    }

    private void addAura(int id, String name, Texture base, String payvaultid, int frames) {
        addAura(id, name, base, payvaultid, frames, 0.2f);
    }

    private void addAura(int id, String name, Texture base, String payvaultid) {
        addAura(id, name, base, payvaultid, 1);
    }

    private void addSmiley(int id, String name, String description, Texture base, String payvaultid, int minimapColor) {
        TextureRegion smileyTexture = new TextureRegion(base, 26*id, 0, 26, 26);
        TextureRegion smileyTextureGold = new TextureRegion(base, 26*id, 26, 26, 26);
        smilies.add(new ItemSmiley(id, name, description, smileyTexture, payvaultid, minimapColor, smileyTextureGold));
    }

    private void addSmiley(int id, String name, String description, Texture base, String payvaultid) {
        addSmiley(id, name, description, base, payvaultid, 0xFFFFFFFF);
    }

    private void loadTextures() {
        // Misc
		smileysBMD = new Texture("media/smileys.png");
		smileyPlatinumSpenderBMD = new Texture("media/smileys_platinumspender.png");
		aurasBMD = new Texture("media/auras.png");
		aurasOrnateBMD = new Texture("media/ornate.png");
		aurasBubbleBMD = new Texture("media/auras_bubble.png");
		aurasGalaxyBMD = new Texture("media/auras_galaxy.png");
		shopBMD = new Texture("media/shop.png");
		shopWorldsBMD = new Texture("media/shop_worlds.png");
		shopAurasBMD = new Texture("media/shop_auras.png");
		favoriteBMD = new Texture("media/favorite.png");
		likeBMD = new Texture("media/like.png");
		allParticles = new Texture("media/particles.png");
		graphicsPreviewBG = new Texture("media/graphicsPreviewBG.png");

        // Blocks
		blocksBMD = new Texture("media/blocks.png");
		decoBlocksBMD = new Texture("media/blocks_deco.png");
		bgBlocksBMD = new Texture("media/blocks_bg.png");
		specialBlocksBMD = new Texture("media/blocks_special.png");
		shadowBlocksBMD = new Texture("media/blocks_shadow.png");
		mudBlocksBMD = new Texture("media/blocks_mud.png");
		npcBlocksBMD = new Texture("media/blocks_npc.png");
		doorBlocksBMD = new Texture("media/blocks_door.png");
		effectBlocksBMD = new Texture("media/blocks_effect.png");
		teamBlocksBMD = new Texture("media/blocks_team.png");
		completeBlocksBMD = new Texture("media/blocks_complete.png");
		blockNumbersBMD = new Texture("media/block_numbers.png");
		blocksFireworksBMD = new Texture("media/blocks_fireworks.png");
		blocksGoldenEasterEggBMD = new Texture("media/blocks_goldeneasteregg.png");
    }

    private ItemManager() {
        loadTextures();
        initializeManager();
    }

    public static ItemManager instance() {
        if (singleton == null) {
            singleton = new ItemManager();
        }
        return singleton;
    }


}
