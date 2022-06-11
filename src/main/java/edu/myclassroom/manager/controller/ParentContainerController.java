package edu.myclassroom.manager.controller;

import com.gluonhq.charm.glisten.control.AutoCompleteTextField;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.model.ManagementEntity;
import edu.myclassroom.manager.view.ClassroomPage;
import edu.myclassroom.manager.view.TeacherPage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import lombok.Data;

import java.net.URL;
import java.util.ResourceBundle;

@Data
public class ParentContainerController implements Initializable {
    @FXML
    private AutoCompleteTextField <ManagementEntity> searchInput;
    @FXML
    private BottomNavigationButton classroomMenuButton;
    @FXML
    private BottomNavigationButton teacherMenuButton;
    @FXML
    private BottomNavigationButton bookingMenuButton;
    @FXML
    private BottomNavigationButton faqMenuButton;
    @FXML
    private Button searchButton;
    @FXML
    private AnchorPane customContent;
    @FXML
    private AnchorPane formContent;
    @FXML
    private AnchorPane tableContent;
    @FXML
    private AnchorPane body;
    private GridPane classroomPage = ClassroomPage.buildClassroomPage().getClassroomPageInstance();
    private GridPane teacherPage = TeacherPage.buildTeacherPage().getTeacherPageInstance();

    @Override
    public void initialize( URL url, ResourceBundle resourceBundle ) {

    }

    @FXML
    private void goToClassroomPage( ActionEvent actionEvent ) {
        this.getBody().getChildren().setAll( this.classroomPage );
    }

    @FXML
    private void goToTeacherPage( ActionEvent actionEvent ) {
        this.getBody().getChildren().setAll( this.teacherPage );
    }

    @FXML
    private void goToBookingPage( ActionEvent actionEvent ) {
    }

    @FXML
    private void goToFAQPage( ActionEvent actionEvent ) {
    }

    @FXML
    private void findData( ActionEvent actionEvent ) {
    }
}
