package ru.shavaliev.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task1 {

    @FXML
    private Label DayLabel;

    @FXML
    private Button SearchButton;

    @FXML
    private TextField XTextField;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int X = Integer.parseInt(XTextField.getText());
        String DayName = "";
        switch (X){
            case 1:
                DayName = "Понедельник";
                break;
            case 2:
                DayName = "Вторник";
                break;
            case 3:
                DayName = "Среда";
                break;
            case 4:
                DayName = "Четверг";
                break;
            case 5:
                DayName = "Пятница";
                break;
            case 6:
                DayName = "Суббота";
                break;
            case 7:
                DayName = "Воскресенье";
                break;
            default:
                DayName = "Некоректный день";
                break;
        }
        DayLabel.setText("" + DayName);
    }

}
