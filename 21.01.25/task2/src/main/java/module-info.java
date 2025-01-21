module ru.shavaliev.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.task2 to javafx.fxml;
    exports ru.shavaliev.task2;
}