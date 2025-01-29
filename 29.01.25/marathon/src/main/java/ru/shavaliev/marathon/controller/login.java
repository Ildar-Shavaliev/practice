package ru.shavaliev.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static ru.shavaliev.marathon.util.controller.*;

public class login {

    @FXML
    private Button CancelButton;

    @FXML
    private Button EPLoginButton;

    @FXML
    private TextField EmailTextField;

    @FXML
    private Button LogoutButton;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private Button backButton;

    @FXML
    void BackOnAction(ActionEvent event) {
        showprove("prove.fxml", "Marathon Skills 2016");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMainscreen(menuStage,"MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void CancelOnAction(ActionEvent event) {
        showMainscreen(menuStage, "MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void EPLoginOnAction(ActionEvent event) {
        if (EmailTextField.getText().isEmpty() || PasswordTextField.getText().isEmpty()) {
            Alert fail = new Alert(Alert.AlertType.INFORMATION);
            fail.setHeaderText("Ошибка");
            fail.setContentText("Пожалуйста, заполните все поля.");
            fail.showAndWait();
        } else {
            showregMarf("regMarf.fxml", "Marathon Skills 2016 - Register for as event");
        }
    }
}
