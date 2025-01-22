package ru.shavaliev.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task1 {

    @FXML
    private TextField DVTextField;

    @FXML
    private Button resultBtn;

    @FXML
    private Label resultLabel;

    @FXML
    private Label sumLabel;

    @FXML
    void resultOnAction(ActionEvent event) {
        int d = Integer.parseInt(DVTextField.getText());
        int a = d / 10;
        int b = d % 10;
        int res = a + b;
        int nech = res % 2;
        sumLabel.setText("сумма цифр " + res);
        if (nech == 0)
            resultLabel.setText("чётное");
        else
            resultLabel.setText("не чётное");

    }

}
