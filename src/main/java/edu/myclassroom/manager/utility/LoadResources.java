package edu.myclassroom.manager.utility;

import java.net.URL;
import java.util.Objects;

public class LoadResources {

    private final String nameOfResource;

    public LoadResources( String nameOfResource ) {
        this.nameOfResource = nameOfResource;
    }

    public String getResourcesAsStringPath() {
        return Objects.requireNonNull( LoadResources.class.getResource( this.nameOfResource ) ).toExternalForm();
    }

    public URL getResourcesAsUrl() {
        return Objects.requireNonNull( LoadResources.class.getResource( this.nameOfResource ) );
    }
}
