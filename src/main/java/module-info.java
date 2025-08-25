module com.vnr.mahubankapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vnr.mahubankapp to javafx.fxml;
    exports com.vnr.mahubankapp;
    exports  com.vnr.mahubankapp.controller;
    exports com.vnr.mahubankapp.controller.admin;
    exports com.vnr.mahubankapp.controller.client;
    exports com.vnr.mahubankapp.model;
    exports com.vnr.mahubankapp.views;



}