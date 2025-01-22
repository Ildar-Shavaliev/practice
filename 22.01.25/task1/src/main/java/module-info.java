module ru.shavaliev.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.task1 to javafx.fxml;
    exports ru.shavaliev.task1;
}