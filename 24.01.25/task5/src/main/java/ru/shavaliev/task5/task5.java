package ru.shavaliev.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class task5 {

    @FXML
    private Label AnswerLabel;

    @FXML
    private TextField NTextField;

    @FXML
    private Button SearchButton;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int n = Integer.parseInt(NTextField.getText());
        double a = 1, b = 1;
        double sum = a * b;
        for (int k = 2; k <= n; k++){
            double A = 0.5 * sqrt(b) + 0.5 * sqrt(a);
            double B = 2 * pow(a,2) + b;
            sum += A * B;
            a = A;
            b = B;
        }
        AnswerLabel.setText("" + sum);
    }

}
