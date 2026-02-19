package app;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CreateEventController {

    @FXML private TextField eventNameField;
    @FXML private TextArea descriptionField;
    @FXML private TextField capacityField;
    @FXML private TextField priceField;
    @FXML private DatePicker datePicker;
    @FXML private TextField startTimeField;
    @FXML private TextField endTimeField;
    @FXML private TextField locationField;

    // NAVIGATION
    @FXML
    public void goHome() {
        Navigation.go("Home.fxml", eventNameField);
    }

    @FXML
    public void goEvents() {
        Navigation.go("Events.fxml", eventNameField);
    }

    @FXML
    public void goCreateEvent() {
        Navigation.go("CreateEvent.fxml", eventNameField);
    }

    @FXML
    public void goTickets() {
        Navigation.go("Tickets.fxml", eventNameField);
    }

    @FXML
    public void goAccount() {
        Navigation.go("Account.fxml", eventNameField);
    }

    @FXML
    public void cancel() {
        Navigation.go("Home.fxml", eventNameField);
    }

    @FXML
    public void createEvent() {
        System.out.println("Event created: " + eventNameField.getText());
        Navigation.go("Home.fxml", eventNameField);
    }
}
