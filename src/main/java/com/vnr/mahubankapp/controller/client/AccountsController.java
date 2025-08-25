package com.vnr.mahubankapp.controller.client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
    public Label checking_acc_num;
    public Label transaction_limit;
    public Label ch_acc_date;
    public Label ch_acc_bl;
    public Label sv_acc_num;
    public Label withdrawal_limit;
    public Label sv_acc_Date;
    public Label sv_acc_bl;
    public TextField amount_to_sv;
    public Button trans_to_sv_btn;
    public TextField amount_to_ck;
    public Button trans_to_ck_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
