package com.vnr.mahubankapp;


import com.vnr.mahubankapp.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Model.getInstance().getViewFactory().showLoginView();
    }

    public static void main(String[] args) {
        launch(args);
    }
}