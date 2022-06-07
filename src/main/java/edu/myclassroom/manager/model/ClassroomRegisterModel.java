package edu.myclassroom.manager.model;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.view.ClassroomRegisterButton;
import lombok.Data;

import java.util.List;

@Data
public class ClassroomRegisterModel {
    private ClassroomModel classroomModel;
    private ClassroomRegisterButton classroomRegisterButton;
    private int classroomId;
    private String name;
    private int seatsNumber;
    private ClassroomType type;
    private List <ClassroomEquipment> equipment;
    private BottomNavigationButton Delete;
    private BottomNavigationButton modify;
    private BottomNavigationButton booking;

    public ClassroomRegisterModel( ClassroomModel classroomModel, ClassroomRegisterButton classroomRegisterButton ) {
        this.classroomId = classroomModel.getId();
        this.name = classroomModel.getName();
        this.seatsNumber = classroomModel.getSeatsNumber();
        this.type = classroomModel.getType();
        this.equipment = classroomModel.getEquipment();
        this.Delete = classroomRegisterButton.getDelete();
        this.modify = classroomRegisterButton.getModify();
        this.booking = classroomRegisterButton.getBooking();
    }
}
