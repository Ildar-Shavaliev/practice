module ru.shavaliev.task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.shavaliev.task1 to javafx.fxml;
    exports ru.shavaliev.task1;
}