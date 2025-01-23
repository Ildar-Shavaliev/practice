package ru.shavaliev.task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task6 {

    @FXML
    private Label FresultLabel;

    @FXML
    private TextField NTextFiled;

    @FXML
    private Label SLabel;

    @FXML
    private Button SearchButton;

    @FXML
    private Label TLabel;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int N = Integer.parseInt(NTextFiled.getText());
        int M = N;
        int B = N;
        while (N > 0) {
            N = N / 100;
            M = M % 10;
            B = ((B % 100) - M) / 10;
            FresultLabel.setText("" + M);
            SLabel.setText("" + B);
            TLabel.setText("" + N);
            N = 0;
        }
    }

}
