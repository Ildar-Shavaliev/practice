package ru.shavaliev.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task2 {

    @FXML
    private TextField MTextField;

    @FXML
    private TextField NTextField;

    @FXML
    private Button SearchButton;

    @FXML
    private Label resultLabel;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int M = Integer.parseInt(MTextField.getText());
        int N = Integer.parseInt(NTextField.getText());
        String mast = "";
        String dost = "";
        switch (M) {
            case 1:
                mast = "пики ";
                break;
            case 2:
                mast = "трефы ";
                break;
            case 3:
                mast = "бубны ";
                break;
            case 4:
                mast = "червы ";
                break;
        }
        switch (N) {
            case 11:
                dost = "валет";
                break;
            case 12:
                dost = "дама";
                break;
            case 13:
                dost = "король";
                break;
            case 14:
                dost = "туз";
                break;
        }
        resultLabel.setText("" + mast + dost);
    }

}
