package edu.myclassroom.manager.view;

import edu.myclassroom.manager.controller.ClassroomRegisterController;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class ClassroomRegister {
    private static ClassroomRegister classroomRegister;
    private final FXMLLoader fxmlLoader = new FXMLLoader(
            new LoadResources( "/template/classroomRegister.fxml" ).getResourcesAsUrl() );

    private ClassroomRegister() {}

    public static ClassroomRegister buildClassroomTable() {
        if ( classroomRegister == null ) {
            classroomRegister = new ClassroomRegister();
        }

        return classroomRegister;
    }

    public StackPane getClassroomTable() {
        try {
            return fxmlLoader.load();
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

    public ClassroomRegisterController getClassroomRegisterController() {
        return this.fxmlLoader.getController();
    }
}
