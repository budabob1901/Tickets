package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AccountController {

    @FXML
    private Label dummy;

    private void switchTo(String fxml) {
        try {
            Stage stage = (Stage) dummy.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            stage.setScene(new Scene(loader.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goHome() {
        switchTo("Home.fxml");
    }

    @FXML
    private void goEvents() {
        switchTo("Events.fxml");
    }

    @FXML
    private void goTickets() {
        switchTo("Tickets.fxml");
    }

    @FXML
    private void goAccount() {
        switchTo("Account.fxml");
    }
}