package ru.shavaliev.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;
import static java.lang.Math.sqrt;

public class Task4 {

    @FXML
    private Label ALabel;

    @FXML
    private Label PLabel;

    @FXML
    private TextField XTextField;

    @FXML
    private TextField aTextField;

    @FXML
    private Button resultButton;

    @FXML
    void ResultOnAction(ActionEvent event) {
        double X = Double.parseDouble(XTextField.getText());
        double a = Double.parseDouble(aTextField.getText());
        double P = (1 / cos(X) + log(abs(tan(X / 2))) + X / (1 + X) / (1 + X));
        double A = (pow(P,5)*sqrt(a * pow(X,3)+2))/2 * cos(X);
        PLabel.setText("P = " + P);
        ALabel.setText("A = " + A);
    }

}
