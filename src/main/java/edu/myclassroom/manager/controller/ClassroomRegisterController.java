package edu.myclassroom.manager.controller;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.model.ClassroomEquipment;
import edu.myclassroom.manager.model.ClassroomRegisterModel;
import edu.myclassroom.manager.model.ClassroomType;
import edu.myclassroom.manager.view.ClassroomRegisterButton;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class ClassroomRegisterController {
    @FXML
    private TableView <ClassroomRegisterModel> classroomTableView;
    @FXML
    private TableColumn <String, ClassroomRegisterModel> classroomName;
    @FXML
    private TableColumn <ClassroomType, ClassroomRegisterModel> classroomType;
    @FXML
    private TableColumn <List <ClassroomEquipment>, ClassroomRegisterModel> classroomEquipment;
    @FXML
    private TableColumn <Integer, ClassroomRegisterModel> classroomSeats;
    @FXML
    private TableColumn <BottomNavigationButton, ClassroomRegisterButton> classroomBooking;
    @FXML
    private TableColumn <BottomNavigationButton, ClassroomRegisterButton> classroomModify;
    @FXML
    private TableColumn <BottomNavigationButton, ClassroomRegisterButton> classroomDelete;

    public void addItems( ClassroomRegisterModel classroomRegisterModel ) {
        if ( !classroomTableView.getItems().contains( classroomRegisterModel ) ) {
            this.classroomName.setCellValueFactory( new PropertyValueFactory <>( "name" ) );
            this.classroomType.setCellValueFactory( new PropertyValueFactory <>( "type" ) );
            this.classroomEquipment.setCellValueFactory( new PropertyValueFactory <>( "equipment" ) );
            this.classroomSeats.setCellValueFactory( new PropertyValueFactory <>( "seatsNumber" ) );
            this.classroomBooking.setCellValueFactory( new PropertyValueFactory <>( "booking" ) );
            this.classroomModify.setCellValueFactory( new PropertyValueFactory <>( "modify" ) );
            this.classroomDelete.setCellValueFactory( new PropertyValueFactory <>( "Delete" ) );
            this.classroomTableView.getItems().add( classroomRegisterModel );
        }
    }
}
