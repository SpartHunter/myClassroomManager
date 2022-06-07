package edu.myclassroom.manager.view;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class WindowImpl implements Window {
    private final Stage stage;
    private final Scene scene;
    private final String title;

    public WindowImpl( Stage stage, Scene scene, String title ) {
        this.stage = stage;
        this.scene = scene;
        this.title = title;
    }

    @Override
    public void bootstrapStageOfApp() {
        this.stage.setTitle( this.title );
        this.stage.setScene( this.scene );
        this.stage.setResizable( false );
        this.stage.setFullScreen( false );
        this.stage.setMaxHeight( 850.0 );
        this.stage.setMaxWidth( 1220.0 );
        this.stage.setMinHeight( 850.0 );
        this.stage.setMinWidth( 1220.0 );
    }

    @Override
    public void showAppStage() {
        this.stage.show();
    }
}
