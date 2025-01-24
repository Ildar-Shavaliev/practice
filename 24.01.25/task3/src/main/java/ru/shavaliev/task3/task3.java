package ru.shavaliev.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class task3 {

    @FXML
    private TextField ATextField;

    @FXML
    private Label AnswerLabel;

    @FXML
    private TextField BTextField;

    @FXML
    private Button SearchButton;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int A = Integer.parseInt(ATextField.getText());
        int B = Integer.parseInt(BTextField.getText());
        int b = 0;
        for (int a = A; a <= B; a++) {
            b = (int) (b + (pow(a,2)));
        }
        AnswerLabel.setText("" + b);
    }

}

