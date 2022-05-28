package edu.myclassroom.manager.view;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class WindowImpl implements Window {
    private final Stage stage;
    private final Scene scene;
    private final String title;
    public final double STAGE_WIDTH;
    public final double STAGE_HEIGHT;
    private final boolean resizable;
    private final boolean fullscreen;

    public WindowImpl( Stage stage, Scene scene, String title, double width, double height, boolean resizable, boolean fullscreen ) {
        this.stage = stage;
        this.scene = scene;
        this.title = title;
        this.STAGE_WIDTH = width;
        this.STAGE_HEIGHT = height;
        this.resizable = resizable;
        this.fullscreen = fullscreen;
    }

    @Override
    public void bootstrapStageOfApp() {
        this.stage.setTitle( this.title );
        this.stage.setResizable( this.resizable );
        this.stage.setFullScreen( this.fullscreen );
        this.stage.setMinWidth( this.STAGE_WIDTH );
        this.stage.setMinHeight( this.STAGE_HEIGHT );
        this.stage.setWidth( STAGE_WIDTH );
        this.stage.setHeight( STAGE_HEIGHT );
        this.stage.setScene( this.scene );
    }

    @Override
    public void showAppStage() {
        this.stage.show();
    }

}
