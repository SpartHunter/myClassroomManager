package edu.myclassroom.manager.model;

public enum ClassroomEquipment {
    TABLES( "Table" ),
    CHAISES( "Chaises" ),
    MICROSCOPE( "Microscope" ),
    CLAVIERS( "Clavier" ),
    SOURIS( "Souris" ),
    LIT( "Lit" ),
    BUREAU( "Bureau" );

    private String equipmentName;

    ClassroomEquipment( String equipmentName ) {
        this.equipmentName = equipmentName;
    }
}
