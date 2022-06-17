package fx.app.gpacal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GPACalcApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene = new Scene(p);
        stage.setTitle("GPA Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
