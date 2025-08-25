package com.vnr.mahubankapp.controller.client;

import com.vnr.mahubankapp.model.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_btn;
    public Button transaction_btn;
    public Button accounts_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        dashboard_btn.setOnAction(event ->
                onDashboard());
        transaction_btn.setOnAction(event ->
                onTransaction());
        accounts_btn.setOnAction(event ->
                onAccounts());
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItemProperty().set("Dashboard");
    }

    private void onTransaction() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItemProperty().set("Transaction");
    }

    private void onAccounts() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItemProperty().set("Accounts");
    }

}
