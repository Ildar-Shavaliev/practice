package ru.shavaliev.dop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Dop {

    @FXML
    private TextField A1TextField;

    @FXML
    private TextField A2TextField;

    @FXML
    private TextField B1TextField;

    @FXML
    private TextField B2TextField;

    @FXML
    private TextField C1TextField;

    @FXML
    private TextField C2TextField;

    @FXML
    private Label DLabel;

    @FXML
    private Button result;

    @FXML
    private Label xLabel;

    @FXML
    private Label yLabel;

    @FXML
    void ResultOnAction(ActionEvent event) {
        double A1 = Double.parseDouble(A1TextField.getText());
        double B1 = Double.parseDouble(B1TextField.getText());
        double C1 = Double.parseDouble(C1TextField.getText());
        double A2 = Double.parseDouble(A2TextField.getText());
        double B2 = Double.parseDouble(B2TextField.getText());
        double C2 = Double.parseDouble(C2TextField.getText());
        double D = A1 * B2 - A2 * B1;
        double x =(C1 * B2 - C2 * B1)/D;
        double y = (A1 * C2 - A2 * C1)/D;
        DLabel.setText("D = " + D);
        xLabel.setText("x = " + x);
        yLabel.setText("y = " + y);
        if (D == 0){
            DLabel.setText("Система не имеет уникального решения");
        }
    }
}
