package ru.shavaliev.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task2 {

    @FXML
    private TextField firstTextField;

    @FXML
    private Button resultBtn;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField secondTextField;

    @FXML
    void ResultOnAction(ActionEvent event) {
        int a = Integer.parseInt(firstTextField.getText());
        int b = Integer.parseInt(secondTextField.getText());
        if (a>b)
            resultLabel.setText("первое число больше");
        else if (a<b)
            resultLabel.setText("второе число больше");
        else resultLabel.setText("эти числа равны");
    }

}
