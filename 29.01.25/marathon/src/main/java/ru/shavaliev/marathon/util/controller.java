package ru.shavaliev.marathon.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.shavaliev.marathon.HelloApplication;

import java.io.IOException;

public class controller {



    public static Stage menuStage;
    public static Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    public static void showMainscreen(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene screen = new Scene(fxmlLoader.load(),600, 400);
            stage.setScene((screen));
            stage.setTitle(title);
            stage.setMinWidth(300);
            stage.setMinHeight(200);
            stage.setMaxWidth(620);
            stage.setMaxHeight(450);
            stage.setMaximized(false);
            menuStage=stage;

            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showprove(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight());
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showlogin(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showregister(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight());
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showregMarf(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight());
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showthx(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight());
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showRunnerMain(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
