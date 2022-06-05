package edu.myclassroom.manager.view;

import edu.myclassroom.manager.controller.ClassroomController;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ClassroomForm {

    private static ClassroomForm classroomFormInstance;
    private final FXMLLoader fxmlLoader = new FXMLLoader(
            new LoadResources( "/template/classroomForm.fxml" ).getResourcesAsUrl()
    );

    private ClassroomForm() {}

    public static ClassroomForm buildClassroomForm() {
        if ( classroomFormInstance == null ) {
            classroomFormInstance = new ClassroomForm();
        }

        return classroomFormInstance;
    }

    public BorderPane getClassroomFormInstance() {
        try {
            return this.fxmlLoader.load();
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

    public ClassroomController getClassroomControler() {
        return this.fxmlLoader.getController();
    }
}
