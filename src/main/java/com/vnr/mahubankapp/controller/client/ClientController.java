package com.vnr.mahubankapp.controller.client;

import com.vnr.mahubankapp.model.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {

    public BorderPane client_parent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItemProperty().addListener((observableValue, oldValue, newValue) -> {
            switch (newValue) {
                case "Dashboard" -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                case "Transaction" -> client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
                case "Accounts" -> client_parent.setCenter(Model.getInstance().getViewFactory().getClientAccountsView());

                default -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
}
