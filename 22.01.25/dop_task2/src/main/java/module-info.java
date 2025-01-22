module ru.shavaliev.dop_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.dop_task2 to javafx.fxml;
    exports ru.shavaliev.dop_task2;
}