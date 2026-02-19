package app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigation {

    public static void go(String fxml, Node anyNode) {
        try {
            Stage stage = (Stage) anyNode.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(Navigation.class.getResource(fxml));
            stage.setScene(new Scene(loader.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
