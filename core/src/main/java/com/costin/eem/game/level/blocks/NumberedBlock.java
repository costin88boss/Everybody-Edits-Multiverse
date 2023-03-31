package com.costin.eem.game.level.blocks;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.costin.eem.client.screens.WorldScreen;
import com.costin.eem.game.items.ItemId;
import com.costin.eem.game.items.ItemManager;
import com.costin.eem.game.level.Block;
import com.costin.eem.utils.FontManager;

public class NumberedBlock extends Block {
    public int rotation;

    public NumberedBlock(int id, int rotation) {
        super(id);
        this.rotation = rotation;
    }

    @Override
    public void draw(SpriteBatch batch, int x, int y) {
        int drawRotation = 0;
        if(ItemId.isBlockRotateable(id) || id == ItemId.SPIKE || id == ItemId.SPIKE_SILVER || id == ItemId.SPIKE_BLACK
            || id == ItemId.SPIKE_RED || id == ItemId.SPIKE_GOLD || id == ItemId.SPIKE_GREEN || id == ItemId.SPIKE_BLUE) {
            drawRotation = (rotation - 1) * -90;
        }
        ItemManager.instance().getBrickById(id).draw(batch, drawRotation, x * 16, (WorldScreen.instance().getWorld().getHeight() - y) * 16);
        if(ItemId.isBlockNumbered(id)) {
            String text = Integer.toString(rotation);
            Color color = new Color();
            GlyphLayout layout = new GlyphLayout(FontManager.instance().getMiniFont(), Integer.toString(rotation));
            Color.argb8888ToColor(color, ItemManager.instance().getBrickById(id).getMinimapColor());
            if(color.r + color.g + color.b > 1.5f/*1.5f*/) {
                FontManager.instance().getMiniFont().setColor(0, 0, 0, 1);
            }
            FontManager.instance().getMiniFont().draw(batch, Integer.toString(rotation), x * 16 + 16 - layout.width - 1, (WorldScreen.instance().getWorld().getHeight() - y) * 16 + FontManager.instance().getMiniFont().getCapHeight() + 1);
            FontManager.instance().getMiniFont().setColor(1,1,1,1);
        }
    }
}
