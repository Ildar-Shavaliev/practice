package ru.shavaliev.dop_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dop_task2 {

    @FXML
    private TextField ChTextField;

    @FXML
    private Button SearchButton;

    @FXML
    private Label reshLabel;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int x = Integer.parseInt(ChTextField.getText());
        int chet = x % 2;
        if (chet == 0 && x > 9 && x < 100)
            reshLabel.setText("чётное двузначное число");
        else if (chet != 0 && x > 9 && x < 100)
            reshLabel.setText("нечётное двузначное число");
        else if (chet == 0 && x > 99 && x < 1000)
            reshLabel.setText("чётное трехзначное число");
        else if (chet != 0 && x > 99 && x < 1000)
            reshLabel.setText("нечётное трехзначное число");
        else if (chet == 0 && x > 0 && x < 10)
            reshLabel.setText("чётное однозначное число");
        else if (chet != 0 && x > 0 && x < 10)
            reshLabel.setText("нечётное однозначное число");
        else
            reshLabel.setText("числа могут быть только от 1 до 999");

    }

}
