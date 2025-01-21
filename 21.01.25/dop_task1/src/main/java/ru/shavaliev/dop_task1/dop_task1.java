package ru.shavaliev.dop_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dop_task1 {

    @FXML
    private TextField ATextField;

    @FXML
    private Label AxBLabel;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Label Ost_SLabel;

    @FXML
    private Label S_CLabel;

    @FXML
    private Button SearchBtn;

    @FXML
    private Label kolLabel;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int A = Integer.parseInt(ATextField.getText());
        int B = Integer.parseInt(BTextField.getText());
        int C = Integer.parseInt(CTextField.getText());
        int AxB = A * B;
        int CxC = C * C;
        int kol = AxB / CxC;
        int Ost = AxB - (kol * CxC);
        AxBLabel.setText("Площадь прямоугольника " + AxB);
        S_CLabel.setText("Площадь квадрата " + CxC);
        kolLabel.setText("количество квадратов " + kol);
        Ost_SLabel.setText("Оставшееся площадь " + Ost);
    }

}
