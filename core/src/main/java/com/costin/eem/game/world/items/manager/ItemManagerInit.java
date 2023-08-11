package com.costin.eem.game.world.items.manager;

import com.costin.eem.game.world.items.ItemBrickPackage;
import com.costin.eem.game.world.items.ItemId;
import com.costin.eem.game.world.items.ItemLayer;
import com.costin.eem.game.world.items.ItemTab;

import static com.costin.eem.game.world.items.manager.ItemManager.singleton;

class ItemManagerInit {
    private static boolean init;

    private static ItemBrickPackage npc;

    private static void initSmileys() {

        /* Define and declare smilies */
        //Free
        singleton.addSmiley(0, "Smiley", "", singleton.smileysBMD, "");
        singleton.addSmiley(1, "Grin", "", singleton.smileysBMD, "");
        singleton.addSmiley(2, "Tongue", "", singleton.smileysBMD, "");
        singleton.addSmiley(3, "Happy", "", singleton.smileysBMD, "");
        singleton.addSmiley(4, "Annoyed", "", singleton.smileysBMD, "");
        singleton.addSmiley(5, "Sad", "", singleton.smileysBMD, "");

        //Beta / Pro smilies
        singleton.addSmiley(6, "Crying", "", singleton.smileysBMD, "pro");
        singleton.addSmiley(7, "Wink", "", singleton.smileysBMD, "pro");
        singleton.addSmiley(8, "Frustrated", "", singleton.smileysBMD, "pro");
        singleton.addSmiley(9, "Shades", "", singleton.smileysBMD, "pro");
        singleton.addSmiley(10, "Devil", "", singleton.smileysBMD, "pro");
        singleton.addSmiley(11, "Inquisitive", "", singleton.smileysBMD, "pro");

        //Other
        singleton.addSmiley(12, "Ninja", "", singleton.smileysBMD, "smileyninja", 0x0);
        singleton.addSmiley(13, "Santa", "", singleton.smileysBMD, "smileysanta");
        singleton.addSmiley(14, "Worker", "", singleton.smileysBMD, "");
        singleton.addSmiley(15, "Big Spender", "", singleton.smileysBMD, "smileybigspender");
        singleton.addSmiley(16, "Superman", "", singleton.smileysBMD, "smileysuper");
        singleton.addSmiley(17, "Surprise", "", singleton.smileysBMD, "smileysupprice");
        singleton.addSmiley(18, "Indifferent", "", singleton.smileysBMD, ""); //In the middle free smiley :D
        singleton.addSmiley(19, "Girl", "", singleton.smileysBMD, "");
        singleton.addSmiley(20, "New Year 2010", "", singleton.smileysBMD, "mixednewyear2010");
        singleton.addSmiley(21, "Coy", "", singleton.smileysBMD, "");
        singleton.addSmiley(22, "Wizard", "", singleton.smileysBMD, "smileywizard");

        singleton.addSmiley(23, "Fan Boy", "", singleton.smileysBMD, "smileyfanboy");
        singleton.addSmiley(24, "Terminator", "", singleton.smileysBMD, "");
        singleton.addSmiley(25, "Extra Grin", "", singleton.smileysBMD, "smileyxd");

        singleton.addSmiley(26, "Bully", "", singleton.smileysBMD, "smileybully");
        singleton.addSmiley(27, "Commando", "", singleton.smileysBMD, "smileycommando");
        singleton.addSmiley(28, "Kissing", "", singleton.smileysBMD, "smileyvalentines2011");
        singleton.addSmiley(29, "Bird", "", singleton.smileysBMD, "smileybird");
        singleton.addSmiley(30, "Bunny", "", singleton.smileysBMD, "smileybunni");

        singleton.addSmiley(31, "Diamond Touch", "", singleton.smileysBMD, "unobtainable");
        singleton.addSmiley(32, "Fire Wizard", "", singleton.smileysBMD, "smileywizard2");
        singleton.addSmiley(33, "Extra Tongue", "", singleton.smileysBMD, "smileyxdp");
        singleton.addSmiley(34, "Postman", "", singleton.smileysBMD, "smileypostman");
        singleton.addSmiley(35, "Templar", "", singleton.smileysBMD, "smileytemplar");
        singleton.addSmiley(36, "Angel", "", singleton.smileysBMD, "");
        singleton.addSmiley(37, "Nurse", "", singleton.smileysBMD, "smileynurse");
        singleton.addSmiley(38, "Vampire", "", singleton.smileysBMD, "smileyhw2011vampire");
        singleton.addSmiley(39, "Ghost", "", singleton.smileysBMD, "smileyhw2011ghost");
        singleton.addSmiley(40, "Frankenstein", "", singleton.smileysBMD, "smileyhw2011frankenstein");
        singleton.addSmiley(41, "Witch", "", singleton.smileysBMD, "smileywitch");

        singleton.addSmiley(42, "Indian", "", singleton.smileysBMD, "smileytg2011indian");
        singleton.addSmiley(43, "Pilgrim", "", singleton.smileysBMD, "smileytg2011pilgrim");

        singleton.addSmiley(44, "Pumpkin", "", singleton.smileysBMD, "smileypumpkin1");
        singleton.addSmiley(45, "Lit Pumpkin", "", singleton.smileysBMD, "smileypumpkin2");

        singleton.addSmiley(46, "Snowman", "", singleton.smileysBMD, "smileyxmassnowman");
        singleton.addSmiley(47, "Reindeer", "", singleton.smileysBMD, "smileyxmasreindeer");
        singleton.addSmiley(48, "Grinch", "", singleton.smileysBMD, "smileyxmasgrinch");
        singleton.addSmiley(49, "Maestro", "", singleton.smileysBMD, "bricknode");
        singleton.addSmiley(50, "DJ", "", singleton.smileysBMD, "brickdrums");
        singleton.addSmiley(51, "Sigh", "", singleton.smileysBMD, "");
        singleton.addSmiley(52, "Robber", "", singleton.smileysBMD, "", 0x0);
        singleton.addSmiley(53, "Police", "", singleton.smileysBMD, "", 0xFF0c64f6);
        singleton.addSmiley(54, "Purple Ghost", "", singleton.smileysBMD, "smileypurpleghost");
        singleton.addSmiley(55, "Pirate", "", singleton.smileysBMD, "");
        singleton.addSmiley(56, "Viking", "", singleton.smileysBMD, "");
        singleton.addSmiley(57, "Karate", "", singleton.smileysBMD, "");
        singleton.addSmiley(58, "Cowboy", "", singleton.smileysBMD, "");
        singleton.addSmiley(59, "Diver", "", singleton.smileysBMD, "smileydiver");
        singleton.addSmiley(60, "Tanned", "", singleton.smileysBMD, "smileytanned");
        singleton.addSmiley(61, "Propeller Hat", "", singleton.smileysBMD, "");
        singleton.addSmiley(62, "Hard Hat", "", singleton.smileysBMD, "smileyhardhat");
        singleton.addSmiley(63, "Gas Mask", "", singleton.smileysBMD, "smileygasmask");
        singleton.addSmiley(64, "Robot", "", singleton.smileysBMD, "");
        singleton.addSmiley(65, "Peasant", "", singleton.smileysBMD, "");
        singleton.addSmiley(66, "Guard", "", singleton.smileysBMD, "");
        singleton.addSmiley(67, "Blacksmith", "", singleton.smileysBMD, "");
        singleton.addSmiley(68, "LOL", "", singleton.smileysBMD, "");
        singleton.addSmiley(69, "Dog", "", singleton.smileysBMD, "");
        singleton.addSmiley(70, "Alien", "", singleton.smileysBMD, "smileyalien");
        singleton.addSmiley(71, "Astronaut", "", singleton.smileysBMD, "smileyastronaut");
        singleton.addSmiley(72, "PartyOrange", "", singleton.smileysBMD, "unobtainable");
        singleton.addSmiley(73, "PartyGreen", "", singleton.smileysBMD, "unobtainable");
        singleton.addSmiley(74, "PartyBlue", "", singleton.smileysBMD, "unobtainable");
        singleton.addSmiley(75, "PartyRed", "", singleton.smileysBMD, "unobtainable");
        singleton.addSmiley(76, "Daredevil", "", singleton.smileysBMD, "");
        singleton.addSmiley(77, "Monster", "", singleton.smileysBMD, "smileymonster");
        singleton.addSmiley(78, "Skeleton", "", singleton.smileysBMD, "smileyskeleton");
        singleton.addSmiley(79, "Mad Scientist", "", singleton.smileysBMD, "smileymadscientist");
        singleton.addSmiley(80, "Headhunter", "", singleton.smileysBMD, "smileyheadhunter");
        singleton.addSmiley(81, "Safari", "", singleton.smileysBMD, "smileysafari");
        singleton.addSmiley(82, "Archaeologist", "", singleton.smileysBMD, "smileyarchaeologist");
        singleton.addSmiley(83, "New Year 2013", "", singleton.smileysBMD, "smileynewyear2012");
        singleton.addSmiley(84, "Winter Hat", "", singleton.smileysBMD, "smileywinter");
        singleton.addSmiley(85, "Fire demon", "", singleton.smileysBMD, "smileyfiredeamon");
        singleton.addSmiley(86, "Bishop", "", singleton.smileysBMD, "smileybishop");
        singleton.addSmiley(87, "Zombie", "", singleton.smileysBMD, "unobtainable");
        singleton.addSmiley(88, "Bruce", "", singleton.smileysBMD, "smileyzombieslayer");
        singleton.addSmiley(89, "Unit", "", singleton.smileysBMD, "smileyunit");
        singleton.addSmiley(90, "Spartan", "", singleton.smileysBMD, "smileyspartan");
        singleton.addSmiley(91, "Lady", "", singleton.smileysBMD, "smileyhelen");
        singleton.addSmiley(92, "Cow", "", singleton.smileysBMD, "smileycow");
        singleton.addSmiley(93, "Scarecrow", "", singleton.smileysBMD, "smileyscarecrow");
        singleton.addSmiley(94, "Dark Wizard", "", singleton.smileysBMD, "smileydarkwizard");
        singleton.addSmiley(95, "Kung Fu Master", "", singleton.smileysBMD, "smileykungfumaster");
        singleton.addSmiley(96, "Fox", "", singleton.smileysBMD, "smileyfox");
        singleton.addSmiley(97, "Night Vision", "", singleton.smileysBMD, "smileynightvision");
        singleton.addSmiley(98, "Summer Girl", "", singleton.smileysBMD, "smileysummergirl");
        singleton.addSmiley(99, "Fan Boy II", "", singleton.smileysBMD, "smileyfanboy2");
        singleton.addSmiley(100, "Sci-Fi Hologram", "", singleton.smileysBMD, "unobtainable");
        singleton.addSmiley(101, "Gingerbread", "", singleton.smileysBMD, "smileygingerbread");
        singleton.addSmiley(102, "Caroler", "", singleton.smileysBMD, "smileycaroler");
        singleton.addSmiley(103, "Elf", "", singleton.smileysBMD, "smileyelf");
        singleton.addSmiley(104, "Nutcracker", "", singleton.smileysBMD, "smileynutcracker");
        singleton.addSmiley(105, "Blushing", "", singleton.smileysBMD, "brickvalentines2015");
        singleton.addSmiley(106, "Artist", "", singleton.smileysBMD, "smileyartist"); // Loading screen contest prize
        singleton.addSmiley(107, "Princess", "", singleton.smileysBMD, "");
        singleton.addSmiley(108, "Chef", "", singleton.smileysBMD, "");
        singleton.addSmiley(109, "Clown", "", singleton.smileysBMD, "");
        singleton.addSmiley(110, "Red Ninja", "", singleton.smileysBMD, "smileyninjared");
        singleton.addSmiley(111, "3D Glasses", "", singleton.smileysBMD, "smiley3dglasses");
        singleton.addSmiley(112, "Sunburned", "", singleton.smileysBMD, "smileysunburned");
        singleton.addSmiley(113, "Tourist", "", singleton.smileysBMD, "smileytourist");
        singleton.addSmiley(114, "Graduate", "", singleton.smileysBMD, "smileygraduate");
        singleton.addSmiley(115, "Sombrero", "", singleton.smileysBMD, "smileysombrero");
        singleton.addSmiley(116, "Cat", "", singleton.smileysBMD, "");
        singleton.addSmiley(117, "Scared", "", singleton.smileysBMD, ""); // FREE!
        singleton.addSmiley(118, "Ghoul", "", singleton.smileysBMD, "smileyghoul");
        singleton.addSmiley(119, "Mummy", "", singleton.smileysBMD, "smileymummy");
        singleton.addSmiley(120, "Bat", "", singleton.smileysBMD, "smileybat");
        singleton.addSmiley(121, "Eyeball", "", singleton.smileysBMD, "smileyeyeball"); // Halloween campaign prize
        singleton.addSmiley(122, "Light Wizard", "", singleton.smileysBMD, "smileylightwizard");
        singleton.addSmiley(123, "Hooded", "", singleton.smileysBMD, "smileyhooded");
        singleton.addSmiley(124, "Earmuffs", "", singleton.smileysBMD, "smileyearmuffs");
        singleton.addSmiley(125, "Penguin", "", singleton.smileysBMD, "smileypenguin");
        singleton.addSmiley(126, "Gold Smiley", "", singleton.smileysBMD, "goldmember");
        singleton.addSmiley(127, "Gold Ninja", "", singleton.smileysBMD, "goldmember");
        singleton.addSmiley(128, "Gold Robot", "", singleton.smileysBMD, "goldmember");
        singleton.addSmiley(129, "Gold Top Hat", "", singleton.smileysBMD, "goldmember");
        singleton.addSmiley(130, "Sick", "", singleton.smileysBMD, "");
        singleton.addSmiley(131, "Unsure", "", singleton.smileysBMD, "");
        singleton.addSmiley(132, "Goofy", "", singleton.smileysBMD, "smileygoofy");
        singleton.addSmiley(133, "Raindrop", "", singleton.smileysBMD, "smileyraindrop");
        singleton.addSmiley(134, "Bee", "", singleton.smileysBMD, "smileybee");
        singleton.addSmiley(135, "Butterfly", "", singleton.smileysBMD, "smileybutterfly");
        singleton.addSmiley(136, "Sea Captain", "", singleton.smileysBMD, "smileyseacaptain");
        singleton.addSmiley(137, "Soda Clerk", "", singleton.smileysBMD, "smileysodaclerk");
        singleton.addSmiley(138, "Lifeguard", "", singleton.smileysBMD, "smileylifeguard");
        singleton.addSmiley(139, "Aviator", "", singleton.smileysBMD, "smileyaviator");
        singleton.addSmiley(140, "Sleepy", "", singleton.smileysBMD, "smileysleepy");
        singleton.addSmiley(141, "Seagull", "", singleton.smileysBMD, "smileyseagull");
        singleton.addSmiley(142, "Werewolf", "", singleton.smileysBMD, "smileywerewolf");
        singleton.addSmiley(143, "Swamp Creature", "", singleton.smileysBMD, "smileyswampcreature");
        singleton.addSmiley(144, "Fairy", "", singleton.smileysBMD, "smileyfairy");
        singleton.addSmiley(145, "Firefighter", "", singleton.smileysBMD, "smileyfirefighter");
        singleton.addSmiley(146, "Spy", "", singleton.smileysBMD, "smileyspy", 0x0);
        singleton.addSmiley(147, "Devil Skull", "", singleton.smileysBMD, "smileydevilskull");
        singleton.addSmiley(148, "Clockwork Robot", "", singleton.smileysBMD, "smileyclockwork");
        singleton.addSmiley(149, "Teddy Bear", "", singleton.smileysBMD, "smileyteddybear");
        singleton.addSmiley(150, "Christmas Soldier", "", singleton.smileysBMD, "smileychristmassoldier");
        singleton.addSmiley(151, "Scrooge", "", singleton.smileysBMD, "smileyscrooge");
        singleton.addSmiley(152, "Boy", "", singleton.smileysBMD, "");
        singleton.addSmiley(153, "Pigtails", "", singleton.smileysBMD, "smileypigtails");
        singleton.addSmiley(154, "Doctor", "", singleton.smileysBMD, "smileydoctor");
        singleton.addSmiley(155, "Turban", "", singleton.smileysBMD, "smileyturban");
        singleton.addSmiley(156, "Hazmat Suit", "", singleton.smileysBMD, "smileyhazmatsuit");
        singleton.addSmiley(157, "Leprechaun", "", singleton.smileysBMD, "smileyleprechaun");
        singleton.addSmiley(158, "Angry", "", singleton.smileysBMD, "smileyangry");
        singleton.addSmiley(159, "Smirk", "", singleton.smileysBMD, "smileysmirk");
        singleton.addSmiley(160, "Sweat", "", singleton.smileysBMD, "smileysweat");
        singleton.addSmiley(161, "Country Singer", "", singleton.smileysBMD, "brickguitar");
        singleton.addSmiley(162, "Thor", "", singleton.smileysBMD, "smileythor");
        singleton.addSmiley(163, "Cowgirl", "", singleton.smileysBMD, "");
        singleton.addSmiley(164, "Raccoon", "", singleton.smileysBMD, "smileyraccoon");
        singleton.addSmiley(165, "Lion", "", singleton.smileysBMD, "smileylion");
        singleton.addSmiley(166, "Laika", "", singleton.smileysBMD, "smileylaiika");
        singleton.addSmiley(167, "Fishbowl", "", singleton.smileysBMD, "smileyfishbowl");
        singleton.addSmiley(168, "Slime", "", singleton.smileysBMD, "smileyslime");
        singleton.addSmiley(169, "Designer", "", singleton.smileysBMD, "smileydesigner");
        singleton.addSmiley(170, "Frozen", "", singleton.smileysBMD, "smileyfrozen");
        singleton.addSmiley(171, "Masquerade", "", singleton.smileysBMD, "smileymasquerade");
        singleton.addSmiley(172, "Polar Bear", "", singleton.smileysBMD, "smileypolarbear");
        singleton.addSmiley(173, "Baseball Cap", "", singleton.smileysBMD, "smileybaseball");
        singleton.addSmiley(174, "Golfer", "", singleton.smileysBMD, "smileygolfer");
        singleton.addSmiley(ItemId.SMILEY_PLATINUM_SPENDER, "Platinum Big Spender", "", singleton.smileysBMD, "smileyplatinumspender");
        singleton.addSmiley(176, "Green Dragon", "", singleton.smileysBMD, "smileydragongreen");
        singleton.addSmiley(177, "Red Dragon", "", singleton.smileysBMD, "smileydragonred");
        singleton.addSmiley(178, "Executioner", "", singleton.smileysBMD, "smileyexecutioner");
        singleton.addSmiley(179, "Gargoyle", "", singleton.smileysBMD, "smileygargoyle");
        singleton.addSmiley(180, "Banshee", "", singleton.smileysBMD, "smileybanshee");
        singleton.addSmiley(181, "Golem", "", singleton.smileysBMD, "smileygolem");
        singleton.addSmiley(182, "Frost Dragon", "", singleton.smileysBMD, "smileyfrostdragon");
        singleton.addSmiley(183, "Squirrel", "", singleton.smileysBMD, "smileysquirrel");
        singleton.addSmiley(184, "Golden Dragon", "", singleton.smileysBMD, "smileygoldendragon");
        singleton.addSmiley(185, "Robot Mk II", "", singleton.smileysBMD, "smileyrobot2");
        singleton.addSmiley(186, "Black Dragon", "", singleton.smileysBMD, "smileydragonblack");
        singleton.addSmiley(187, "Silver Dragon", "", singleton.smileysBMD, "smileydragonsilver");

    }

    private static void initAuras() {
        singleton.addAura(0, "Default", singleton.aurasBMD, "");
        singleton.addAura(1, "Pinwheel", singleton.aurasBMD, "aurashapepinwheel", 6);
        singleton.addAura(2, "Torus", singleton.aurasBMD, "aurashapetorus");
        singleton.addAura(3, "Ornate", singleton.aurasBMD, "goldmember", 6);
        singleton.addAura(4, "Spiral", singleton.aurasBMD, "aurashapespiral", 6, 0.15f);
        singleton.addAura(5, "Star", singleton.aurasBMD, "aurashapestar");
        singleton.addAura(6, "Snowflake", singleton.aurasBMD, "aurashapesnowflake");
        singleton.addAura(7, "Atom", singleton.aurasBMD, "aurashapeatom", 8, 0.175f);
        singleton.addAura(8, "Sawblade", singleton.aurasBMD, "aurashapesawblade", 6, 0.2f);
        singleton.addAura(9, "Target", singleton.aurasBMD, "aurashapetarget", 6, 0.15f);
        singleton.addAura(10, "Bubble", singleton.aurasBubbleBMD, "aurabubble", 8, .1f, false);
        singleton.addAura(11, "Galaxy", singleton.aurasGalaxyBMD, "auragalaxy", 12, .15f, false);
        singleton.addAura(12, "Heart", singleton.aurasBMD, "aurashapeheart", 10, 0.125f);
        singleton.addAura(13, "Flower", singleton.aurasBMD, "aurashapesunflower");
    }

    private static void initNpcs() {
        /* Define and declare Npcs */
        npc = new ItemBrickPackage("NPCs", "idk, npcs are npcs.", new String[]{"npc"});
        singleton.addNpc(ItemId.NPC_SMILE, "npcsmile", npc, 2, new String[]{"Smile", "Happy", "Yellow"});
        singleton.addNpc(ItemId.NPC_SAD, "npcsad", npc, 2, new String[]{"Sad", "Yellow"});
        singleton.addNpc(ItemId.NPC_OLD, "npcold", npc, 2, new String[]{"Old", "Yellow"});
        singleton.addNpc(ItemId.NPC_ANGRY, "npcangry", npc, 2, new String[]{"Angry", "Mad", "Red"});
        singleton.addNpc(ItemId.NPC_SLIME, "npcslime", npc, 2, new String[]{"Slime", "Lime", "Green"});
        singleton.addNpc(ItemId.NPC_ROBOT, "npcrobot", npc, 2, new String[]{"Robot", "Grey"});
        singleton.addNpc(ItemId.NPC_KNIGHT, "npcknight", npc, 2, new String[]{"Knight", "War", "Grey"});
        singleton.addNpc(ItemId.NPC_MEH, "npcmeh", npc, 2, new String[]{"Meh", "Yellow"});
        singleton.addNpc(ItemId.NPC_COW, "npccow", npc, 2, new String[]{"Cow", "Brown"});
        singleton.addNpc(ItemId.NPC_FROG, "npcfrog", npc, 9, new String[]{"Frog", "Green"}, 6.5f / 3f, -7);
        singleton.addNpc(ItemId.NPC_BRUCE, "npcbruce", npc, 2, new String[]{"Bruce", "Yellow"});
        singleton.addNpc(ItemId.NPC_STARFISH, "npcstarfish", npc, 2, new String[]{"Starfish", "Pink", "Ocean"});
        singleton.addNpc(ItemId.NPC_DT, "npcdt", npc, 2, new String[]{"Computer", "???"});
        singleton.addNpc(ItemId.NPC_SKELETON, "npcskeleton", npc, 2, new String[]{"Skeleton"});
        singleton.addNpc(ItemId.NPC_ZOMBIE, "npczombie", npc, 2, new String[]{"Zombie"});
        singleton.addNpc(ItemId.NPC_GHOST, "npcghost", npc, 6, new String[]{"Ghost"}, 6.5f / 1.25f);
        singleton.addNpc(ItemId.NPC_ASTRONAUT, "npcastronaut", npc, 9, new String[]{"Astronaut", "Space", "Sci-fi"}, 4.5f);
        singleton.addNpc(ItemId.NPC_SANTA, "npcsanta", npc, 2, new String[]{"Santa", "Christmas", "Holiday", "Yellow"}, 7);
        singleton.addNpc(ItemId.NPC_SNOWMAN, "npcsnowman", npc, 4, new String[]{"Snowman", "Christmas", "Holiday"}, 7);
        singleton.addNpc(ItemId.NPC_WALRUS, "npcwalrus", npc, 3, new String[]{"Walrus"});
        singleton.addNpc(ItemId.NPC_CRAB, "npccrab", npc, 10, new String[]{"Hermit", "Crab", "Shell"});

    }

    private static void initBricks() {

        /* Define and declare bricks */
        //BRICKs
        ItemBrickPackage basic = new ItemBrickPackage("basic", "Basic Blocks", new String[]{"Primary", "Simple", "Standard", "Default"});
        basic.addBrick(singleton.createBrick(1088, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 260, -1, new String[]{"White", "Light"}));
        basic.addBrick(singleton.createBrick(9, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 9, 0xFF6E6E6E, new String[]{"Grey", "Gray", "Taupe"}));
        basic.addBrick(singleton.createBrick(182, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 156, 0xFF282828, new String[]{"Black", "Dark", "Coal", "Road"}));
        basic.addBrick(singleton.createBrick(12, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 12, 0xFFA83554, new String[]{"Red", "Magenta", "Vermillion", "Ruby"}));
        basic.addBrick(singleton.createBrick(1018, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 205, -1, new String[]{"Orange", "Persimmon", "Copper"}));
        basic.addBrick(singleton.createBrick(13, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 13, 0xFF93A835, new String[]{"Yellow", "Lime", "Chartreuse", "Light green", "Citrine", "Citrus"}));
        basic.addBrick(singleton.createBrick(14, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 14, 0xFF42A836, new String[]{"Green", "Kelly", "Emerald", "Grass"}));
        basic.addBrick(singleton.createBrick(15, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 15, 0xFF359EA6, new String[]{"Blue", "Cyan", "Light Blue", "Aquamarine", "Sky Blue"}));
        basic.addBrick(singleton.createBrick(10, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 10, 0xFF3552A8, new String[]{"Blue", "Dark Blue", "Cobalt"}));
        basic.addBrick(singleton.createBrick(11, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 11, 0xFF9735A7, new String[]{"Purple", "Pink", "Plum", "Violet"}));
        singleton.brickPackages.add(basic);

        ItemBrickPackage beta = new ItemBrickPackage("beta", "Beta Access", new String[]{"Exclusive"});
        beta.addBrick(singleton.createBrick(1089, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 261, 0xFFE5E5E5, new String[]{"White", "Light"}));
        beta.addBrick(singleton.createBrick(42, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 42, 0xFF999999, new String[]{"Grey", "Gray", "Taupe"}));
        beta.addBrick(singleton.createBrick(1021, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 208, 0xFF474747, new String[]{"Black", "Dark", "Onyx"}));
        beta.addBrick(singleton.createBrick(40, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 40, 0xFFCF6650, new String[]{"Red", "Ruby", "Garnet"}));
        beta.addBrick(singleton.createBrick(1020, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 207, 0xFFCE7E50, new String[]{"Orange", "Copper"}));
        beta.addBrick(singleton.createBrick(41, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 41, 0xFFD2A945, new String[]{"Yellow", "Gold", "Jasmine"}));
        beta.addBrick(singleton.createBrick(38, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 38, 0xFF4AC882, new String[]{"Green", "Emerald", "Malachite"}));
        beta.addBrick(singleton.createBrick(1019, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 206, 0xFF49C2C6, new String[]{"Blue", "Cyan", "Light blue", "Aquamarine", "Turquoise"}));
        beta.addBrick(singleton.createBrick(39, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 39, 0xFF4D84C6, new String[]{"Blue", "Sapphire"}));
        beta.addBrick(singleton.createBrick(37, ItemLayer.FOREGROUND, singleton.blocksBMD, "pro", "", ItemTab.BLOCK, false, true, 37, 0xFFCE62CF, new String[]{"Purple", "Pink", "Magenta", "Violet", "Amethyst"}));
        singleton.brickPackages.add(beta);

        ItemBrickPackage brick = new ItemBrickPackage("brick", "Brick Blocks", new String[]{"Standard", "Wall"});
        brick.addBrick(singleton.createBrick(1090, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 262, 0xFF888888, new String[]{"White", "Light"}));
        brick.addBrick(singleton.createBrick(1022, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 209, 0xFF4C4C4C, new String[]{"Gray", "Grey", "Concrete", "Stone"}));
        brick.addBrick(singleton.createBrick(1024, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 211, -1, new String[]{"Black", "Dark", "Coal"}));
        brick.addBrick(singleton.createBrick(20, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 20, 0xFF6F2429, new String[]{"Red", "Maroon", "Hell"}));
        brick.addBrick(singleton.createBrick(16, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 16, 0xFF8B3E09, new String[]{"Brown", "Orange", "Soil", "Dirt", "Mahogany"}));
        brick.addBrick(singleton.createBrick(21, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 21, 0xFF6F5D24, new String[]{"Beige", "Tan", "Olive", "Brown", "Ecru", "Yellow"}));
        brick.addBrick(singleton.createBrick(19, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 19, 0xFF438310, new String[]{"Green", "Grass"}));
        brick.addBrick(singleton.createBrick(17, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 17, 0xFF246F4D, new String[]{"Blue", "Cyan", "Turquoise", "Teal", "Skobeloff", "Dark Green"}));
        brick.addBrick(singleton.createBrick(1023, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 210, -1, new String[]{"Blue", "Dark", "Zaffre"}));
        brick.addBrick(singleton.createBrick(18, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 18, 0xFF4E246F, new String[]{"Purple", "Dark", "Violet"}));
        singleton.brickPackages.add(brick);

        ItemBrickPackage metal = new ItemBrickPackage("metal", "Metal Blocks", new String[]{"Ore", "Standard"});
        metal.addBrick(singleton.createBrick(29, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 29, 0xFFA1A3A5, new String[]{"Silver", "White", "Iron", "Platinum"}));
        metal.addBrick(singleton.createBrick(30, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 30, 0xFFDF7A41, new String[]{"Orange", "Bronze", "Amber"}));
        metal.addBrick(singleton.createBrick(31, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 31, 0xFFF0A927, new String[]{"Yellow", "Gold", "Jasmine"}));
        singleton.brickPackages.add(metal);

        ItemBrickPackage grass = new ItemBrickPackage("grass", "Grass Blocks", new String[]{"Environment", "Nature", "Standard", "Soil", "Ground", "Dirt", "Flora"});
        grass.addBrick(singleton.createBrick(34, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 34, 0xFF456313, new String[]{"Left", "Soil"}));
        grass.addBrick(singleton.createBrick(35, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 35, 0xFF456313, new String[]{"Middle", "Soil"}));
        grass.addBrick(singleton.createBrick(36, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 36, 0xFF456313, new String[]{"Right", "Soil"}));
        singleton.brickPackages.add(grass);

        ItemBrickPackage generic = new ItemBrickPackage("generic", "Generic Blocks", new String[]{"Special"});
        generic.addBrick(singleton.createBrick(22, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 22, 0xFF895B12, new String[]{"Caution", "Warning", "Hazard", "Stripes", "Yellow", "Black", "Standard"}));
        generic.addBrick(singleton.createBrick(1057, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 235, -1, new String[]{"Neutral", "Yellow", "Body", "No face"}));
        generic.addBrick(singleton.createBrick(32, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 32, 0xFFCF9022, new String[]{"Face", "Smiley", "Yellow", "Standard"}));
        generic.addBrick(singleton.createBrick(1058, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 236, -1, new String[]{"Caution", "Warning", "Hazard", "Stripes", "Black", "Yellow"}));
        generic.addBrick(singleton.createBrick(33, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 33, 0xFF000000, new String[]{"Black", "Dark", "Standard"}));
        singleton.brickPackages.add(generic);

        ItemBrickPackage brickfactorypack = new ItemBrickPackage("factory", "Factory Package");
        brickfactorypack.addBrick(singleton.createBrick(45, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 45, 0xFF72614B, new String[]{"X", "Crate", "Metal", "Box", "Wood"}));
        brickfactorypack.addBrick(singleton.createBrick(46, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 46, 0xFF6E6B60, new String[]{"Concrete", "Grey", "Gray", "Stone", "Slate", "X"}));
        brickfactorypack.addBrick(singleton.createBrick(47, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 47, 0xFF8E734F, new String[]{"Wood", "Tree", "Wooden", "House", "Planks", "Flooring", "Parquet"}));
        brickfactorypack.addBrick(singleton.createBrick(48, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 48, 0xFF7F4F2B, new String[]{"X", "Crate", "Wooden", "Box", "Wood", "Storage"}));
        brickfactorypack.addBrick(singleton.createBrick(49, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 49, 0xFF757575, new String[]{"Silver", "Metal", "Scales"}));
        singleton.brickPackages.add(brickfactorypack);

        ItemBrickPackage secret = new ItemBrickPackage("secrets", "Secret Bricks", new String[]{"Hidden", "Invisible"});
        secret.addBrick(singleton.createBrick(44, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "completely black, makes minimap invisible", ItemTab.BLOCK, false, true, 44, 0x01000000, new String[]{"Black", "Pure", "Old", "Solid"})); //Black block is in the special range
        secret.addBrick(singleton.createBrick(50, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.BLOCK, false, true, 139, 0x0, new String[]{"Appear"}));
        secret.addBrick(singleton.createBrick(243, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.BLOCK, false, true, 140, 0x01000000, new String[]{"Blank", "Hidden"}));
        secret.addBrick(singleton.createBrick(136, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.BLOCK, false, false, 141, 0x0, new String[]{"Disappear"}));
        singleton.brickPackages.add(secret);

        ItemBrickPackage glass = new ItemBrickPackage("glass", "Glass bricks", new String[]{"Bright", "Light", "Shine", "Polish", "Neon"});
        glass.addBrick(singleton.createBrick(51, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 51, 0xFFF89299, new String[]{"Red", "Light red", "Pink", "Ruby"}));
        glass.addBrick(singleton.createBrick(58, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 58, 0xFFF6BA94, new String[]{"Orange", "Light orange", "Topaz"}));
        glass.addBrick(singleton.createBrick(57, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 57, 0xFFF8DA8C, new String[]{"Yellow", "Light yellow", "Jasmine"}));
        glass.addBrick(singleton.createBrick(56, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 56, 0xFF92FBAA, new String[]{"Green", "Light green", "Emerald"}));
        glass.addBrick(singleton.createBrick(55, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 55, 0xFF95DCF6, new String[]{"Cyan", "Light blue", "Diamond"}));
        glass.addBrick(singleton.createBrick(54, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 54, 0xFF7E99F6, new String[]{"Blue", "Sapphire"}));
        glass.addBrick(singleton.createBrick(53, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 53, 0xFFA789F6, new String[]{"Purple", "Violet", "Amethyst"}));
        glass.addBrick(singleton.createBrick(52, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 52, 0xFFE98BF6, new String[]{"Pink", "Magenta", "Purple", "Quartz"}));
        singleton.brickPackages.add(glass);

        ItemBrickPackage mineral = new ItemBrickPackage("minerals", "Minerals", new String[]{"Neon", "Pure", "Bright"});
        mineral.addBrick(singleton.createBrick(70, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickminiral", "", ItemTab.BLOCK, false, true, 70, 0xFFEE0000, new String[]{"Red", "Ruby"}));
        mineral.addBrick(singleton.createBrick(76, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickminiral", "", ItemTab.BLOCK, false, true, 76, 0xFFEE7700, new String[]{"Orange", "Topaz"}));
        mineral.addBrick(singleton.createBrick(75, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickminiral", "", ItemTab.BLOCK, false, true, 75, 0xFFEEEE00, new String[]{"Yellow", "Jasmine"}));
        mineral.addBrick(singleton.createBrick(74, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickminiral", "", ItemTab.BLOCK, false, true, 74, 0xFF00EE00, new String[]{"Green", "Lime", "Emerald", "Peridot"}));
        mineral.addBrick(singleton.createBrick(73, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickminiral", "", ItemTab.BLOCK, false, true, 73, 0xFF00EEEE, new String[]{"Cyan", "Light blue", "Aquamarine", "Turquoise"}));
        mineral.addBrick(singleton.createBrick(72, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickminiral", "", ItemTab.BLOCK, false, true, 72, 0xFF0000EE, new String[]{"Blue", "Indigo", "Sapphire", "Lapis"}));
        mineral.addBrick(singleton.createBrick(71, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickminiral", "", ItemTab.BLOCK, false, true, 71, 0xFFEE00EE, new String[]{"Pink", "Magenta", "Purple", "Amethyst"}));
        singleton.brickPackages.add(mineral);

        ItemBrickPackage xmas2011 = new ItemBrickPackage("christmas 2011", "Christmas 2011 bricks", new String[]{"Holiday", "Wrapping Paper", "Gift", "Present"});
        xmas2011.addBrick(singleton.createBrick(78, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickxmas2011", "", ItemTab.BLOCK, false, true, 78, -1, new String[]{"Yellow"}));
        xmas2011.addBrick(singleton.createBrick(79, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickxmas2011", "", ItemTab.BLOCK, false, true, 79, -1, new String[]{"White"}));
        xmas2011.addBrick(singleton.createBrick(80, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickxmas2011", "", ItemTab.BLOCK, false, true, 80, -1, new String[]{"Red"}));
        xmas2011.addBrick(singleton.createBrick(81, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickxmas2011", "", ItemTab.BLOCK, false, true, 81, -1, new String[]{"Blue"}));
        xmas2011.addBrick(singleton.createBrick(82, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickxmas2011", "", ItemTab.BLOCK, false, true, 82, -1, new String[]{"Green"}));
        singleton.brickPackages.add(xmas2011);
    }

    private static void initActions() {

        //ACTIONs
        ItemBrickPackage gravity = new ItemBrickPackage("gravity", "Gravity Modifying Arrows", new String[]{"Physics", "Motion", "Action", "Standard"});
        gravity.addBrick(singleton.createBrick(0, ItemLayer.BACKGROUND, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 0, 0xff000000, new String[]{"Clear", "Empty", "Delete", "Nothing", "Erase"}));
        gravity.addBrick(singleton.createBrick(1, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 1, 0x0, new String[]{"Left", "Arrow"}));
        gravity.addBrick(singleton.createBrick(2, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 2, 0x0, new String[]{"Up", "Arrow"}));
        gravity.addBrick(singleton.createBrick(3, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 3, 0x0, new String[]{"Right", "Arrow"}));
        gravity.addBrick(singleton.createBrick(1518, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 285, 0x0, new String[]{"Down", "Arrow"}));
        gravity.addBrick(singleton.createBrick(4, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 4, 0x0, new String[]{"Dot"}));
        gravity.addBrick(singleton.createBrick(ItemId.SLOW_DOT, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 233, 0x0, new String[]{"Slow", "Dot", "Climbable", "Physics"}));
        gravity.addBrick(singleton.createBrick(411, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 312, 0x0, new String[]{"Invisible", "Left", "Arrow"}));
        gravity.addBrick(singleton.createBrick(412, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 317, 0x0, new String[]{"Invisible", "Up", "Arrow"}));
        gravity.addBrick(singleton.createBrick(413, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 322, 0x0, new String[]{"Invisible", "Right", "Arrow"}));
        gravity.addBrick(singleton.createBrick(1519, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 652, 0x0, new String[]{"Invisible", "Down", "Arrow"}));
        gravity.addBrick(singleton.createBrick(414, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 327, 0x0, new String[]{"Invisible", "Dot"}));
        gravity.addBrick(singleton.createBrick(ItemId.SLOW_DOT_INVISIBLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 466, 0x0, new String[]{"Slow", "Dot", "Climbable", "Physics", "Invisible"}));
        singleton.brickPackages.add(gravity);

        ItemBrickPackage keys = new ItemBrickPackage("keys", "Key Blocks", new String[]{"Key", "Lock", "Button", "Action", "Standard"});
        keys.addBrick(singleton.createBrick(6, ItemLayer.DECORATION, singleton.blocksBMD, "", "hit to activate key doors and gates for everyone for 6 seconds", ItemTab.ACTION, false, false, 6, 0xFF2C1A1A, new String[]{"Red", "Key", "Magenta"}));
        keys.addBrick(singleton.createBrick(7, ItemLayer.DECORATION, singleton.blocksBMD, "", "hit to activate key doors and gates for everyone for 6 seconds", ItemTab.ACTION, false, false, 7, 0xFF1A2C1A, new String[]{"Green", "Key"}));
        keys.addBrick(singleton.createBrick(8, ItemLayer.DECORATION, singleton.blocksBMD, "", "hit to activate key doors and gates for everyone for 6 seconds", ItemTab.ACTION, false, false, 8, 0xFF1A1A2C, new String[]{"Blue", "Key"}));
        keys.addBrick(singleton.createBrick(408, ItemLayer.DECORATION, singleton.blocksBMD, "", "hit to activate key doors and gates for everyone for 6 seconds", ItemTab.ACTION, false, false, 189, 0xFF0C2D3D, new String[]{"Cyan", "Teal"}));
        keys.addBrick(singleton.createBrick(409, ItemLayer.DECORATION, singleton.blocksBMD, "", "hit to activate key doors and gates for everyone for 6 seconds", ItemTab.ACTION, false, false, 190, 0xFF400C40, new String[]{"Pink", "Violet", "Purple"}));
        keys.addBrick(singleton.createBrick(410, ItemLayer.DECORATION, singleton.blocksBMD, "", "hit to activate key doors and gates for everyone for 6 seconds", ItemTab.ACTION, false, false, 191, 0xFF2C330A, new String[]{"Yellow", "Key"}));
        singleton.brickPackages.add(keys);

        ItemBrickPackage gates = new ItemBrickPackage("gates", "Gate Blocks", new String[]{"Key", "Lock", "Action", "Standard"});
        gates.addBrick(singleton.createBrick(26, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 26, 0xFF9C2D46, new String[]{"Red", "Magenta"}));
        gates.addBrick(singleton.createBrick(27, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 27, 0xFF379C30, new String[]{"Green"}));
        gates.addBrick(singleton.createBrick(28, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 28, 0xFF2D449C, new String[]{"Blue"}));
        gates.addBrick(singleton.createBrick(1008, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 195, 0xFF2D8D99, new String[]{"Cyan", "Teal"}));
        gates.addBrick(singleton.createBrick(1009, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 196, 0xFF912D99, new String[]{"Pink", "Purple", "Violet"}));
        gates.addBrick(singleton.createBrick(1010, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 197, 0xFF97922D, new String[]{"Yellow"}));
        singleton.brickPackages.add(gates);

        ItemBrickPackage doors = new ItemBrickPackage("doors", "Door Blocks", new String[]{"Key", "Lock", "Action", "Standard"});
        doors.addBrick(singleton.createBrick(23, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 23, 0xFF9C2D46, new String[]{"Red", "Magenta"}));
        doors.addBrick(singleton.createBrick(24, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 24, 0xFF379C30, new String[]{"Green"}));
        doors.addBrick(singleton.createBrick(25, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 25, 0xFF2D449C, new String[]{"Blue"}));
        doors.addBrick(singleton.createBrick(1005, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 192, 0xFF2D8D99, new String[]{"Cyan", "Teal"}));
        doors.addBrick(singleton.createBrick(1006, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 193, 0xFF912D99, new String[]{"Pink", "Purple", "Violet"}));
        doors.addBrick(singleton.createBrick(1007, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 194, 0xFF97922D, new String[]{"Yellow"}));
        singleton.brickPackages.add(doors);

        ItemBrickPackage coins = new ItemBrickPackage("coins", "Coin Blocks");
        coins.addBrick(singleton.createBrick(100, ItemLayer.ABOVE, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 0, 0x0, new String[]{"Gold", "G-Coins", "Yellow", "Money", "Primary", "Collect", "Magic", "Value", "Standard"}));
        coins.addBrick(singleton.createBrick(101, ItemLayer.ABOVE, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 13, 0x0, new String[]{"Blue", "B-Coin", "Secondary", "Money", "Optional", "Collect", "Magic", "Value", "Standard"}));
        coins.addBrick(singleton.createBrick(110, ItemLayer.DECORATION, singleton.specialBlocksBMD, "hidden", "", ItemTab.ACTION, false, false, 26, 0x0, new String[]{}, true, true));
        coins.addBrick(singleton.createBrick(111, ItemLayer.DECORATION, singleton.specialBlocksBMD, "hidden", "", ItemTab.ACTION, false, false, 39, 0x0, new String[]{}, true, true));
        coins.addBrick(singleton.createBrick(ItemId.COINGATE, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, false, 139, 0xFFB88E15, new String[]{"Gate", "Yellow", "Gold", "Primary", "Lock"}));
        coins.addBrick(singleton.createBrick(ItemId.COINDOOR, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 43, 0xFFB88E15, new String[]{"Door", "Yellow", "Gold", "Primary", "Lock"}));
        coins.addBrick(singleton.createBrick(ItemId.BLUECOINGATE, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 186, 0xFF1C60F4, new String[]{"Gate", "Blue", "Optional", "Lock"}));
        coins.addBrick(singleton.createBrick(ItemId.BLUECOINDOOR, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 185, 0xFF1C60F4, new String[]{"Door", "Blue", "Optional", "Lock"}));
        singleton.brickPackages.add(coins);

        ItemBrickPackage tools = new ItemBrickPackage("tools", "Tool Blocks");
        tools.addBrick(singleton.createBrick(255, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "players spawn here", ItemTab.ACTION, false, false, 255 - 128, 0x0, new String[]{"Spawn", "Start", "Beginning", "Enter"}));
        tools.addBrick(singleton.createBrick(ItemId.WORLD_PORTAL_SPAWN, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickworldportal", "a spawn point targetable by world portals", ItemTab.ACTION, true, false, 354, 0x0, new String[]{"Spawn", "Start", "Beginning", "Enter", "World", "Red"}));
        tools.addBrick(singleton.createBrick(ItemId.CHECKPOINT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "", "players respawn here when they die", ItemTab.ACTION, false, false, 154, 0x0, new String[]{"Checkpoint", "Respawn", "Safe", "Enter", "Save"}));
        tools.addBrick(singleton.createBrick(ItemId.RESET_POINT, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "resets the player's progress", ItemTab.ACTION, false, false, 288, 0x0, new String[]{"Reset", "Restart", "Retry"}));
        tools.addBrick(singleton.createBrick(ItemId.GOD_BLOCK, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickgodblock", "gives the player god mode privileges", ItemTab.ACTION, true, false, 320, 0x0, new String[]{"God"}));
        tools.addBrick(singleton.createBrick(ItemId.MAP_BLOCK, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickmapblock", "allows the player to use the minimap when disabled", ItemTab.ACTION, true, false, 355, 0x0, new String[]{"Map", "Minimap"}));
        singleton.brickPackages.add(tools);

        ItemBrickPackage crown = new ItemBrickPackage("crown", "Crown");
        crown.addBrick(singleton.createBrick(5, ItemLayer.DECORATION, singleton.blocksBMD, "", "awards the player a golden crown", ItemTab.ACTION, false, true, 5, 0xFF43391F, new String[]{"Crown", "King", "Gold", "Action", "Prize", "Reward"}));
        crown.addBrick(singleton.createBrick(ItemId.CROWNGATE, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickcrowndoor", "", ItemTab.ACTION, false, true, 40, 0x0, new String[]{"Crown", "Gate", "Gold", "Yellow", "Lock"}));
        crown.addBrick(singleton.createBrick(ItemId.CROWNDOOR, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickcrowndoor", "", ItemTab.ACTION, false, true, 41, 0x0, new String[]{"Crown", "Door", "Gold", "Yellow", "Lock"}));
        crown.addBrick(singleton.createBrick(ItemId.BRICK_COMPLETE, ItemLayer.ABOVE, singleton.completeBlocksBMD, "", "gives the player a silver crown, displays a win message", ItemTab.ACTION, false, false, 0, 0x0, new String[]{"Crown", "Trophy", "Win", "Complete", "Finish", "End", "Reward"}));
        crown.addBrick(singleton.createBrick(ItemId.SILVERCROWNGATE, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickcrowndoor", "", ItemTab.ACTION, false, true, 42, 0x0, new String[]{"Crown", "Gate", "Silver", "Lock"}));
        crown.addBrick(singleton.createBrick(ItemId.SILVERCROWNDOOR, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickcrowndoor", "", ItemTab.ACTION, false, true, 43, 0x0, new String[]{"Crown", "Door", "Silver", "Lock"}));
        singleton.brickPackages.add(crown);

        ItemBrickPackage speed = new ItemBrickPackage("boost", "Boost Arrows", new String[]{"Speed", "Fast", "Friction", "Arrow", "Motion", "Action", "Physics"});
        speed.addBrick(singleton.createBrick(ItemId.SPEED_LEFT, ItemLayer.DECORATION, singleton.blocksBMD, "brickboost", "", ItemTab.ACTION, false, false, 157, 0x0, new String[]{"Left"}));
        speed.addBrick(singleton.createBrick(ItemId.SPEED_UP, ItemLayer.DECORATION, singleton.blocksBMD, "brickboost", "", ItemTab.ACTION, false, false, 159, 0x0, new String[]{"Up", "Above"}));
        speed.addBrick(singleton.createBrick(ItemId.SPEED_RIGHT, ItemLayer.DECORATION, singleton.blocksBMD, "brickboost", "", ItemTab.ACTION, false, false, 158, 0x0, new String[]{"Right"}));
        speed.addBrick(singleton.createBrick(ItemId.SPEED_DOWN, ItemLayer.DECORATION, singleton.blocksBMD, "brickboost", "", ItemTab.ACTION, false, false, 160, 0x0, new String[]{"Down", "Below"}));
        singleton.brickPackages.add(speed);

        ItemBrickPackage ladders = new ItemBrickPackage("climbable", "Climbable Blocks", new String[]{"Transportation", "No", "Gravity", "Slow"});
        ladders.addBrick(singleton.createBrick(ItemId.CHAIN, ItemLayer.DECORATION, singleton.blocksBMD, "brickmedieval", "", ItemTab.ACTION, false, true, 135, 0x0, new String[]{"Chain", "Vertical", "Ninja"}));
        ladders.addBrick(singleton.createBrick(ItemId.METAL_LADDER, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickindustrial", "", ItemTab.ACTION, false, true, 331, 0x0, new String[]{"Ladder", "Vertical", "Metal", "Industrial"}));
        ladders.addBrick(singleton.createBrick(ItemId.NINJA_LADDER, ItemLayer.DECORATION, singleton.blocksBMD, "brickninja", "", ItemTab.ACTION, false, true, 98, 0x0, new String[]{"Ladder", "Vertical", "Ninja"}));
        ladders.addBrick(singleton.createBrick(ItemId.VINE_V, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 174, 0x0, new String[]{"Vine", "Vertical", "Jungle", "Environment"}));
        ladders.addBrick(singleton.createBrick(ItemId.VINE_H, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.ACTION, false, true, 175, 0x0, new String[]{"Vine", "Horizontal", "Jungle", "Environment"}));
        ladders.addBrick(singleton.createBrick(ItemId.ROPE, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.ACTION, false, true, 266, 0x0, new String[]{"Rope", "Vertical", "Medieval", "Ninja"}));
        ladders.addBrick(singleton.createBrick(ItemId.FAIRYTALE_LADDER, ItemLayer.DECORATION, singleton.blocksBMD, "brickfairytale", "", ItemTab.ACTION, false, false, 252, 0x0, new String[]{"Ladder", "Vine", "Fairytale"}));
        ladders.addBrick(singleton.createBrick(ItemId.GARDEN_LATTICE_VINES, ItemLayer.DECORATION, singleton.blocksBMD, "brickgarden", "", ItemTab.ACTION, false, true, 303, 0x0, new String[]{"Ladder", "Vine", "Lattice", "Fence", "Brown", "Leaf", "Leaves", "Lattice", "Wood", "Garden"}));
        ladders.addBrick(singleton.createBrick(ItemId.GARDEN_STALK, ItemLayer.DECORATION, singleton.blocksBMD, "brickgarden", "", ItemTab.ACTION, false, true, 307, 0x0, new String[]{"Ladder", "Stalk", "Vine", "Vertical", "Green", "Bean", "Garden"}));
        ladders.addBrick(singleton.createBrick(ItemId.DUNGEON_CHAIN, ItemLayer.DECORATION, singleton.blocksBMD, "brickdungeon", "", ItemTab.ACTION, false, true, 315, 0x0, new String[]{"Halloween", "Dungeon", "Chain"}));
        singleton.brickPackages.add(ladders);

        ItemBrickPackage switches = new ItemBrickPackage("switches", "Switches", new String[]{"Lock", "Action"});
        switches.addBrick(singleton.createBrick(ItemId.SWITCH_PURPLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickswitchpurple", "", ItemTab.ACTION, false, true, 310, 0x0, new String[]{"Switch", "Lever", "Button", "Purple", "Violet"}));
        switches.addBrick(singleton.createBrick(ItemId.RESET_PURPLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickswitchpurple", "", ItemTab.ACTION, false, true, 866, 0x0, new String[]{"Reset", "Off", "Switch", "Lever", "Button", "Purple", "Violet"}));
        switches.addBrick(singleton.createBrick(ItemId.GATE_PURPLE, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickswitchpurple", "", ItemTab.ACTION, false, false, 8, -10206822, new String[]{"Switch", "Gate", "Purple", "Violet"}));
        switches.addBrick(singleton.createBrick(ItemId.DOOR_PURPLE, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickswitchpurple", "", ItemTab.ACTION, false, false, 9, -10206822, new String[]{"Switch", "Door", "Purple", "Violet"}));
        switches.addBrick(singleton.createBrick(ItemId.SWITCH_ORANGE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickswitchorange", "", ItemTab.ACTION, false, true, 422, 0x0, new String[]{"Switch", "Lever", "Button", "Orange"}));
        switches.addBrick(singleton.createBrick(ItemId.RESET_ORANGE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickswitchorange", "", ItemTab.ACTION, false, true, 867, 0x0, new String[]{"Reset", "Off", "Switch", "Lever", "Button", "Orange"}));
        switches.addBrick(singleton.createBrick(ItemId.GATE_ORANGE, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickswitchorange", "", ItemTab.ACTION, false, false, 38, 0xFFD7642F, new String[]{"Switch", "Gate", "Orange"}));
        switches.addBrick(singleton.createBrick(ItemId.DOOR_ORANGE, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickswitchorange", "", ItemTab.ACTION, false, false, 39, 0xFFD7642F, new String[]{"Switch", "Door", "Orange"}));
        singleton.brickPackages.add(switches);

        ItemBrickPackage death = new ItemBrickPackage("death", "Death Doors/Gates (+10)", new String[]{"Lock", "Die", "Skull", "Curse"});
        death.addBrick(singleton.createBrick(ItemId.DEATH_GATE, ItemLayer.DECORATION, singleton.blocksBMD, "brickdeathdoor", "", ItemTab.ACTION, false, false, 198, 0xFFA9A9A9, new String[]{"Gate", "Off"}));
        death.addBrick(singleton.createBrick(ItemId.DEATH_DOOR, ItemLayer.DECORATION, singleton.blocksBMD, "brickdeathdoor", "", ItemTab.ACTION, false, false, 199, 0xFFA9A9A9, new String[]{"Door", "On"}));
        singleton.brickPackages.add(death);

        ItemBrickPackage zombie = new ItemBrickPackage("zombie", "Zombie Blocks", new String[]{"Blue", "Grey", "Gray"});
        zombie.addBrick(singleton.createBrick(ItemId.EFFECT_ZOMBIE, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectzombie", "infects the player with a horrible disease", ItemTab.ACTION, false, false, 5, 0x0, new String[]{"Effect", "Death", "Slow"}));
        zombie.addBrick(singleton.createBrick(ItemId.ZOMBIE_GATE, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickeffectzombie", "", ItemTab.ACTION, false, false, 12, 0xFF62747F, new String[]{"Gate"}));
        zombie.addBrick(singleton.createBrick(ItemId.ZOMBIE_DOOR, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickeffectzombie", "", ItemTab.ACTION, false, false, 13, 0xFF62747F, new String[]{"Door"}));
        singleton.brickPackages.add(zombie);

        ItemBrickPackage teams = new ItemBrickPackage("teams", "Team effect (+10)", new String[]{"Team", "Grey", "Gray"});
        teams.addBrick(singleton.createBrick(ItemId.EFFECT_TEAM, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectteam", "sets the player's team to the specified color", ItemTab.ACTION, false, false, 6, 0x0, new String[]{"Effect", "Separation"}));
        teams.addBrick(singleton.createBrick(ItemId.TEAM_GATE, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickeffectteam", "", ItemTab.ACTION, false, false, 29, 0x0, new String[]{"Gate", "Lock", "Off"}));
        teams.addBrick(singleton.createBrick(ItemId.TEAM_DOOR, ItemLayer.DECORATION, singleton.doorBlocksBMD, "brickeffectteam", "", ItemTab.ACTION, false, false, 22, 0x0, new String[]{"Door", "Lock", "On"}));
        singleton.brickPackages.add(teams);

        ItemBrickPackage timed = new ItemBrickPackage("timed", "Timed Doors (+10)", new String[]{"Lock", "Wait", "Door", "Gate", "Grey", "Gray"});
        timed.addBrick(singleton.createBrick(ItemId.TIMEGATE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricktimeddoor", "", ItemTab.ACTION, false, false, 337, -1, new String[]{"Off"}));
        timed.addBrick(singleton.createBrick(ItemId.TIMEDOOR, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricktimeddoor", "", ItemTab.ACTION, false, true, 332, -1, new String[]{"On"}));
        singleton.brickPackages.add(timed);

        ItemBrickPackage music = new ItemBrickPackage("music", "Music Blocks", new String[]{"Sound", "Entertainment", "Note", "Melody", "Instrument"});
        music.addBrick(singleton.createBrick(77, ItemLayer.DECORATION, singleton.blocksBMD, "bricknode", "plays a sound when touched", ItemTab.ACTION, false, false, 77, 0x0, new String[]{"Piano", "Maestro"}));
        music.addBrick(singleton.createBrick(83, ItemLayer.DECORATION, singleton.blocksBMD, "brickdrums", "plays a sound when touched", ItemTab.ACTION, false, false, 83, 0x0, new String[]{"Drums"}));
        music.addBrick(singleton.createBrick(1520, ItemLayer.DECORATION, singleton.blocksBMD, "brickguitar", "plays a sound when touched", ItemTab.ACTION, false, false, 286, 0x0, new String[]{"Guitar"}));
        singleton.brickPackages.add(music);

        ItemBrickPackage hazards = new ItemBrickPackage("hazards", "Hazard Blocks", new String[]{"Kill", "Die", "Respawn", "Death", "Trap", "Fatal", "Deadly"});
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspike", "kills the player", ItemTab.ACTION, false, false, 157, 0x0, new String[]{"Spikes", "Morphable"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_CENTER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspike", "kills the player", ItemTab.ACTION, false, false, 739, 0x0, new String[]{"Spikes", "Floating", "Centre", "Center", "Central", "Mine", "Hover"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_SILVER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikesilver", "kills the player", ItemTab.ACTION, false, false, 869, 0x0, new String[]{"Spikes", "Morphable"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_SILVER_CENTER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikesilver", "kills the player", ItemTab.ACTION, false, false, 872, 0x0, new String[]{"Spikes", "Floating", "Centre", "Center", "Central", "Mine", "Hover"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_BLACK, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikeblack", "kills the player", ItemTab.ACTION, false, false, 874, 0x0, new String[]{"Spikes", "Morphable", "Silver", "Light", "White", "Gray", "Grey"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_BLACK_CENTER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikeblack", "kills the player", ItemTab.ACTION, false, false, 877, 0x0, new String[]{"Spikes", "Floating", "Centre", "Center", "Central", "Mine", "Hover", "Silver", "Light", "White", "Gray", "Grey"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_RED, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikered", "kills the player", ItemTab.ACTION, false, false, 879, 0x0, new String[]{"Spikes", "Morphable", "Black", "Dark", "Gray", "Grey"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_RED_CENTER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikered", "kills the player", ItemTab.ACTION, false, false, 882, 0x0, new String[]{"Spikes", "Floating", "Centre", "Center", "Central", "Mine", "Hover", "Black", "Dark", "Gray", "Grey"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_GOLD, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikegold", "kills the player", ItemTab.ACTION, false, false, 884, 0x0, new String[]{"Spikes", "Morphable", "Yellow", "Gold"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_GOLD_CENTER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikegold", "kills the player", ItemTab.ACTION, false, false, 887, 0x0, new String[]{"Spikes", "Floating", "Centre", "Center", "Central", "Mine", "Hover", "Yellow", "Gold"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_GREEN, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikegreen", "kills the player", ItemTab.ACTION, false, false, 889, 0x0, new String[]{"Spikes", "Morphable", "Green"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_GREEN_CENTER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikegreen", "kills the player", ItemTab.ACTION, false, false, 892, 0x0, new String[]{"Spikes", "Floating", "Centre", "Center", "Central", "Mine", "Hover", "Green"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_BLUE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikeblue", "kills the player", ItemTab.ACTION, false, false, 894, 0x0, new String[]{"Spikes", "Morphable", "Blue"}));
        hazards.addBrick(singleton.createBrick(ItemId.SPIKE_BLUE_CENTER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspikeblue", "kills the player", ItemTab.ACTION, false, false, 897, 0x0, new String[]{"Spikes", "Floating", "Centre", "Center", "Central", "Mine", "Hover", "Blue"}));
        hazards.addBrick(singleton.createBrick(ItemId.FIRE, ItemLayer.ABOVE, singleton.specialBlocksBMD, "brickfire", "kills the player", ItemTab.ACTION, false, false, 188, 0x0, new String[]{"Fire", "Burn", "Flames", "Animated", "Hell"}));
        singleton.brickPackages.add(hazards);

        ItemBrickPackage liquid = new ItemBrickPackage("liquids", "Liquid Blocks", new String[]{"Transportation", "Swim", "Fluid", "Action", "Environment"});
        liquid.addBrick(singleton.createBrick(ItemId.WATER, ItemLayer.ABOVE, singleton.specialBlocksBMD, "", "", ItemTab.ACTION, false, false, 196, 0x0, new String[]{"Water", "Blue", "Up", "Float"}));
        liquid.addBrick(singleton.createBrick(ItemId.LAVA, ItemLayer.ABOVE, singleton.specialBlocksBMD, "bricklava", "sets the player on fire and kills", ItemTab.ACTION, false, false, 218, 0x0, new String[]{"Lava", "Hazard", "Die", "Orange", "Death", "Burn", "Sink", "Hell"}));
        liquid.addBrick(singleton.createBrick(ItemId.MUD, ItemLayer.ABOVE, singleton.mudBlocksBMD, "brickswamp", "slows the player down", ItemTab.ACTION, false, false, 0, 0x0, new String[]{"Mud", "Swamp", "Bog", "Slow", "Brown", "Sink"}));
        liquid.addBrick(singleton.createBrick(ItemId.TOXIC_WASTE, ItemLayer.ABOVE, singleton.specialBlocksBMD, "bricktoxic", "kills the player instantly on touch", ItemTab.ACTION, false, false, 746, 0x0, new String[]{"Toxic", "Waste", "Slow", "Green"}));
        singleton.brickPackages.add(liquid);

        ItemBrickPackage portal = new ItemBrickPackage("portals", "Portal Blocks", new String[]{"Teleport"});
        portal.addBrick(singleton.createBrick(ItemId.PORTAL_INVISIBLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickinvisibleportal", "teleports the player to another portal", ItemTab.ACTION, false, true, 138, 0x0, new String[]{"Invisible", "Secrets", "Hidden"}));
        portal.addBrick(singleton.createBrick(242, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickportal", "teleports the player to another portal", ItemTab.ACTION, false, true, 52, -1, new String[]{"Visible", "Blue"}));
        portal.addBrick(singleton.createBrick(ItemId.WORLD_PORTAL, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickworldportal", "teleports the player to another world", ItemTab.ACTION, true, true, 113, -1, new String[]{"World", "Red"}));
        singleton.brickPackages.add(portal);

        ItemBrickPackage diamond = new ItemBrickPackage("diamond", "Diamond (+1)", new String[]{"Exclusive"});
        diamond.addBrick(singleton.createBrick(ItemId.DIAMOND, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickdiamond", "changes the player's smiley to diamond", ItemTab.ACTION, true, true, 241 - 128, -1, new String[]{"Luxury", "Smiley", "Expensive", "Gray", "Animated", "Shiny", "Grey"}, false, true));
        singleton.brickPackages.add(diamond);

        ItemBrickPackage cake = new ItemBrickPackage("cake", "Cake");
        cake.addBrick(singleton.createBrick(ItemId.CAKE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickcake", "changes the player's smiley to party hat", ItemTab.ACTION, true, true, 298, 0x0, new String[]{"Party", "Birthday", "Smiley", "Hat", "Animated", "Food"}));
        singleton.brickPackages.add(cake);

        ItemBrickPackage hologram = new ItemBrickPackage("hologram", "Hologram");
        hologram.addBrick(singleton.createBrick(ItemId.HOLOGRAM, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhologram", "changes the player's smiley to hologram", ItemTab.ACTION, true, true, 279, 0x6666FFFF, new String[]{"Sci-fi", "Blue", "Transparent", "Smiley", "Future", "Animated"}));
        singleton.brickPackages.add(hologram);
    }

    private static void initDecoratives() {

        //DECORATIVEs
        ItemBrickPackage christmas2010 = new ItemBrickPackage("christmas 2010", "Christmas 2010 Blocks", new String[]{"Holiday", "Xmas", "Winter"});
        christmas2010.addBrick(singleton.createBrick(249, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2010", "", ItemTab.DECORATIVE, false, false, 249 - 128, 0x0, new String[]{"Snow", "Left", "Corner", "Snowdrift", "Environment"}));
        christmas2010.addBrick(singleton.createBrick(250, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2010", "", ItemTab.DECORATIVE, false, false, 250 - 128, 0x0, new String[]{"Snow", "Right", "Corner", "Snowdrift", "Environment"}));
        christmas2010.addBrick(singleton.createBrick(251, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2010", "", ItemTab.DECORATIVE, false, false, 251 - 128, 0x0, new String[]{"Tree", "Plant", "Nature", "Spruce", "Environment"}));
        christmas2010.addBrick(singleton.createBrick(252, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2010", "", ItemTab.DECORATIVE, false, false, 252 - 128, 0x0, new String[]{"Tree", "Snow", "Plant", "Lights", "Spruce", "Nature", "Environment"}));
        christmas2010.addBrick(singleton.createBrick(253, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2010", "", ItemTab.DECORATIVE, false, false, 253 - 128, 0x0, new String[]{"Fence", "Snow", "Wood"}));
        christmas2010.addBrick(singleton.createBrick(254, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2010", "", ItemTab.DECORATIVE, false, false, 254 - 128, 0x0, new String[]{"Fence", "Wood"}));
        singleton.brickPackages.add(christmas2010);

        ItemBrickPackage newyear2010 = new ItemBrickPackage("new year 2010", "New Year 2010", new String[]{"Holiday", "Baubles", "Ornament", "Light", "Bulb"});
        newyear2010.addBrick(singleton.createBrick(244, ItemLayer.DECORATION, singleton.decoBlocksBMD, "mixednewyear2010", "", ItemTab.DECORATIVE, false, true, 244 - 128, 0x0, new String[]{"Pink", "Violet", "Purple"}));
        newyear2010.addBrick(singleton.createBrick(245, ItemLayer.DECORATION, singleton.decoBlocksBMD, "mixednewyear2010", "", ItemTab.DECORATIVE, false, true, 245 - 128, 0x0, new String[]{"Yellow"}));
        newyear2010.addBrick(singleton.createBrick(246, ItemLayer.DECORATION, singleton.decoBlocksBMD, "mixednewyear2010", "", ItemTab.DECORATIVE, false, true, 246 - 128, 0x0, new String[]{"Blue"}));
        newyear2010.addBrick(singleton.createBrick(247, ItemLayer.DECORATION, singleton.decoBlocksBMD, "mixednewyear2010", "", ItemTab.DECORATIVE, false, true, 247 - 128, 0x0, new String[]{"Red"}));
        newyear2010.addBrick(singleton.createBrick(248, ItemLayer.DECORATION, singleton.decoBlocksBMD, "mixednewyear2010", "", ItemTab.DECORATIVE, false, true, 248 - 128, 0x0, new String[]{"Green"}));
        singleton.brickPackages.add(newyear2010);

        ItemBrickPackage spring2011 = new ItemBrickPackage("spring 2011", "Spring package 2011", new String[]{"Season", "Nature", "Plant", "Environment"});
        spring2011.addBrick(singleton.createBrick(233, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2011", "", ItemTab.DECORATIVE, false, false, 233 - 128, 0x0, new String[]{"Grass", "Left", "Grass", "Short"}));
        spring2011.addBrick(singleton.createBrick(234, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2011", "", ItemTab.DECORATIVE, false, false, 234 - 128, 0x0, new String[]{"Grass", "Middle", "Short"}));
        spring2011.addBrick(singleton.createBrick(235, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2011", "", ItemTab.DECORATIVE, false, false, 235 - 128, 0x0, new String[]{"Grass", "Right", "Short"}));
        spring2011.addBrick(singleton.createBrick(236, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2011", "", ItemTab.DECORATIVE, false, false, 236 - 128, 0x0, new String[]{"Grass", "Hedge", "Left", "Big", "Tall Grass", "Bush"}));
        spring2011.addBrick(singleton.createBrick(237, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2011", "", ItemTab.DECORATIVE, false, false, 237 - 128, 0x0, new String[]{"Grass", "Hedge", "Middle", "Big", "Tall Grass", "Bush"}));
        spring2011.addBrick(singleton.createBrick(238, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2011", "", ItemTab.DECORATIVE, false, false, 238 - 128, 0x0, new String[]{"Grass", "Hedge", "Right", "Big", "Tall Grass", "Bush"}));
        spring2011.addBrick(singleton.createBrick(239, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2011", "", ItemTab.DECORATIVE, false, false, 239 - 128, 0x0, new String[]{"Flower", "Sun", "Yellow", "Flora"}));
        spring2011.addBrick(singleton.createBrick(240, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2011", "", ItemTab.DECORATIVE, false, false, 240 - 128, 0x0, new String[]{"Bush", "Plant", "Shrub", "Flora"}));
        singleton.brickPackages.add(spring2011);

        ItemBrickPackage prizes = new ItemBrickPackage("Prizes", "Your Prizes", new String[]{"Prize"});
        prizes.addBrick(singleton.createBrick(223, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhwtrophy", "trophy for the Halloween 2011 contest winners", ItemTab.DECORATIVE, false, false, 95, 0x0, new String[]{"Cup", "Trophy", "Halloween", "Gold", "Thanel"}, false, true));
        prizes.addBrick(singleton.createBrick(478, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspringtrophybronze", "prize for winning third place in the Spring 2016 contest", ItemTab.DECORATIVE, false, false, 298, 0x0, new String[]{"Trophy", "Bronze", "Spring", "Flower"}, false, true));
        prizes.addBrick(singleton.createBrick(479, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspringtrophysilver", "prize for winning second place in the Spring 2016 contest ", ItemTab.DECORATIVE, false, false, 297, 0x0, new String[]{"Trophy", "Silver", "Spring", "Flower"}, false, true));
        prizes.addBrick(singleton.createBrick(480, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspringtrophygold", "prize for winning first place in the Spring 2016 contest", ItemTab.DECORATIVE, false, false, 296, 0x0, new String[]{"Trophy", "Gold", "Spring", "Flower"}, false, true));
        prizes.addBrick(singleton.createBrick(484, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummertrophybronze", "prize for winning third place in the Summer 2016 contest", ItemTab.DECORATIVE, false, false, 301, 0x0, new String[]{"Trophy", "Bronze", "Summer", "Sun"}, false, true));
        prizes.addBrick(singleton.createBrick(485, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummertrophysilver", "prize for winning second place in the Summer 2016 contest ", ItemTab.DECORATIVE, false, false, 300, 0x0, new String[]{"Trophy", "Silver", "Summer", "Sun"}, false, true));
        prizes.addBrick(singleton.createBrick(486, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummertrophygold", "prize for winning first place in the Summer 2016 contest", ItemTab.DECORATIVE, false, false, 299, 0x0, new String[]{"Trophy", "Gold", "Summer", "Sun"}, false, true));
        prizes.addBrick(singleton.createBrick(1540, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickdesigntrophybronze", "prize for winning third place in the Design contest", ItemTab.DECORATIVE, false, false, 338, 0x0, new String[]{"Trophy", "Bronze", "Design"}, false, true));
        prizes.addBrick(singleton.createBrick(1541, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickdesigntrophysilver", "prize for winning second place in the Design contest", ItemTab.DECORATIVE, false, false, 337, 0x0, new String[]{"Trophy", "Silver", "Design"}, false, true));
        prizes.addBrick(singleton.createBrick(1542, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickdesigntrophygold", "prize for winning first place in the Design contest", ItemTab.DECORATIVE, false, false, 336, 0x0, new String[]{"Trophy", "Gold", "Design"}, false, true));
        singleton.brickPackages.add(prizes);

        ItemBrickPackage easter_2012 = new ItemBrickPackage("easter 2012", "Easter  decorations 2012", new String[]{"Holiday", "Decor", "Egg"});
        easter_2012.addBrick(singleton.createBrick(256, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickeaster2012", "", ItemTab.DECORATIVE, false, false, 256 - 128, 0x0, new String[]{"Cyan", "Teal", "Wavy"}));
        easter_2012.addBrick(singleton.createBrick(257, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickeaster2012", "", ItemTab.DECORATIVE, false, false, 257 - 128, 0x0, new String[]{"Pink", "Wavy"}));
        easter_2012.addBrick(singleton.createBrick(258, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickeaster2012", "", ItemTab.DECORATIVE, false, false, 258 - 128, 0x0, new String[]{"Green", "Line", "Yellow"}));
        easter_2012.addBrick(singleton.createBrick(259, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickeaster2012", "", ItemTab.DECORATIVE, false, false, 259 - 128, 0x0, new String[]{"Pink", "Stripes"}));
        easter_2012.addBrick(singleton.createBrick(260, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickeaster2012", "", ItemTab.DECORATIVE, false, false, 260 - 128, 0x0, new String[]{"Green", "Dots"}));
        singleton.brickPackages.add(easter_2012);

    }

    private static void initBackgrounds() {

        //BACKGROUNDs

        ItemBrickPackage basicbg = new ItemBrickPackage("basic", "Basic Background Blocks");
        basicbg.addBrick(singleton.createBrick(715, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 209, -1, new String[]{"White", "Light"}));
        basicbg.addBrick(singleton.createBrick(500, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 0 /* 500 */, -1, new String[]{"Gray", "Grey"}));
        basicbg.addBrick(singleton.createBrick(645, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 139, -1, new String[]{"Black", "Dark", "Shadow"}));
        basicbg.addBrick(singleton.createBrick(503, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 503 - 500, -1, new String[]{"Red"}));
        basicbg.addBrick(singleton.createBrick(644, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 138, -1, new String[]{"Orange"}));
        basicbg.addBrick(singleton.createBrick(504, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 504 - 500, -1, new String[]{"Yellow", "Lime", "Green"}));
        basicbg.addBrick(singleton.createBrick(505, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 505 - 500, -1, new String[]{"Green", "Backdrop"}));
        basicbg.addBrick(singleton.createBrick(506, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 506 - 500, -1, new String[]{"Cyan", "Teal", "Turquoise", "Blue"}));
        basicbg.addBrick(singleton.createBrick(501, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 501 - 500, -1, new String[]{"Blue"}));
        basicbg.addBrick(singleton.createBrick(502, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 502 - 500, -1, new String[]{"Purple", "Magenta", "Pink", "Violet"}));
        singleton.brickPackages.add(basicbg);

        ItemBrickPackage betabg = new ItemBrickPackage("beta", "Beta Access", new String[]{"Exclusive"});
        betabg.addBrick(singleton.createBrick(743, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 237, -1, new String[]{"White", "Light"}));
        betabg.addBrick(singleton.createBrick(744, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 238, -1, new String[]{"Grey", "Gray", "Taupe"}));
        betabg.addBrick(singleton.createBrick(745, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 239, -1, new String[]{"Black", "Dark", "Onyx"}));
        betabg.addBrick(singleton.createBrick(746, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 240, -1, new String[]{"Red", "Ruby", "Garnet"}));
        betabg.addBrick(singleton.createBrick(747, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 241, -1, new String[]{"Orange", "Copper"}));
        betabg.addBrick(singleton.createBrick(748, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 242, -1, new String[]{"Yellow", "Gold", "Jasmine"}));
        betabg.addBrick(singleton.createBrick(749, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 243, -1, new String[]{"Green", "Emerald", "Malachite"}));
        betabg.addBrick(singleton.createBrick(750, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 244, -1, new String[]{"Blue", "Cyan", "Light blue", "Aquamarine", "Turquoise"}));
        betabg.addBrick(singleton.createBrick(751, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 245, -1, new String[]{"Blue", "Sapphire"}));
        betabg.addBrick(singleton.createBrick(752, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "pro", "", ItemTab.BACKGROUND, false, true, 246, -1, new String[]{"Purple", "Pink", "Magenta", "Violet", "Amethyst"}));
        singleton.brickPackages.add(betabg);

        ItemBrickPackage brickbg = new ItemBrickPackage("brick", "Brick Background Blocks");
        brickbg.addBrick(singleton.createBrick(716, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 210, 0xFF5B5B5B, new String[]{"White", "Light"}));
        brickbg.addBrick(singleton.createBrick(646, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 140, 0xFF282828, new String[]{"Gray", "Grey"}));
        brickbg.addBrick(singleton.createBrick(648, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 142, 0xFF0F0F0F, new String[]{"Black", "Dark", "Shadow"}));
        brickbg.addBrick(singleton.createBrick(511, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 11, -1, new String[]{"Red"}));
        brickbg.addBrick(singleton.createBrick(507, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 7, -1, new String[]{"Orange", "Brown", "Dirt", "Soil"}));
        brickbg.addBrick(singleton.createBrick(512, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 12, -1, new String[]{"Yellow", "Soil", "Brown"}));
        brickbg.addBrick(singleton.createBrick(510, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 10, -1, new String[]{"Green", "Lime"}));
        brickbg.addBrick(singleton.createBrick(508, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 8, -1, new String[]{"Cyan", "Teal", "Turquoise", "Blue"}));
        brickbg.addBrick(singleton.createBrick(647, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 141, -1, new String[]{"Blue"}));
        brickbg.addBrick(singleton.createBrick(509, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 9, -1, new String[]{"Magenta", "Purple", "Violet"}));
        singleton.brickPackages.add(brickbg);

        ItemBrickPackage checker = new ItemBrickPackage("checker", "Checker Backgrounds", new String[]{"Checkered"});
        checker.addBrick(singleton.createBrick(718, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 212, -1, new String[]{"White", "Light"}));
        checker.addBrick(singleton.createBrick(513, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 513 - 500, -1, new String[]{"Gray", "Grey", "Shadow"}));
        checker.addBrick(singleton.createBrick(650, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 144, -1, new String[]{"Black", "Dark", "Shadow"}));
        checker.addBrick(singleton.createBrick(516, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 516 - 500, -1, new String[]{"Red", "Pink"}));
        checker.addBrick(singleton.createBrick(649, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 143, -1, new String[]{"Orange"}));
        checker.addBrick(singleton.createBrick(517, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 517 - 500, -1, new String[]{"Yellow", "Lime"}));
        checker.addBrick(singleton.createBrick(518, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 518 - 500, -1, new String[]{"Green"}));
        checker.addBrick(singleton.createBrick(519, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 519 - 500, -1, new String[]{"Cyan", "Teal", "Turquoise", "Blue"}));
        checker.addBrick(singleton.createBrick(514, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 514 - 500, -1, new String[]{"Blue"}));
        checker.addBrick(singleton.createBrick(515, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 515 - 500, -1, new String[]{"Purple", "Magenta", "Pink", "Violet"}));
        singleton.brickPackages.add(checker);

        ItemBrickPackage dark = new ItemBrickPackage("dark", "Solid Dark Backgrounds", new String[]{"Solid"});
        dark.addBrick(singleton.createBrick(719, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 213, -1, new String[]{"White", "Light"}));
        dark.addBrick(singleton.createBrick(520, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 520 - 500, -1, new String[]{"Gray", "Grey", "Shadow"}));
        dark.addBrick(singleton.createBrick(652, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 146, -1, new String[]{"Black", "Dark", "Shadow"}));
        dark.addBrick(singleton.createBrick(523, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 523 - 500, -1, new String[]{"Red"}));
        dark.addBrick(singleton.createBrick(651, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 145, -1, new String[]{"Orange"}));
        dark.addBrick(singleton.createBrick(524, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 524 - 500, -1, new String[]{"Yellow", "Lime"}));
        dark.addBrick(singleton.createBrick(525, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 525 - 500, -1, new String[]{"Green"}));
        dark.addBrick(singleton.createBrick(526, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 526 - 500, -1, new String[]{"Cyan", "Teal", "Turquoise", "Blue"}));
        dark.addBrick(singleton.createBrick(521, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 521 - 500, -1, new String[]{"Blue"}));
        dark.addBrick(singleton.createBrick(522, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 522 - 500, -1, new String[]{"Purple", "Magenta", "Pink", "Violet"}));
        singleton.brickPackages.add(dark);

        ItemBrickPackage normalbackgrounds = new ItemBrickPackage("normal", "Solid backrounds", new String[]{"Solid"});
        normalbackgrounds.addBrick(singleton.createBrick(717, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 211, -1, new String[]{"White", "Light"}));
        normalbackgrounds.addBrick(singleton.createBrick(610, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 110, -1, new String[]{"Gray", "Grey", "Shadow"}));
        normalbackgrounds.addBrick(singleton.createBrick(654, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 148, -1, new String[]{"Black", "Dark", "Shadow"}));
        normalbackgrounds.addBrick(singleton.createBrick(613, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 113, -1, new String[]{"Red"}));
        normalbackgrounds.addBrick(singleton.createBrick(653, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 147, -1, new String[]{"Orange"}));
        normalbackgrounds.addBrick(singleton.createBrick(614, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 114, -1, new String[]{"Yellow", "Lime"}));
        normalbackgrounds.addBrick(singleton.createBrick(615, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 115, -1, new String[]{"Green"}));
        normalbackgrounds.addBrick(singleton.createBrick(616, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 116, -1, new String[]{"Cyan", "Teal", "Turquoise", "Blue"}));
        normalbackgrounds.addBrick(singleton.createBrick(611, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 111, -1, new String[]{"Blue"}));
        normalbackgrounds.addBrick(singleton.createBrick(612, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 112, -1, new String[]{"Purple", "Magenta", "Pink", "Violet"}));
        singleton.brickPackages.add(normalbackgrounds);

        ItemBrickPackage pastel = new ItemBrickPackage("pastel", "Pretty Pastel Backgrounds", new String[]{"Solid", "Bright"});
        pastel.addBrick(singleton.createBrick(532, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 32, -1, new String[]{"Pink", "Red", "Magenta"}));
        pastel.addBrick(singleton.createBrick(676, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 170, -1, new String[]{"Orange"}));
        pastel.addBrick(singleton.createBrick(527, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 27, -1, new String[]{"Yellow"}));
        pastel.addBrick(singleton.createBrick(529, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 29, -1, new String[]{"Yellow", "Green", "Lime"}));
        pastel.addBrick(singleton.createBrick(528, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 28, -1, new String[]{"Green"}));
        pastel.addBrick(singleton.createBrick(530, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 30, -1, new String[]{"Cyan", "Light Blue", "Sky"}));
        pastel.addBrick(singleton.createBrick(531, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 31, -1, new String[]{"Blue", "Sky"}));
        pastel.addBrick(singleton.createBrick(677, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 171, -1, new String[]{"Purple"}));
        singleton.brickPackages.add(pastel);


        ItemBrickPackage canvas = new ItemBrickPackage("canvas", "Canvas Backgrounds", new String[]{"Rough", "Textured"});
        canvas.addBrick(singleton.createBrick(538, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 38, -1, new String[]{"Gray", "Grey"}));
        canvas.addBrick(singleton.createBrick(671, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 165, -1, new String[]{"Red"}));
        canvas.addBrick(singleton.createBrick(533, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 33, -1, new String[]{"Orange"}));
        canvas.addBrick(singleton.createBrick(534, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 34, -1, new String[]{"Beige", "Brown", "Tan"}));
        canvas.addBrick(singleton.createBrick(535, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 35, -1, new String[]{"Yellow"}));
        canvas.addBrick(singleton.createBrick(536, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 36, -1, new String[]{"Green"}));
        canvas.addBrick(singleton.createBrick(537, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 37, -1, new String[]{"Cyan", "Light Blue", "Water"}));
        canvas.addBrick(singleton.createBrick(606, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 106, -1, new String[]{"Blue"}));
        canvas.addBrick(singleton.createBrick(672, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcanvas", "", ItemTab.BACKGROUND, false, false, 166, -1, new String[]{"Purple", "Violet"}));

        singleton.brickPackages.add(canvas);

        ItemBrickPackage carnival = new ItemBrickPackage("carnival", "Carnival backgrounds");
        carnival.addBrick(singleton.createBrick(545, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcarnival", "", ItemTab.BACKGROUND, false, false, 45, -1, new String[]{"Stripes", "Red", "Yellow", "McDonald's"}));
        carnival.addBrick(singleton.createBrick(546, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcarnival", "", ItemTab.BACKGROUND, false, false, 46, -1, new String[]{"Stripes", "Purple", "Violet", "Dark"}));
        carnival.addBrick(singleton.createBrick(547, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcarnival", "", ItemTab.BACKGROUND, false, false, 47, -1, new String[]{"Magenta", "Pink"}));
        carnival.addBrick(singleton.createBrick(548, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcarnival", "", ItemTab.BACKGROUND, false, false, 48, -1, new String[]{"Checker", "Black", "White", "Double"}));
        carnival.addBrick(singleton.createBrick(549, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcarnival", "", ItemTab.BACKGROUND, false, false, 49, -1, new String[]{"Green"}));
        carnival.addBrick(singleton.createBrick(558, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcarnival", "", ItemTab.BACKGROUND, false, false, 58, -1, new String[]{"Yellow"}));
        carnival.addBrick(singleton.createBrick(563, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcarnival", "", ItemTab.BACKGROUND, false, false, 63, -1, new String[]{"Poland", "Stripes", "Red", "White"}));
        carnival.addBrick(singleton.createBrick(607, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickbgcarnival", "", ItemTab.BACKGROUND, false, false, 107, -1, new String[]{"Blue", "Solid"}));
        singleton.brickPackages.add(carnival);
    }

    private static void initRest1() {


        ItemBrickPackage candy = new ItemBrickPackage("candy", "CandyLand", new String[]{"Sweet", "Sugar", "Food"});
        candy.addBrick(singleton.createBrick(60, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 60, -1, new String[]{"Pink", "Cotton Candy", "Fairy Floss", "Stripes", "Pastel"}));
        candy.addBrick(singleton.createBrick(1154, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 310, -1, new String[]{"Blue", "Cotton Candy", "Fairy Floss", "Stripes", "Pastel"}));
        candy.addBrick(singleton.createBrick(61, ItemLayer.DECORATION, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 61, -1, new String[]{"Platform", "Magenta", "Pink", "One-Way"}));
        candy.addBrick(singleton.createBrick(62, ItemLayer.DECORATION, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 62, -1, new String[]{"Platform", "Red", "One-Way", "One way"}));
        candy.addBrick(singleton.createBrick(63, ItemLayer.DECORATION, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 63, -1, new String[]{"Platform", "Cyan", "One-Way", "One way"}));
        candy.addBrick(singleton.createBrick(64, ItemLayer.DECORATION, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 64, -1, new String[]{"Platform", "Green", "One-Way", "One way"}));
        candy.addBrick(singleton.createBrick(65, ItemLayer.DECORATION, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 65, -1, new String[]{"Candy", "Cane", "Red", "White", "Stripes"}));
        candy.addBrick(singleton.createBrick(66, ItemLayer.DECORATION, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 66, -1, new String[]{"Cake", "Licorice", "Hamburger", "Sandwich", "Stripes"}));
        candy.addBrick(singleton.createBrick(67, ItemLayer.DECORATION, singleton.blocksBMD, "brickcandy", "", ItemTab.BLOCK, false, true, 67, -1, new String[]{"Gingerbread", "Chocolate", "Brown", "Cake", "Dirt"}));
        candy.addBrick(singleton.createBrick(227, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcandy", "", ItemTab.DECORATIVE, false, false, 99, 0x0, new String[]{"Cream", "Small", "Creme", "Whipped Topping", "White"}));
        candy.addBrick(singleton.createBrick(431, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcandy", "", ItemTab.DECORATIVE, false, false, 273, 0x0, new String[]{"Cream", "Big", "Creme", "Whipped Topping", "White"}));
        candy.addBrick(singleton.createBrick(432, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcandy", "", ItemTab.DECORATIVE, false, false, 274, 0x0, new String[]{"Gumdrop", "Red"}));
        candy.addBrick(singleton.createBrick(433, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcandy", "", ItemTab.DECORATIVE, false, false, 275, 0x0, new String[]{"Gumdrop", "Green"}));
        candy.addBrick(singleton.createBrick(434, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcandy", "", ItemTab.DECORATIVE, false, false, 276, 0x0, new String[]{"Gumdrop", "Pink"}));
        candy.addBrick(singleton.createBrick(539, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcandy", "", ItemTab.BACKGROUND, false, false, 39, -1, new String[]{"Stripes", "Pink", "Pastel"}));
        candy.addBrick(singleton.createBrick(540, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcandy", "", ItemTab.BACKGROUND, false, false, 40, -1, new String[]{"Stripes", "Blue", "Pastel"}));
        singleton.brickPackages.add(candy);

        ItemBrickPackage summer2011 = new ItemBrickPackage("summer 2011", "Summer package 2011", new String[]{"Season", "Hot", "Beach"});
        summer2011.addBrick(singleton.createBrick(59, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksummer2011", "", ItemTab.BLOCK, false, true, 59, -1, new String[]{"Sand", "Environment"}));
        summer2011.addBrick(singleton.createBrick(228, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2011", "", ItemTab.DECORATIVE, false, false, 228 - 128, 0x0, new String[]{"Umbrella", "Parasol", "Beach", "Sun"}));
        summer2011.addBrick(singleton.createBrick(229, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2011", "", ItemTab.DECORATIVE, false, false, 229 - 128, 0x0, new String[]{"Left", "Sand", "Corner", "Dune", "Environment"}));
        summer2011.addBrick(singleton.createBrick(230, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2011", "", ItemTab.DECORATIVE, false, false, 230 - 128, 0x0, new String[]{"Right", "Sand", "Corner", "Dune", "Environment"}));
        summer2011.addBrick(singleton.createBrick(231, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2011", "", ItemTab.DECORATIVE, false, false, 231 - 128, 0x0, new String[]{"Rock", "Stone", "Environment"}));
        summer2011.addBrick(singleton.createBrick(232, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2011", "", ItemTab.DECORATIVE, false, false, 232 - 128, 0x0, new String[]{"Bush", "Nature", "Plant", "Yellow", "Dead", "Tumbleweed", "Environment"}));
        singleton.brickPackages.add(summer2011);


        ItemBrickPackage halloween2011 = new ItemBrickPackage("halloween 2011", "Halloween pack", new String[]{"Scary", "Holiday", "Creepy"});
        halloween2011.addBrick(singleton.createBrick(68, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickhw2011", "", ItemTab.BLOCK, false, true, 68, -1, new String[]{"Brick", "Gray", "Grey", "Bloody", "Wall", "House"}));
        halloween2011.addBrick(singleton.createBrick(69, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickhw2011", "", ItemTab.BLOCK, false, true, 69, -1, new String[]{"Basic", "Gray", "Grey"}));
        halloween2011.addBrick(singleton.createBrick(224, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhw2011", "", ItemTab.DECORATIVE, false, false, 224 - 128, 0x0, new String[]{"Grave", "Tombstone", "Headstone", "Marker", "Dead"}));
        halloween2011.addBrick(singleton.createBrick(225, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhw2011", "", ItemTab.DECORATIVE, false, true, 225 - 128, 0x0, new String[]{"Cobweb", "Spider Web", "Right", "Corner"}));
        halloween2011.addBrick(singleton.createBrick(226, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhw2011", "", ItemTab.DECORATIVE, false, true, 226 - 128, 0x0, new String[]{"Cobweb", "Spider Web", "Left", "Corner"}));
        halloween2011.addBrick(singleton.createBrick(541, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhw2011", "", ItemTab.BACKGROUND, false, false, 541 - 500, -1, new String[]{"Stone", "Gray", "Grey"}));
        halloween2011.addBrick(singleton.createBrick(542, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhw2011", "", ItemTab.BACKGROUND, false, false, 542 - 500, -1, new String[]{"Brick", "Gray", "Grey", "House"}));
        halloween2011.addBrick(singleton.createBrick(543, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhw2011", "", ItemTab.BACKGROUND, false, false, 543 - 500, -1, new String[]{"Brick", "Damaged", "Right", "Ruins", "Corner", "House"}));
        halloween2011.addBrick(singleton.createBrick(544, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhw2011", "", ItemTab.BACKGROUND, false, false, 544 - 500, -1, new String[]{"Brick", "Damaged", "Left", "Ruins", "Corner", "House"}));
        singleton.brickPackages.add(halloween2011);


        ItemBrickPackage christmas2011 = new ItemBrickPackage("christmas 2011", "XMAS  decorations", new String[]{"2011", "Xmas", "Bauble", "Ornament", "Holiday"});
        christmas2011.addBrick(singleton.createBrick(218, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2011", "", ItemTab.DECORATIVE, false, true, 218 - 128, 0x0, new String[]{"Red", "Bulb", "Round", "Holiday", "Circle"}));
        christmas2011.addBrick(singleton.createBrick(219, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2011", "", ItemTab.DECORATIVE, false, true, 219 - 128, 0x0, new String[]{"Green", "Bulb", "Round", "Holiday", "Circle"}));
        christmas2011.addBrick(singleton.createBrick(220, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2011", "", ItemTab.DECORATIVE, false, true, 220 - 128, 0x0, new String[]{"Blue", "Bulb", "Round", "Holiday", "Circle"}));
        christmas2011.addBrick(singleton.createBrick(221, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2011", "", ItemTab.DECORATIVE, false, true, 221 - 128, 0x0, new String[]{"Circle", "Wreath", "Garland", "Holiday", "Green"}));
        christmas2011.addBrick(singleton.createBrick(222, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2011", "", ItemTab.DECORATIVE, false, true, 222 - 128, 0x0, new String[]{"Star", "Yellow", "Night", "Sky"}));
        singleton.brickPackages.add(christmas2011);

        ItemBrickPackage scifi = new ItemBrickPackage("sci-fi", "Sci-Fi Package", new String[]{"Future", "Science Fiction", "Alien", "UFO"});
        scifi.addBrick(singleton.createBrick(84, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 84, -1, new String[]{"Red", "Screen", "Panel"}));
        scifi.addBrick(singleton.createBrick(85, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 85, -1, new String[]{"Blue", "Screen", "Panel"}));
        scifi.addBrick(singleton.createBrick(1150, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 308, -1, new String[]{"Green", "Screen", "Panel"}));
        scifi.addBrick(singleton.createBrick(1151, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 309, -1, new String[]{"Yellow", "Screen", "Panel"}));
        scifi.addBrick(singleton.createBrick(1162, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 317, -1, new String[]{"Magenta", "Pink", "Purple", "Screen", "Panel"}));
        scifi.addBrick(singleton.createBrick(1163, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 318, -1, new String[]{"Cyan", "Screen", "Panel"}));
        scifi.addBrick(singleton.createBrick(86, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 86, -1, new String[]{"Metal", "Gray", "Bumpy", "Grey"}));
        scifi.addBrick(singleton.createBrick(87, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 87, 0xFFFFFFFF, new String[]{"Metal", "White", "Grey", "Gray"}));
        scifi.addBrick(singleton.createBrick(88, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 88, -1, new String[]{"Brown", "Camouflauge", "Leopard", "Carpet"}));
        scifi.addBrick(singleton.createBrick(89, ItemLayer.DECORATION, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 89, -1, new String[]{"Platform", "Red", "One-way", "One way"}));
        scifi.addBrick(singleton.createBrick(90, ItemLayer.DECORATION, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 90, -1, new String[]{"Platform", "Blue", "One-way", "One way"}));
        scifi.addBrick(singleton.createBrick(91, ItemLayer.DECORATION, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 91, -1, new String[]{"Platform", "Green", "One-way", "One way"}));
        scifi.addBrick(singleton.createBrick(ItemId.ONEWAY_SCIFI_YELLOW, ItemLayer.DECORATION, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 234, -1, new String[]{"Platform", "Yellow", "One-way", "One way"}));
        scifi.addBrick(singleton.createBrick(ItemId.ONEWAY_SCIFI_MAGENTA, ItemLayer.DECORATION, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 319, -1, new String[]{"Platform", "Magenta", "Pink", "Purple", "One-way", "One way"}));
        scifi.addBrick(singleton.createBrick(ItemId.ONEWAY_SCIFI_CYAN, ItemLayer.DECORATION, singleton.blocksBMD, "brickscifi", "", ItemTab.BLOCK, false, true, 320, -1, new String[]{"Platform", "Cyan", "One-way", "One way"}));
        scifi.addBrick(singleton.createBrick(ItemId.GLOWYLINE_BLUE_SLOPE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickscifi", "", ItemTab.DECORATIVE, false, true, 177, 0x0, new String[]{"Morphable", "Laser", "Neon", "Blue", "Flourescent", "Corner"}));
        scifi.addBrick(singleton.createBrick(ItemId.GLOWY_LINE_BLUE_STRAIGHT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickscifi", "", ItemTab.DECORATIVE, false, true, 181, 0x0, new String[]{"Morphable", "Laser", "Neon", "Blue", "Flourescent", "Middle"}));
        scifi.addBrick(singleton.createBrick(ItemId.GLOWY_LINE_GREEN_SLOPE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickscifi", "", ItemTab.DECORATIVE, false, true, 169, 0x0, new String[]{"Morphable", "Laser", "Neon", "Green", "Flourescent", "Corner"}));
        scifi.addBrick(singleton.createBrick(ItemId.GLOWY_LINE_GREEN_STRAIGHT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickscifi", "", ItemTab.DECORATIVE, false, true, 173, 0x0, new String[]{"Morphable", "Laser", "Neon", "Green", "Flourescent", "Middle"}));
        scifi.addBrick(singleton.createBrick(ItemId.GLOWY_LINE_YELLOW_SLOPE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickscifi", "", ItemTab.DECORATIVE, false, true, 161, 0x0, new String[]{"Morphable", "Laser", "Neon", "Yellow", "Orange", "Flourescent", "Corner"}));
        scifi.addBrick(singleton.createBrick(ItemId.GLOWY_LINE_YELLOW_STRAIGHT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickscifi", "", ItemTab.DECORATIVE, false, true, 165, 0x0, new String[]{"Morphable", "Laser", "Neon", "Yellow", "Orange", "Flourescent", "Middle"}));
        scifi.addBrick(singleton.createBrick(ItemId.GLOWY_LINE_RED_SLOPE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickscifi", "", ItemTab.DECORATIVE, false, true, 409, 0x0, new String[]{"Morphable", "Laser", "Neon", "Red", "Pink", "Flourescent", "Corner"}));
        scifi.addBrick(singleton.createBrick(ItemId.GLOWY_LINE_RED_STRAIGHT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickscifi", "", ItemTab.DECORATIVE, false, true, 413, 0x0, new String[]{"Morphable", "Laser", "Neon", "Red", "Pink", "Flourescent", "Middle"}));
        scifi.addBrick(singleton.createBrick(637, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickscifi", "", ItemTab.BACKGROUND, false, true, 131, 0xff737D81, new String[]{"Gray", "Outline", "Grey"}));
        singleton.brickPackages.add(scifi);

        ItemBrickPackage prison = new ItemBrickPackage("prison", "Prison", new String[]{"Cell", "Jail"});
        prison.addBrick(singleton.createBrick(261, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickprison", "", ItemTab.DECORATIVE, false, false, 261 - 128, 0x0, new String[]{"Bars", "Metal"}));
        prison.addBrick(singleton.createBrick(92, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickprison", "", ItemTab.BLOCK, false, true, 92, -1, new String[]{"Wall", "Brick", "Grey", "Gray", "House"}));
        prison.addBrick(singleton.createBrick(550, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickprison", "", ItemTab.BACKGROUND, false, true, 50, -1, new String[]{"Wall", "Brick", "Background", "Grey", "Gray", "House"}));
        prison.addBrick(singleton.createBrick(551, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickprison", "", ItemTab.BACKGROUND, false, true, 51, -1, new String[]{"Window", "Light", "Orange", "Brick"}));
        prison.addBrick(singleton.createBrick(552, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickprison", "", ItemTab.BACKGROUND, false, true, 52, -1, new String[]{"Window", "Light", "Blue", "Brick"}));
        prison.addBrick(singleton.createBrick(553, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickprison", "", ItemTab.BACKGROUND, false, true, 53, -1, new String[]{"Window", "Dark", "Vent", "Brick", "Grey", "Gray", "Drain"}));
        singleton.brickPackages.add(prison);

        ItemBrickPackage windows = new ItemBrickPackage("windows", "Colored Windows", new String[]{"Glass"});
        windows.addBrick(singleton.createBrick(262, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 262 - 128, 0x0, new String[]{"Transparent", "Clear", "Black", "Dark"}));
        windows.addBrick(singleton.createBrick(268, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 268 - 128, 0x0, new String[]{"Transparent", "Red", "Pink"}));
        windows.addBrick(singleton.createBrick(269, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 269 - 128, 0x0, new String[]{"Transparent", "Orange"}));
        windows.addBrick(singleton.createBrick(270, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 270 - 128, 0x0, new String[]{"Transparent", "Yellow"}));
        windows.addBrick(singleton.createBrick(263, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 263 - 128, 0x0, new String[]{"Transparent", "Green"}));
        windows.addBrick(singleton.createBrick(264, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 264 - 128, 0x0, new String[]{"Transparent", "Turquoise", "Cyan", "Teal", "Blue", "Green"}));
        windows.addBrick(singleton.createBrick(265, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 265 - 128, 0x0, new String[]{"Transparent", "Blue"}));
        windows.addBrick(singleton.createBrick(266, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 266 - 128, 0x0, new String[]{"Transparent", "Purple", "Violet", "Indigo"}));
        windows.addBrick(singleton.createBrick(267, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 267 - 128, 0x0, new String[]{"Transparent", "Pink", "Magenta"}));
        singleton.brickPackages.add(windows);

        ItemBrickPackage pirate = new ItemBrickPackage("pirate", "Pirate Pack");
        pirate.addBrick(singleton.createBrick(93, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickpirate", "", ItemTab.BLOCK, false, true, 93, -1, new String[]{"Wood", "Planks", "Board", "Siding", "Navy", "House"}));
        pirate.addBrick(singleton.createBrick(94, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickpirate", "", ItemTab.BLOCK, false, true, 94, -1, new String[]{"Chest", "Treasure", "Loot", "Booty", "Navy"}));
        pirate.addBrick(singleton.createBrick(154, ItemLayer.DECORATION, singleton.blocksBMD, "brickpirate", "", ItemTab.BLOCK, false, true, 131, 0x0, new String[]{"Platform", "Wood", "Ship", "Navy", "One Way", "One-Way"}));
        pirate.addBrick(singleton.createBrick(271, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickpirate", "", ItemTab.DECORATIVE, false, true, 143, 0x0, new String[]{"Wood", "Decoration", "Navy"}));
        pirate.addBrick(singleton.createBrick(272, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickpirate", "", ItemTab.DECORATIVE, false, true, 144, 0x0, new String[]{"Skull", "Head", "Skeleton", "Creepy", "Death"}));
        pirate.addBrick(singleton.createBrick(435, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickpirate", "", ItemTab.DECORATIVE, false, false, 277, 0x0, new String[]{"Cannon", "Sea war", "Gun", "Ship", "Navy"}));
        pirate.addBrick(singleton.createBrick(436, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickpirate", "", ItemTab.DECORATIVE, false, false, 278, 0x0, new String[]{"Port Window", "Porthole", "Ship", "Navy"}));
        pirate.addBrick(singleton.createBrick(554, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickpirate", "", ItemTab.BACKGROUND, false, false, 54, -1, new String[]{"Wood", "Dark", "Planks", "Board", "Ship", "House", "Siding", "Navy"}));
        pirate.addBrick(singleton.createBrick(555, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickpirate", "", ItemTab.BACKGROUND, false, false, 55, -1, new String[]{"Wood", "Light", "Planks", "Board", "Ship", "House", "Siding", "Navy"}));
        pirate.addBrick(singleton.createBrick(559, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickpirate", "", ItemTab.BACKGROUND, false, false, 59, -1, new String[]{"Wood", "Dark", "Planks", "Board", "Ship", "House", "Siding", "Navy"}));
        pirate.addBrick(singleton.createBrick(560, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickpirate", "", ItemTab.BACKGROUND, false, false, 60, -1, new String[]{"Flag", "Jolly Roger", "Skull", "Ship", "Navy"}));
        singleton.brickPackages.add(pirate);

        ItemBrickPackage stone = new ItemBrickPackage("stone", "Stone Pack", new String[]{"Cave", "Rocks", "Environment", "House"});
        stone.addBrick(singleton.createBrick(95, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickstone", "", ItemTab.BLOCK, false, true, 95, -1, new String[]{"Gray", "Grey"}));
        stone.addBrick(singleton.createBrick(1044, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickstone", "", ItemTab.BLOCK, false, true, 226, -1, new String[]{"Green", "Limestone"}));
        stone.addBrick(singleton.createBrick(1045, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickstone", "", ItemTab.BLOCK, false, true, 227, -1, new String[]{"Brown", "Dirt"}));
        stone.addBrick(singleton.createBrick(1046, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickstone", "", ItemTab.BLOCK, false, true, 228, -1, new String[]{"Blue"}));
        stone.addBrick(singleton.createBrick(561, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickstone", "", ItemTab.BACKGROUND, false, false, 61, -1, new String[]{"Dark", "Gray", "Grey"}));
        stone.addBrick(singleton.createBrick(562, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickstone", "", ItemTab.BACKGROUND, false, false, 62, -1, new String[]{"Half", "Dark", "Gray", "Grey"}));
        stone.addBrick(singleton.createBrick(688, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickstone", "", ItemTab.BACKGROUND, false, false, 182, -1, new String[]{"Green", "Limestone"}));
        stone.addBrick(singleton.createBrick(689, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickstone", "", ItemTab.BACKGROUND, false, false, 183, -1, new String[]{"Half", "Limestone"}));
        stone.addBrick(singleton.createBrick(690, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickstone", "", ItemTab.BACKGROUND, false, false, 184, -1, new String[]{"Brown"}));
        stone.addBrick(singleton.createBrick(691, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickstone", "", ItemTab.BACKGROUND, false, false, 185, -1, new String[]{"Half", "Brown"}));
        stone.addBrick(singleton.createBrick(692, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickstone", "", ItemTab.BACKGROUND, false, false, 186, -1, new String[]{"Blue"}));
        stone.addBrick(singleton.createBrick(693, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickstone", "", ItemTab.BACKGROUND, false, false, 187, -1, new String[]{"Half"}));
        singleton.brickPackages.add(stone);


        ItemBrickPackage dojo = new ItemBrickPackage("dojo", "Dojo Pack", new String[]{"Ninja", "Asian", "Japanese", "Kung Fu"});
        dojo.addBrick(singleton.createBrick(96, ItemLayer.DECORATION, singleton.blocksBMD, "brickninja", "", ItemTab.BLOCK, false, true, 96, 0x0, new String[]{"Platform", "White", "One-way", "One way"}));
        dojo.addBrick(singleton.createBrick(97, ItemLayer.DECORATION, singleton.blocksBMD, "brickninja", "", ItemTab.BLOCK, false, true, 97, 0x0, new String[]{"Platform", "Gray", "Grey", "One-way", "One way"}));
        dojo.addBrick(singleton.createBrick(564, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickninja", "", ItemTab.BACKGROUND, false, true, 64, -1, new String[]{"White"}));
        dojo.addBrick(singleton.createBrick(565, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickninja", "", ItemTab.BACKGROUND, false, true, 65, -1, new String[]{"Grey", "Gray"}));
        dojo.addBrick(singleton.createBrick(566, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickninja", "", ItemTab.BACKGROUND, false, true, 66, -1, new String[]{"Roof", "Blue", "Tile", "Shingles", "House"}));
        dojo.addBrick(singleton.createBrick(567, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickninja", "", ItemTab.BACKGROUND, false, true, 67, -1, new String[]{"Roof", "Blue", "Dark", "Tile", "Shingles", "House"}));
        dojo.addBrick(singleton.createBrick(667, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickninja", "", ItemTab.BACKGROUND, false, false, 161, -1, new String[]{"Roof", "Red", "Tile", "Shingles", "House"}));
        dojo.addBrick(singleton.createBrick(668, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickninja", "", ItemTab.BACKGROUND, false, false, 162, -1, new String[]{"Roof", "Red", "Dark", "Tile", "Shingles", "House"}));
        dojo.addBrick(singleton.createBrick(669, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickninja", "", ItemTab.BACKGROUND, false, false, 163, -1, new String[]{"Roof", "Green", "Tile", "Shingles", "House"}));
        dojo.addBrick(singleton.createBrick(670, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickninja", "", ItemTab.BACKGROUND, false, false, 164, -1, new String[]{"Roof", "Green", "Dark", "Tile", "Shingles", "House"}));
        dojo.addBrick(singleton.createBrick(ItemId.DOJO_LIGHT_LEFT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 389, 0x0, new String[]{"Morphable", "Fin", "Left", "Blue", "Green", "Red", "Corner"}));
        dojo.addBrick(singleton.createBrick(ItemId.DOJO_LIGHT_RIGHT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 392, 0x0, new String[]{"Morphable", "Fin", "Right", "Blue", "Green", "Red", "Corner"}));
        dojo.addBrick(singleton.createBrick(278, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 278 - 128, 0x0, new String[]{"Window", "Open", "House"}));
        dojo.addBrick(singleton.createBrick(ItemId.DOJO_DARK_LEFT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 395, 0x0, new String[]{"Morphable", "Fin", "Left", "Dark", "Blue", "Green", "Red", "Corner"}));
        dojo.addBrick(singleton.createBrick(ItemId.DOJO_DARK_RIGHT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 398, 0x0, new String[]{"Morphable", "Fin", "Right", "Dark", "Blue", "Green", "Red", "Corner"}));
        dojo.addBrick(singleton.createBrick(281, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 281 - 128, 0x0, new String[]{"Window", "Dark", "Open", "House"}));
        dojo.addBrick(singleton.createBrick(282, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 282 - 128, 0x0, new String[]{"Character", "Chinese"}));
        dojo.addBrick(singleton.createBrick(283, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 283 - 128, 0x0, new String[]{"Character", "Chinese"}));
        dojo.addBrick(singleton.createBrick(284, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickninja", "", ItemTab.DECORATIVE, false, false, 284 - 128, 0x0, new String[]{"Yin Yang", "Chinese", "White", "Black white"}));
        singleton.brickPackages.add(dojo);

        ItemBrickPackage cowboy = new ItemBrickPackage("wild west", "Wild West Pack", new String[]{"Cowboy", "Western", "House"});
        cowboy.addBrick(singleton.createBrick(122, ItemLayer.DECORATION, singleton.blocksBMD, "brickcowboy", "", ItemTab.BLOCK, false, true, 99, 0x0, new String[]{"Brown", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(singleton.createBrick(123, ItemLayer.DECORATION, singleton.blocksBMD, "brickcowboy", "", ItemTab.BLOCK, false, true, 100, 0x0, new String[]{"Red", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(singleton.createBrick(124, ItemLayer.DECORATION, singleton.blocksBMD, "brickcowboy", "", ItemTab.BLOCK, false, true, 101, 0x0, new String[]{"Blue", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(singleton.createBrick(125, ItemLayer.DECORATION, singleton.blocksBMD, "brickcowboy", "", ItemTab.BLOCK, false, true, 102, 0x0, new String[]{"Dark", "Brown", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(singleton.createBrick(126, ItemLayer.DECORATION, singleton.blocksBMD, "brickcowboy", "", ItemTab.BLOCK, false, true, 103, 0x0, new String[]{"Dark", "Red", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(singleton.createBrick(127, ItemLayer.DECORATION, singleton.blocksBMD, "brickcowboy", "", ItemTab.BLOCK, false, true, 104, 0x0, new String[]{"Dark", "Blue", "Wood", "Platform", "One way", "One-Way"}));
        cowboy.addBrick(singleton.createBrick(568, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcowboy", "", ItemTab.BACKGROUND, false, true, 68, -1, new String[]{"Siding", "Wood", "Brown", "Planks", "Ship", "Board"}));
        cowboy.addBrick(singleton.createBrick(569, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcowboy", "", ItemTab.BACKGROUND, false, true, 69, -1, new String[]{"Siding", "Wood", "Dark Brown", "Planks", "Ship", "Board"}));
        cowboy.addBrick(singleton.createBrick(570, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcowboy", "", ItemTab.BACKGROUND, false, true, 70, -1, new String[]{"Siding", "Wood", "Red", "Planks", "Board", "Board"}));
        cowboy.addBrick(singleton.createBrick(571, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcowboy", "", ItemTab.BACKGROUND, false, true, 71, -1, new String[]{"Siding", "Wood", "Dark Red", "Planks", "Board"}));
        cowboy.addBrick(singleton.createBrick(572, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcowboy", "", ItemTab.BACKGROUND, false, true, 72, -1, new String[]{"Siding", "Wood", "Blue", "Planks", "Board"}));
        cowboy.addBrick(singleton.createBrick(573, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcowboy", "", ItemTab.BACKGROUND, false, true, 73, -1, new String[]{"Siding", "Wood", "Dark Blue", "Planks", "Board"}));
        cowboy.addBrick(singleton.createBrick(285, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, true, 285 - 128, 0x0, new String[]{"Pole", "White"}));
        cowboy.addBrick(singleton.createBrick(286, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, true, 286 - 128, 0x0, new String[]{"Pole", "Gray", "Dark", "Grey"}));
        cowboy.addBrick(singleton.createBrick(1521, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, true, 321, 0x0, new String[]{"Pole", "White"}));
        cowboy.addBrick(singleton.createBrick(1522, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, true, 322, 0x0, new String[]{"Pole", "Gray", "Dark", "Grey"}));
        cowboy.addBrick(singleton.createBrick(287, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 287 - 128, 0x0, new String[]{"Door", "Wood", "Brown", "Left"}));
        cowboy.addBrick(singleton.createBrick(288, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 288 - 128, 0x0, new String[]{"Door", "Wood", "Brown", "Right"}));
        cowboy.addBrick(singleton.createBrick(289, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 289 - 128, 0x0, new String[]{"Door", "Wood", "Red", "Left"}));
        cowboy.addBrick(singleton.createBrick(290, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 290 - 128, 0x0, new String[]{"Door", "Wood", "Red", "Right"}));
        cowboy.addBrick(singleton.createBrick(291, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 291 - 128, 0x0, new String[]{"Door", "Wood", "Blue", "Left"}));
        cowboy.addBrick(singleton.createBrick(292, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 292 - 128, 0x0, new String[]{"Door", "Wood", "Blue", "Right"}));
        cowboy.addBrick(singleton.createBrick(293, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 293 - 128, 0x0, new String[]{"Window", "Curtains"}));
        cowboy.addBrick(singleton.createBrick(294, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 294 - 128, 0x0, new String[]{"Fence", "Wood", "Brown"}));
        cowboy.addBrick(singleton.createBrick(295, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 295 - 128, 0x0, new String[]{"Fence", "Wood", "Brown"}));
        cowboy.addBrick(singleton.createBrick(296, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 296 - 128, 0x0, new String[]{"Fence", "Wood", "Red"}));
        cowboy.addBrick(singleton.createBrick(297, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 297 - 128, 0x0, new String[]{"Fence", "Wood", "Red"}));
        cowboy.addBrick(singleton.createBrick(298, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 298 - 128, 0x0, new String[]{"Fence", "Wood", "Blue"}));
        cowboy.addBrick(singleton.createBrick(299, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickcowboy", "", ItemTab.DECORATIVE, false, false, 299 - 128, 0x0, new String[]{"Fence", "Wood", "Blue"}));
        singleton.brickPackages.add(cowboy);
    }

    private static void initRest2() {

        ItemBrickPackage plastic = new ItemBrickPackage("plastic", "Plastic Pack", new String[]{"Neon", "Bright"});
        plastic.addBrick(singleton.createBrick(129, ItemLayer.DECORATION, singleton.blocksBMD, "brickplastic", "", ItemTab.BLOCK, false, true, 106, -1, new String[]{"Red"}));
        plastic.addBrick(singleton.createBrick(135, ItemLayer.DECORATION, singleton.blocksBMD, "brickplastic", "", ItemTab.BLOCK, false, true, 112, -1, new String[]{"Orange"}));
        plastic.addBrick(singleton.createBrick(130, ItemLayer.DECORATION, singleton.blocksBMD, "brickplastic", "", ItemTab.BLOCK, false, true, 107, -1, new String[]{"Yellow"}));
        plastic.addBrick(singleton.createBrick(128, ItemLayer.DECORATION, singleton.blocksBMD, "brickplastic", "", ItemTab.BLOCK, false, true, 105, -1, new String[]{"Green", "Light Green", "Lime"}));
        plastic.addBrick(singleton.createBrick(134, ItemLayer.DECORATION, singleton.blocksBMD, "brickplastic", "", ItemTab.BLOCK, false, true, 111, -1, new String[]{"Green"}));
        plastic.addBrick(singleton.createBrick(131, ItemLayer.DECORATION, singleton.blocksBMD, "brickplastic", "", ItemTab.BLOCK, false, true, 108, -1, new String[]{"Light Blue", "Cyan"}));
        plastic.addBrick(singleton.createBrick(132, ItemLayer.DECORATION, singleton.blocksBMD, "brickplastic", "", ItemTab.BLOCK, false, true, 109, -1, new String[]{"Blue", "Indigo"}));
        plastic.addBrick(singleton.createBrick(133, ItemLayer.DECORATION, singleton.blocksBMD, "brickplastic", "", ItemTab.BLOCK, false, true, 110, -1, new String[]{"Purple", "Magenta", "Pink"}));
        singleton.brickPackages.add(plastic);

        ItemBrickPackage water = new ItemBrickPackage("water", "Water pack", new String[]{"Sea", "Ocean", "Nature", "Environment"});
//			water.addBrick(singleton.createBrick(ItemId.WATER, ItemLayer.ABOVE, singleton.waterBMD, "", ItemTab.ACTION,false,false,0,0x0))
        water.addBrick(singleton.createBrick(ItemId.WAVE, ItemLayer.ABOVE, singleton.specialBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 234, 0x0, new String[]{"Waves", "Animated"}));
        water.addBrick(singleton.createBrick(574, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 74, 0xFF75DAE7));
        water.addBrick(singleton.createBrick(575, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 75, 0xFF75DAE7, new String[]{"Octopus", "Squid"}));
        water.addBrick(singleton.createBrick(576, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 76, 0xFF75DAE7, new String[]{"Fish"}));
        water.addBrick(singleton.createBrick(577, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 77, 0xFF75DAE7, new String[]{"Seahorse"}));
        water.addBrick(singleton.createBrick(578, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 78, 0xFF75DAE7, new String[]{"Seaweed", "Plant", "Algae"}));
        singleton.brickPackages.add(water);

        ItemBrickPackage sand = new ItemBrickPackage("sand", "Sand Pack", new String[]{"Desert", "Beach", "Environment", "Soil"});
        sand.addBrick(singleton.createBrick(137, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksand", "", ItemTab.BLOCK, false, true, 114, -1, new String[]{"White", "Beige"}));
        sand.addBrick(singleton.createBrick(138, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksand", "", ItemTab.BLOCK, false, true, 115, -1, new String[]{"Grey", "Gray"}));
        sand.addBrick(singleton.createBrick(139, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksand", "", ItemTab.BLOCK, false, true, 116, -1, new String[]{"Yellow"}));
        sand.addBrick(singleton.createBrick(140, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksand", "", ItemTab.BLOCK, false, true, 117, -1, new String[]{"Yellow", "Orange"}));
        sand.addBrick(singleton.createBrick(141, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksand", "", ItemTab.BLOCK, false, true, 118, -1, new String[]{"Brown", "Light"}));
        sand.addBrick(singleton.createBrick(142, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksand", "", ItemTab.BLOCK, false, true, 119, -1, new String[]{"Brown", "Dark", "Dirt"}));
        sand.addBrick(singleton.createBrick(579, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksand", "", ItemTab.BACKGROUND, false, false, 79, -1, new String[]{"Off-white"}));
        sand.addBrick(singleton.createBrick(580, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksand", "", ItemTab.BACKGROUND, false, false, 80, -1, new String[]{"Gray", "Grey"}));
        sand.addBrick(singleton.createBrick(581, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksand", "", ItemTab.BACKGROUND, false, false, 81, -1, new String[]{"Yellow"}));
        sand.addBrick(singleton.createBrick(582, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksand", "", ItemTab.BACKGROUND, false, false, 82, -1, new String[]{"Orange", "Yellow"}));
        sand.addBrick(singleton.createBrick(583, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksand", "", ItemTab.BACKGROUND, false, false, 83, -1, new String[]{"Brown", "Light"}));
        sand.addBrick(singleton.createBrick(584, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksand", "", ItemTab.BACKGROUND, false, false, 84, -1, new String[]{"Brown", "Dark"}));
        sand.addBrick(singleton.createBrick(301, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksand", "", ItemTab.DECORATIVE, false, false, 300 - 128, 0x0, new String[]{"White"}));
        sand.addBrick(singleton.createBrick(302, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksand", "", ItemTab.DECORATIVE, false, false, 301 - 128, 0x0, new String[]{"Gray", "Grey"}));
        sand.addBrick(singleton.createBrick(303, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksand", "", ItemTab.DECORATIVE, false, false, 302 - 128, 0x0, new String[]{"Yellow"}));
        sand.addBrick(singleton.createBrick(304, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksand", "", ItemTab.DECORATIVE, false, false, 303 - 128, 0x0, new String[]{"Yellow", "Orange"}));
        sand.addBrick(singleton.createBrick(305, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksand", "", ItemTab.DECORATIVE, false, false, 304 - 128, 0x0, new String[]{"Brown", "Light"}));
        sand.addBrick(singleton.createBrick(306, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksand", "", ItemTab.DECORATIVE, false, false, 305 - 128, 0x0, new String[]{"Brown", "Dark"}));
        singleton.brickPackages.add(sand);

        ItemBrickPackage summer2012 = new ItemBrickPackage("summer 2012", "Summer pack 2012", new String[]{"Season", "Beach"});
        summer2012.addBrick(singleton.createBrick(307, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2012", "", ItemTab.DECORATIVE, false, false, 306 - 128, 0x0, new String[]{"Beach", "Ball", "Toy", "Ball"}));
        summer2012.addBrick(singleton.createBrick(308, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2012", "", ItemTab.DECORATIVE, false, false, 307 - 128, 0x0, new String[]{"Pail", "Bucket", "Toy", "Sand"}));
        summer2012.addBrick(singleton.createBrick(309, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2012", "", ItemTab.DECORATIVE, false, false, 308 - 128, 0x0, new String[]{"Shovel", "Dig", "Toy", "Sand"}));
        summer2012.addBrick(singleton.createBrick(310, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2012", "", ItemTab.DECORATIVE, false, false, 309 - 128, 0x0, new String[]{"Drink", "Margarita", "Umbrella", "Cocktail", "Glass", "Cup"}));
        singleton.brickPackages.add(summer2012);

        ItemBrickPackage cloud = new ItemBrickPackage("cloud", "Cloud Pack", new String[]{"Sky", "Environment"});
        cloud.addBrick(singleton.createBrick(143, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, false, 120, -1, new String[]{"Center", "Middle", "White"}));
        cloud.addBrick(singleton.createBrick(311, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 310 - 128, 0x0, new String[]{"Top", "Side", "White"}));
        cloud.addBrick(singleton.createBrick(312, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 311 - 128, 0x0, new String[]{"Bottom", "Side", "White"}));
        cloud.addBrick(singleton.createBrick(313, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 312 - 128, 0x0, new String[]{"Left", "Side", "White"}));
        cloud.addBrick(singleton.createBrick(314, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 313 - 128, 0x0, new String[]{"Right", "Side", "White"}));
        cloud.addBrick(singleton.createBrick(315, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 314 - 128, 0x0, new String[]{"Top right", "Corner", "White"}));
        cloud.addBrick(singleton.createBrick(316, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 315 - 128, 0x0, new String[]{"Top left", "Corner", "White"}));
        cloud.addBrick(singleton.createBrick(317, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 316 - 128, 0x0, new String[]{"Bottom left", "Corner", "White"}));
        cloud.addBrick(singleton.createBrick(318, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 317 - 128, 0x0, new String[]{"Bottom right", "Corner", "White"}));

        cloud.addBrick(singleton.createBrick(1126, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, false, 287, -1, new String[]{"Center", "Middle", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(singleton.createBrick(1523, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 323, 0x0, new String[]{"Top", "Side", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(singleton.createBrick(1524, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 324, 0x0, new String[]{"Bottom", "Side", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(singleton.createBrick(1525, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 325, 0x0, new String[]{"Left", "Side", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(singleton.createBrick(1526, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 326, 0x0, new String[]{"Right", "Side", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(singleton.createBrick(1527, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 327, 0x0, new String[]{"Top right", "Corner", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(singleton.createBrick(1528, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 328, 0x0, new String[]{"Top left", "Corner", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(singleton.createBrick(1529, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 329, 0x0, new String[]{"Bottom left", "Corner", "Dark", "Grey", "Gray", "Storm"}));
        cloud.addBrick(singleton.createBrick(1530, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 330, 0x0, new String[]{"Bottom right", "Corner", "Dark", "Grey", "Gray", "Storm"}));
        singleton.brickPackages.add(cloud);

        ItemBrickPackage industrial = new ItemBrickPackage("industrial", "Industrial Package", new String[]{"Factory"});
        industrial.addBrick(singleton.createBrick(144, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 121, -1, new String[]{"Diamond plating", "Plate", "Metal"}));
        industrial.addBrick(singleton.createBrick(145, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 122, -1, new String[]{"Wiring", "Wires", "Metal"}));
        industrial.addBrick(singleton.createBrick(585, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickindustrial", "", ItemTab.BACKGROUND, false, false, 85, -1, new String[]{"Plate", "Metal"}));
        industrial.addBrick(singleton.createBrick(586, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickindustrial", "", ItemTab.BACKGROUND, false, false, 86, -1, new String[]{"Gray", "Steel", "Plate", "Metal"}));
        industrial.addBrick(singleton.createBrick(587, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickindustrial", "", ItemTab.BACKGROUND, false, false, 87, -1, new String[]{"Blue", "Cyan", "Plate", "Metal"}));
        industrial.addBrick(singleton.createBrick(588, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickindustrial", "", ItemTab.BACKGROUND, false, false, 88, -1, new String[]{"Green", "Plate", "Metal"}));
        industrial.addBrick(singleton.createBrick(589, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickindustrial", "", ItemTab.BACKGROUND, false, false, 89, -1, new String[]{"Yellow", "Orange", "Plate", "Metal"}));
        industrial.addBrick(singleton.createBrick(146, ItemLayer.DECORATION, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 123, 0x0, new String[]{"Platform", "One-Way", "One Way", "Metal"}));
        industrial.addBrick(singleton.createBrick(147, ItemLayer.DECORATION, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 124, 0x0, new String[]{"Scissor", "Scaffolding", "X", "Metal"}));
        industrial.addBrick(singleton.createBrick(1133, ItemLayer.DECORATION, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 294, 0x0, new String[]{"Scissor", "Scaffolding", "X", "Metal"}));
        industrial.addBrick(singleton.createBrick(148, ItemLayer.DECORATION, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 125, 0x0, new String[]{"Lift", "Table", "Piston", "Metal"}));
        industrial.addBrick(singleton.createBrick(ItemId.INDUSTRIAL_TABLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 712, 0x0, new String[]{"Lift", "Table", "Piston", "Metal", "Morphable"}));
        industrial.addBrick(singleton.createBrick(149, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 126, -1, new String[]{"Tube", "Plate", "Piston", "Metal"}));
        industrial.addBrick(singleton.createBrick(1127, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 288, -1, new String[]{"Tube", "Plate", "Piston", "Metal"}));
        industrial.addBrick(singleton.createBrick(ItemId.INDUSTRIAL_PIPE_THICK, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 710, 0x0, new String[]{"Thick", "Pipe", "Metal", "Morphable"}));
        industrial.addBrick(singleton.createBrick(150, ItemLayer.DECORATION, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 127, -1, new String[]{"Conveyor belt", "Left", "Metal"}));
        industrial.addBrick(singleton.createBrick(151, ItemLayer.DECORATION, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 128, -1, new String[]{"Conveyor belt", "Middle", "Metal"}));
        industrial.addBrick(singleton.createBrick(152, ItemLayer.DECORATION, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 129, -1, new String[]{"Conveyor belt", "Middle", "Metal"}));
        industrial.addBrick(singleton.createBrick(153, ItemLayer.DECORATION, singleton.blocksBMD, "brickindustrial", "", ItemTab.BLOCK, false, true, 130, -1, new String[]{"Conveyor belt", "Right", "Metal"}));
        industrial.addBrick(singleton.createBrick(319, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickindustrial", "", ItemTab.DECORATIVE, false, true, 190, 0x0, new String[]{"Caution", "Warning", "Fire", "Flame", "Sign", "Alert"}));
        industrial.addBrick(singleton.createBrick(320, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickindustrial", "", ItemTab.DECORATIVE, false, true, 191, 0x0, new String[]{"Caution", "Warning", "Death", "Toxin", "Poison", "Sign", "Alert"}));
        industrial.addBrick(singleton.createBrick(321, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickindustrial", "", ItemTab.DECORATIVE, false, true, 192, 0x0, new String[]{"Caution", "Warning", "Electricity", "Lightning", "Sign", "Alert"}));
        industrial.addBrick(singleton.createBrick(322, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickindustrial", "", ItemTab.DECORATIVE, false, true, 193, 0x0, new String[]{"Caution", "Warning", "No", "Do not enter", "X", "Sign", "Alert"}));
        industrial.addBrick(singleton.createBrick(323, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickindustrial", "", ItemTab.DECORATIVE, false, true, 194, 0x0, new String[]{"Caution", "Warning", "Horizontal", "Stripes", "Hazard", "Pole", "Alert"}));
        industrial.addBrick(singleton.createBrick(324, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickindustrial", "", ItemTab.DECORATIVE, false, true, 195, 0x0, new String[]{"Caution", "Warning", "Vertical", "Stripes", "Hazard", "Pole", "Alert"}));
        industrial.addBrick(singleton.createBrick(ItemId.INDUSTRIAL_PIPE_THIN, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickindustrial", "", ItemTab.DECORATIVE, false, true, 708, 0x0, new String[]{"Thin", "Pipe", "Metal", "Morphable"}));

        singleton.brickPackages.add(industrial);

        ItemBrickPackage clay = new ItemBrickPackage("clay", "Clay Backgrounds", new String[]{"House"});
        clay.addBrick(singleton.createBrick(594, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 94, -1, new String[]{"White", "Tile", "Bathroom"}));
        clay.addBrick(singleton.createBrick(595, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 95, -1, new String[]{"Brick", "Tile", "Bathroom"}));
        clay.addBrick(singleton.createBrick(596, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 96, -1, new String[]{"Diamond", "Chisel", "Tile", "Bathroom"}));
        clay.addBrick(singleton.createBrick(597, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 97, -1, new String[]{"X", "Cross", "Chisel", "Bathroom", "Tile"}));
        clay.addBrick(singleton.createBrick(598, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 98, -1, new String[]{"Rough", "Natural"}));
        singleton.brickPackages.add(clay);

        ItemBrickPackage medieval = new ItemBrickPackage("medieval", "Medieval", new String[]{"Castle"});
        medieval.addBrick(singleton.createBrick(158, ItemLayer.DECORATION, singleton.blocksBMD, "brickmedieval", "", ItemTab.BLOCK, false, true, 132, 0x0, new String[]{"Platform", "Stone"}));
        medieval.addBrick(singleton.createBrick(159, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmedieval", "", ItemTab.BLOCK, false, true, 133, -1, new String[]{"Brick", "Stone"}));
        medieval.addBrick(singleton.createBrick(160, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmedieval", "", ItemTab.BLOCK, false, true, 134, -1, new String[]{"Brick", "Arrow slit", "Stone", "Window"}));
        medieval.addBrick(singleton.createBrick(599, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmedieval", "", ItemTab.BACKGROUND, false, false, 99, -1, new String[]{"Anvil", "Blacksmith"}));
        medieval.addBrick(singleton.createBrick(325, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, true, 196, 0x0, new String[]{"Brick", "Stone", "House"}));
        medieval.addBrick(singleton.createBrick(326, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, false, 197, -1, new String[]{"Top", "Display", "Stone"}));
        medieval.addBrick(singleton.createBrick(162, ItemLayer.DECORATION, singleton.blocksBMD, "brickmedieval", "", ItemTab.BLOCK, false, true, 136, 0x0, new String[]{"Parapet", "Stone"}));
        medieval.addBrick(singleton.createBrick(163, ItemLayer.DECORATION, singleton.blocksBMD, "brickmedieval", "", ItemTab.BLOCK, false, true, 137, 0x0, new String[]{"Barrel", "Keg"}));
        medieval.addBrick(singleton.createBrick(437, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, false, 279, 0x0, new String[]{"Window", "Wood", "House"}));
        medieval.addBrick(singleton.createBrick(600, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmedieval", "", ItemTab.BACKGROUND, false, false, 100, -1, new String[]{"Wood", "Planks", "Vertical", "Brown", "House"}));
        medieval.addBrick(singleton.createBrick(590, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmedieval", "", ItemTab.BACKGROUND, false, false, 90, -1, new String[]{"Straw", "Hay", "Roof", "House"}));
        medieval.addBrick(singleton.createBrick(591, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmedieval", "", ItemTab.BACKGROUND, false, false, 91, -1, new String[]{"Roof", "Shingles", "Scales", "Red", "House"}));
        medieval.addBrick(singleton.createBrick(592, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmedieval", "", ItemTab.BACKGROUND, false, false, 92, -1, new String[]{"Roof", "Shingles", "Scales", "Green", "House"}));
        medieval.addBrick(singleton.createBrick(556, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmedieval", "", ItemTab.BACKGROUND, false, false, 56, -1, new String[]{"Roof", "Shingles", "Scales", "Brown", "House"}));
        medieval.addBrick(singleton.createBrick(593, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmedieval", "", ItemTab.BACKGROUND, false, false, 93, -1, new String[]{"Gray", "Dry wall", "Stucco", "Grey", "House", "Beige"}));
        medieval.addBrick(singleton.createBrick(ItemId.MEDIEVAL_TIMBER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, false, 417, 0x0, new String[]{"Scaffolding", "Wood", "Morphable", "Fence", "House", "Design"}));
        medieval.addBrick(singleton.createBrick(330, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, true, 201, 0x0, new String[]{"Shield", "Warrior", "Weapon"}));
        medieval.addBrick(singleton.createBrick(ItemId.MEDIEVAL_AXE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, true, 365, 0x0, new String[]{"Axe", "Morphable", "Warrior", "Weapon"}));
        medieval.addBrick(singleton.createBrick(ItemId.MEDIEVAL_SWORD, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, true, 377, 0x0, new String[]{"Sword", "Morphable", "Warrior", "Weapon"}));
        medieval.addBrick(singleton.createBrick(ItemId.MEDIEVAL_SHIELD, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, true, 373, 0x0, new String[]{"Shield", "Morphable", "Blue", "Green", "Yellow", "Red", "Circle"}));
        medieval.addBrick(singleton.createBrick(ItemId.MEDIEVAL_COATOFARMS, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, true, 405, 0x0, new String[]{"Shield", "Morphable", "Blue", "Green", "Yellow", "Red"}));
        medieval.addBrick(singleton.createBrick(ItemId.MEDIEVAL_BANNER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmedieval", "", ItemTab.DECORATIVE, false, true, 369, 0x0, new String[]{"Banner", "Morphable", "Blue", "Green", "Yellow", "Red", "Flag"}));
        singleton.brickPackages.add(medieval);

        ItemBrickPackage plasticpipes = new ItemBrickPackage("pipes", "Pipes", new String[]{"Orange"});
        plasticpipes.addBrick(singleton.createBrick(166, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 140, -1, new String[]{"Left"}));
        plasticpipes.addBrick(singleton.createBrick(167, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 141, -1, new String[]{"Horizontal"}));
        plasticpipes.addBrick(singleton.createBrick(168, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 142, -1, new String[]{"Right"}));
        plasticpipes.addBrick(singleton.createBrick(169, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 143, -1, new String[]{"Up"}));
        plasticpipes.addBrick(singleton.createBrick(170, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 144, -1, new String[]{"Vertical"}));
        plasticpipes.addBrick(singleton.createBrick(171, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 145, -1, new String[]{"Down"}));
        singleton.brickPackages.add(plasticpipes);

        ItemBrickPackage outerSpace = new ItemBrickPackage("outer space", "Outer Space", new String[]{"Ship", "Aliens", "UFO", "Sci-Fi", "Science Fiction", "Void"});
        outerSpace.addBrick(singleton.createBrick(172, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 146, -1, new String[]{"White", "Metal", "Plate"}));
        outerSpace.addBrick(singleton.createBrick(173, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 147, -1, new String[]{"Blue", "Metal", "Plate"}));
        outerSpace.addBrick(singleton.createBrick(174, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 148, -1, new String[]{"Green", "Metal", "Plate"}));
        outerSpace.addBrick(singleton.createBrick(175, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 149, -1, new String[]{"Red", "Magenta", "Metal", "Plate", "Pink"}));
        outerSpace.addBrick(singleton.createBrick(176, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 150, 0xFFFFAB44, new String[]{"Sand", "Mars", "Orange"}));
        outerSpace.addBrick(singleton.createBrick(1029, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 214, -1, new String[]{"Moon", "Rock", "Stone", "Metal", "Grey", "Gray"}));
        outerSpace.addBrick(singleton.createBrick(601, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 101, -1, new String[]{"White", "Grey", "Gray", "Metal"}));
        outerSpace.addBrick(singleton.createBrick(602, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 102, -1, new String[]{"Blue", "Metal"}));
        outerSpace.addBrick(singleton.createBrick(603, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 103, -1, new String[]{"Green", "Metal"}));
        outerSpace.addBrick(singleton.createBrick(604, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 104, -1, new String[]{"Red", "Metal"}));
        outerSpace.addBrick(singleton.createBrick(332, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 203, 0x0, new String[]{"Sign", "Panel", "Computer", "Green"}));
        outerSpace.addBrick(singleton.createBrick(333, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 204, 0x0, new String[]{"Red", "Dot", "Light", "Lamp", "Circle"}));
        outerSpace.addBrick(singleton.createBrick(334, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 205, 0x0, new String[]{"Blue", "Dot", "Light", "Lamp", "Circle"}));
        outerSpace.addBrick(singleton.createBrick(1567, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 352, 0x0, new String[]{"Green", "Dot", "Light", "Lamp", "Circle"}));
        outerSpace.addBrick(singleton.createBrick(1568, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 353, 0x0, new String[]{"Yellow", "Dot", "Light", "Lamp", "Circle"}));
        outerSpace.addBrick(singleton.createBrick(1623, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 366, 0x0, new String[]{"Magenta", "Pink", "Purple", "Dot", "Light", "Lamp", "Circle", "Orb", "Button"}));
        outerSpace.addBrick(singleton.createBrick(1624, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 367, 0x0, new String[]{"Cyan", "Dot", "Light", "Lamp", "Circle", "Orb", "Button"}));
        outerSpace.addBrick(singleton.createBrick(335, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 206, 0x0, new String[]{"Computer", "Control panel", "System"}));
        outerSpace.addBrick(singleton.createBrick(428, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 270, 0x0, new String[]{"Star", "Shiny", "Red", "Light", "Night", "Sky", "Big"}));
        outerSpace.addBrick(singleton.createBrick(429, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 271, 0x0, new String[]{"Star", "Shiny", "Blue", "Light", "Night", "Sky", "Medium"}));
        outerSpace.addBrick(singleton.createBrick(430, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 272, 0x0, new String[]{"Star", "Shiny", "Yellow", "Light", "Night", "Sky", "Small"}));
        outerSpace.addBrick(singleton.createBrick(331, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 202, 0x0, new String[]{"Rock", "Hard", "Gray", "Grey", "Boulder", "Stone", "Environment"}));
        singleton.brickPackages.add(outerSpace);

        ItemBrickPackage desert = new ItemBrickPackage("desert", "Desert Pack", new String[]{"Environment"});
        desert.addBrick(singleton.createBrick(177, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 151, 0xFFDD943B, new String[]{"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(singleton.createBrick(178, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 152, 0xFFC68534, new String[]{"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(singleton.createBrick(179, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 153, 0xFF916127, new String[]{"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(singleton.createBrick(180, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 154, -1, new String[]{"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(singleton.createBrick(181, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 155, -1, new String[]{"Mars", "Orange", "Sandstone", "Ground", "Soil", "Dirt", "Rocky", "Space"}));
        desert.addBrick(singleton.createBrick(336, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 207, 0x0, new String[]{"Rock", "Orange", "Sandstone", "Boulder", "Space"}));
        desert.addBrick(singleton.createBrick(425, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 267, 0x0, new String[]{"Cactus", "Nature", "Plant", "Western"}));
        desert.addBrick(singleton.createBrick(426, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 268, 0x0, new String[]{"Bush", "Cactus", "Nature", "Plant", "Western"}));
        desert.addBrick(singleton.createBrick(427, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 269, 0x0, new String[]{"Tree", "Nature", "Plant", "Bush", "Western", "Bonsai"}));
        desert.addBrick(singleton.createBrick(699, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 193, -1, new String[]{"Brown", "Dirt", "Soil", "Sandstone"}));
        desert.addBrick(singleton.createBrick(700, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 194, -1, new String[]{"Brown", "Dirt", "Soil", "Sandstone"}));
        desert.addBrick(singleton.createBrick(701, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 195, -1, new String[]{"Brown", "Dirt", "Soil", "Sandstone"}));
        singleton.brickPackages.add(desert);
    }

    private static void initRest3() {

        ItemBrickPackage neon = new ItemBrickPackage("neon", "Neon Backgrounds", new String[]{"Solid"});
        neon.addBrick(singleton.createBrick(675, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickneon", "", ItemTab.BACKGROUND, false, true, 169, -1, new String[]{"Magenta", "Pink", "Red"}));
        neon.addBrick(singleton.createBrick(673, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickneon", "", ItemTab.BACKGROUND, false, true, 167, -1, new String[]{"Orange", "Fire"}));
        neon.addBrick(singleton.createBrick(697, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickneon", "", ItemTab.BACKGROUND, false, true, 191, -1, new String[]{"Yellow"}));
        neon.addBrick(singleton.createBrick(674, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickneon", "", ItemTab.BACKGROUND, false, true, 168, -1, new String[]{"Green", "Jungle"}));
        neon.addBrick(singleton.createBrick(698, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickneon", "", ItemTab.BACKGROUND, false, true, 192, -1, new String[]{"Cyan"}));
        neon.addBrick(singleton.createBrick(605, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickneon", "", ItemTab.BACKGROUND, false, true, 105, -1, new String[]{"Blue", "Night", "Sky", "Dark"}));
        singleton.brickPackages.add(neon);

        ItemBrickPackage monster = new ItemBrickPackage("monster", "Monster", new String[]{"Creature"});
        monster.addBrick(singleton.createBrick(608, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmonster", "", ItemTab.BACKGROUND, false, true, 108, 0xFFA0A061, new String[]{"Green", "Grass"}));
        monster.addBrick(singleton.createBrick(609, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmonster", "", ItemTab.BACKGROUND, false, true, 109, 0xFF707044, new String[]{"Green", "Dark", "Grass"}));
        monster.addBrick(singleton.createBrick(663, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmonster", "", ItemTab.BACKGROUND, false, true, 157, -1, new String[]{"Red", "Pink", "Scales"}));
        monster.addBrick(singleton.createBrick(664, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmonster", "", ItemTab.BACKGROUND, false, false, 158, -1, new String[]{"Red", "Pink", "Dark", "Scales"}));
        monster.addBrick(singleton.createBrick(665, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmonster", "", ItemTab.BACKGROUND, false, false, 159, -1, new String[]{"Purple", "Scales", "Violet"}));
        monster.addBrick(singleton.createBrick(666, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmonster", "", ItemTab.BACKGROUND, false, false, 160, -1, new String[]{"Purple", "Scales", "Dark", "Violet"}));
        monster.addBrick(singleton.createBrick(ItemId.TOOTH_BIG, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmonster", "", ItemTab.DECORATIVE, false, false, 385, 0x0, new String[]{"Teeth", "Tooth", "Creepy", "Morphable", "Scary"}));
        monster.addBrick(singleton.createBrick(ItemId.TOOTH_SMALL, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmonster", "", ItemTab.DECORATIVE, false, false, 381, 0x0, new String[]{"Teeth", "Tooth", "Creepy", "Morphable", "Scary"}));
        monster.addBrick(singleton.createBrick(ItemId.TOOTH_TRIPLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmonster", "", ItemTab.DECORATIVE, false, false, 401, 0x0, new String[]{"Teeth", "Tooth", "Creepy", "Morphable", "Scary"}));
        monster.addBrick(singleton.createBrick(274, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickmonster", "", ItemTab.DECORATIVE, false, false, 146, 0x0, new String[]{"Eye", "Purple", "Circle", "Creepy", "Ball", "Scary"}));
        monster.addBrick(singleton.createBrick(341, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickmonster", "", ItemTab.DECORATIVE, false, false, 211, 0x0, new String[]{"Eye", "Yellow", "Circle", "Creepy", "Ball", "Scary"}));
        monster.addBrick(singleton.createBrick(342, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickmonster", "", ItemTab.DECORATIVE, false, false, 212, 0x0, new String[]{"Eye", "Blue", "Circle", "Creepy", "Ball", "Scary"}));
        singleton.brickPackages.add(monster);

        ItemBrickPackage fog = new ItemBrickPackage("fog", "Fog", new String[]{"Mist", "Transparent", "Damp", "Environment"});
        fog.addBrick(singleton.createBrick(343, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 213, 0x0, new String[]{"Center", "Middle"}));
        fog.addBrick(singleton.createBrick(344, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 214, 0x0, new String[]{"Bottom", "Side"}));
        fog.addBrick(singleton.createBrick(345, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 215, 0x0, new String[]{"Top", "Side"}));
        fog.addBrick(singleton.createBrick(346, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 216, 0x0, new String[]{"Left", "Side"}));
        fog.addBrick(singleton.createBrick(347, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 217, 0x0, new String[]{"Right", "Side"}));
        fog.addBrick(singleton.createBrick(348, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 218, 0x0, new String[]{"Top Right", "Corner"}));
        fog.addBrick(singleton.createBrick(349, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 219, 0x0, new String[]{"Top Left", "Corner"}));
        fog.addBrick(singleton.createBrick(350, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 220, 0x0, new String[]{"Bottom Left", "Corner"}));
        fog.addBrick(singleton.createBrick(351, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfog", "", ItemTab.DECORATIVE, false, false, 221, 0x0, new String[]{"Bottom Right", "Corner"}));
        singleton.brickPackages.add(fog);

        ItemBrickPackage halloween2012 = new ItemBrickPackage("halloween 2012", "Halloween 2012", new String[]{"Holiday", "Spooky"});
        halloween2012.addBrick(singleton.createBrick(352, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhw2012", "", ItemTab.DECORATIVE, false, true, 222, 0x0, new String[]{"Head", "Transfer", "Lamp", "Top"}));
        halloween2012.addBrick(singleton.createBrick(353, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickhw2012", "", ItemTab.DECORATIVE, false, false, 223, 0x0, new String[]{"Antenna", "Tesla coil", "Middle"}));
        halloween2012.addBrick(singleton.createBrick(354, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickhw2012", "", ItemTab.DECORATIVE, false, true, 224, 0x0, new String[]{"Wire", "Blue", "Red", "Electricity", "Wiring", "Power", "Vertical"}));
        halloween2012.addBrick(singleton.createBrick(355, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickhw2012", "", ItemTab.DECORATIVE, false, true, 225, 0x0, new String[]{"Wire", "Blue", "Red", "Electricity", "Wiring", "Power", "Horizontal"}));
        halloween2012.addBrick(singleton.createBrick(356, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhw2012", "", ItemTab.DECORATIVE, false, false, 226, 0x0, new String[]{"Lightning", "Storm", "Electricity", "Environment"}));
        singleton.brickPackages.add(halloween2012);

        ItemBrickPackage brickchecker = new ItemBrickPackage("checker", "Checker Blocks", new String[]{"Checkered"});
        brickchecker.addBrick(singleton.createBrick(1091, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 263, 0xFFBFBFBF, new String[]{"White", "Light"}));
        brickchecker.addBrick(singleton.createBrick(186, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 161, 0xff6B6B6B, new String[]{"Gray", "Grey"}));
        brickchecker.addBrick(singleton.createBrick(1026, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 213, -1, new String[]{"Black", "Dark", "Gray", "Grey"}));
        brickchecker.addBrick(singleton.createBrick(189, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 164, 0xffA8193F, new String[]{"Red", "Magenta"}));
        brickchecker.addBrick(singleton.createBrick(1025, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 212, -1, new String[]{"Orange"}));
        brickchecker.addBrick(singleton.createBrick(190, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 165, 0xffABB333, new String[]{"Yellow", "Lime"}));
        brickchecker.addBrick(singleton.createBrick(191, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 166, 0xff45A337, new String[]{"Green"}));
        brickchecker.addBrick(singleton.createBrick(192, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 167, 0xff3CB2AC, new String[]{"Cyan", "Blue"}));
        brickchecker.addBrick(singleton.createBrick(187, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 162, 0xff2F5391, new String[]{"Blue"}));
        brickchecker.addBrick(singleton.createBrick(188, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 163, 0xff803D91, new String[]{"Purple", "Magenta", "Pink", "Violet"}));
        singleton.brickPackages.add(brickchecker);

        ItemBrickPackage jungle = new ItemBrickPackage("jungle", "Jungle");
        jungle.addBrick(singleton.createBrick(193, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 168, 0x0, new String[]{"Idol", "Face", "Brick", "No show", "Statue", "Totem", "Ruins"}));
        jungle.addBrick(singleton.createBrick(194, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 169, 0x0, new String[]{"Platform", "Old", "Mossy", "Ruins", "Stone"}));
        jungle.addBrick(singleton.createBrick(195, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 170, 0xff99997A, new String[]{"Brick", "Grey", "Gray", "Ruins", "Stone"}));
        jungle.addBrick(singleton.createBrick(196, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 171, 0xffAC7061, new String[]{"Brick", "Red", "Pink", "Ruins", "Stone"}));
        jungle.addBrick(singleton.createBrick(197, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 172, 0xff62889A, new String[]{"Brick", "Blue", "Ruins", "Stone"}));
        jungle.addBrick(singleton.createBrick(198, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 173, 0xff878441, new String[]{"Brick", "Yellow", "Olive", "Ruins", "Stone", "Green"}));
        jungle.addBrick(singleton.createBrick(617, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 117, 0xff666651, new String[]{"Brick", "Grey", "Gray", "Ruins", "Stone"}));
        jungle.addBrick(singleton.createBrick(618, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 118, 0xff774E44, new String[]{"Brick", "Red", "Pink", "Ruins", "Stone"}));
        jungle.addBrick(singleton.createBrick(619, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 119, 0xff415A66, new String[]{"Brick", "Blue", "Ruins", "Stone"}));
        jungle.addBrick(singleton.createBrick(620, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 120, 0xff6B6834, new String[]{"Brick", "Yellow", "Olive", "Ruins", "Stone", "Green"}));
        jungle.addBrick(singleton.createBrick(199, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 176, 0x0, new String[]{"Pot", "Jar", "Clay", "Ruins", "Urn"}));
        jungle.addBrick(singleton.createBrick(621, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 121, 0xff688403, new String[]{"Leaves", "Green", "Grass", "Environment", "Nature"}));
        jungle.addBrick(singleton.createBrick(622, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 122, 0xff587003, new String[]{"Leaves", "Green", "Grass", "Environment", "Nature"}));
        jungle.addBrick(singleton.createBrick(623, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 123, 0xff425402, new String[]{"Leaves", "Green", "Grass", "Environment", "Nature"}));
        jungle.addBrick(singleton.createBrick(357, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 227, 0x0, new String[]{"Bush", "Plant", "Nature", "Environment"}));
        jungle.addBrick(singleton.createBrick(358, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 228, 0x0, new String[]{"Rock", "Pot", "Jar", "Basket", "Ruins", "Clay"}));
        jungle.addBrick(singleton.createBrick(359, ItemLayer.ABOVE, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 229, 0x0, new String[]{"Idol", "Statue", "Gold", "Trophy", "Artifact", "Artefact", "Yellow", "Ruins"}));
        singleton.brickPackages.add(jungle);

        ItemBrickPackage christmas2012 = new ItemBrickPackage("christmas 2012", "Christmas 2012", new String[]{"Xmas", "Holiday"});
        christmas2012.addBrick(singleton.createBrick(624, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickxmas2012", "", ItemTab.BACKGROUND, false, true, 124, 0xffD88A19, new String[]{"Wrapping paper", "Yellow", "Stripes"}));
        christmas2012.addBrick(singleton.createBrick(625, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickxmas2012", "", ItemTab.BACKGROUND, false, true, 125, 0xff54840D, new String[]{"Wrapping paper", "Green", "Stripes"}));
        christmas2012.addBrick(singleton.createBrick(626, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickxmas2012", "", ItemTab.BACKGROUND, false, true, 126, 0xff1F39D8, new String[]{"Wrapping paper", "Blue", "Purple", "Dots", "Spots"}));
        christmas2012.addBrick(singleton.createBrick(362, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2012", "", ItemTab.DECORATIVE, false, true, 230, 0x0, new String[]{"Ribbon", "Blue", "Vertical"}));
        christmas2012.addBrick(singleton.createBrick(363, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2012", "", ItemTab.DECORATIVE, false, true, 231, 0x0, new String[]{"Ribbon", "Blue", "Horizontal"}));
        christmas2012.addBrick(singleton.createBrick(364, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2012", "", ItemTab.DECORATIVE, false, true, 232, 0x0, new String[]{"Ribbon", "Blue", "Cross", "Middle"}));
        christmas2012.addBrick(singleton.createBrick(365, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2012", "", ItemTab.DECORATIVE, false, true, 233, 0x0, new String[]{"Ribbon", "Purple", "Vertical", "Magenta", "Red"}));
        christmas2012.addBrick(singleton.createBrick(366, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2012", "", ItemTab.DECORATIVE, false, true, 234, 0x0, new String[]{"Ribbon", "Purple", "Horizontal", "Magenta", "Red"}));
        christmas2012.addBrick(singleton.createBrick(367, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickxmas2012", "", ItemTab.DECORATIVE, false, true, 235, 0x0, new String[]{"Ribbon", "Purple", "Cross", "Middle", "Magenta", "Red"}));
        singleton.brickPackages.add(christmas2012);

        ItemBrickPackage lavaPackage = new ItemBrickPackage("lava", "Lava", new String[]{"Hell", "Hot", "Environment", "Heat"});
        lavaPackage.addBrick(singleton.createBrick(202, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricklava", "", ItemTab.BLOCK, false, true, 177, 0xffFFCE3E, new String[]{"Yellow"}));
        lavaPackage.addBrick(singleton.createBrick(203, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricklava", "", ItemTab.BLOCK, false, true, 178, 0xffFA970E, new String[]{"Orange"}));
        lavaPackage.addBrick(singleton.createBrick(204, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricklava", "", ItemTab.BLOCK, false, true, 179, 0xffFF5F00, new String[]{"Orange", "Red"}));
        lavaPackage.addBrick(singleton.createBrick(627, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricklava", "", ItemTab.BACKGROUND, false, true, 127, 0xffCCA333, new String[]{"Yellow"}));
        lavaPackage.addBrick(singleton.createBrick(628, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricklava", "", ItemTab.BACKGROUND, false, true, 128, 0xffC6750B, new String[]{"Orange"}));
        lavaPackage.addBrick(singleton.createBrick(629, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricklava", "", ItemTab.BACKGROUND, false, true, 129, 0xffB73A00, new String[]{"Red", "Orange"}));
        lavaPackage.addBrick(singleton.createBrick(415, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricklava", "", ItemTab.DECORATIVE, false, false, 264, 0x0, new String[]{"Fire", "Glow", "Orange"}));
        singleton.brickPackages.add(lavaPackage);

        ItemBrickPackage swamp = new ItemBrickPackage("swamp", "Swamp");
        swamp.addBrick(singleton.createBrick(370, ItemLayer.ABOVE, singleton.specialBlocksBMD, "brickswamp", "", ItemTab.DECORATIVE, false, false, 249, 0x0, new String[]{"Mud", "Bubbles", "Gas", "Nature", "Environment", "Animated"}));
        swamp.addBrick(singleton.createBrick(371, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickswamp", "", ItemTab.DECORATIVE, false, false, 236, 0x0, new String[]{"Grass", "Thick", "Nature", "Plant", "Environment"}));
        swamp.addBrick(singleton.createBrick(372, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickswamp", "", ItemTab.DECORATIVE, false, false, 237, 0x0, new String[]{"Wood", "Nature", "Log", "Environment"}));
        swamp.addBrick(singleton.createBrick(373, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickswamp", "", ItemTab.DECORATIVE, false, false, 238, 0x0, new String[]{"Danger", "Sign", "Caution", "Radioactive", "Nuclear"}));
        swamp.addBrick(singleton.createBrick(557, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickswamp", "", ItemTab.BACKGROUND, false, false, 57, -1, new String[]{"Mud", "Quicksand", "Environment", "Soil"}));
        swamp.addBrick(singleton.createBrick(630, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickswamp", "", ItemTab.BACKGROUND, false, false, 130, 0xff605A24, new String[]{"Green", "Grass", "Environment", "Soil"}));
        singleton.brickPackages.add(swamp);

        ItemBrickPackage sparta = new ItemBrickPackage("marble", "Sparta", new String[]{"Rome", "Sparta", "House", "Greece", "Roman"});
        sparta.addBrick(singleton.createBrick(382, ItemLayer.DECORATION, singleton.decoBlocksBMD, "bricksparta", "", ItemTab.DECORATIVE, false, true, 239, 0x0, new String[]{"Column", "Top", "Ancient"}));
        sparta.addBrick(singleton.createBrick(383, ItemLayer.DECORATION, singleton.decoBlocksBMD, "bricksparta", "", ItemTab.DECORATIVE, false, true, 240, 0x0, new String[]{"Column", "Middle", "Ancient"}));
        sparta.addBrick(singleton.createBrick(384, ItemLayer.DECORATION, singleton.decoBlocksBMD, "bricksparta", "", ItemTab.DECORATIVE, false, true, 241, 0x0, new String[]{"Column", "Bottom", "Ancient"}));
        sparta.addBrick(singleton.createBrick(208, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksparta", "", ItemTab.BLOCK, false, true, 180, 0xffCDD1D3, new String[]{"Brick", "White", "Ancient", "Grey", "Gray"}));
        sparta.addBrick(singleton.createBrick(209, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksparta", "", ItemTab.BLOCK, false, true, 181, 0xffC1DCB9, new String[]{"Brick", "Green", "Ancient"}));
        sparta.addBrick(singleton.createBrick(210, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksparta", "", ItemTab.BLOCK, false, true, 182, 0xffE5C6CF, new String[]{"Brick", "Red", "Pink", "Ancient"}));
        sparta.addBrick(singleton.createBrick(211, ItemLayer.DECORATION, singleton.blocksBMD, "bricksparta", "", ItemTab.BLOCK, false, true, 183, 0x0, new String[]{"Column", "Platform", "Top", "Ancient", "One-Way", "One Way"}));
        sparta.addBrick(singleton.createBrick(638, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksparta", "", ItemTab.BACKGROUND, false, false, 132, 0xff777B7D, new String[]{"Brick", "White", "Ancient", "Grey", "Gray"}));
        sparta.addBrick(singleton.createBrick(639, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksparta", "", ItemTab.BACKGROUND, false, false, 133, 0xff70816F, new String[]{"Brick", "Green", "Ancient"}));
        sparta.addBrick(singleton.createBrick(640, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksparta", "", ItemTab.BACKGROUND, false, false, 134, 0xff83767B, new String[]{"Brick", "Red", "Pink", "Ancient"}));

        singleton.brickPackages.add(sparta);

        ItemBrickPackage admin = new ItemBrickPackage("Label", "Admin Blocks");
        admin.addBrick(singleton.createBrick(ItemId.LABEL, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.ACTION, false, true, 265, 0x0, new String[]{"Text", "Words", "ModText"}, true));
        singleton.brickPackages.add(admin);

        ItemBrickPackage textSign = new ItemBrickPackage("sign", "Signs (+1)");
        textSign.addBrick(singleton.createBrick(ItemId.TEXT_SIGN, ItemLayer.ABOVE, singleton.specialBlocksBMD, "bricksign", "players will see a custom message when they touch this block", ItemTab.ACTION, false, true, 513, 0x0, new String[]{"Morphable", "Write", "Text", "Wood", "Info"}));
        singleton.brickPackages.add(textSign);

        ItemBrickPackage farm = new ItemBrickPackage("farm", "Farm");
        farm.addBrick(singleton.createBrick(386, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfarm", "", ItemTab.DECORATIVE, false, false, 243, -1, new String[]{"Wheat", "Nature", "Plant", "Environment"}));
        farm.addBrick(singleton.createBrick(387, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfarm", "", ItemTab.DECORATIVE, false, false, 244, -1, new String[]{"Corn", "Nature", "Plant", "Environment"}));
        farm.addBrick(singleton.createBrick(388, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfarm", "", ItemTab.DECORATIVE, false, true, 245, -1, new String[]{"Fence", "Wood", "Left"}));
        farm.addBrick(singleton.createBrick(1531, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfarm", "", ItemTab.DECORATIVE, false, true, 332, -1, new String[]{"Fence", "Wood", "Center", "Middle"}));
        farm.addBrick(singleton.createBrick(389, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickfarm", "", ItemTab.DECORATIVE, false, true, 246, -1, new String[]{"Fence", "Wood", "Right"}));
        farm.addBrick(singleton.createBrick(212, ItemLayer.DECORATION, singleton.blocksBMD, "brickfarm", "", ItemTab.BLOCK, false, true, 184, 0xffCCBE75, new String[]{"Hay", "Yellow", "Haybale", "Straw"}));

        singleton.brickPackages.add(farm);

        ItemBrickPackage autumn2014 = new ItemBrickPackage("autumn 2014", "Autumn 2014", new String[]{"Nature", "Environment", "Season", "Fall"});
        autumn2014.addBrick(singleton.createBrick(390, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickautumn2014", "", ItemTab.DECORATIVE, false, false, 247, -1, new String[]{"Leaves", "Left", "Orange"}));
        autumn2014.addBrick(singleton.createBrick(391, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickautumn2014", "", ItemTab.DECORATIVE, false, false, 248, -1, new String[]{"Leaves", "Right", "Orange"}));
        autumn2014.addBrick(singleton.createBrick(392, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickautumn2014", "", ItemTab.DECORATIVE, false, false, 249, -1, new String[]{"Grass", "Left"}));
        autumn2014.addBrick(singleton.createBrick(393, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickautumn2014", "", ItemTab.DECORATIVE, false, false, 250, -1, new String[]{"Grass", "Middle"}));
        autumn2014.addBrick(singleton.createBrick(394, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickautumn2014", "", ItemTab.DECORATIVE, false, false, 251, -1, new String[]{"Grass", "Right"}));
        autumn2014.addBrick(singleton.createBrick(395, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickautumn2014", "", ItemTab.DECORATIVE, false, false, 252, -1, new String[]{"Acorn", "Nut", "Brown"}));
        autumn2014.addBrick(singleton.createBrick(396, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickautumn2014", "", ItemTab.DECORATIVE, false, false, 253, -1, new String[]{"Pumpkin", "Halloween", "Food", "Orange"}));
        autumn2014.addBrick(singleton.createBrick(641, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickautumn2014", "", ItemTab.BACKGROUND, false, true, 135, -1, new String[]{"Leaves", "Yellow"}));
        autumn2014.addBrick(singleton.createBrick(642, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickautumn2014", "", ItemTab.BACKGROUND, false, true, 136, -1, new String[]{"Leaves", "Orange"}));
        autumn2014.addBrick(singleton.createBrick(643, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickautumn2014", "", ItemTab.BACKGROUND, false, true, 137, -1, new String[]{"Leaves", "Red"}));
        singleton.brickPackages.add(autumn2014);

        ItemBrickPackage christmas2014 = new ItemBrickPackage("christmas 2014", "Christmas 2014", new String[]{"Xmas", "Holiday"});
        christmas2014.addBrick(singleton.createBrick(215, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickchristmas2014", "", ItemTab.BLOCK, false, true, 187, -1, new String[]{"Snow", "Environment"}));
        christmas2014.addBrick(singleton.createBrick(216, ItemLayer.DECORATION, singleton.blocksBMD, "brickchristmas2014", "", ItemTab.BLOCK, false, true, 188, -1, new String[]{"Ice", "Snow", "Platform", "Icicle", "Top", "Environment", "One-Way", "One Way"}));
        christmas2014.addBrick(singleton.createBrick(398, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2014", "", ItemTab.DECORATIVE, false, false, 254, -1, new String[]{"Snow", "Fluff", "Left", "Snowdrift", "Environment"}));
        christmas2014.addBrick(singleton.createBrick(399, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2014", "", ItemTab.DECORATIVE, false, false, 255, -1, new String[]{"Snow", "Fluff", "Middle", "Snowdrift", "Environment"}));
        christmas2014.addBrick(singleton.createBrick(400, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2014", "", ItemTab.DECORATIVE, false, false, 256, -1, new String[]{"Snow", "Fluff", "Right", "Snowdrift", "Environment"}));
        christmas2014.addBrick(singleton.createBrick(401, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickchristmas2014", "", ItemTab.DECORATIVE, false, false, 257, 0x0, new String[]{"Candy cane", "Stripes"}));
        christmas2014.addBrick(singleton.createBrick(402, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickchristmas2014", "", ItemTab.DECORATIVE, false, true, 258, 0x0, new String[]{"Tinsel", "Nature", "Garland", "Top"}));
        christmas2014.addBrick(singleton.createBrick(403, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickchristmas2014", "", ItemTab.DECORATIVE, false, true, 259, 0x0, new String[]{"Stocking", "Sock", "Red", "Holiday"}));
        christmas2014.addBrick(singleton.createBrick(404, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickchristmas2014", "", ItemTab.DECORATIVE, false, true, 260, 0x0, new String[]{"Bow", "Ribbon", "Red"}));
        singleton.brickPackages.add(christmas2014);

        ItemBrickPackage oneway = new ItemBrickPackage("one-way", "One-way Blocks", new String[]{"Platform"});
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_WHITE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 566, -1, new String[]{"One way", "White", "Light", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_GRAY, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 472, -1, new String[]{"One way", "Gray", "Grey", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_BLACK, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 488, -1, new String[]{"One way", "Black", "Dark", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_RED, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 480, -1, new String[]{"One way", "Red", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_ORANGE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 272, -1, new String[]{"One way", "Orange", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_YELLOW, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 268, -1, new String[]{"One way", "Yellow", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_GREEN, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 484, -1, new String[]{"One way", "Green", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_CYAN, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 264, -1, new String[]{"One way", "Cyan", "Blue", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_BLUE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 476, -1, new String[]{"One way", "Blue", "Dark", "Morphable", "One-way"}));
        oneway.addBrick(singleton.createBrick(ItemId.ONEWAY_PINK, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickoneway", "", ItemTab.BLOCK, false, false, 276, -1, new String[]{"One way", "Purple", "Pink", "Morphable", "One-way"}));
        singleton.brickPackages.add(oneway);

        ItemBrickPackage valentines2015 = new ItemBrickPackage("valentines 2015", "Valentines 2015", new String[]{"Kiss", "Holiday", "Love", "Heart", "<3"});
        valentines2015.addBrick(singleton.createBrick(405, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickvalentines2015", "", ItemTab.DECORATIVE, false, true, 261, 0x0, new String[]{"Red"}));
        valentines2015.addBrick(singleton.createBrick(406, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickvalentines2015", "", ItemTab.DECORATIVE, false, true, 262, 0x0, new String[]{"Purple", "Pink"}));
        valentines2015.addBrick(singleton.createBrick(407, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickvalentines2015", "", ItemTab.DECORATIVE, false, true, 263, 0x0, new String[]{"Pink"}));
        singleton.brickPackages.add(valentines2015);

        ItemBrickPackage magic = new ItemBrickPackage("magic", "Magic Blocks", new String[]{"Rare"});
        magic.addBrick(singleton.createBrick(1013, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmagic", "the first magic block", ItemTab.BLOCK, false, true, 200, -1, new String[]{"Green", "Emerald", "Peridot"}));
        magic.addBrick(singleton.createBrick(1014, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmagic2", "the second magic block", ItemTab.BLOCK, false, true, 201, -1, new String[]{"Purple", "Violet", "Amethyst"}));
        magic.addBrick(singleton.createBrick(1015, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmagic3", "the third magic block", ItemTab.BLOCK, false, true, 202, -1, new String[]{"Yellow", "Orange", "Amber", "Topaz"}));
        magic.addBrick(singleton.createBrick(1016, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmagic4", "the fourth magic block", ItemTab.BLOCK, false, true, 203, -1, new String[]{"Blue", "Sapphire"}));
        magic.addBrick(singleton.createBrick(1017, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmagic5", "the fifth magic block", ItemTab.BLOCK, false, true, 204, -1, new String[]{"Red", "Ruby", "Garnet"}));
        magic.addBrick(singleton.createBrick(1132, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmagic6", "the sixth magic block", ItemTab.BLOCK, false, true, 293, -1, new String[]{"Cyan", "Aquamarine", "Turquoise"}));
        magic.addBrick(singleton.createBrick(1142, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmagic7", "the seventh magic block", ItemTab.BLOCK, false, true, 299, -1, new String[]{"White", "Opal", "Pearl"}));
        magic.addBrick(singleton.createBrick(1161, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmagic8", "the eighth magic block", ItemTab.BLOCK, false, true, 316, -1, new String[]{"Black", "Onyx"}));
        singleton.brickPackages.add(magic);

        ItemBrickPackage effect = new ItemBrickPackage("effect", "Effect Blocks", new String[]{"Powers", "Action", "Physics"});
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_JUMP, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectjump", "jump effect: players jump twice or half as high", ItemTab.ACTION, false, false, 0, 0x0, new String[]{"Jump", "Boost", "High", "Low"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_FLY, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectfly", "fly effect: players can levitate by holding space", ItemTab.ACTION, false, false, 1, 0x0, new String[]{"Fly", "Hover", "Levitate"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_RUN, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectspeed", "speed effect: players move 50% faster or slower", ItemTab.ACTION, false, false, 2, 0x0, new String[]{"Speed", "Fast", "Run", "Slow"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_LOW_GRAVITY, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectlowgravity", "low gravity effect: player gravity is reduced", ItemTab.ACTION, false, false, 13, 0x0, new String[]{"Gravity", "Moon", "Low gravity", "Space", "Slow fall", "Float"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_PROTECTION, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectprotection", "protection effect: players are safe from hazards and cured from curses/zombies", ItemTab.ACTION, false, false, 3, 0x0, new String[]{"Invincible", "Health", "Plus", "Immortal", "Protection"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_CURSE, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectcurse", "players die after X seconds, spreads on contact, maximum of 3 curses at a time", ItemTab.ACTION, false, false, 4, 0x0, new String[]{"Curse", "Skull", "Skeleton", "Timed", "Death", "Die", "Kill"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_MULTIJUMP, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectmultijump", "multijump effect: players can jump X times", ItemTab.ACTION, false, false, 15, 0x0, new String[]{"Double", "Jump", "Twice", "Powers", "Action", "Physics"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_GRAVITY, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickeffectgravity", "gravity effect: player gravity is rotated", ItemTab.ACTION, false, false, 657, 0x0, new String[]{"Gravity", "Reverse", "Action", "Physics"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_POISON, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectpoison", "poison effect: players die after X seconds, does not spread", ItemTab.ACTION, false, false, 23, 0x0, new String[]{"Poison", "Toxic", "Action", "Timed", "Death", "Die", "Kill"}));
        effect.addBrick(singleton.createBrick(ItemId.EFFECT_RESET, ItemLayer.DECORATION, singleton.effectBlocksBMD, "brickeffectreset", "reset effect: resets all non-timed effects", ItemTab.ACTION, false, false, 26, 0x0, new String[]{"Reset", "Action", "Physics"}));
        singleton.brickPackages.add(effect);

        // TODO: singleton.add tags
        ItemBrickPackage gm = new ItemBrickPackage("gold", "Gold Membership Blocks", new String[]{"Shiny", "Yellow"});
        gm.addBrick(singleton.createBrick(1065, ItemLayer.FOREGROUND, singleton.blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 242, -1, new String[]{}));
        gm.addBrick(singleton.createBrick(1066, ItemLayer.FOREGROUND, singleton.blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 243, -1, new String[]{}));
        gm.addBrick(singleton.createBrick(1067, ItemLayer.FOREGROUND, singleton.blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 244, -1, new String[]{}));
        gm.addBrick(singleton.createBrick(1068, ItemLayer.FOREGROUND, singleton.blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 245, -1, new String[]{}));
        gm.addBrick(singleton.createBrick(1069, ItemLayer.DECORATION, singleton.blocksBMD, "goldmember", "", ItemTab.BLOCK, true, true, 246, 0x0, new String[]{}));
        gm.addBrick(singleton.createBrick(709, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "goldmember", "", ItemTab.BACKGROUND, true, false, 198, -1, new String[]{}));
        gm.addBrick(singleton.createBrick(710, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "goldmember", "", ItemTab.BACKGROUND, true, false, 199, -1, new String[]{}));
        gm.addBrick(singleton.createBrick(711, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "goldmember", "", ItemTab.BACKGROUND, true, false, 200, -1, new String[]{}));
        gm.addBrick(singleton.createBrick(ItemId.GATE_GOLD, ItemLayer.DECORATION, singleton.doorBlocksBMD, "goldmember", "allows white-border smilies to pass", ItemTab.ACTION, true, false, 10, -1, new String[]{}));
        gm.addBrick(singleton.createBrick(ItemId.DOOR_GOLD, ItemLayer.DECORATION, singleton.doorBlocksBMD, "goldmember", "allows gold-border smilies to pass", ItemTab.ACTION, true, false, 11, -1, new String[]{}));
        singleton.brickPackages.add(gm);

        ItemBrickPackage cave = new ItemBrickPackage("cave", "Cave Backgrounds", new String[]{"Environment"});
        cave.addBrick(singleton.createBrick(766, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 259, -1, new String[]{"Dark", "Grey", "Gray"}));
        cave.addBrick(singleton.createBrick(767, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 260, -1, new String[]{"Dark", "Grey", "Gray"}));
        cave.addBrick(singleton.createBrick(768, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 261, -1, new String[]{"Dark", "Grey", "Gray", "Black"}));
        cave.addBrick(singleton.createBrick(662, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 156, -1, new String[]{"Dark", "Red"}));
        cave.addBrick(singleton.createBrick(660, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 154, -1, new String[]{"Dark", "Orange", "Brown"}));
        cave.addBrick(singleton.createBrick(661, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 155, -1, new String[]{"Dark", "Yellow", "Olive"}));
        cave.addBrick(singleton.createBrick(659, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 153, -1, new String[]{"Dark", "Green"}));
        cave.addBrick(singleton.createBrick(656, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 150, -1, new String[]{"Dark", "Cyan"}));
        cave.addBrick(singleton.createBrick(657, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 151, -1, new String[]{"Dark", "Blue", "Night", "Sky"}));
        cave.addBrick(singleton.createBrick(655, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 149, -1, new String[]{"Dark", "Purple"}));
        cave.addBrick(singleton.createBrick(658, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickcave", "", ItemTab.BACKGROUND, false, false, 152, -1, new String[]{"Dark", "Pink", "Magenta", "Violet"}));
        singleton.brickPackages.add(cave);

        ItemBrickPackage summer2015 = new ItemBrickPackage("summer 2015", "Summer 2015", new String[]{"Season"});
        summer2015.addBrick(singleton.createBrick(441, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, true, 280, 0x0, new String[]{"Life preserver", "Life saver", "Circle", "Life buoy", "Ring"}));
        summer2015.addBrick(singleton.createBrick(442, ItemLayer.DECORATION, singleton.decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, true, 281, 0x0, new String[]{"Anchor", "Metal", "Ship", "Water"}));
        summer2015.addBrick(singleton.createBrick(443, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, false, 282, 0x0, new String[]{"Rope", "Left", "Dock"}));
        summer2015.addBrick(singleton.createBrick(444, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, false, 283, 0x0, new String[]{"Rope", "Right", "Dock"}));
        summer2015.addBrick(singleton.createBrick(445, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricksummer2015", "", ItemTab.DECORATIVE, false, false, 284, 0x0, new String[]{"Tree", "Nature", "Palm", "Plant", "Environment"}));
        singleton.brickPackages.add(summer2015);

        ItemBrickPackage environment = new ItemBrickPackage("environment", "Environment", new String[]{"Nature"});
        environment.addBrick(singleton.createBrick(1030, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 215, -1, new String[]{"Wood", "Tree", "Brown"}));
        environment.addBrick(singleton.createBrick(1031, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 216, -1, new String[]{"Leaves", "Grass", "Green", "Plant"}));
        environment.addBrick(singleton.createBrick(1032, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 217, -1, new String[]{"Bamboo", "Wood", "Yellow"}));
        environment.addBrick(singleton.createBrick(1033, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 218, -1, new String[]{"Obsidian", "Rock", "Ice", "Grey", "Gray"}));
        environment.addBrick(singleton.createBrick(1034, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 219, -1, new String[]{"Fire", "Lava", "Hot"}));
        environment.addBrick(singleton.createBrick(678, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 172, -1, new String[]{"Wood", "Tree", "Brown"}));
        environment.addBrick(singleton.createBrick(679, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 173, -1, new String[]{"Leaves", "Grass", "Green"}));
        environment.addBrick(singleton.createBrick(680, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 174, -1, new String[]{"Bamboo", "Wood"}));
        environment.addBrick(singleton.createBrick(681, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 175, -1, new String[]{"Obsidian", "Rock", "Ice", "Grey", "Gray"}));
        environment.addBrick(singleton.createBrick(682, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 176, -1, new String[]{"Fire", "Lava", "Hot", "Molten"}));
        singleton.brickPackages.add(environment);

        ItemBrickPackage domestic = new ItemBrickPackage("domestic", "Domestic", new String[]{"House"});
        domestic.addBrick(singleton.createBrick(1035, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 220, -1, new String[]{"Tile", "Double", "Floor", "Parquet", "Checkered"}));
        domestic.addBrick(singleton.createBrick(1036, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 221, -1, new String[]{"Wood", "Brown", "Floor"}));
        domestic.addBrick(singleton.createBrick(1037, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 222, -1, new String[]{"Red", "Carpet"}));
        domestic.addBrick(singleton.createBrick(1038, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 223, -1, new String[]{"Blue", "Carpet"}));
        domestic.addBrick(singleton.createBrick(1039, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 224, -1, new String[]{"Green", "Carpet", "Grass"}));
        domestic.addBrick(singleton.createBrick(1040, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, true, 225, -1, new String[]{"White", "Marble", "Box", "Square"}));
        domestic.addBrick(singleton.createBrick(683, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 177, -1, new String[]{"Wallpaper", "Yellow", "Dark yellow", "Brown"}));
        domestic.addBrick(singleton.createBrick(684, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 178, -1, new String[]{"Wallpaper", "Brown", "Dark brown"}));
        domestic.addBrick(singleton.createBrick(685, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 179, -1, new String[]{"Wallpaper", "Red", "Dark red"}));
        domestic.addBrick(singleton.createBrick(686, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 180, -1, new String[]{"Wallpaper", "Blue", "Dark blue"}));
        domestic.addBrick(singleton.createBrick(687, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdomestic", "", ItemTab.BACKGROUND, false, false, 181, -1, new String[]{"Wallpaper", "Green", "Dark green", "Stripes"}));
        domestic.addBrick(singleton.createBrick(446, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 285, 0x0, new String[]{"Light", "Lampshade"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_LIGHT_BULB, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 425, 0x0, new String[]{"Light", "Bulb", "Morphable"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_TAP, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, true, 429, 0x0, new String[]{"Pipe", "Tube", "Mario", "Corner", "Morphable"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_PIPE_STRAIGHT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 715, 0x0, new String[]{"Pipe", "Tube", "Mario", "Morphable"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_PIPE_T, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 717, 0x0, new String[]{"Pipe", "Tube", "Mario", "Corner", "Morphable"}));
        domestic.addBrick(singleton.createBrick(1539, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, true, 335, 0x0, new String[]{"Pipe", "Tube", "Mario", "Corner"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_PAINTING, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 433, 0x0, new String[]{"Picture", "Painting", "Frame", "Morphable"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_VASE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 437, 0x0, new String[]{"Flower", "Nature", "Plant", "Vase"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_TV, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 441, 0x0, new String[]{"Television", "TV", "Morphable", "Screen", "CRT", "Box", "LCD", "Electronic"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_WINDOW, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 445, 0x0, new String[]{"Window", "Morphable"}));
        domestic.addBrick(singleton.createBrick(ItemId.HALFBLOCK_DOMESTIC_YELLOW, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, false, 449, -1, new String[]{"Half block", "Yellow", "Morphable", "Gold"}));
        domestic.addBrick(singleton.createBrick(ItemId.HALFBLOCK_DOMESTIC_BROWN, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, false, 453, -1, new String[]{"Half block", "Brown", "Morphable", "Wood"}));
        domestic.addBrick(singleton.createBrick(ItemId.HALFBLOCK_DOMESTIC_WHITE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.BLOCK, false, false, 457, -1, new String[]{"Half block", "White", "Morphable", "Marble"}));
        domestic.addBrick(singleton.createBrick(ItemId.DOMESTIC_FRAME_BORDER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdomestic", "", ItemTab.DECORATIVE, false, false, 720, 0x0, new String[]{"Picture", "Painting", "Frame", "Morphable"}));
        singleton.brickPackages.add(domestic);

        ItemBrickPackage halloween2015 = new ItemBrickPackage("halloween 2015", "Halloween 2015", new String[]{"Holiday", "House", "Scary", "Creepy"});
        halloween2015.addBrick(singleton.createBrick(1047, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickhalloween2015", "", ItemTab.BLOCK, false, true, 229, -1, new String[]{"Mossy", "Green", "Brick", "Old", "Sewer", "Ghost"}));
        halloween2015.addBrick(singleton.createBrick(1048, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickhalloween2015", "", ItemTab.BLOCK, false, true, 230, -1, new String[]{"Siding", "Light gray"}));
        halloween2015.addBrick(singleton.createBrick(1049, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickhalloween2015", "", ItemTab.BLOCK, false, true, 231, -1, new String[]{"Mossy", "Gray", "Green", "Grey", "Roof", "Catacomb", "Brick", "Tomb"}));
        halloween2015.addBrick(singleton.createBrick(ItemId.HALLOWEEN_2015_ONEWAY, ItemLayer.DECORATION, singleton.blocksBMD, "brickhalloween2015", "", ItemTab.BLOCK, false, true, 232, 0x0, new String[]{"Platform", "Gray", "Grey", "Stone", "Corner", "One Way", "One-Way"}));
        halloween2015.addBrick(singleton.createBrick(454, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 286, 0x0, new String[]{"Bush", "Nature", "Plant", "Dead", "Shrub", "Environment"}));
        halloween2015.addBrick(singleton.createBrick(455, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 287, 0x0, new String[]{"Fence", "Spikes"}));
        halloween2015.addBrick(singleton.createBrick(ItemId.HALLOWEEN_2015_WINDOW_RECT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 461, 0x0, new String[]{"Window", "Morphable", "Wood", "Arched"}));
        halloween2015.addBrick(singleton.createBrick(ItemId.HALLOWEEN_2015_WINDOW_CIRCLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 463, 0x0, new String[]{"Window", "Morphable", "Round", "Circle", "Wood"}));
        halloween2015.addBrick(singleton.createBrick(ItemId.HALLOWEEN_2015_LAMP, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalloween2015", "", ItemTab.DECORATIVE, false, false, 465, 0x0, new String[]{"Light", "Morphable", "Lamp", "Lantern"}));
        halloween2015.addBrick(singleton.createBrick(694, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhalloween2015", "", ItemTab.BACKGROUND, false, false, 188, -1, new String[]{"Mossy", "Green", "Brick", "Stone", "Sewer"}));
        halloween2015.addBrick(singleton.createBrick(695, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhalloween2015", "", ItemTab.BACKGROUND, false, false, 189, -1, new String[]{"Sliding", "Gray", "Grey", "Slabs", "Sewer"}));
        halloween2015.addBrick(singleton.createBrick(696, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhalloween2015", "", ItemTab.BACKGROUND, false, false, 190, -1, new String[]{"Mossy", "Gray", "Grey", "Roof", "Catacomb", "Tomb"}));
        singleton.brickPackages.add(halloween2015);

        ItemBrickPackage arctic = new ItemBrickPackage("arctic", "Arctic", new String[]{"Snow", "Cold", "Blue", "Frozen", "Freeze"});
        arctic.addBrick(singleton.createBrick(1059, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 237, -1, new String[]{"Ice"}));
        arctic.addBrick(singleton.createBrick(1060, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 238, -1));
        arctic.addBrick(singleton.createBrick(1061, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 239, -1, new String[]{"Left"}));
        arctic.addBrick(singleton.createBrick(1062, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 240, -1, new String[]{"Middle"}));
        arctic.addBrick(singleton.createBrick(1063, ItemLayer.DECORATION, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 241, -1, new String[]{"Right"}));
        arctic.addBrick(singleton.createBrick(702, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 196, -1));
        arctic.addBrick(singleton.createBrick(703, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, false, 197, -1));
        singleton.brickPackages.add(arctic);

        ItemBrickPackage newYear2015 = new ItemBrickPackage("new year 2015", "New Year 2015", new String[]{"Holiday"});
        newYear2015.addBrick(singleton.createBrick(462, ItemLayer.DECORATION, singleton.decoBlocksBMD, "bricknewyear2015", "", ItemTab.DECORATIVE, false, true, 289, 0x0, new String[]{"Glass", "Wine", "Drink"}));
        newYear2015.addBrick(singleton.createBrick(463, ItemLayer.DECORATION, singleton.decoBlocksBMD, "bricknewyear2015", "", ItemTab.DECORATIVE, false, true, 290, 0x0, new String[]{"Bottle", "Champagne", "Drink"}));
        newYear2015.addBrick(singleton.createBrick(ItemId.NEW_YEAR_2015_BALLOON, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricknewyear2015", "", ItemTab.DECORATIVE, false, true, 492, 0x0, new String[]{"Balloon", "Morphable"}));
        newYear2015.addBrick(singleton.createBrick(ItemId.NEW_YEAR_2015_STREAMER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricknewyear2015", "", ItemTab.DECORATIVE, false, true, 497, 0x0, new String[]{"String", "Morphable", "Streamer"}));
        singleton.brickPackages.add(newYear2015);

        ItemBrickPackage ice = new ItemBrickPackage("ice", "Ice");
        ice.addBrick(singleton.createBrick(ItemId.ICE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickice2", "", ItemTab.ACTION, false, true, 501, -1, new String[]{"Slippery", "Physics", "Slide"}));
        singleton.brickPackages.add(ice);

        ItemBrickPackage fairytale = new ItemBrickPackage("fairytale", "Fairytale", new String[]{"Mythical", "Fiction"});
        fairytale.addBrick(singleton.createBrick(1070, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 247, -1, new String[]{"Cobblestone", "Pebbles"}));
        fairytale.addBrick(singleton.createBrick(1071, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 248, -1, new String[]{"Orange", "Tree"}));
        fairytale.addBrick(singleton.createBrick(1072, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 249, -1, new String[]{"Green", "Moss"}));
        fairytale.addBrick(singleton.createBrick(1073, ItemLayer.DECORATION, singleton.blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 250, -1, new String[]{"Blue", "Cloud"}));
        fairytale.addBrick(singleton.createBrick(1074, ItemLayer.DECORATION, singleton.blocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, true, 251, -1, new String[]{"Red", "Mushroom", "Spotted"}));
        fairytale.addBrick(singleton.createBrick(468, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 291, 0x0, new String[]{"Green", "Plant", "Vine"}));
        fairytale.addBrick(singleton.createBrick(469, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 292, 0x0, new String[]{"Mushroom", "Orange"}));
        fairytale.addBrick(singleton.createBrick(1622, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 365, 0x0, new String[]{"Mushroom", "Red", "Spotted"}));
        fairytale.addBrick(singleton.createBrick(470, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 293, 0x0, new String[]{"Dew Drop", "Transparent", "Water"}));
        fairytale.addBrick(singleton.createBrick(704, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickfairytale", "", ItemTab.BACKGROUND, false, false, 201, -1, new String[]{"Orange", "Mist", "Fog", "Swirl"}));
        fairytale.addBrick(singleton.createBrick(705, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickfairytale", "", ItemTab.BACKGROUND, false, false, 202, -1, new String[]{"Green", "Mist", "Fog", "Swirl"}));
        fairytale.addBrick(singleton.createBrick(706, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickfairytale", "", ItemTab.BACKGROUND, false, false, 203, -1, new String[]{"Blue", "Mist", "Fog", "Swirl"}));
        fairytale.addBrick(singleton.createBrick(707, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickfairytale", "", ItemTab.BACKGROUND, false, false, 204, -1, new String[]{"Pink", "Mist", "Fog", "Swirl"}));
        fairytale.addBrick(singleton.createBrick(ItemId.HALFBLOCK_FAIRYTALE_ORANGE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, false, 522, -1, new String[]{"Half block", "Gemstone", "Crystal", "Orange"}));
        fairytale.addBrick(singleton.createBrick(ItemId.HALFBLOCK_FAIRYTALE_GREEN, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, false, 526, -1, new String[]{"Half block", "Gemstone", "Crystal", "Green"}));
        fairytale.addBrick(singleton.createBrick(ItemId.HALFBLOCK_FAIRYTALE_BLUE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, false, 530, -1, new String[]{"Half block", "Gemstone", "Crystal", "Blue"}));
        fairytale.addBrick(singleton.createBrick(ItemId.HALFBLOCK_FAIRYTALE_PINK, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickfairytale", "", ItemTab.BLOCK, false, false, 534, -1, new String[]{"Half block", "Gemstone", "Crystal", "Pink"}));
        fairytale.addBrick(singleton.createBrick(ItemId.FAIRYTALE_FLOWERS, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickfairytale", "", ItemTab.DECORATIVE, false, true, 538, 0x0, new String[]{"Morphable", "Green", "Blue", "Orange", "Pink", "Plant", "Flower"}));
        singleton.brickPackages.add(fairytale);
    }

    private static void initRest4() {

        ItemBrickPackage spring2016 = new ItemBrickPackage("spring 2016", "Spring 2016");
        spring2016.addBrick(singleton.createBrick(1081, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickspring2016", "", ItemTab.BLOCK, false, true, 253, -1, new String[]{"Dirt", "Brown", "Soil", "Nature"}));
        spring2016.addBrick(singleton.createBrick(1082, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickspring2016", "", ItemTab.BLOCK, false, true, 254, -1, new String[]{"Hedge", "Green", "Leaf", "Nature", "Plant"}));
        spring2016.addBrick(singleton.createBrick(473, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 294, 0x0, new String[]{"Dirt", "Brown", "Soil", "Slope", "Left"}));
        spring2016.addBrick(singleton.createBrick(474, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 295, 0x0, new String[]{"Dirt", "Brown", "Soil", "Slope", "Right"}));
        spring2016.addBrick(singleton.createBrick(ItemId.SPRING_DAISY, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 541, 0x0, new String[]{"Daisy", "Flower", "Plant", "Nature", "White", "Blue", "Pink"}));
        spring2016.addBrick(singleton.createBrick(ItemId.SPRING_TULIP, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 544, 0x0, new String[]{"Tulip", "Flower", "Plant", "Nature", "Red", "Yellow", "Pink"}));
        spring2016.addBrick(singleton.createBrick(ItemId.SPRING_DAFFODIL, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickspring2016", "", ItemTab.DECORATIVE, false, false, 547, 0x0, new String[]{"Daffodil", "Flower", "Plant", "Nature", "Yellow", "White", "Orange"}));
        singleton.brickPackages.add(spring2016);

        ItemBrickPackage summer2016 = new ItemBrickPackage("summer 2016", "Summer 2016");
        summer2016.addBrick(singleton.createBrick(1083, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 255, -1, new String[]{"Thatched", "Straw", "Seasonal", "Beige", "Tan"}));
        summer2016.addBrick(singleton.createBrick(1084, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 256, -1, new String[]{"Planks", "Wood", "Seasonal", "Purple"}));
        summer2016.addBrick(singleton.createBrick(1085, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 257, -1, new String[]{"Planks", "Wood", "Seasonal", "Yellow"}));
        summer2016.addBrick(singleton.createBrick(1086, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 258, -1, new String[]{"Planks", "Wood", "Seasonal", "Teal"}));
        summer2016.addBrick(singleton.createBrick(1087, ItemLayer.DECORATION, singleton.blocksBMD, "bricksummer2016", "", ItemTab.BLOCK, false, true, 259, 0x0, new String[]{"Platform", "Dock", "Wood", "Seasonal", "One Way", "One-Way", "Brown"}));
        summer2016.addBrick(singleton.createBrick(708, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksummer2016", "", ItemTab.BACKGROUND, false, false, 205, -1, new String[]{"Thatched", "Straw", "Seasonal", "Beige", "Tan"}));
        summer2016.addBrick(singleton.createBrick(712, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksummer2016", "", ItemTab.BACKGROUND, false, false, 206, -1, new String[]{"Planks", "Wood", "Seasonal", "Purple"}));
        summer2016.addBrick(singleton.createBrick(713, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksummer2016", "", ItemTab.BACKGROUND, false, false, 207, -1, new String[]{"Planks", "Wood", "Seasonal", "Yellow"}));
        summer2016.addBrick(singleton.createBrick(714, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricksummer2016", "", ItemTab.BACKGROUND, false, false, 208, -1, new String[]{"Planks", "Wood", "Seasonal", "Teal"}));
        summer2016.addBrick(singleton.createBrick(ItemId.SUMMER_FLAG, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricksummer2016", "", ItemTab.DECORATIVE, false, false, 550, 0x0, new String[]{"Flag", "Seasonal", "Red", "Yellow", "Green", "Cyan", "Blue", "Purple"}));
        summer2016.addBrick(singleton.createBrick(ItemId.SUMMER_AWNING, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricksummer2016", "", ItemTab.DECORATIVE, false, false, 556, 0x0, new String[]{"Awning", "Striped", "Seasonal", "White", "Red", "Yellow", "Green", "Cyan", "Blue", "Purple"}));
        summer2016.addBrick(singleton.createBrick(ItemId.SUMMER_ICECREAM, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricksummer2016", "", ItemTab.DECORATIVE, false, false, 562, 0x0, new String[]{"Ice Cream", "Food", "Vanilla", "Chocolate", "Strawberry", "Mint", "Beige", "Brown", "Pink", "Green"}));
        singleton.brickPackages.add(summer2016);

        ItemBrickPackage minepack = new ItemBrickPackage("mine", "Mine");
        minepack.addBrick(singleton.createBrick(1093, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickmine", "", ItemTab.BLOCK, false, true, 264, -1, new String[]{"Stone", "Brown", "Tan", "Rock"}));
        minepack.addBrick(singleton.createBrick(720, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickmine", "", ItemTab.BACKGROUND, false, true, 219, -1, new String[]{"Stone", "Brown", "Tan", "Rock", "Dark"}));
        minepack.addBrick(singleton.createBrick(495, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickmine", "", ItemTab.DECORATIVE, false, true, 307, 0x0, new String[]{"Stalagmite", "Stone", "Brown", "Tan", "Rock"}));
        minepack.addBrick(singleton.createBrick(496, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickmine", "", ItemTab.DECORATIVE, false, true, 308, 0x0, new String[]{"Stalagtite", "Stone", "Brown", "Tan", "Rock"}));
        minepack.addBrick(singleton.createBrick(ItemId.CAVE_CRYSTAL, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmine", "", ItemTab.DECORATIVE, false, true, 570, 0x0, new String[]{"Crystal", "Gemstone", "Red", "Yellow", "Green", "Cyan", "Blue", "Purple"}));
        minepack.addBrick(singleton.createBrick(ItemId.CAVE_TORCH, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickmine", "", ItemTab.DECORATIVE, false, false, 576, 0x0, new String[]{"Torch", "Fire", "Animated"}));
        singleton.brickPackages.add(minepack);

        ItemBrickPackage restaurant = new ItemBrickPackage("restaurant", "Restaurant");
        restaurant.addBrick(singleton.createBrick(487, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 302, 0x0, new String[]{"Hamburger", "Sandwich", "Food"}));
        restaurant.addBrick(singleton.createBrick(488, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 303, 0x0, new String[]{"Hot Dog", "Sausage", "Food"}));
        restaurant.addBrick(singleton.createBrick(489, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 304, 0x0, new String[]{"Sub", "Sandwich", "Ham", "Food"}));
        restaurant.addBrick(singleton.createBrick(490, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 305, 0x0, new String[]{"Soda", "Drink", "Beverage", "Red"}));
        restaurant.addBrick(singleton.createBrick(491, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 306, 0x0, new String[]{"French Fries", "Chips", "Food", "Red", "Yellow"}));
        restaurant.addBrick(singleton.createBrick(ItemId.RESTAURANT_CUP, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 588, 0x0, new String[]{"Glass", "Cup", "Drink", "Water", "Milk", "Orange Juice", "Beverage"}));
        restaurant.addBrick(singleton.createBrick(ItemId.RESTAURANT_PLATE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 592, 0x0, new String[]{"Plate", "Chicken", "Ham", "Fish", "Food"}));
        restaurant.addBrick(singleton.createBrick(ItemId.RESTAURANT_BOWL, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickrestaurant", "", ItemTab.DECORATIVE, false, true, 597, 0x0, new String[]{"Bowl", "Salad", "Spaghetti", "Pasta", "Ice Cream", "Food"}));
        singleton.brickPackages.add(restaurant);

        ItemBrickPackage textile = new ItemBrickPackage("textile", "Textile");
        textile.addBrick(singleton.createBrick(721, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 214, -1, new String[]{"Cloth", "Fabric", "Pattern", "White", "Green", "Plaid", "Checker"}));
        textile.addBrick(singleton.createBrick(722, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 215, -1, new String[]{"Cloth", "Fabric", "Pattern", "White", "Blue", "Chevron", "Zigzag"}));
        textile.addBrick(singleton.createBrick(723, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 216, -1, new String[]{"Cloth", "Fabric", "Pattern", "White", "Pink", "Polka Dots", "Spots"}));
        textile.addBrick(singleton.createBrick(724, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 217, -1, new String[]{"Cloth", "Fabric", "Pattern", "White", "Yellow", "Stripes", "Horizontal"}));
        textile.addBrick(singleton.createBrick(725, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktextile", "", ItemTab.BACKGROUND, false, true, 218, -1, new String[]{"Cloth", "Fabric", "Pattern", "White", "Red", "Plaid", "Diamond"}));
        singleton.brickPackages.add(textile);

        ItemBrickPackage halloween2016 = new ItemBrickPackage("halloween 2016", "Halloween 2016");
        halloween2016.addBrick(singleton.createBrick(ItemId.HALLOWEEN_2016_ROTATABLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalloween2016", "", ItemTab.DECORATIVE, false, false, 601, 0x0, new String[]{"Branch", "Root", "Wood", "Slope", "Black", "Rotatable", "Morphable", "Seasonal", "Holiday"}));
        halloween2016.addBrick(singleton.createBrick(ItemId.HALLOWEEN_2016_PUMPKIN, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalloween2016", "", ItemTab.DECORATIVE, false, false, 605, 0x0, new String[]{"Pumpkin", "Jack o Lantern", "Orange", "Morphable", "Seasonal", "Holiday"}));
        halloween2016.addBrick(singleton.createBrick(1501, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickhalloween2016", "", ItemTab.DECORATIVE, false, false, 309, 0x0, new String[]{"Grass", "Plant", "Purple", "Seasonal", "Holiday"}));
        halloween2016.addBrick(singleton.createBrick(ItemId.HALLOWEEN_2016_EYES, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalloween2016", "", ItemTab.DECORATIVE, false, false, 612, 0x0, new String[]{"Eyes", "Orange", "Purple", "Green", "Yellow", "Morphable", "Seasonal", "Holiday"}));
        halloween2016.addBrick(singleton.createBrick(726, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhalloween2016", "", ItemTab.BACKGROUND, false, false, 220, -1, new String[]{"Tree", "Wood", "Black", "Seasonal", "Holiday"}));
        halloween2016.addBrick(singleton.createBrick(727, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickhalloween2016", "", ItemTab.BACKGROUND, false, false, 221, -1, new String[]{"Leaves", "Plant", "Purple", "Seasonal", "Holiday"}));
        singleton.brickPackages.add(halloween2016);

        ItemBrickPackage construction = new ItemBrickPackage("construction", "Construction");
        construction.addBrick(singleton.createBrick(1096, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 265, -1, new String[]{"Plywood", "Wood", "Brown", "Tan"}));
        construction.addBrick(singleton.createBrick(1097, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 266, -1, new String[]{"Gravel", "Stone", "Gray", "Grey"}));
        construction.addBrick(singleton.createBrick(1098, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 267, -1, new String[]{"Cement", "Stone", "Beige"}));
        construction.addBrick(singleton.createBrick(1099, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 268, -1, new String[]{"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(singleton.createBrick(1130, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 291, -1, new String[]{"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(singleton.createBrick(1128, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 289, -1, new String[]{"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(singleton.createBrick(1129, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 290, -1, new String[]{"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(singleton.createBrick(1131, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 292, -1, new String[]{"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(singleton.createBrick(1100, ItemLayer.FOREGROUND, singleton.blocksBMD, "", "", ItemTab.BLOCK, false, true, 269, -1, new String[]{"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(singleton.createBrick(1503, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 310, 0x0, new String[]{"Sawhorse", "Orange", "White", "Caution", "Sign", "Stripes", "Horizontal"}));
        construction.addBrick(singleton.createBrick(1504, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 311, 0x0, new String[]{"Cone", "Orange", "White"}));
        construction.addBrick(singleton.createBrick(1505, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 312, 0x0, new String[]{"Sign", "Orange", "Caution", "Warning"}));
        construction.addBrick(singleton.createBrick(1532, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 333, 0x0, new String[]{"Sign", "Red", "Caution", "Warning", "Stop"}));
        construction.addBrick(singleton.createBrick(1533, ItemLayer.DECORATION, singleton.decoBlocksBMD, "", "", ItemTab.DECORATIVE, false, true, 334, 0x0, new String[]{"Red", "Fire", "Hydrant"}));
        construction.addBrick(singleton.createBrick(728, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 222, -1, new String[]{"Plywood", "Wood", "Brown", "Tan"}));
        construction.addBrick(singleton.createBrick(729, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 223, -1, new String[]{"Gravel", "Stone", "Gray", "Grey"}));
        construction.addBrick(singleton.createBrick(730, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 224, -1, new String[]{"Cement", "Stone", "Beige"}));
        construction.addBrick(singleton.createBrick(731, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 225, -1, new String[]{"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(singleton.createBrick(755, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 249, -1, new String[]{"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(singleton.createBrick(753, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 247, -1, new String[]{"Beam", "Metal", "Red", "Horizontal"}));
        construction.addBrick(singleton.createBrick(754, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 248, -1, new String[]{"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(singleton.createBrick(756, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 250, -1, new String[]{"Beam", "Metal", "Red", "Vertical"}));
        construction.addBrick(singleton.createBrick(732, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "", "", ItemTab.BACKGROUND, false, true, 226, -1, new String[]{"Beam", "Metal", "Red", "Vertical"}));
        singleton.brickPackages.add(construction);

        ItemBrickPackage christmas2016 = new ItemBrickPackage("christmas 2016", "Christmas 2016");
        christmas2016.addBrick(singleton.createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_RED, ItemLayer.DECORATION, singleton.blocksBMD, "brickchristmas2016", "", ItemTab.BLOCK, false, true, 270, -1, new String[]{"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "Red"}));
        christmas2016.addBrick(singleton.createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_GREEN, ItemLayer.DECORATION, singleton.blocksBMD, "brickchristmas2016", "", ItemTab.BLOCK, false, true, 271, -1, new String[]{"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "Green"}));
        christmas2016.addBrick(singleton.createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_WHITE, ItemLayer.DECORATION, singleton.blocksBMD, "brickchristmas2016", "", ItemTab.BLOCK, false, true, 272, -1, new String[]{"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "White"}));
        christmas2016.addBrick(singleton.createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_BLUE, ItemLayer.DECORATION, singleton.blocksBMD, "brickchristmas2016", "", ItemTab.BLOCK, false, true, 273, -1, new String[]{"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "Blue"}));
        christmas2016.addBrick(singleton.createBrick(ItemId.HALFBLOCK_CHRISTMAS_2016_PRESENT_YELLOW, ItemLayer.DECORATION, singleton.blocksBMD, "brickchristmas2016", "", ItemTab.BLOCK, false, true, 274, -1, new String[]{"Half block", "Present", "Gift", "Holiday", "Wrapping paper", "Ribbon", "Bow", "Yellow"}));
        christmas2016.addBrick(singleton.createBrick(ItemId.CHRISTMAS_2016_LIGHTS_DOWN, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 631, 0x0, new String[]{"Light", "String", "Wire", "Bulb", "Holiday", "Morphable", "Red", "Green", "Yellow", "Blue", "Purple"}));
        christmas2016.addBrick(singleton.createBrick(ItemId.CHRISTMAS_2016_LIGHTS_UP, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 636, 0x0, new String[]{"Light", "String", "Wire", "Bulb", "Holiday", "Morphable", "Red", "Green", "Yellow", "Blue", "Purple"}));
        christmas2016.addBrick(singleton.createBrick(1508, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 313, 0x0, new String[]{"Bell", "Bow", "Holiday", "Yellow", "Gold"}));
        christmas2016.addBrick(singleton.createBrick(1509, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 314, 0x0, new String[]{"Holly Berries", "Holiday", "Nature", "Plant", "Red", "Green"}));
        christmas2016.addBrick(singleton.createBrick(ItemId.CHRISTMAS_2016_CANDLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickchristmas2016", "", ItemTab.DECORATIVE, false, true, 640, 0x0, new String[]{"Candle", "Fire", "Flame", "Holiday", "Animated", "Red"}));
        singleton.brickPackages.add(christmas2016);

        ItemBrickPackage tiles = new ItemBrickPackage("tiles", "Tiles", new String[]{"Tile"});
        tiles.addBrick(singleton.createBrick(1106, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 275, -1, new String[]{"White"}));
        tiles.addBrick(singleton.createBrick(1107, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 276, -1, new String[]{"Gray", "Grey"}));
        tiles.addBrick(singleton.createBrick(1108, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 277, -1, new String[]{"Black", "Gray", "Grey"}));
        tiles.addBrick(singleton.createBrick(1109, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 278, -1, new String[]{"Red"}));
        tiles.addBrick(singleton.createBrick(1110, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 279, -1, new String[]{"Orange"}));
        tiles.addBrick(singleton.createBrick(1111, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 280, -1, new String[]{"Yellow"}));
        tiles.addBrick(singleton.createBrick(1112, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 281, -1, new String[]{"Green"}));
        tiles.addBrick(singleton.createBrick(1113, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 282, -1, new String[]{"Cyan"}));
        tiles.addBrick(singleton.createBrick(1114, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 283, -1, new String[]{"Blue"}));
        tiles.addBrick(singleton.createBrick(1115, ItemLayer.FOREGROUND, singleton.blocksBMD, "bricktiles", "", ItemTab.BLOCK, false, true, 284, -1, new String[]{"Purple"}));
        tiles.addBrick(singleton.createBrick(733, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 227, -1, new String[]{"White"}));
        tiles.addBrick(singleton.createBrick(734, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 228, -1, new String[]{"Gray", "Grey"}));
        tiles.addBrick(singleton.createBrick(735, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 229, -1, new String[]{"Black", "Gray", "Grey"}));
        tiles.addBrick(singleton.createBrick(736, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 230, -1, new String[]{"Red"}));
        tiles.addBrick(singleton.createBrick(737, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 231, -1, new String[]{"Orange"}));
        tiles.addBrick(singleton.createBrick(738, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 232, -1, new String[]{"Yellow"}));
        tiles.addBrick(singleton.createBrick(739, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 233, -1, new String[]{"Green"}));
        tiles.addBrick(singleton.createBrick(740, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 234, -1, new String[]{"Cyan"}));
        tiles.addBrick(singleton.createBrick(741, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 235, -1, new String[]{"Blue"}));
        tiles.addBrick(singleton.createBrick(742, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktiles", "", ItemTab.BACKGROUND, false, true, 236, -1, new String[]{"Purple"}));
        singleton.brickPackages.add(tiles);

        ItemBrickPackage stpattyday2017 = new ItemBrickPackage("St. Patricks 2017", "St. Patricks 2017");
        stpattyday2017.addBrick(singleton.createBrick(1511, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 315, 0x0, new String[]{"Shamrock", "Clover", "Green", "Plant", "Nature"}));
        stpattyday2017.addBrick(singleton.createBrick(1512, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 316, 0x0, new String[]{"Pot of Gold"}));
        stpattyday2017.addBrick(singleton.createBrick(1513, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 317, 0x0, new String[]{"Horseshoe", "Gold"}));
        stpattyday2017.addBrick(singleton.createBrick(1514, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 318, 0x0, new String[]{"Rainbow", "Left"}));
        stpattyday2017.addBrick(singleton.createBrick(1515, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickstpatricks2017", "", ItemTab.DECORATIVE, false, true, 319, 0x0, new String[]{"Rainbow", "Right"}));
        singleton.brickPackages.add(stpattyday2017);

        ItemBrickPackage halfBlockPack = new ItemBrickPackage("Half Blocks", "Half Blocks");
        halfBlockPack.addBrick(singleton.createBrick(1116, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 668, -1, new String[]{"White"}));
        halfBlockPack.addBrick(singleton.createBrick(1117, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 672, -1, new String[]{"Gray", "Grey"}));
        halfBlockPack.addBrick(singleton.createBrick(1118, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 676, -1, new String[]{"Black", "Gray", "Grey"}));
        halfBlockPack.addBrick(singleton.createBrick(1119, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 680, -1, new String[]{"Red"}));
        halfBlockPack.addBrick(singleton.createBrick(1120, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 684, -1, new String[]{"Orange"}));
        halfBlockPack.addBrick(singleton.createBrick(1121, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 688, -1, new String[]{"Yellow"}));
        halfBlockPack.addBrick(singleton.createBrick(1122, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 692, -1, new String[]{"Green"}));
        halfBlockPack.addBrick(singleton.createBrick(1123, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 696, -1, new String[]{"Cyan"}));
        halfBlockPack.addBrick(singleton.createBrick(1124, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 700, -1, new String[]{"Blue"}));
        halfBlockPack.addBrick(singleton.createBrick(1125, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickhalfblocks", "", ItemTab.BLOCK, false, true, 704, -1, new String[]{"Purple"}));
        singleton.brickPackages.add(halfBlockPack);

        ItemBrickPackage winter2018 = new ItemBrickPackage("Winter 2018", "Winter 2018", new String[]{"Winter"});
        winter2018.addBrick(singleton.createBrick(1136, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 295, -1, new String[]{"Ice", "Brick", "Cyan", "Snow"}));
        winter2018.addBrick(singleton.createBrick(1137, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 296, -1, new String[]{"Snow", "Pile", "Grey", "Gray", "White"}));
        winter2018.addBrick(singleton.createBrick(1138, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 297, -1, new String[]{"Glacier", "Snow", "Ice", "Cyan", "Blue"}));
        winter2018.addBrick(singleton.createBrick(1139, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 298, -1, new String[]{"Slate", "Grey", "Gray"}));
        winter2018.addBrick(singleton.createBrick(ItemId.HALFBLOCK_WINTER2018_SNOW, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 732, -1, new String[]{"Half Block", "Morphable", "Snow", "Pile", "Grey", "Gray", "White"}));
        winter2018.addBrick(singleton.createBrick(ItemId.HALFBLOCK_WINTER2018_GLACIER, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickwinter2018", "", ItemTab.BLOCK, false, true, 736, -1, new String[]{"Half Block", "Morphable", "Glacier", "Snow", "Ice", "Cyan", "Blue"}));
        winter2018.addBrick(singleton.createBrick(1543, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 339, 0x0, new String[]{"Snow", "Pile", "Small", "White", "Grey", "Gray"}));
        winter2018.addBrick(singleton.createBrick(1544, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 340, 0x0, new String[]{"Snow", "Pile", "Left", "White", "Grey", "Gray"}));
        winter2018.addBrick(singleton.createBrick(1545, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 341, 0x0, new String[]{"Snow", "Pile", "Right", "White", "Grey", "Gray"}));
        winter2018.addBrick(singleton.createBrick(1546, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, true, 342, 0x0, new String[]{"Snowman", "Hat", "Carrot", "Scarf", "White", "Grey", "Gray"}));
        winter2018.addBrick(singleton.createBrick(1547, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, true, 343, 0x0, new String[]{"Tree", "Wood", "Snow", "Brown", "White"}));
        winter2018.addBrick(singleton.createBrick(1548, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 344, 0x0, new String[]{"Snowflake", "Large", "Sky"}));
        winter2018.addBrick(singleton.createBrick(1549, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickwinter2018", "", ItemTab.DECORATIVE, false, false, 345, 0x0, new String[]{"Snowflake", "Small", "Sky"}));
        winter2018.addBrick(singleton.createBrick(757, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickwinter2018", "", ItemTab.BACKGROUND, false, true, 251, -1, new String[]{"Ice", "Brick", "Cyan", "Snow"}));
        winter2018.addBrick(singleton.createBrick(758, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickwinter2018", "", ItemTab.BACKGROUND, false, true, 252, -1, new String[]{"Snow", "Pile", "Grey", "Gray", "White"}));
        winter2018.addBrick(singleton.createBrick(759, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickwinter2018", "", ItemTab.BACKGROUND, false, true, 253, -1, new String[]{"Glacier", "Snow", "Ice", "Cyan", "Blue"}));
        winter2018.addBrick(singleton.createBrick(760, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickwinter2018", "", ItemTab.BACKGROUND, false, true, 254, -1, new String[]{"Slate", "Grey", "Gray", "Winter"}));
        singleton.brickPackages.add(winter2018);

        ItemBrickPackage garden = new ItemBrickPackage("Garden", "Garden", new String[]{"Garden"});
        garden.addBrick(singleton.createBrick(1143, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 300, -1, new String[]{"Rock", "Environment", "Brown", "Soil", "Dark", "Dirt"}));
        garden.addBrick(singleton.createBrick(1144, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 301, -1, new String[]{"Grass", "Moss", "Environment", "Brown", "Soil", "Dark", "Dirt"}));
        garden.addBrick(singleton.createBrick(1145, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 302, -1, new String[]{"Leaves", "Green", "Leaf", "Nature", "Plant"}));
        garden.addBrick(singleton.createBrick(1560, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 346, 0x0, new String[]{"Grass", "Green", "Nature", "Plant", "Short"}));
        garden.addBrick(singleton.createBrick(1561, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 347, 0x0, new String[]{"Fence", "White", "Short", "Post"}));
        garden.addBrick(singleton.createBrick(1562, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 348, 0x0, new String[]{"Fence", "Brown", "Lattice", "Wood"}));
        garden.addBrick(singleton.createBrick(ItemId.GARDEN_ONEWAY_FLOWER, ItemLayer.DECORATION, singleton.blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 304, 0x0, new String[]{"Flower", "Green", "Pink", "Vine", "Bean", "Stalk"}));
        garden.addBrick(singleton.createBrick(ItemId.GARDEN_ONEWAY_LEAF_L, ItemLayer.DECORATION, singleton.blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 305, 0x0, new String[]{"Leaf", "Green", "Bean", "Stalk", "Left"}));
        garden.addBrick(singleton.createBrick(ItemId.GARDEN_ONEWAY_LEAF_R, ItemLayer.DECORATION, singleton.blocksBMD, "brickgarden", "", ItemTab.BLOCK, false, true, 306, 0x0, new String[]{"Leaf", "Green", "Bean", "Stalk", "Right"}));
        garden.addBrick(singleton.createBrick(1564, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 349, 0x0, new String[]{"Snail", "Shell"}));
        garden.addBrick(singleton.createBrick(1565, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 350, 0x0, new String[]{"Butterfly"}));
        garden.addBrick(singleton.createBrick(761, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickgarden", "", ItemTab.BACKGROUND, false, true, 255, -1, new String[]{"Rock", "Environment", "Brown", "Soil", "Dark", "Dirt", "Rock"}));
        garden.addBrick(singleton.createBrick(762, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickgarden", "", ItemTab.BACKGROUND, false, true, 256, -1, new String[]{"Grass", "Moss", "Environment", "Brown", "Soil", "Dark", "Dirt"}));
        garden.addBrick(singleton.createBrick(763, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickgarden", "", ItemTab.BACKGROUND, false, true, 257, -1, new String[]{"Leaves", "Green", "Leaf", "Nature", "Plant"}));
        garden.addBrick(singleton.createBrick(1566, ItemLayer.ABOVE, singleton.decoBlocksBMD, "brickgarden", "", ItemTab.DECORATIVE, false, false, 351, 0x0, new String[]{"Wood", "Frame", "Window", "Brown", "Peep", "Hole"}));
        singleton.brickPackages.add(garden);

        ItemBrickPackage fireworks = new ItemBrickPackage("Fireworks", "Fireworks");
        fireworks.addBrick(singleton.createBrick(ItemId.FIREWORKS, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickfirework", "", ItemTab.DECORATIVE, false, false, 741, 0x0, new String[]{"Fireworks", "Purple", "White", "Red", "Blue", "Green", "Yellow", "Magenta", "Gold", "Morphable", "Seasonal", "Holiday"}));
        singleton.brickPackages.add(fireworks);

        ItemBrickPackage toxic = new ItemBrickPackage("Toxic", "Toxic", new String[]{"Toxic"});
        toxic.addBrick(singleton.createBrick(ItemId.TOXIC_WASTE_SURFACE, ItemLayer.ABOVE, singleton.specialBlocksBMD, "bricktoxic", "", ItemTab.DECORATIVE, false, false, 774, 0x0, new String[]{"Toxic", "Waste", "Green", "Glow"}));
        toxic.addBrick(singleton.createBrick(ItemId.TOXIC_WASTE_BARREL, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricktoxic", "", ItemTab.DECORATIVE, false, true, 788, 0x0, new String[]{"Toxic", "Waste", "Barrel", "Leaking", "Green", "Glow", "Morphable"}));
        toxic.addBrick(singleton.createBrick(ItemId.SEWER_PIPE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricktoxic", "", ItemTab.DECORATIVE, false, false, 789, 0x0, new String[]{"Sewer", "Pipe", "Drain", "Water", "Blue", "Lava", "Orange", "Mud", "Swamp", "Bog", "Brown", "Toxic", "Waste", "Green", "Morphable"}));
        toxic.addBrick(singleton.createBrick(ItemId.TOXIC_WASTE_BG, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "bricktoxic", "", ItemTab.BACKGROUND, false, false, 258, -1, new String[]{"Toxic", "Waste", "Green"}));
        toxic.addBrick(singleton.createBrick(ItemId.RUSTED_LADDER, ItemLayer.DECORATION, singleton.decoBlocksBMD, "bricktoxic", "", ItemTab.DECORATIVE, false, true, 356, 0x0, new String[]{"Rusty", "Rusted", "Broken", "Metal", "Ladder", "Vertical", "Industrial"}));
        toxic.addBrick(singleton.createBrick(ItemId.GUARD_RAIL, ItemLayer.ABOVE, singleton.decoBlocksBMD, "bricktoxic", "", ItemTab.DECORATIVE, false, false, 357, 0x0, new String[]{"Rusty", "Rusted", "Metal", "Guard", "Rail"}));
        toxic.addBrick(singleton.createBrick(ItemId.METAL_PLATFORM, ItemLayer.DECORATION, singleton.specialBlocksBMD, "bricktoxic", "", ItemTab.BLOCK, false, true, 795, -1, new String[]{"Rusty", "Rusted", "One way", "One-way", "Metal", "Platform", "Morphable"}));
        singleton.brickPackages.add(toxic);

        ItemBrickPackage special = new ItemBrickPackage("Special", "Special");
        special.addBrick(singleton.createBrick(ItemId.GOLDEN_EASTER_EGG, ItemLayer.ABOVE, singleton.decoBlocksBMD, "blockgoldenegg", "", ItemTab.DECORATIVE, true, false, 358, -1));
        special.addBrick(singleton.createBrick(ItemId.GREEN_SPACE, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickgreenspace", "", ItemTab.DECORATIVE, false, true, 363, -1));
        special.addBrick(singleton.createBrick(ItemId.GOLD_SACK, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickgoldsack", "", ItemTab.DECORATIVE, false, true, 364, -1));
        singleton.brickPackages.add(special);

        ItemBrickPackage dungeon = new ItemBrickPackage("Dungeon", "Dungeon", new String[]{"Halloween", "Dungeon"});
        dungeon.addBrick(singleton.createBrick(ItemId.GREY_DUNGEON_BRICK, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 311, -1, new String[]{"Grey", "Gray", "Dungeon", "Brick"}));
        dungeon.addBrick(singleton.createBrick(ItemId.GREEN_DUNGEON_BRICK, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 312, -1, new String[]{"Green", "Dungeon", "Brick"}));
        dungeon.addBrick(singleton.createBrick(ItemId.BLUE_DUNGEON_BRICK, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 313, -1, new String[]{"Blue", "Dungeon", "Brick"}));
        dungeon.addBrick(singleton.createBrick(ItemId.PURPLE_DUNGEON_BRICK, ItemLayer.FOREGROUND, singleton.blocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 314, -1, new String[]{"Purple", "Dungeon", "Brick"}));
        dungeon.addBrick(singleton.createBrick(ItemId.GREY_DUNGEON_BG, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdungeon", "", ItemTab.BACKGROUND, false, false, 262, -1, new String[]{"Grey", "Gray", "Dungeon", "Brick"}));
        dungeon.addBrick(singleton.createBrick(ItemId.GREEN_DUNGEON_BG, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdungeon", "", ItemTab.BACKGROUND, false, false, 263, -1, new String[]{"Green", "Dungeon", "Brick"}));
        dungeon.addBrick(singleton.createBrick(ItemId.BLUE_DUNGEON_BG, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdungeon", "", ItemTab.BACKGROUND, false, false, 264, -1, new String[]{"Blue", "Dungeon", "Brick"}));
        dungeon.addBrick(singleton.createBrick(ItemId.PURPLE_DUNGEON_BG, ItemLayer.BACKGROUND, singleton.bgBlocksBMD, "brickdungeon", "", ItemTab.BACKGROUND, false, false, 265, -1, new String[]{"Purple", "Dungeon", "Brick"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_PILLAR_BOTTOM, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 799, 0x0, new String[]{"Dungeon", "Brick", "Pillar", "Bottom", "Morphable"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_PILLAR_MIDDLE, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 803, 0x0, new String[]{"Dungeon", "Brick", "Pillar", "Middle", "Morphable"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_PILLAR_TOP, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdungeon", "", ItemTab.BLOCK, false, true, 807, 0x0, new String[]{"Dungeon", "Brick", "Pillar", "Top", "Morphable"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_ARCH_LEFT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 811, 0x0, new String[]{"Dungeon", "Brick", "Arch", "Left", "Morphable"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_ARCH_RIGHT, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 815, 0x0, new String[]{"Dungeon", "Brick", "Arch", "Right", "Morphable"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_TORCH, ItemLayer.DECORATION, singleton.specialBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, false, 830, 0x0, new String[]{"Dungeon", "Torch", "Fire", "Morphable"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_BARS, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, false, 359, 0x0, new String[]{"Dungeon", "Bars", "Window"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_RING, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 360, 0x0, new String[]{"Dungeon", "Chain", "Ring"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_HOOK, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 361, 0x0, new String[]{"Dungeon", "Chain", "Hook"}));
        dungeon.addBrick(singleton.createBrick(ItemId.DUNGEON_LOCK, ItemLayer.DECORATION, singleton.decoBlocksBMD, "brickdungeon", "", ItemTab.DECORATIVE, false, true, 362, 0x0, new String[]{"Dungeon", "Lock", "Padlock"}));
        singleton.brickPackages.add(dungeon);

        int shadowSelectorBG = 610;
        ItemBrickPackage shadows = new ItemBrickPackage("Shadows", "Shadows", new String[]{"Shadows", "Dark", "Glow"});
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_A, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 1, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_B, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 5, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_C, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 9, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_D, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 11, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_E, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 14, 0x0, new String[]{}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_F, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 16, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_G, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 20, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_H, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 24, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_I, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 26, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_J, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 29, 0x0, new String[]{}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_K, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 31, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_L, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 35, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_M, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 39, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        shadows.addBrick(singleton.createBrick(ItemId.SHADOW_N, ItemLayer.DECORATION, singleton.shadowBlocksBMD, "", "", ItemTab.DECORATIVE, false, false, 43, 0x0, new String[]{"Morphable"}, false, false, shadowSelectorBG));
        singleton.brickPackages.add(shadows);
    }

    static void initializeManager() {
        if (init) throw new RuntimeException("already initialised Item Manager");
        init = true;

        initSmileys();
        initAuras();
        initNpcs();

        initBricks();
        initActions();
        initDecoratives();
        initBackgrounds();
        initRest1();
        initRest2();
        initRest3();
        initRest4();

        //add npcs brick package declared earlier, so they will end up in the end of Action tab.
        singleton.brickPackages.add(npc);

        // Free IDs:

        // Smiley: 183

        // Background: 773
        // Solid: 1156
        // Decoration: 1623

        // NPCs are 1550-1559 and 1569-1579 :P

        // Art offsets:
        // singleton.decorationsBMD: 358
        // singleton.backgroundBricksBMD: 259
        // singleton.foregroundBricksBMD: 311
        // singleton.specialBricksBMD: 797
    }
}
