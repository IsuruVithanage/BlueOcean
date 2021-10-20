import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppRunner extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("view/LoadWindow.fxml"));
        Scene scene = new Scene(load);
        //scene.getStylesheets().add("style/style.css");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();


    }
}
