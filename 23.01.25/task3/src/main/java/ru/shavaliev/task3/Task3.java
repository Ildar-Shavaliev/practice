package ru.shavaliev.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task3 {

    @FXML
    private Label DLabel;

    @FXML
    private Label LLabel;

    @FXML
    private TextField RTextField;

    @FXML
    private Label Rlabel;

    @FXML
    private Label SLabel;

    @FXML
    private Button SearchButton;

    @FXML
    private TextField cpoTextField;

    @FXML
    void SearchOnAction(ActionEvent event) {
        double R = Double.parseDouble(RTextField.getText());
        int cpo = Integer.parseInt(cpoTextField.getText());
        double D = 0, L = 0, S = 0;
        switch (cpo) {
            case 1:
                R = R;
                break;
            case 2:
                D = 2 * R;
                break;
            case 3:
                L = 2 * PI * R;
                break;
            case 4:
                S = PI * pow(R, 2);
                break;
        }
        Rlabel.setText("R = " + R);
        DLabel.setText("D = " + D);
        LLabel.setText("L = " + L);
        SLabel.setText("S = " + S);
    }

}
