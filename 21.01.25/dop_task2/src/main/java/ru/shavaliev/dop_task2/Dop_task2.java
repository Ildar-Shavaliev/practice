package ru.shavaliev.dop_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Dop_task2 {

    @FXML
    private Button SearchBtn;

    @FXML
    private Label YearLabel;

    @FXML
    private TextField yearTextField;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int g = Integer.parseInt(yearTextField.getText());
        int sto = g % 100;
        if (sto == 0)
            YearLabel.setText("номер столетия = " + g / 100);
        else YearLabel.setText("номер столетия = " + ((g / 100) + 1));
    }

}
