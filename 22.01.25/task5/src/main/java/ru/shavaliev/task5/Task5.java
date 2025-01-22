package ru.shavaliev.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task5 {

    @FXML
    private Label ResultLabel;

    @FXML
    private Button SearchButton;

    @FXML
    private TextField XTextField;

    @FXML
    private TextField XtochTextField;

    @FXML
    private TextField YTextfield;

    @FXML
    private TextField YtochTextField;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int x = Integer.parseInt(XTextField.getText());
        int y = Integer.parseInt(YTextfield.getText());
        int x1 = Integer.parseInt(XtochTextField.getText());
        int y1 = Integer.parseInt(YtochTextField.getText());
        if (x > x1 && y > y1)
            ResultLabel.setText("да, лежит");
        else if (x < x1 && y < y1)
            ResultLabel.setText("нет, не лежит");
        else
            ResultLabel.setText("на границе");
    }

}
