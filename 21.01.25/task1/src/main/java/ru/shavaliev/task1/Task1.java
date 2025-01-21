package ru.shavaliev.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task1 {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Button resultButton;

    @FXML
    private Label resultLabel;

    @FXML
    void ResultOnAction(ActionEvent event) {
        double A = Double.parseDouble(ATextField.getText());
        double B = Double.parseDouble(BTextField.getText());
        double C = A % B;
        resultLabel.setText("Ответ = " + C);
    }

}
