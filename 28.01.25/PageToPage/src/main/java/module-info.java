module ru.shavaliev.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shavaliev.pagetopage to javafx.fxml;
    exports ru.shavaliev.pagetopage;
    exports ru.shavaliev.pagetopage.controller;
    opens ru.shavaliev.pagetopage.controller to javafx.fxml;
}