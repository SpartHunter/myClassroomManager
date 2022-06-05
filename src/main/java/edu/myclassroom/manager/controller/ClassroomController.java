package edu.myclassroom.manager.controller;

import edu.myclassroom.manager.model.ClassroomEquipment;
import edu.myclassroom.manager.model.ClassroomType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import lombok.Data;
import org.controlsfx.control.CheckComboBox;

@Data
public class ClassroomController {
    @FXML
    private TextField classroomName;
    @FXML
    private TextField classroomSeats;
    @FXML
    private ComboBox <ClassroomType> classroomType;
    @FXML
    private CheckComboBox <ClassroomEquipment> classroomEquipment;
    @FXML
    private Button saveClassroom;
}
