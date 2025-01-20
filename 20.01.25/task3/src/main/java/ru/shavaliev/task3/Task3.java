package ru.shavaliev.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task3 {

    @FXML
    private Label S1Label;

    @FXML
    private Label S2label;

    @FXML
    private Label S3Label;

    @FXML
    private TextField T1TextField;

    @FXML
    private TextField T2TextField;

    @FXML
    private TextField UTextField;

    @FXML
    private TextField VtextField;

    @FXML
    private Button resultbutton;

    @FXML
    void ResultOnAction(ActionEvent event) {
        double V = Double.parseDouble(VtextField.getText());
        double U = Double.parseDouble(UTextField.getText());
        double T1 = Double.parseDouble(T1TextField.getText());
        double T2 = Double.parseDouble(T2TextField.getText());
        S1Label.setText("S1 (по течению) = " + T1 * V);
        S2label.setText("S2 (против течения) = " + T2 * (V - U));
        S3Label.setText("S3 (всё вместе) = " + T1 * V + T2 * (V - U));
        if (U > V)
            S1Label.setText("В данном задании скорость течения реки не может быть больше скорости лодки");
    }

}
