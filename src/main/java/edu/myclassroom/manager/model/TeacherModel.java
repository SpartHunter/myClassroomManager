package edu.myclassroom.manager.model;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class TeacherModel {
    private int id;
    private String name;
    private String registrationNumber;
    private List <BookingModel> booking;

    public static List <TeacherModel> defaultTeacherList() {
        TeacherModel teacher1 = new TeacherModel();
        TeacherModel teacher2 = new TeacherModel();
        TeacherModel teacher3 = new TeacherModel();
        TeacherModel teacher4 = new TeacherModel();
        TeacherModel teacher5 = new TeacherModel();

        teacher1.setId( 1 );
        teacher2.setId( 2 );
        teacher3.setId( 3 );
        teacher4.setId( 4 );
        teacher5.setId( 5 );

        teacher1.setName( "Teacher1" );
        teacher2.setName( "Teacher2" );
        teacher3.setName( "Teacher3" );
        teacher4.setName( "Teacher4" );
        teacher5.setName( "Teacher5" );

        teacher1.setRegistrationNumber( "TRN-1" );
        teacher2.setRegistrationNumber( "TRN-2" );
        teacher3.setRegistrationNumber( "TRN-3" );
        teacher4.setRegistrationNumber( "TRN-4" );
        teacher5.setRegistrationNumber( "TRN-5" );

        teacher1.setBooking( null );
        teacher2.setBooking( null );
        teacher3.setBooking( null );
        teacher4.setBooking( null );
        teacher5.setBooking( null );

        return Arrays.asList( teacher1, teacher2, teacher3, teacher4, teacher5 );
    }
}
