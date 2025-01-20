package ru.shavaliev.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class Task2 {

    @FXML
    private Label ACBClabel;

    @FXML
    private Label ACLabel;

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Label CBLabel;

    @FXML
    private TextField CTextField;

    @FXML
    private Button ResultButton;

    @FXML
    void ResultOnAction(ActionEvent event) {
        double A = Double.parseDouble(ATextField.getText());
        double B = Double.parseDouble(BTextField.getText());
        double C = Double.parseDouble(CTextField.getText());
        double AC = abs(C - A);
        double CB = abs(B - C);
        ACLabel.setText("AC = " + AC);
        CBLabel.setText("CB = " + CB);
        ACBClabel.setText("AC * CB = " + AC * CB);
    }

}
