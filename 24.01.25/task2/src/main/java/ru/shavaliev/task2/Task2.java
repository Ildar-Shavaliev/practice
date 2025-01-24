package ru.shavaliev.task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class Task2 {

    @FXML
    private TextField ChisTextField;

    @FXML
    private ListView<Integer> DanListView;

    @FXML
    private Button OKButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button canelButton;

    @FXML
    private Button vvodButton;

    @FXML
    void OKOnAction(ActionEvent event) {
        List<Integer> data = DanListView.getItems();
        int max = 0;
        for (int i = 0; i < data.size(); i++) {
            int m = data.get(i);
            if (m % 10 == 4 && m % 6 == 0) {
                max += m;
            }
        }
        if (max > 0)
            answerLabel.setText(String.valueOf(max));
        else answerLabel.setText("Чисел нет");
    }

    @FXML
    void VvodOnAction(ActionEvent event) {
        if (ChisTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(ChisTextField.getText());
            DanListView.getItems().add(x);
        } catch (NumberFormatException exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            ChisTextField.setText("");
        }
    }

    @FXML
    void canelOnAction(ActionEvent event) {
        Platform.exit();
    }

}
