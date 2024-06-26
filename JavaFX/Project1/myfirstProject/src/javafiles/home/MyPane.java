package javafiles.home;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyPane extends Application {
    public void start(Stage primaryStage) {

        BorderPane borderPane = new BorderPane();

        Label top = new Label("Good Night");
        top.setFont(new Font(40));
        StackPane topPane = new StackPane(top);
        topPane.setAlignment(Pos.CENTER);
        
        Label left = new Label("Cpp");
        left.setFont(new Font(40));
        
        Label center = new Label("Java");
        center.setFont(new Font(40));
        
        Label right = new Label("Python");
        right.setFont(new Font(40));
        
        Label bottom = new Label("C#");
        bottom.setFont(new Font(40));

        borderPane.setTop(topPane);
        borderPane.setLeft(left);
        borderPane.setCenter(center);
        borderPane.setRight(right);
        borderPane.setBottom(bottom);

        Scene scene = new Scene(borderPane, 450, 300);
        scene.setFill(Color.ORANGE);
        scene.setCursor(Cursor.OPEN_HAND);

        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.show();
    }

    
}

