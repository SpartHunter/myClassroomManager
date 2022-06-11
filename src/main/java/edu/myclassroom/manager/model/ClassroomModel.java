package edu.myclassroom.manager.model;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class ClassroomModel {
    private int id;
    private String name;
    private int seatsNumber;
    private ClassroomType type;
    private List <ClassroomEquipment> equipment;
    private List <BookingModel> booking;

    public static List <ClassroomModel> defaultClassroomList() {
        ClassroomModel classroom1 = new ClassroomModel();
        ClassroomModel classroom2 = new ClassroomModel();
        ClassroomModel classroom3 = new ClassroomModel();
        ClassroomModel classroom4 = new ClassroomModel();
        ClassroomModel classroom5 = new ClassroomModel();

        classroom1.setId( 1 );
        classroom2.setId( 2 );
        classroom3.setId( 3 );
        classroom4.setId( 4 );
        classroom5.setId( 5 );

        classroom1.setName( "classroom1" );
        classroom2.setName( "classroom2" );
        classroom3.setName( "classroom3" );
        classroom4.setName( "classroom4" );
        classroom5.setName( "classroom5" );

        classroom1.setSeatsNumber( 10 );
        classroom2.setSeatsNumber( 5 );
        classroom3.setSeatsNumber( 20 );
        classroom4.setSeatsNumber( 40 );
        classroom5.setSeatsNumber( 15 );

        classroom1.setType( ClassroomType.CHIMIE );
        classroom2.setType( ClassroomType.PROFS );
        classroom3.setType( ClassroomType.CAFETERIA );
        classroom4.setType( ClassroomType.INFORMATIQUE );
        classroom5.setType( ClassroomType.INFIRMERIE );

        classroom1.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES, ClassroomEquipment.MICROSCOPE ) );
        classroom2.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES, ClassroomEquipment.BUREAU ) );
        classroom3.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES ) );
        classroom4.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES, ClassroomEquipment.SOURIS, ClassroomEquipment.CLAVIERS ) );
        classroom5.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES, ClassroomEquipment.LIT ) );

        classroom1.setBooking( null );
        classroom2.setBooking( null );
        classroom3.setBooking( null );
        classroom4.setBooking( null );
        classroom5.setBooking( null );

        return Arrays.asList( classroom1, classroom2, classroom3, classroom4, classroom5 );
    }
}
