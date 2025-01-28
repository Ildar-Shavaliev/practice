package ru.shavaliev.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import ru.shavaliev.pagetopage.util.Manager;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button Secondform;

    @FXML
    private Label welcomeText;

    @FXML
    void secondformOnAction(ActionEvent event) {
        Manager.showSecondStage("second-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Secondform.setStyle("-fx-background-color: #20B2AA; -fx-background-radius: 5px; -fx-text-fill: #ffffff");
    }
}
