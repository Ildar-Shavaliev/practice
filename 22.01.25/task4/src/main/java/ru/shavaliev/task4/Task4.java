package ru.shavaliev.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class Task4 {

    @FXML
    private TextField KTextField;

    @FXML
    private TextField XTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button searchButton;

    @FXML
    void searchOnAction(ActionEvent event) {
        int k = Integer.parseInt(KTextField.getText());
        int x = Integer.parseInt(XTextField.getText());
        double res = 0;
        if (k == 3)
            res = sin(x) + 2;
        else if (k == 20)
            res = cos(pow(x, 2));
        else if (k == 10 || k == 15)
            res = tan(x) + sin(x);
        else {
            resultLabel.setText("значение y не определено");
            return;
        }
        resultLabel.setText("Ответ " + res);
    }

}
