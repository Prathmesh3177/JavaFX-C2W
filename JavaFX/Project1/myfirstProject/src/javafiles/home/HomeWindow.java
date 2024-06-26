package javafiles.home;

import javafx.application.Application;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeWindow extends Application {
    Text txt = null;
    public void start(Stage prStage) throws Exception {
        prStage.setTitle("Stage Practical");
        
        // Use class loader to load the image
        prStage.getIcons().add(new Image(getClass().getResourceAsStream("/Assets/images/icon6.png")));
        
        prStage.setResizable(false);
        prStage.setX(0);
        prStage.setY(0);
        prStage.setWidth(1800);
        prStage.setHeight(1000);

        txt = new Text(10, 30, "Good Evening,");
        txt.setFill(Color.WHITE);
        txt.setFont(new Font(30));

        Text gd = new Text(1000, 30, "Have a Nice Day");
        gd.setFill(Color.YELLOW);
        gd.setFont(new Font(35));
        gd.setFont(new Font(30));

        Text Python = new Text("Python");
        Python.setFont(new Font(40));

        Text Java = new Text("Java");
        Java.setFont(new Font(40));

        Text Cpp = new Text("Cpp");
        Cpp.setFont(new Font(40));

        Text web = new Text( "Web");
        web.setFont(new Font(40));

        Text backend = new Text( "Backend");
        backend.setFont(new Font(40));

        Text app = new Text(30,30,"App");
        app.setFont(new Font(40));

        VBox vb = new VBox(50, Python,Java, Cpp);
        vb.setLayoutX(50);
        vb.setLayoutY(100);

        VBox vb1 = new VBox(50, web, backend, app);
        vb1.setLayoutX(400);
        vb1.setLayoutY(100);


        Group group = new Group(vb1, vb, txt, gd);
        HBox hb = new HBox(30,group);

        Scene scene = new Scene(hb, 450, 100);
        scene.setFill(Color.MAROON);
        scene.setCursor(Cursor.OPEN_HAND);

        prStage.setScene(scene);
        prStage.show();
    }
}
