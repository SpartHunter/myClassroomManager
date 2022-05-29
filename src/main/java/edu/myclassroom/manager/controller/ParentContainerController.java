package edu.myclassroom.manager.controller;

import com.gluonhq.charm.glisten.control.AutoCompleteTextField;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.model.ManagementEntity;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ParentContainerController {
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
}
