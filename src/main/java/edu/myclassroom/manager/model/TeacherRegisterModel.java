package edu.myclassroom.manager.model;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.view.RegisterButton;
import lombok.Data;

@Data
public class TeacherRegisterModel {
    private String name;
    private String registrationNumber;
    private BottomNavigationButton Delete;
    private BottomNavigationButton modify;
    private BottomNavigationButton booking;

    public TeacherRegisterModel( TeacherModel teacherModel, RegisterButton registerButton ) {
        this.name = teacherModel.getName();
        this.registrationNumber = teacherModel.getRegistrationNumber();
        this.Delete = registerButton.getDelete();
        this.modify = registerButton.getModify();
        this.booking = registerButton.getBooking();
    }
}
