package ru.shavaliev.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task5 {

    @FXML
    private Label KLabel;

    @FXML
    private TextField PTextField;

    @FXML
    private Label SLabel;

    @FXML
    private Button SearchButton;

    @FXML
    void SearchOnAction(ActionEvent event) {
        double P = Double.parseDouble(PTextField.getText());
        double V = 1000;
        int K = 0;
        while (V <= 1100) {
            V = V + (V * (P * 0.01));
            K++;
        }
        SLabel.setText("" + V);
        KLabel.setText("" + K);
    }

}
