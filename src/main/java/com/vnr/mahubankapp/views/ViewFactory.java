package com.vnr.mahubankapp.views;


import com.vnr.mahubankapp.controller.client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {

    private final StringProperty clientSelectedMenuItem;

    private AnchorPane dashboardView;
    private AnchorPane accountsView;
    private AnchorPane transactionView;

    public ViewFactory() {
        this.clientSelectedMenuItem = new SimpleStringProperty("Dashboard");
    }

    public StringProperty getClientSelectedMenuItemProperty() {
        return clientSelectedMenuItem;
    }

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                dashboardView = new AnchorPane();
                dashboardView.getChildren().add(new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/client/Dashboard.fxml")).load());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load Dashboard view", e);
            }
        }
        return dashboardView;
    }

    public AnchorPane getTransactionView() {
        if (transactionView == null) {
            try {
                transactionView = new AnchorPane();
                transactionView.getChildren().add(new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/client/transaction.fxml")).load());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load Transaction view", e);
            }
        }
        return transactionView;
    }

    public AnchorPane getClientAccountsView() {
        if (accountsView == null) {
            try {
                accountsView = new AnchorPane();
                accountsView.getChildren().add(new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/client/accounts.fxml")).load());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load Accounts view", e);
            }
        }
        return accountsView;
    }

    public void showLoginView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/client/client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        Scene scene;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load view", e);
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Banking Application");
        stage.show();
    }


    public void closeStage(Stage stage) {
        stage.close();
    }
}
