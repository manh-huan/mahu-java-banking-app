package com.vnr.mahubankapp.views;


import com.vnr.mahubankapp.controller.admin.AdminController;
import com.vnr.mahubankapp.controller.client.ClientController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {

    private final ObjectProperty<ClientMenuOptions> clientSelectedMenuItem;
    private final ObjectProperty<AdminMenuOptions> adminSelectedMenuItem ;
    private AnchorPane dashboardView;
    private AnchorPane accountsView;
    private AnchorPane transactionView;
    private AnchorPane clientsView;
    private AnchorPane createClientView;
    private AnchorPane depositView;

    private final AccountType loginAccountType;

    public ViewFactory() {
        this.loginAccountType = AccountType.CLIENT;
        this.clientSelectedMenuItem = new SimpleObjectProperty<>();
        this.adminSelectedMenuItem = new SimpleObjectProperty<>();
    }

    public ObjectProperty<ClientMenuOptions> getClientSelectedMenuItemProperty() {
        return clientSelectedMenuItem;
    }

    public ObjectProperty<AdminMenuOptions> getAdminSelectedMenuItemProperty() {
        return adminSelectedMenuItem;
    }

    public AccountType getLoginAccountType() {
        return loginAccountType;
    }


    public AnchorPane getCreateClientView() {
        if (createClientView == null) {
            try {
                createClientView = new AnchorPane();
                createClientView.getChildren().add(new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/admin/createClient.fxml")).load());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load Create Client view", e);
            }
        }
        return createClientView;
    }

    public AnchorPane getClientsView() {
        if (clientsView == null) {
            try {
                clientsView = new AnchorPane();
                clientsView.getChildren().add(new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/admin/clients.fxml")).load());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load Clients view", e);
            }
        }
        return clientsView;
    }

    public AnchorPane getDepositView() {
        if (depositView == null) {
            try {
                depositView = new AnchorPane();
                depositView.getChildren().add(new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/admin/deposit.fxml")).load());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load Deposit view", e);
            }
        }
        return depositView;
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

    public void showAdminWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/vnr/mahubankapp/fxml/admin/admin.fxml"));
        AdminController adminController = new AdminController();
        loader.setController(adminController);
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
