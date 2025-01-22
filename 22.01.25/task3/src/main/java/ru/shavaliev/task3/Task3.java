package ru.shavaliev.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task3 {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Button SearchButton;

    @FXML
    private Label resultLabel;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int a = Integer.parseInt(ATextField.getText());
        int b = Integer.parseInt(BTextField.getText());
        int c = Integer.parseInt(CTextField.getText());
        int sr;
        if ((a >= b && a <= c) || (a <= b && a >= c))
            sr = a;
        else if ((b >= a && b <= c) || (b <= a && b >= c))
            sr = b;
        else
            sr = c;
        resultLabel.setText("среднее число " + sr);
    }
}
