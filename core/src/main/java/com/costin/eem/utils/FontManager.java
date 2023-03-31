package com.costin.eem.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class FontManager {
    private static FontManager singleton;

    private final BitmapFont miniFont;

    public BitmapFont getMiniFont() {
        return miniFont;
    }

    private FontManager() {
        FreeTypeFontGenerator generator_nokiafc22 = new FreeTypeFontGenerator(Gdx.files.internal("media/nokiafc22.ttf"));
        FreeTypeFontGenerator generator_visitor = new FreeTypeFontGenerator(Gdx.files.internal("media/visitor.ttf"));

        FreeTypeFontGenerator.FreeTypeFontParameter param = new FreeTypeFontGenerator.FreeTypeFontParameter();

        param.size = 12;
        miniFont = generator_visitor.generateFont(param);

        generator_nokiafc22.dispose();
        generator_visitor.dispose();
    }

    public void dispose() {

    }

    public static FontManager instance() {
        if (singleton == null) {
            singleton = new FontManager();
        }
        return singleton;
    }


}
