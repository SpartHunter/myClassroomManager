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
        ClassroomModel model1 = new ClassroomModel();
        ClassroomModel model2 = new ClassroomModel();
        ClassroomModel model3 = new ClassroomModel();
        ClassroomModel model4 = new ClassroomModel();
        ClassroomModel model5 = new ClassroomModel();

        model1.setId( 1 );
        model2.setId( 2 );
        model3.setId( 3 );
        model4.setId( 4 );
        model5.setId( 5 );

        model1.setName( "model1" );
        model2.setName( "model2" );
        model3.setName( "model3" );
        model4.setName( "model4" );
        model5.setName( "model5" );

        model1.setSeatsNumber( 10 );
        model2.setSeatsNumber( 5 );
        model3.setSeatsNumber( 20 );
        model4.setSeatsNumber( 40 );
        model5.setSeatsNumber( 15 );

        model1.setType( ClassroomType.CHIMIE );
        model2.setType( ClassroomType.PROFS );
        model3.setType( ClassroomType.CAFETERIA );
        model4.setType( ClassroomType.INFORMATIQUE );
        model5.setType( ClassroomType.INFIRMERIE );

        model1.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES, ClassroomEquipment.MICROSCOPE ) );
        model2.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES, ClassroomEquipment.BUREAU ) );
        model3.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES ) );
        model4.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES, ClassroomEquipment.SOURIS, ClassroomEquipment.CLAVIERS ) );
        model5.setEquipment( Arrays.asList( ClassroomEquipment.TABLES, ClassroomEquipment.CHAISES, ClassroomEquipment.LIT ) );

        model1.setBooking( null );
        model2.setBooking( null );
        model3.setBooking( null );
        model4.setBooking( null );
        model5.setBooking( null );

        return Arrays.asList( model1, model2, model3, model4, model5 );
    }
}
