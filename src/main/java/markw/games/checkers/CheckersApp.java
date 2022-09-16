package markw.games.checkers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import java.io.IOException;

public class CheckersApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CheckersApp.class.getResource("title-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Checkers");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume();
            exit(stage);
        });
    }
    public void exit(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit the game.");
        alert.setContentText("Any unsaved data will be lost, do you still wish to exit?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage.close();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}