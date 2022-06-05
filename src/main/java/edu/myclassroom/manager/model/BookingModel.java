package edu.myclassroom.manager.model;

import lombok.Data;

import java.util.Date;

@Data
public class BookingModel {
    private Date beginDate;
    private Date endDate;
    private TeacherModel teacher;
    private ClassroomModel classroom;
}
