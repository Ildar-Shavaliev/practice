package ru.shavaliev.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static ru.shavaliev.marathon.util.controller.*;

public class thx {

    @FXML
    private Button LogoutButton;

    @FXML
    private Button backButton;

    @FXML
    private Button thxOkButton;
    private Stage mainStage;

    @FXML
    void BackOnAction(ActionEvent event) {
        showregMarf("regMarf.fxml", "Marathon Skills 2016");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMainscreen(menuStage,"MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void thxOkOnAction(ActionEvent event) {
        showRunnerMain("RunnerMain.fxml", "Marathon Skills 2016");
    }

}
