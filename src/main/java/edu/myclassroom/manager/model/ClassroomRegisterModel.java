package edu.myclassroom.manager.model;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.view.ClassroomTableButton;
import lombok.Data;

import java.util.List;

@Data
public class ClassroomRegisterModel {
    private ClassroomModel classroomModel;
    private ClassroomTableButton classroomTableButton;
    private int classroomId;
    private String name;
    private int seatsNumber;
    private ClassroomType type;
    private List <ClassroomEquipment> equipment;
    private BottomNavigationButton Delete;
    private BottomNavigationButton modify;
    private BottomNavigationButton booking;

    public ClassroomRegisterModel( ClassroomModel classroomModel, ClassroomTableButton classroomTableButton ) {
        this.classroomId = classroomModel.getId();
        this.name = classroomModel.getName();
        this.seatsNumber = classroomModel.getSeatsNumber();
        this.type = classroomModel.getType();
        this.equipment = classroomModel.getEquipment();
        this.Delete = classroomTableButton.getDelete();
        this.modify = classroomTableButton.getModify();
        this.booking = classroomTableButton.getBooking();
    }
}
