module ru.shavaliev.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.task3 to javafx.fxml;
    exports ru.shavaliev.task3;
}