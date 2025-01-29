package ru.shavaliev.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import ru.shavaliev.marathon.util.controller;

import static ru.shavaliev.marathon.util.controller.*;

public class MainScreen {

    @FXML
    private Button IRunnerButton;

    @FXML
    private Button Loginbutton;

    @FXML
    private Button LogoutButton;

    @FXML
    private Button backButton;

    @FXML
    private Button eventButton;

    @FXML
    private Button sponsorButton;
    private controller Programm;
    private Stage mainStage;

    @FXML
    void BackOnAction(ActionEvent event) {
        showMainscreen(mainStage,"MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void IRunnerOnAction(ActionEvent event) {
        showprove("prove.fxml", "Marathon Skills 2016");
    }

    @FXML
    void LoginOnAction(ActionEvent event) {
        showlogin("login.fxml", "Marathon Skills 2016");

    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMainscreen(mainStage,"MainScreen.fxml", "Marathon Skills 2016");

    }

    @FXML
    void eventOnAction(ActionEvent event) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("WIP");
        coming.show();
    }

    @FXML
    void sponsorOnAction(ActionEvent event) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("WIP");
        coming.show();
    }

}
