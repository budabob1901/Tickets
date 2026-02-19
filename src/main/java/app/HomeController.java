package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeController {

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
        switchTo("Home.fxml");
    }

    @FXML
    private void goEvents() {
        System.out.println("goEvents VIRKER");
        switchTo("Events.fxml");
    }

    @FXML
    private void goCreateEvent() {
        System.out.println("goCreateEvent VIRKER");
        switchTo("CreateEvent.fxml");
    }

    @FXML
    private void goTickets() {
        System.out.println("goTickets VIRKER");
        switchTo("Tickets.fxml");
    }

    @FXML
    private void goAccount() {
        System.out.println("goAccount VIRKER");
        switchTo("Account.fxml");
    }
}