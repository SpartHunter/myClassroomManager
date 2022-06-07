package edu.myclassroom.manager.controller;

import edu.myclassroom.manager.view.ParentContainer;
import edu.myclassroom.manager.view.Window;
import edu.myclassroom.manager.view.WindowImpl;
import javafx.stage.Stage;

public class windowStageController {
    private static windowStageController windowStageControllerInstance;
    private final static String APP_TITLE = "CLASSROOM MANAGEMENT";
    ParentContainer parentContainer;
    private final Window primaryWindow;

    private windowStageController( Stage stage ) {
        parentContainer = ParentContainer.buildParentContainer();
        this.primaryWindow = new WindowImpl( stage, parentContainer.getSceneInstance(), APP_TITLE );
    }

    public static windowStageController getSceneControllerInstance( Stage stage ) {
        if ( windowStageControllerInstance == null ) {
            windowStageControllerInstance = new windowStageController( stage );
        }

        return windowStageControllerInstance;
    }

    public static windowStageController getSceneControllerInstance() {
        return windowStageControllerInstance;
    }

    public void buildApplication() {
        this.primaryWindow.bootstrapStageOfApp();
        this.primaryWindow.showAppStage();
    }

    public ParentContainer getParentContainer() {
        return parentContainer;
    }
}
