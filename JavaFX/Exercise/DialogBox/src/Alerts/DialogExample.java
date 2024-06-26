package Alerts;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DialogExample extends Application {
    public void start(Stage stage) {
       
        TextField textField = new TextField();


       
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("C2W_Dialog");

        ButtonType type = new ButtonType("Ok", ButtonData.OK_DONE);
        dialog.setContentText("Hello, You Have Created A Dialog Box");
        dialog.getDialogPane().getButtonTypes().add(type);

        
        Text txt = new Text("Click here -->");
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        txt.setFont(font);

       
        Button button = new Button("Show Dialog Box");
        button.setOnAction(e -> dialog.showAndWait());

        
        HBox pane = new HBox(15);
        pane.setPadding(new Insets(50, 150, 50, 60));
        pane.getChildren().addAll(txt, button);

        
        VBox vb = new VBox(pane);

        
        Scene scene = new Scene(vb, 600, 250, Color.TEAL);

       
        stage.setTitle("C2W_Dialog Box Demo");
        stage.setScene(scene);
        stage.show();
    }

    
}
