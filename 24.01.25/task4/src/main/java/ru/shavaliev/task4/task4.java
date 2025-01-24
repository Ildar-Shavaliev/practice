package ru.shavaliev.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task4 {

    @FXML
    private Label AnswerLabel;

    @FXML
    private TextField NTextField;

    @FXML
    private Button SearchButton;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int N = Integer.parseInt(NTextField.getText());
        double fact = 1;
        double sum = 0;
        for (int n = 1; n <= N; n++) {
            fact *= n;
            sum += fact;
        }
        AnswerLabel.setText("" + fact);
    }

}
