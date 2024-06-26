package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Assignment extends Application {
    public void start(Stage prStage) throws Exception {
        prStage.setTitle("Assignment1");
        prStage.setWidth(1100);
        prStage.setHeight(800);

       
        Text nameText = new Text("Name: Prathamesh Bondar");
        nameText.setFont(new Font(25));
        nameText.setFill(Color.MAROON);

        Text hobbiesText = new Text("Hobbies: Traveling, Sports, Coding");
        hobbiesText.setFont(new Font(25));
        hobbiesText.setFill(Color.MAROON);

        Text languagesText = new Text("Programming Languages: Java, Python, JavaScript");
        languagesText.setFont(new Font(25));
        languagesText.setFill(Color.MAROON);

       
        VBox vb = new VBox(20, nameText, hobbiesText, languagesText);
        vb.setAlignment(Pos.CENTER); 
        vb.setStyle("-fx-background-color: AQUA;");

        
        Scene sc = new Scene(vb, 1100, 800);

        
        prStage.setScene(sc);

        
        prStage.show();
    }

   
}

