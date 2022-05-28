package edu.myclassroom.manager.view;

import edu.myclassroom.manager.utility.CustomFont;
import edu.myclassroom.manager.utility.LoadResources;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.enums.ButtonType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.SnapshotParameters;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class LeftMenuPane {
    private static LeftMenuPane leftMenuPane;
    private final AnchorPane leftMenuContainer;
    private final static double IMAGE_VIEW_HEIGHT = 102.0;
    private final static double IMAGE_VIEW_WIDTH = 166.5;
    private final static double VERTICAL_BOX_SPACING = 35.0;
    private final static double VERTICAL_BOX_PADDING = 15.0;
    private final static double BUTTON_WIDTH = 150.0;
    private final static double BUTTON_HEIGHT = 45.0;
    private final static String stylesheetPath = new LoadResources(
            "/css/leftMenuPane.css" )
            .getResourcesAsStringPath();

    private LeftMenuPane( double height ) {
        Image image = new Image(
                new LoadResources( "/images/posterImage.png" )
                        .getResourcesAsStringPath(), IMAGE_VIEW_WIDTH, IMAGE_VIEW_HEIGHT, false, false
        );
        ImageView imageView = this.roundedImage( image );
        MFXButton buttonClassroom = mfxButton( "Classroom" );
        MFXButton buttonTeacher = mfxButton( "Teacher" );
        MFXButton buttonBooking = mfxButton( "Booking" );
        MFXButton buttonHelp = mfxButton( "Help" );
        VBox buttonBox = new VBox( VERTICAL_BOX_SPACING, buttonClassroom, buttonTeacher, buttonBooking, buttonHelp );
        buttonBox.setPadding( new Insets( VERTICAL_BOX_PADDING ) );
        buttonBox.setPrefHeight( ( height - IMAGE_VIEW_HEIGHT ) - 150 );
        buttonBox.setMinHeight( ( height - IMAGE_VIEW_HEIGHT ) - 150 );
        buttonBox.setMaxHeight( ( height - IMAGE_VIEW_HEIGHT ) - 150 );
        buttonBox.setAlignment( Pos.BASELINE_CENTER );
        Text footerCopyright = new Text( "Management-Classroom@Copyright" );
        footerCopyright.setFill( Color.BLACK );
        VBox verticalBox = new VBox( VERTICAL_BOX_SPACING, imageView, buttonBox, footerCopyright );
        verticalBox.setPadding( new Insets( VERTICAL_BOX_PADDING ) );
        verticalBox.setPrefHeight( height );
        verticalBox.setMinHeight( height );
        verticalBox.setMaxHeight( height );
        verticalBox.setAlignment( Pos.TOP_CENTER );
        verticalBox.getStyleClass().add( "menu-row" );
        this.leftMenuContainer = new AnchorPane( verticalBox );
        this.leftMenuContainer.getStylesheets().add( stylesheetPath );
        this.leftMenuContainer.getStyleClass().add( "menu-container" );
        this.leftMenuContainer.setPrefHeight( height );
        this.leftMenuContainer.setMinHeight( height );
        this.leftMenuContainer.setMaxHeight( height );
    }

    public static LeftMenuPane buildLeftMenuPane( double height ) {
        if ( leftMenuPane == null ) {
            leftMenuPane = new LeftMenuPane( height );
        }

        return leftMenuPane;
    }

    public static LeftMenuPane getLeftMenuPane() throws InstantiationException {
        if ( leftMenuPane == null ) {
            throw new InstantiationException( "Thrown error: parentContainerInstance is null, maybe it was not built before calling this method." );
        }

        return leftMenuPane;
    }

    public Parent getLeftMenuContainer() {
        return this.leftMenuContainer;
    }

    private MFXButton mfxButton( String placeholder ) {
        MFXButton button = new MFXButton( placeholder, BUTTON_WIDTH, BUTTON_HEIGHT );
        button.setPrefSize( BUTTON_WIDTH, BUTTON_HEIGHT );
        button.setMaxSize( BUTTON_WIDTH, BUTTON_HEIGHT );
        button.setMinSize( BUTTON_WIDTH, BUTTON_HEIGHT );
        button.setButtonType( ButtonType.FLAT );
        button.setTextFill( Color.WHITE );
        button.setFont( CustomFont.getBoldFont() );
        button.getStyleClass().add( "menu-button" );
        return button;
    }

    private ImageView roundedImage( Image image ) {
        ImageView sampleImage = new ImageView( image );
        Rectangle rectangle = new Rectangle( IMAGE_VIEW_WIDTH, IMAGE_VIEW_HEIGHT );
        rectangle.setArcWidth( 15 );
        rectangle.setArcHeight( 15 );
        sampleImage.setClip( rectangle );
        SnapshotParameters parameters = new SnapshotParameters();
        parameters.setFill( Color.TRANSPARENT );
        WritableImage roundedImage = sampleImage.snapshot( parameters, null );
        sampleImage.setClip( null );
        sampleImage.setEffect( new DropShadow( 10, Color.BLACK ) );
        sampleImage.setImage( roundedImage );

        return sampleImage;
    }
}
