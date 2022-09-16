module markw.games.checkers {
    requires javafx.controls;
    requires javafx.fxml;


    opens markw.games.checkers to javafx.fxml;
    exports markw.games.checkers;
}