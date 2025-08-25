package com.vnr.mahubankapp.model;


import com.vnr.mahubankapp.views.ViewFactory;

//Singleton Design Pattern to ensure only one instance of Model exists
public class Model {
    private static Model instance;
    private final ViewFactory viewFactory;

    private Model() {
        this.viewFactory = new ViewFactory();
    }

    //Whenever the application needs to access the Model, it can call this method
    //to get the single instance of Model
    public static synchronized Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }




}
