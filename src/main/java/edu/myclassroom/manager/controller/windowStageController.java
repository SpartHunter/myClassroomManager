package edu.myclassroom.manager.controller;

import edu.myclassroom.manager.view.ParentContainer;
import edu.myclassroom.manager.view.Window;
import edu.myclassroom.manager.view.WindowImpl;
import javafx.stage.Stage;

public class windowStageController {
    private static windowStageController windowStageControllerInstance;
    private final static String appTitle = "CLASSROOM MANAGEMENT";
    private final Stage stage;
    private final ParentContainer parentContainer;
    private final Window primaryWindow;

    private windowStageController( Stage stage ) {
        this.parentContainer = ParentContainer.buildParentContainer();
        this.primaryWindow = new WindowImpl( stage, this.parentContainer.getSceneInstance(), appTitle );
        this.stage = stage;
    }

    public static windowStageController getSceneControllerInstance( Stage stage ) {
        if ( windowStageControllerInstance == null ) {
            windowStageControllerInstance = new windowStageController( stage );
        }

        return windowStageControllerInstance;
    }

    public void buildApplication() {
        this.primaryWindow.bootstrapStageOfApp();
        this.primaryWindow.showAppStage();
    }
}
