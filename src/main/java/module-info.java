module edu.myclassroom.manager {

    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.swing;
    requires javafx.web;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.jfoenix;
    requires MaterialFX;
    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.util;

    requires org.joda.time;
    requires lombok;

    exports edu.myclassroom.manager;
    exports edu.myclassroom.manager.controller;
    exports edu.myclassroom.manager.model;
    exports edu.myclassroom.manager.view;

    opens edu.myclassroom.manager.controller;
    opens edu.myclassroom.manager.model;
    opens edu.myclassroom.manager.view;
}