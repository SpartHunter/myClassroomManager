package edu.myclassroom.manager.view;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import lombok.Data;

@Data
public class ClassroomTableButton {
    private int id;
    private BottomNavigationButton Delete;
    private BottomNavigationButton modify;
    private BottomNavigationButton booking;
}
