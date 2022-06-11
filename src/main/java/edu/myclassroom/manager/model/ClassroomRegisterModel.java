package edu.myclassroom.manager.model;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.view.RegisterButton;
import lombok.Data;

import java.util.List;

@Data
public class ClassroomRegisterModel {
    private ClassroomModel classroomModel;
    private RegisterButton registerButton;
    private int classroomId;
    private String name;
    private int seatsNumber;
    private ClassroomType type;
    private List <ClassroomEquipment> equipment;
    private BottomNavigationButton Delete;
    private BottomNavigationButton modify;
    private BottomNavigationButton booking;

    public ClassroomRegisterModel( ClassroomModel classroomModel, RegisterButton registerButton ) {
        this.classroomId = classroomModel.getId();
        this.name = classroomModel.getName();
        this.seatsNumber = classroomModel.getSeatsNumber();
        this.type = classroomModel.getType();
        this.equipment = classroomModel.getEquipment();
        this.Delete = registerButton.getDelete();
        this.modify = registerButton.getModify();
        this.booking = registerButton.getBooking();
    }
}
