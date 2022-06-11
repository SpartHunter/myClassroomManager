package edu.myclassroom.manager.view;

import edu.myclassroom.manager.controller.ClassroomRegisterController;
import edu.myclassroom.manager.controller.GridContainer;
import edu.myclassroom.manager.model.ClassroomModel;
import edu.myclassroom.manager.model.ClassroomRegisterModel;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class ClassroomPage {
    private static ClassroomPage classroomPageInstance;
    private final GridPane gridpane;
    private final FXMLLoader fxmlLoader = new FXMLLoader(
            new LoadResources( "/template/gridContainer.fxml" ).getResourcesAsUrl()
    );

    private ClassroomPage() {
        try {
            gridpane = this.fxmlLoader.load();
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

    public static ClassroomPage buildClassroomPage() {
        if ( classroomPageInstance == null ) {
            classroomPageInstance = new ClassroomPage();
        }

        return classroomPageInstance;
    }

    public GridPane getClassroomPageInstance() {
        GridContainer gridContainer = this.fxmlLoader.getController();
        BorderPane classroomForm = ClassroomForm.buildClassroomForm().getClassroomFormInstance();
        StackPane classroomRegister = ClassroomRegister.buildClassroomRegister().getClassroomRegisterInstance();
        ClassroomRegisterController registerController = ClassroomRegister.buildClassroomRegister().getClassroomRegisterController();

        for ( ClassroomModel defaultClassroom : ClassroomModel.defaultClassroomList() ) {
            RegisterButton button = new RegisterButton( defaultClassroom.getId() );
            ClassroomRegisterModel registerModel = new ClassroomRegisterModel( defaultClassroom, button );
            registerController.addItems( registerModel );
        }

        try {
            gridContainer.getBodyGrid().add( classroomForm, 1, 0, 5, 2 );
            gridContainer.getBodyGrid().add( classroomRegister, 0, 2, 7, 7 );
        } catch ( IllegalArgumentException e ) {
            return this.gridpane;
        }

        return this.gridpane;

    }

    public GridContainer getClassroomPageController() {
        return fxmlLoader.getController();
    }
}
