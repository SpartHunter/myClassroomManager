package edu.myclassroom.manager.controller;

import javafx.stage.Stage;

public class MainController {
    private static MainController mainControllerInstance;

    private MainController() {}

    public static MainController getMainControllerInstance() {
        System.out.println( "⇒ Method getMainControllerInstance, create singleton object instance of MainController " +
                "if this object contains null value and return this." );
        if ( mainControllerInstance == null ) {
            mainControllerInstance = new MainController();
        }

        return mainControllerInstance;
    }

    public void startAppController( Stage stage ) {
        System.out.println( "⇒ Method startAppController call view class to configure stage, set scene in stage and show this." );
        windowStageController.getSceneControllerInstance( stage ).buildApplication();
    }
}
