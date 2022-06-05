package edu.myclassroom.manager.model;

import lombok.Data;

import java.util.List;

@Data
public class TeacherModel {
    private String name;
    private String registrationNumber;
    private List <BookingModel> booking;
}
