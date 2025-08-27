package com.vnr.mahubankapp.controller.admin;

import com.vnr.mahubankapp.model.Model;
import com.vnr.mahubankapp.views.AdminMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button clients_btn;
    public Button create_client_btn;
    public Button deposit_btn;
    public Button logout_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    public void addListeners() {
        create_client_btn.setOnAction(event ->
                onCreateClient());
        clients_btn.setOnAction(event ->
                onClients());
        deposit_btn.setOnAction(event ->
                onDeposit());
    }

    public void onCreateClient() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItemProperty().set(AdminMenuOptions.CREATE_CLIENT);
    }

    public void onClients() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItemProperty().set(AdminMenuOptions.CLIENTS);
    }

    public void onDeposit() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItemProperty().set(AdminMenuOptions.DEPOSIT);
    }
}
