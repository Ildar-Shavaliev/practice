package ru.shavaliev.task;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static java.lang.Math.*;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;
    private Scene scenedop;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        scenedop = createScenedop1();
        primaryStage.setTitle("Практическая работа 6");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene createScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAield = new TextField();
        Button calcButton = new Button("Найти Объём и площадь");
        Label VLabel = new Label();
        Label SLabel = new Label();
        calcButton.setOnAction(event -> {
            try {
                int a = Integer.parseInt(sideAield.getText());
                VLabel.setText("V = " + pow(a, 3));
                SLabel.setText("S = " + 6 * pow(a, 2));
            } catch (NumberFormatException e) {
                VLabel.setText("ошибка");
            } finally {
                JOptionPane.showMessageDialog(null, "значение вычислено");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("Доп");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scenedop));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a = "), sideAield);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, VLabel, SLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene createScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField AsideAield = new TextField();
        TextField BsideAield = new TextField();
        TextField CsideAield = new TextField();
        Button calcButton = new Button("Найти произведение длин отрезков");
        Label ACLabel = new Label();
        Label CBLabel = new Label();
        Label ACCBLabel = new Label();
        calcButton.setOnAction(event ->

        {
            try {
                int a = Integer.parseInt(AsideAield.getText());
                int b = Integer.parseInt(BsideAield.getText());
                int c = Integer.parseInt(CsideAield.getText());
                double AC = abs(c - a);
                double CB = abs(b - c);
                ACLabel.setText("AC = " + AC);
                CBLabel.setText("CB = " + CB);
                ACCBLabel.setText("AC * CB = " + AC * CB);
            } catch (NumberFormatException e) {
                ACLabel.setText("ошибка");
            } finally {
                JOptionPane.showMessageDialog(null, "значение вычислено");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btndopButton = new Button("Доп");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btndopButton.setOnAction(event -> primaryStage.setScene(scenedop));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btndopButton);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("A = "), AsideAield,new Label("B = "), BsideAield,new Label("C = "), CsideAield);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, ACLabel, CBLabel, ACCBLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene createScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField VsideAield = new TextField();
        TextField UsideAield = new TextField();
        TextField T1sideAield = new TextField();
        TextField T2sideAield = new TextField();
        Button calcButton = new Button("Пусть пройденная лодкой");
        Label S1Label = new Label();
        Label S2Label = new Label();
        Label S3Label = new Label();
        calcButton.setOnAction(event ->

        {
            try {
                double V = Double.parseDouble(VsideAield.getText());
                double U = Double.parseDouble(UsideAield.getText());
                double T1 = Double.parseDouble(T1sideAield.getText());
                double T2 = Double.parseDouble(T2sideAield.getText());
                S1Label.setText("S1 (по течению) = " + T1 * V);
                S2Label.setText("S2 (против течения) = " + T2 * (V - U));
                S3Label.setText("S3 (всё вместе) = " + (T1 * V + T2 * (V - U)));
            } catch (NumberFormatException e) {
                S1Label.setText("ошибка");
            } finally {
                JOptionPane.showMessageDialog(null, "значение вычислено");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btndopButton = new Button("Доп");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btndopButton.setOnAction(event -> primaryStage.setScene(scenedop));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btndopButton);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("Скорость лодки = "), VsideAield,new Label("Скорость течения = "), UsideAield,new Label("Время, если по течению = "), T1sideAield,new Label("Время, если против течения = "), T2sideAield);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, S1Label, S2Label, S3Label, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene createScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField XsideAield = new TextField();
        TextField AsideAield = new TextField();
        Button calcButton = new Button("Значение выражения");
        Label ALabel = new Label();
        Label PLabel = new Label();
        calcButton.setOnAction(event ->

        {
            try {
                double X = Double.parseDouble(XsideAield.getText());
                double a = Double.parseDouble(AsideAield.getText());
                double P = (1 / cos(X) + log(abs(tan(X / 2))) + X / (1 + X) / (1 + X));
                double A = (pow(P, 5) * sqrt(a * pow(X, 3) + 2)) / 2 * cos(X);
                PLabel.setText("P = " + P);
                ALabel.setText("A = " + A);
            } catch (NumberFormatException e) {
                PLabel.setText("ошибка");
            } finally {
                JOptionPane.showMessageDialog(null, "значение вычислено");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btndopButton = new Button("Доп");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btndopButton.setOnAction(event -> primaryStage.setScene(scenedop));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btndopButton);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x = "), XsideAield,new Label("a = "), AsideAield);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, PLabel, ALabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene createScenedop1() {
        Label titleLabel = new Label("Дополнительное Задание");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField A1sideAield = new TextField();
        TextField B1sideAield = new TextField();
        TextField C1sideAield = new TextField();
        TextField A2sideAield = new TextField();
        TextField B2sideAield = new TextField();
        TextField C2sideAield = new TextField();
        Button calcButton = new Button("решение");
        Label DLabel = new Label();
        Label XLabel = new Label();
        Label yLabel = new Label();
        calcButton.setOnAction(event ->

        {
            try {
                double A1 = Double.parseDouble(A1sideAield.getText());
                double B1 = Double.parseDouble(B1sideAield.getText());
                double C1 = Double.parseDouble(C1sideAield.getText());
                double A2 = Double.parseDouble(A2sideAield.getText());
                double B2 = Double.parseDouble(B2sideAield.getText());
                double C2 = Double.parseDouble(C2sideAield.getText());
                double D = A1 * B2 - A2 * B1;
                double x = (C1 * B2 - C2 * B1) / D;
                double y = (A1 * C2 - A2 * C1) / D;
                DLabel.setText("D = " + D);
                XLabel.setText("x = " + x);
                yLabel.setText("y = " + y);
            } catch (NumberFormatException e) {
                DLabel.setText("ошибка");
            } finally {
                JOptionPane.showMessageDialog(null, "значение вычислено");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btndopButton = new Button("Доп");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btndopButton.setOnAction(event -> primaryStage.setScene(scenedop));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btndopButton);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("A1 = "), A1sideAield,new Label("B1 = "), B1sideAield,new Label("C1 = "), C1sideAield,new Label("A2 = "), A2sideAield,new Label("B2 = "), B2sideAield,new Label("C2 = "), C2sideAield);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, DLabel, XLabel, yLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
}