package es.cifpcarlos3.playpoint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayPointApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PlayPointApplication.class.getResource("catalogo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //Titutlo
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
