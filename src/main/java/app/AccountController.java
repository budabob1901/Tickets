package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class AccountController {

    // FIELDS FRA FXML
    @FXML private TextField emailField;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField dobField;
    @FXML private TextField phoneField;

    @FXML private PasswordField currentPasswordField;
    @FXML private PasswordField newPasswordField;
    @FXML private PasswordField confirmPasswordField;

    // NAVIGATION
    private void switchTo(String fxml) {
        try {
            Stage stage = (Stage) emailField.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/" + fxml));
            stage.setScene(new Scene(loader.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML private void goHome() { switchTo("Home.fxml"); }
    @FXML private void goEvents() { switchTo("Events.fxml"); }
    @FXML private void goTickets() { switchTo("Tickets.fxml"); }
    @FXML private void goAccount() { switchTo("Account.fxml"); }

    // KNAPPER FRA FXML
    @FXML
    private void updateProfile() {
        System.out.println("Updating profile...");
    }

    @FXML
    private void changePassword() {
        System.out.println("Changing password...");
    }

    @FXML
    private void downloadData() {
        System.out.println("Downloading data...");
    }

    @FXML
    private void deleteAccount() {
        System.out.println("Deleting account...");
    }
}