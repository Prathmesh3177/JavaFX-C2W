import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment extends Application {
    public void start(Stage prStage) throws Exception {

        prStage.setTitle("Assignment4-Print on Console");
        prStage.setResizable(false);
        prStage.setWidth(1000);
        prStage.setHeight(800);

        Button[] buttons = {
            createMonthButton("January"),
            createMonthButton("February"),
            createMonthButton("March"),
            createMonthButton("April"),
            createMonthButton("May"),
            createMonthButton("June"),
            createMonthButton("July"),
            createMonthButton("August"),
            createMonthButton("September"),
            createMonthButton("October"),
            createMonthButton("November"),
            createMonthButton("December")
        };

        
        VBox buttonsVBox = new VBox(20);
        buttonsVBox.setPadding(new Insets(20));
        buttonsVBox.setAlignment(Pos.TOP_LEFT);
        buttonsVBox.setStyle("-fx-background-color: YELLOW;");

     
        buttonsVBox.getChildren().addAll(buttons);

        
        Scene scene = new Scene(buttonsVBox);

     
        prStage.setScene(scene);
        prStage.show();
    }

    private Button createMonthButton(String monthName) {
        Button button = new Button(monthName);
        button.setPrefWidth(180);
        button.setStyle("-fx-font-weight: bold; -fx-background-color: BLUE;");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(monthName);
            }
        });
        return button;
    }

}
