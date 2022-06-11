package edu.myclassroom.manager.controller;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.model.TeacherRegisterModel;
import edu.myclassroom.manager.view.RegisterButton;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TeacherRegisterController {
    @FXML
    private TableView <TeacherRegisterModel> teacherTableView;
    @FXML
    private TableColumn <String, TeacherRegisterModel> teacherName;
    @FXML
    private TableColumn <String, TeacherRegisterModel> teacherRegistrationNumber;
    @FXML
    private TableColumn <BottomNavigationButton, RegisterButton> teacherBooking;
    @FXML
    private TableColumn <BottomNavigationButton, RegisterButton> teacherModify;
    @FXML
    private TableColumn <BottomNavigationButton, RegisterButton> teacherDelete;

    public void addItems( TeacherRegisterModel teacherRegisterModel ) {
        if ( !teacherTableView.getItems().contains( teacherRegisterModel ) ) {
            this.teacherName.setCellValueFactory( new PropertyValueFactory <>( "name" ) );
            this.teacherRegistrationNumber.setCellValueFactory( new PropertyValueFactory <>( "registrationNumber" ) );
            this.teacherBooking.setCellValueFactory( new PropertyValueFactory <>( "booking" ) );
            this.teacherModify.setCellValueFactory( new PropertyValueFactory <>( "modify" ) );
            this.teacherDelete.setCellValueFactory( new PropertyValueFactory <>( "Delete" ) );
            this.teacherTableView.getItems().add( teacherRegisterModel );
        }
    }
}
