package edu.myclassroom.manager.view;

import edu.myclassroom.manager.controller.GridContainer;
import edu.myclassroom.manager.controller.TeacherRegisterController;
import edu.myclassroom.manager.model.TeacherModel;
import edu.myclassroom.manager.model.TeacherRegisterModel;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class TeacherPage {
    private static TeacherPage teacherPageInstance;
    private final GridPane gridpane;
    private final FXMLLoader fxmlLoader = new FXMLLoader(
            new LoadResources( "/template/gridContainer.fxml" ).getResourcesAsUrl()
    );

    private TeacherPage() {
        try {
            gridpane = this.fxmlLoader.load();
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

    public static TeacherPage buildTeacherPage() {
        if ( teacherPageInstance == null ) {
            teacherPageInstance = new TeacherPage();
        }

        return teacherPageInstance;
    }

    public GridPane getTeacherPageInstance() {
        GridContainer gridContainer = this.fxmlLoader.getController();
        BorderPane teacherForm = TeacherForm.buildTeacherForm().getTeacherFormInstance();
        StackPane teacherRegister = TeacherRegister.buildTeacherRegister().getTeacherRegisterInstance();
        TeacherRegisterController registerController = TeacherRegister.buildTeacherRegister().getTeacherRegisterController();

        for ( TeacherModel defaultTeacher : TeacherModel.defaultTeacherList() ) {
            RegisterButton button = new RegisterButton( defaultTeacher.getId() );
            TeacherRegisterModel registerModel = new TeacherRegisterModel( defaultTeacher, button );
            registerController.addItems( registerModel );
        }

        try {
            gridContainer.getBodyGrid().add( teacherForm, 1, 0, 5, 2 );
            gridContainer.getBodyGrid().add( teacherRegister, 0, 2, 7, 7 );
        } catch ( IllegalArgumentException e ) {
            return this.gridpane;
        }

        return this.gridpane;

    }

    public GridContainer getTeacherPageController() {
        return fxmlLoader.getController();
    }
}
