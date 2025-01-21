package ru.shavaliev.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task2 {

    @FXML
    private TextField NTextField;

    @FXML
    private Label ResultLabel;

    @FXML
    private Button resultbtn;

    @FXML
    void ResultOnAction(ActionEvent event) {
        int N = Integer.parseInt(NTextField.getText());
        int R = N % 60;
        ResultLabel.setText("Ответ = " + R);
    }

}
