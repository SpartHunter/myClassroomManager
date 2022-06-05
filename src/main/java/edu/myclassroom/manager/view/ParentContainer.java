package edu.myclassroom.manager.view;

import edu.myclassroom.manager.controller.ClassroomRegisterController;
import edu.myclassroom.manager.controller.ParentContainerController;
import edu.myclassroom.manager.model.ClassroomModel;
import edu.myclassroom.manager.model.ClassroomRegisterModel;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

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
            ParentContainerController parent = this.fxmlLoader.getController();
            BorderPane pane = ClassroomForm.buildClassroomForm().getClassroomFormInstance();
            StackPane scroll = ClassroomRegister.buildClassroomTable().getClassroomTable();
            ClassroomRegisterController tableController = ClassroomRegister.buildClassroomTable().getClassroomRegisterController();
            for ( ClassroomModel model : ClassroomModel.defaultClassroomList() ) {
                ClassroomTableButton button = new ClassroomTableButton();
                button.setId( model.getId() );
                ClassroomRegisterModel tableModel = new ClassroomRegisterModel( model, button );
                tableController.addItems( tableModel );
            }
            parent.getBodyGrid().add( pane, 1, 0, 5, 2 );
            parent.getBodyGrid().add( scroll, 0, 2, 7, 6 );
            return new Scene( xmlAnchorPane );
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

}
