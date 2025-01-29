package ru.shavaliev.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static ru.shavaliev.marathon.util.controller.*;

public class RunnerMain {

    @FXML
    private Button LogoutButton;

    @FXML
    private Button backButton;

    @FXML
    private Button registerMainButton;

    @FXML
    private Button registerMainButton1;

    @FXML
    private Button registerMainButton11;

    @FXML
    private Button registerMainButton111;

    @FXML
    private Button registerMainButton2;
    private Stage mainStage;

    @FXML
    void BackOnAction(ActionEvent event) {
        showthx("thx.fxml", "Marathon Skills 2016");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMainscreen(menuStage,"MainScreen.fxml", "Marathon Skills 2016");
    }

    @FXML
    void RegisterMainOnAction(ActionEvent event) {
        showregMarf("regMarf.fxml", "Marathon Skills 2016");
    }

    public void MyResultOnAction(ActionEvent actionEvent) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("WIP");
        coming.show();
    }

    public void profileOnAction(ActionEvent actionEvent) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("WIP");
        coming.show();
    }

    public void MySponOnAction(ActionEvent actionEvent) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("WIP");
        coming.show();
    }

    public void ContactsOnAction(ActionEvent actionEvent) {
        Alert comming =new Alert(Alert.AlertType.CONFIRMATION);
        comming.setHeaderText("Контакты");
        comming.setContentText("Для получения дополнительной информации пожалуйста свяжитесь с координаторами:\n" +
                "\n" +
                "Телефон: +55 11 9988 7766\n" +
                "\n" +
                "Email:  coordinators@marathonskills.org\n");
        comming.show();
    }
}
