package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TicketsController {

    @FXML
    private Label dummy;

    private void switchTo(String fxml) {
        try {
            Stage stage = (Stage) dummy.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/" + fxml));
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goHome() {
        System.out.println("goHome VIRKER");
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