package edu.myclassroom.manager;

import edu.myclassroom.manager.controller.MainController;
import javafx.stage.Stage;

public class MainApp extends javafx.application.Application {
    public static void main( String[] args ) {
        System.out.println( "*** MainApp begin running in main, on executed launch method in JFX MainApp class ***" );
        launch( args );
    }

    @Override
    public void start( Stage stage ) {
        System.out.println( "⇒ Launch method in Main called start method and this, called MainController class." );
        MainController.getMainControllerInstance().startAppController( stage );
    }
}
