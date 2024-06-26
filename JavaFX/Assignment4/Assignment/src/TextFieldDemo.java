import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldDemo extends Application {
    private VBox vb;
    public void start (Stage prStage)throws Exception{
        prStage.setTitle("Assignment4-Text Field");
        prStage.setResizable(false);
        prStage.setWidth(1000);
        prStage.setHeight(800);

        TextField tx = new TextField();
        tx.setMaxWidth(800);
        Button PrintText = new Button("Print Text");
        PrintText.setOnAction(new EventHandler<ActionEvent>() {
        
            public void handle(ActionEvent event) {
                System.out.println(tx.getText());
                Label lb1 = new Label(tx.getText());

                vb.getChildren().addAll(lb1);
            }
        });

         vb = new VBox(20, tx, PrintText);
        vb.setStyle("-fx-background-color: BLUE;");
        vb.setAlignment(Pos.CENTER);

        Scene sc = new Scene(vb);

        prStage.setScene(sc);
        prStage.show();

    }
    
}
