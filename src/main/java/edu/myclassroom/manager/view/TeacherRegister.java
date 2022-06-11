package edu.myclassroom.manager.view;

import edu.myclassroom.manager.controller.TeacherRegisterController;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class TeacherRegister {
    private static TeacherRegister teacherRegisterInstance;
    private final StackPane stackPane;
    private final FXMLLoader fxmlLoader = new FXMLLoader(
            new LoadResources( "/template/teacherRegister.fxml" ).getResourcesAsUrl() );

    private TeacherRegister() {
        try {
            stackPane = this.fxmlLoader.load();
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

    public static TeacherRegister buildTeacherRegister() {
        if ( teacherRegisterInstance == null ) {
            teacherRegisterInstance = new TeacherRegister();
        }

        return teacherRegisterInstance;
    }

    public StackPane getTeacherRegisterInstance() {
        return this.stackPane;
    }

    public TeacherRegisterController getTeacherRegisterController() {
        return this.fxmlLoader.getController();
    }
}
