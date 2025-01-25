module ru.shavaliev.task {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.shavaliev.task to javafx.fxml;
    exports ru.shavaliev.task;
}