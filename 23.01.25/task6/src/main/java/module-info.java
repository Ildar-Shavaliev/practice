module ru.shavaliev.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.task6 to javafx.fxml;
    exports ru.shavaliev.task6;
}