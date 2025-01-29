module ru.shavaliev.marathon {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.marathon to javafx.fxml;
    exports ru.shavaliev.marathon;
    exports ru.shavaliev.marathon.controller;
    opens ru.shavaliev.marathon.controller to javafx.fxml;
}