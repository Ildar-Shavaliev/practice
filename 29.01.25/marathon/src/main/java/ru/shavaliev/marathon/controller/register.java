package ru.shavaliev.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.shavaliev.marathon.util.controller;

import static ru.shavaliev.marathon.util.controller.showMainscreen;
import static ru.shavaliev.marathon.util.controller.showregMarf;

public class register {

    @FXML
    private TextField EmailTextField;

    @FXML
    private Button LogoutButton;

    @FXML
    private TextField LustNameTextfield;

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField PasswordProveTextField;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private Button RegChenelButton;

    @FXML
    private Button RegregisterButton;

    @FXML
    private Button backButton;

    @FXML
    private DatePicker dateDatePicker;

    @FXML
    private TextField fileTextField;
    private Stage menuStage;

    @FXML
    void BackOnAction(ActionEvent event) {
        controller.showprove("prove.fxml", "Marathon Skills 2016");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMainscreen(menuStage, "MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void RegChenelOnAction(ActionEvent event) {
        controller.showprove("prove.fxml", "Marathon Skills 2016");
    }

    @FXML
    void RegRegisterOnAction(ActionEvent event) {
        if (EmailTextField.getText().isEmpty() || PasswordTextField.getText().isEmpty() || LustNameTextfield.getText().isEmpty() || PasswordProveTextField.getText().isEmpty() || NameTextField.getText().isEmpty()) {
            Alert fail = new Alert(Alert.AlertType.INFORMATION);
            fail.setHeaderText("Ошибка");
            fail.setContentText("Пожалуйста, заполните все поля.");
            fail.showAndWait();
        } else {
            showregMarf("regMarf.fxml", "Marathon Skills 2016 - Register for as event");

        }
    }
}
