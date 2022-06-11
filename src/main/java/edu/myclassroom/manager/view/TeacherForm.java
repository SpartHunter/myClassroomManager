package edu.myclassroom.manager.view;

import edu.myclassroom.manager.controller.TeacherFormController;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class TeacherForm {
    private static TeacherForm teacherFormInstance;
    private final BorderPane borderPane;
    private final FXMLLoader fxmlLoader = new FXMLLoader(
            new LoadResources( "/template/teacherForm.fxml" ).getResourcesAsUrl()
    );

    private TeacherForm() {
        try {
            this.borderPane = this.fxmlLoader.load();
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

    public static TeacherForm buildTeacherForm() {
        if ( teacherFormInstance == null ) {
            teacherFormInstance = new TeacherForm();
        }

        return teacherFormInstance;
    }

    public BorderPane getTeacherFormInstance() {
        return this.borderPane;
    }

    public TeacherFormController getClassroomFormControler() {
        return this.fxmlLoader.getController();
    }
}
