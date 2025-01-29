package ru.shavaliev.marathon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.shavaliev.marathon.controller.MainScreen;
import ru.shavaliev.marathon.util.controller;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        controller.showMainscreen(stage,"MainScreen.fxml", "Matathon Skills 2016");
    }

    public static void main(String[] args) {
        launch();
    }
}