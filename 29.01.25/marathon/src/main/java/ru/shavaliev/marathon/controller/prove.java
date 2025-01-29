package ru.shavaliev.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static ru.shavaliev.marathon.util.controller.*;

public class prove {

    @FXML
    private Button Loginbutton;

    @FXML
    private Button LogoutButton;

    @FXML
    private Button backButton;

    @FXML
    private Button newRunnerButton;

    @FXML
    private Button oldrunnerButton;
    private Stage mainStage;

    @FXML
    void BackOnAction(ActionEvent event) {
        showMainscreen(menuStage,"MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void LoginOnAction(ActionEvent event) {
        showlogin("login.fxml", "Marathon Skills 2016");

    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMainscreen(menuStage,"MainScreen.fxml", "Marathon Skills 2016");

    }

    @FXML
    void newRunnerButton(ActionEvent event) {
        showregister("register.fxml", "Marathon Skills 2016");

    }

    @FXML
    void oldrunnerOnAction(ActionEvent event) {
        showlogin("login.fxml", "Marathon Skills 2016");

    }

}
