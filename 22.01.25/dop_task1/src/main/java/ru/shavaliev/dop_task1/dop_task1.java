package ru.shavaliev.dop_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dop_task1 {

    @FXML
    private TextField ChTextField;

    @FXML
    private Button ResultButton;

    @FXML
    private Label resultLabel;

    @FXML
    void ResultOnAction(ActionEvent event) {
        int x = Integer.parseInt(ChTextField.getText());
        int chet = x % 2;
        if (x == 0)
            resultLabel.setText("нулевое число");
        else if (chet == 0 && x > 0)
            resultLabel.setText("положительное чётное число");
        else if (chet != 0 && x > 0)
            resultLabel.setText("положительное нечётное число");
        else if (chet == 0 && x < 0)
            resultLabel.setText("отрицательное чётное число");
        else
            resultLabel.setText("отрицательное нечётное число");
    }
}
