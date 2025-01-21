package ru.shavaliev.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task3 {

    @FXML
    private Label JLabel;

    @FXML
    private TextField KTextField;

    @FXML
    private Button ResultBtn;

    @FXML
    private Label ResultLabel;

    @FXML
    void ResultOnAction(ActionEvent event) {
        int K = Integer.parseInt(KTextField.getText());
        int day = K%7;
        switch (day){
            case 1:
                day = 1;
                break;
            case 2:
                day = 2;
                break;
            case 3:
                day = 3;
                break;
            case 4:
                day = 4;
                break;
            case 5:
                day = 5;
                break;
            case 6:
                day = 6;
                break;
            case 7:
                day = 7;
                break;
        }
        ResultLabel.setText(new String(String.valueOf(day + 2)));
    }
}