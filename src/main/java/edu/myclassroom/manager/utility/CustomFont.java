package edu.myclassroom.manager.utility;

import javafx.scene.text.Font;

public class CustomFont {
    private final Font Default = Font.loadFont(
            new LoadResources( "/font/font-regular-oblique.otf" ).getResourcesAsStringPath(), 15 );
    private final Font bold = Font.loadFont(
            new LoadResources( "/font/font-bold.otf" ).getResourcesAsStringPath(), 15 );

    public static Font getDefaultFont() {
        return new CustomFont().Default;
    }

    public static Font getBoldFont() {
        return new CustomFont().bold;
    }
}
