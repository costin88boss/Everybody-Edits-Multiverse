package com.costin.eem.game.world.tiles;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.costin.eem.Game;
import com.costin.eem.game.world.items.ItemId;
import com.costin.eem.game.world.items.manager.ItemManager;
import com.costin.eem.net.client.GameClient;

public class NumberedTile extends BaseTile {
    public int rotation;

    public NumberedTile(int id, String placedBy, int rotation) {
        super(id, placedBy);
        this.rotation = rotation;
    }

    @Override
    public boolean tileEquals(BaseTile tile) {
        if ((tile instanceof NumberedTile))
            return tile.id == id && ((NumberedTile) tile).rotation == rotation;
        else return false;
    }

    @Override
    public void draw(SpriteBatch batch, int x, int y) {
        int drawRotation = 0;
        if(ItemId.isBlockRotateable(id) || id == ItemId.SPIKE || id == ItemId.SPIKE_SILVER || id == ItemId.SPIKE_BLACK
            || id == ItemId.SPIKE_RED || id == ItemId.SPIKE_GOLD || id == ItemId.SPIKE_GREEN || id == ItemId.SPIKE_BLUE) {
            drawRotation = (rotation - 1) * -90;
        }
        ItemManager.instance().getBrickById(id).draw(batch, drawRotation, x * 16, (GameClient.getWorld().getHeight() - y - 1) * 16);
        if(ItemId.isBlockNumbered(id)) {
            BitmapFont font = Game.instance().getFont(Game.FontType.VISITOR, 12);
            String text = Integer.toString(rotation);
            Color color = new Color();
            GlyphLayout layout = new GlyphLayout(font, Integer.toString(rotation));
            Color.argb8888ToColor(color, ItemManager.instance().getBrickById(id).getMinimapColor());
            if(color.r + color.g + color.b > 1.5f/*1.5f*/) {
                font.setColor(0, 0, 0, 1);
            }
           font.draw(batch, Integer.toString(rotation), x * 16 + 16 - layout.width - 1, (GameClient.getWorld().getHeight() - y - 1) * 16 + font.getCapHeight() + 1);
           font.setColor(1,1,1,1);
        }

        //
        //    int drawRotation = 0;
        //    if(ItemId.isBlockRotateable(id) || id == ItemId.SPIKE || id == ItemId.SPIKE_SILVER || id == ItemId.SPIKE_BLACK
        //        || id == ItemId.SPIKE_RED || id == ItemId.SPIKE_GOLD || id == ItemId.SPIKE_GREEN || id == ItemId.SPIKE_BLUE) {
        //        drawRotation = (rotation - 1) * -90;
        //    }
        //    ItemManager.instance().getBrickById(id).draw(batch, drawRotation, x * 16, (WorldScreen.instance().getWorld().getHeight() - y) * 16);
        //    if(ItemId.isBlockNumbered(id)) {
        //        String text = Integer.toString(rotation);
        //        Color color = new Color();
        //        GlyphLayout layout = new GlyphLayout(FontManager.instance().getMiniFont(), Integer.toString(rotation));
        //        Color.argb8888ToColor(color, ItemManager.instance().getBrickById(id).getMinimapColor());
        //        if(color.r + color.g + color.b > 1.5f/*1.5f*/) {
        //            FontManager.instance().getMiniFont().setColor(0, 0, 0, 1);
        //        }
        //        FontManager.instance().getMiniFont().draw(batch, Integer.toString(rotation), x * 16 + 16 - layout.width - 1, (WorldScreen.instance().getWorld().getHeight() - y) * 16 + FontManager.instance().getMiniFont().getCapHeight() + 1);
        //        FontManager.instance().getMiniFont().setColor(1,1,1,1);
        //    }
    }
}
