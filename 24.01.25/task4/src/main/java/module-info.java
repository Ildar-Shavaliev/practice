module ru.shavaliev.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.task4 to javafx.fxml;
    exports ru.shavaliev.task4;
}