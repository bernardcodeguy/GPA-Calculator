module fx.app.gpacal {
    requires javafx.controls;
    requires javafx.fxml;


    opens fx.app.gpacal to javafx.fxml;
    exports fx.app.gpacal;
}