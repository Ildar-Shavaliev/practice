module ru.shavaliev.dop_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.dop_task1 to javafx.fxml;
    exports ru.shavaliev.dop_task1;
}