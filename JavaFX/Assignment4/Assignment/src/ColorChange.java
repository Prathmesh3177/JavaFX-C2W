import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

public class ColorChange extends Application {

    private VBox vb;
    private Button colorChangeButton;
    private Button alignmentButton;

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        primaryStage.setTitle("Background Color Change");
        primaryStage.setWidth(1000);
        primaryStage.setHeight(800);

        
        colorChangeButton = new Button("Click me!");
        colorChangeButton.setOnAction(e -> changeBackgroundColor());

        alignmentButton = new Button("Change Alignment");
        alignmentButton.setOnAction(e -> changeButtonAlignment());

        vb = new VBox(20, colorChangeButton, alignmentButton);
        vb.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vb, 1000, 800);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    private void changeBackgroundColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color randomColor = Color.rgb(red, green, blue);
        vb.setStyle("-fx-background-color: rgb(" + red + "," + green + "," + blue + ");");
    }


    private void changeButtonAlignment() {
        if (vb.getAlignment() == Pos.CENTER) {
            vb.setAlignment(Pos.CENTER_RIGHT);
            vb.setAlignment(Pos.TOP_CENTER);
            vb.setAlignment(Pos.TOP_LEFT);
        } else {
            vb.setAlignment(Pos.CENTER);
        }
    }

    
}
