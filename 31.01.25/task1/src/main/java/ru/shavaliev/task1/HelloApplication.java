package ru.shavaliev.task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javax.swing.*;
import java.io.IOException;

import static java.lang.Math.*;

public class HelloApplication extends Application {
    private Stage mainstage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;

    public void start(Stage stage) throws IOException {
        mainstage = stage;
        scene1 = createscene1();
        scene2 = createscene2();
        scene3 = createscene3();
        mainstage.setTitle("31.01.25");
        mainstage.setScene(scene1);
        mainstage.show();
    }

    private Scene createscene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField a1 = new TextField();
        TextField b1 = new TextField();
        Button Otvet1 = new Button("Найти Периметр");
        Label PLabel = new Label();
        Otvet1.setOnAction(event -> {
            try {
                int a = Integer.parseInt(a1.getText());
                int b = Integer.parseInt(b1.getText());
                int P = 2 * (a + b);
                PLabel.setText("P = " + P);
            } catch (Exception e) {
                PLabel.setText("ошибка");
            } finally {
                JOptionPane.showMessageDialog(null, "значение вычислено");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> mainstage.setScene(scene1));
        btn2Button.setOnAction(event -> mainstage.setScene(scene2));
        btn3Button.setOnAction(event -> mainstage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a = "), a1, new Label("b = "), b1);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, Otvet1, PLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene createscene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField a2 = new TextField();
        TextField b2 = new TextField();
        TextField c2 = new TextField();
        Button calcButton = new Button("Найти Периметр");
        Label Otvet2Label = new Label();
        calcButton.setOnAction(event -> {
            try {
                int a = Integer.parseInt(a2.getText());
                int b = Integer.parseInt(b2.getText());
                int c = Integer.parseInt(c2.getText());
                int f = a * b;
                int s = b * c;
                int max = Math.max(f, s);
                int min = Math.min(f, s);
                Otvet2Label.setText("" + min + "  " + max);
                // 3 числа, а на б, б на с, в порядке возрастания
            } catch (NumberFormatException e) {
                Otvet2Label.setText("ошибка");
            } finally {
                javax.swing.JOptionPane.showMessageDialog(null, "значение вычислено");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> mainstage.setScene(scene1));
        btn2Button.setOnAction(event -> mainstage.setScene(scene2));
        btn3Button.setOnAction(event -> mainstage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a = "), a2, new Label("b = "), b2, new Label("c = "), c2);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, Otvet2Label, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene createscene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField x3 = new TextField();
        TextField y3 = new TextField();
        TextField r3 = new TextField();
        Button calcButton = new Button("Найти Периметр");
        Label PLabel = new Label();
        calcButton.setOnAction(event -> {
            try {
                int x = Integer.parseInt(x3.getText());
                int y = Integer.parseInt(y3.getText());
                int r = Integer.parseInt(r3.getText());
                if (pow(r, 2) > pow(x, 2) + pow(y, 2))
                    PLabel.setText("точка находиться в окружности");
                else
                    PLabel.setText("точка за пределами окружности");
            } catch (NumberFormatException e) {
                PLabel.setText("Ошибка");
            } finally {
                javax.swing.JOptionPane.showMessageDialog(null, "значение вычислено");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> mainstage.setScene(scene1));
        btn2Button.setOnAction(event -> mainstage.setScene(scene2));
        btn3Button.setOnAction(event -> mainstage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x = "), x3, new Label("y = "), y3, new Label("r = "), r3);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, PLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
}
