package ru.shavaliev.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class Task1 {

    @FXML
    private TextField ATextField;

    @FXML
    private Label LabelA;

    @FXML
    private Label SLabel;

    @FXML
    private Label VLabel;

    @FXML
    private Button result;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(ATextField.getText().toString());
        VLabel.setText("V = " + pow(a, 3));
        SLabel.setText("S = " + 6 * pow(a, 2));
    }

}
