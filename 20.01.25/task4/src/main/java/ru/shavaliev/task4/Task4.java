package ru.shavaliev.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class Task4 {

    @FXML
    private Label ALabel;

    @FXML
    private Label PLabel;

    @FXML
    private TextField XTextField;

    @FXML
    private Button resultButton;

    @FXML
    void ResultOnAction(ActionEvent event) {
        double X = Double.parseDouble(XTextField.getText());
        double P,A;
        //PLabel.setText(P = (1/cos(X)+log(abs(tan(X/2)))+X/(1+X)/(1+X)));

    }

}
