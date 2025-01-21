module ru.shavaliev.dop {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.dop to javafx.fxml;
    exports ru.shavaliev.dop;
}