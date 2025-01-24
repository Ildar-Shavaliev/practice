package ru.shavaliev.task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class Task1 {

    @FXML
    private Button CanelButton;

    @FXML
    private Button OKButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Label danLabel;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numTextField;

    @FXML
    private Label vxodLabel;

    @FXML
    void AddOnAction(ActionEvent event) {
        if (numTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numTextField.getText());
            dataListView.getItems().add(x);
        } catch (NumberFormatException exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            numTextField.setText("");
        }
    }

    @FXML
    void CanelOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void NumOnAction(ActionEvent event) {

    }

    @FXML
    void OKOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int max = 0;
        for (int i = 0; i < data.size(); i++) {
            int m = data.get(i);
            if (m % 10 == 2 && m % 7 == 0) {
                max += m;
            }
        }
        if (max > 0)
            answerLabel.setText(String.valueOf(max));
        else answerLabel.setText("Чисел нет");
    }

}
