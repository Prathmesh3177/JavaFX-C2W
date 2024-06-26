package Alerts;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;


public class Confirmation extends Application {
    public void start(Stage prStage)throws Exception{

        Alert alert = new Alert(AlertType.CONFIRMATION);
alert.setTitle("Confirmation Dialog with Custom Actions");
alert.setHeaderText("Look, a Confirmation Dialog with Custom Actions");

alert.setContentText("Choose your option.");
ButtonType buttonTypeOne = new ButtonType("One");
ButtonType buttonTypeTwo = new ButtonType("Two");
ButtonType buttonTypeThree = new ButtonType("Three");
ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree,
buttonTypeCancel);
Optional<ButtonType> result = alert.showAndWait();
if (result.get() == buttonTypeOne){

} else if (result.get() == buttonTypeTwo) {

} else if (result.get() == buttonTypeThree) {

} else {

    }
    
}
}

