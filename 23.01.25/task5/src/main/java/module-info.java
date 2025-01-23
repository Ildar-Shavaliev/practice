module ru.shavaliev.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.task5 to javafx.fxml;
    exports ru.shavaliev.task5;
}