package edu.myclassroom.manager.view;

import edu.myclassroom.manager.controller.ParentContainerController;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ParentContainer {
    private static ParentContainer parentContainerInstance;
    private final FXMLLoader fxmlLoader = new FXMLLoader(
            new LoadResources( "/template/application.fxml" ).getResourcesAsUrl()
    );

    private ParentContainer() {}

    public static ParentContainer buildParentContainer() {
        if ( parentContainerInstance == null ) {
            parentContainerInstance = new ParentContainer();
        }

        return parentContainerInstance;
    }

    public Scene getSceneInstance() {
        try {
            AnchorPane xmlAnchorPane = this.fxmlLoader.load();
            return new Scene( xmlAnchorPane );
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

    public ParentContainerController getParentContainerController() {
        return fxmlLoader.getController();
    }
}
