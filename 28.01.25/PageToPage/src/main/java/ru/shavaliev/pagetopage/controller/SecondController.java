package ru.shavaliev.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static ru.shavaliev.pagetopage.util.Manager.showSecondStage;

public class SecondController {

    @FXML
    private Label TextLabel;

    @FXML
    private Button verButton;

    @FXML
    void VerOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml","Marathon Skills 2016");
    }

}
