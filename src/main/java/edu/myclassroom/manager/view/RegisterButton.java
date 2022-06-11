package edu.myclassroom.manager.view;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import edu.myclassroom.manager.utility.LoadResources;
import javafx.fxml.FXMLLoader;
import lombok.Data;

import java.io.IOException;

@Data
public class RegisterButton {
    private int id;
    private BottomNavigationButton delete;
    private BottomNavigationButton modify;
    private BottomNavigationButton booking;

    private FXMLLoader deleteFxml = new FXMLLoader(
            new LoadResources( "/template/buttonDelete.fxml" ).getResourcesAsUrl()
    );
    private FXMLLoader modifyFxml = new FXMLLoader(
            new LoadResources( "/template/buttonEdit.fxml" ).getResourcesAsUrl()
    );
    private FXMLLoader bookingFxml = new FXMLLoader(
            new LoadResources( "/template/buttonBooking.fxml" ).getResourcesAsUrl()
    );

    public RegisterButton( int id ) {
        this.id = id;
        try {
            this.delete = deleteFxml.load();
            this.modify = modifyFxml.load();
            this.booking = bookingFxml.load();
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }
}
