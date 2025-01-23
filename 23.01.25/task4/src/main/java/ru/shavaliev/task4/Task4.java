package ru.shavaliev.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task4 {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Label OLabel;

    @FXML
    private Button SearchButton;

    @FXML
    void SearchOnAction(ActionEvent event) {
        double A = Double.parseDouble(ATextField.getText());
        double B = Double.parseDouble(BTextField.getText());
        double x = B;
        while (B <= A) {
            B += x;
        }
        B = B - x;
        double O = A - B;
        OLabel.setText("" + O);
    }

}
