package app;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CreateEventController {

    @FXML private TextField eventNameField;
    @FXML private TextArea descriptionField;
    @FXML private TextField capacityField;
    @FXML private TextField priceField;
    @FXML private DatePicker datePicker;
    @FXML private TextField startTimeField;
    @FXML private TextField endTimeField;
    @FXML private TextField locationField;

    @FXML
    public void createEvent() {
        System.out.println("Event created: " + eventNameField.getText());
    }
}