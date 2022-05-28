package edu.myclassroom.manager.view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class ParentContainer {
    private static ParentContainer parentContainerInstance;
    private final Scene scene;
    private final BorderPane menuBorderPane;
    private final BorderPane contentBorderPane;
    private final String appStylesheetPath;
    private final LeftMenuPane leftMenuPane;

    private ParentContainer( double stageWidth, double stageHeight, String appStylesheetPath ) {
        this.menuBorderPane = new BorderPane();
        this.leftMenuPane = LeftMenuPane.buildLeftMenuPane( stageHeight );
        this.contentBorderPane = new BorderPane();
        this.menuBorderPane.setPadding( new Insets( 0.5 ) );
        this.menuBorderPane.setPrefWidth( stageWidth );
        this.menuBorderPane.setPrefHeight( stageHeight );
        try {
            this.menuBorderPane.setLeft( this.leftMenuPane.getLeftMenuContainer() );
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        this.menuBorderPane.setCenter( this.contentBorderPane );
        this.scene = new Scene( this.menuBorderPane );
        this.appStylesheetPath = appStylesheetPath;
        this.scene.getStylesheets().add( this.appStylesheetPath );
    }

    public static ParentContainer buildParentContainer( double stageWidth, double stageHeight, String appStylesheetPath ) {
        if ( parentContainerInstance == null ) {
            parentContainerInstance = new ParentContainer( stageWidth, stageHeight, appStylesheetPath );
        }

        return parentContainerInstance;
    }

    public static ParentContainer getParentContainer() throws InstantiationException {
        if ( parentContainerInstance == null ) {
            throw new InstantiationException( "Thrown error: parentContainerInstance is null, maybe it was not built before calling this method." );
        }

        return parentContainerInstance;
    }

    public Scene getSceneInstance() {
        return this.scene;
    }

    public BorderPane getBorderPane() {
        return this.menuBorderPane;
    }

}
