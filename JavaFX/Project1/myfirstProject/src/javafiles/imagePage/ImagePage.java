package javafiles.imagePage;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ImagePage extends Application {
    public void start(Stage prStage) throws Exception {
        prStage.setResizable(true);
       // prStage.setX(0);
       // prStage.setY();
        prStage.setWidth(1800);
        prStage.setHeight(1000);

        Image ig = new Image("Assets/images/Demo.jpg");
        ImageView iv = new ImageView(ig);
        iv.setFitWidth(300);
        iv.setPreserveRatio(true);

        Label lb = new Label("JW MARRIOT");
        lb.setFont(new Font(40));
        //lb.setAlignment(Pos.CENTER);

        VBox vb = new VBox(iv);
       // vb.setMaxHeight(400);
        //vb.setMaxWidth(300);

        VBox vb1 = new VBox(lb);
        vb1.setStyle("-fx-background-color: AQUA;");
        vb1.setMaxHeight(300);
        //vb1.setMaxWidth(300);
        vb1.setAlignment(Pos.CENTER); 
        

        HBox hb = new HBox( vb , vb1);

        hb.setStyle("-fx-background-color: ORANGE;");

        

       

        Scene scene = new Scene(hb, 400, 300);
        //scene.setFill(Color.MAROON);
       // scene.setCursor(Cursor.OPEN_HAND);

        prStage.setScene(scene);
        prStage.show();
    }


}
