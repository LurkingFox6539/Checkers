package markw.games.checkers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.*;

import java.io.IOException;
import java.util.Objects;

public class TitleScreenController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private AnchorPane gameScene;

    // Exit menu option will provide an alert, exits the application on Confirm
    public void gameExit() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit the game.");
        alert.setContentText("Any unsaved data will be lost, do you still wish to exit?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) gameScene.getScene().getWindow();
            stage.close();
        }
    }

    // Switches to new game
    public void newGame(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("new-game.fxml")));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Switches to load game
    public void loadGame(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("load-game.fxml")));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}