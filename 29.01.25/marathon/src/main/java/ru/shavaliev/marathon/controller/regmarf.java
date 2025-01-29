package ru.shavaliev.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import static ru.shavaliev.marathon.util.controller.*;

public class regmarf {

    @FXML
    private RadioButton ARadiobutton;

    @FXML
    private RadioButton BRadiobutton;

    @FXML
    private RadioButton CRadiobutton;

    @FXML
    private Button ChenelButton;

    @FXML
    private Button LogoutButton;

    @FXML
    private CheckBox MalCheckBox;

    @FXML
    private CheckBox PolCheckBox;

    @FXML
    private Label SummLabel;

    @FXML
    private Button backButton;

    @FXML
    private CheckBox fullCheckBox;

    @FXML
    private Button regVznosButton;
    private Stage mainStage;

    @FXML
    void AVarOnAction(ActionEvent event) {

    }

    @FXML
    void BVarOnAction(ActionEvent event) {

    }

    @FXML
    void BackOnAction(ActionEvent event) {
        showlogin("login.fxml", "Marathon Skills 2016");
    }

    @FXML
    void CVarOnAction(ActionEvent event) {

    }

    @FXML
    void ChenelOnAction(ActionEvent event) {
        showMainscreen(menuStage,"MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void FullOnAction(ActionEvent event) {

    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMainscreen(menuStage,"MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void MalOnAction(ActionEvent event) {

    }

    @FXML
    void PolOnAction(ActionEvent event) {

    }

    @FXML
    void RegVznosOnAction(ActionEvent event) {
        showthx("thx.fxml", "Marathon Skills 2016 - Register as a runner");
    }

}
