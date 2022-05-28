package edu.myclassroom.manager.controller;

import edu.myclassroom.manager.utility.LoadResources;
import edu.myclassroom.manager.view.ParentContainer;
import edu.myclassroom.manager.view.Window;
import edu.myclassroom.manager.view.WindowImpl;
import javafx.stage.Stage;

public class windowStageController {
    private static windowStageController windowStageControllerInstance;
    private final static String appTitle = "CLASSROOM MANAGEMENT";
    private final double SCENE_WIDTH;
    private final double SCENE_HEIGHT;
    private final Stage stage;
    private final ParentContainer parentContainer;
    private final Window primaryWindow;

    private windowStageController( Stage stage, double width, double height ) {
        this.parentContainer = ParentContainer.buildParentContainer( width, height,
                new LoadResources( "/css/appStylesheet.css" ).getResourcesAsStringPath()
        );
        this.primaryWindow = new WindowImpl( stage, this.parentContainer.getSceneInstance(),
                appTitle, width, height, false, false
        );
        this.stage = stage;
        this.SCENE_HEIGHT = height;
        this.SCENE_WIDTH = width;
    }

    public static windowStageController getSceneControllerInstance( Stage stage, double width, double height ) {
        if ( windowStageControllerInstance == null ) {
            windowStageControllerInstance = new windowStageController( stage, width, height );
        }

        return windowStageControllerInstance;
    }

    public void buildApplication() {
        this.primaryWindow.bootstrapStageOfApp();
        this.primaryWindow.showAppStage();
    }
}
