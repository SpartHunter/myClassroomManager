package edu.myclassroom.manager.model;

public enum ClassroomType {
    INFORMATIQUE( "Informatique" ),
    CHIMIE( "Chimie" ),
    INFIRMERIE( "Infirmerie" ),
    PROFS( "Professor" ),
    ETUDE( "Etude" ),
    CAFETERIA( "Cafeteria" );

    private String typeName;

    ClassroomType( String typeName ) {
        this.typeName = typeName;
    }
}
