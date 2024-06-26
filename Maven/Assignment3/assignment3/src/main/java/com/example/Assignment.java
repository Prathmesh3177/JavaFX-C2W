package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment extends Application {
    private VBox Buttons;
    public void start (Stage prStage)throws Exception{
        prStage.setResizable(false);
        prStage.setTitle("JButton Demo");
        prStage.setWidth(1000);
        prStage.setHeight(800);

        TextField javatxt = new TextField();
        TextField superxtxt = new TextField();
        TextField dsatxt = new TextField();

        Button java = new Button("Core2Web-Java");
        java.setPrefWidth(180);
        java.setStyle("-fx-font-weight:bold");
        java.setStyle("-fx-background-color: BLUE;");
        java.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println(javatxt.getText());
                java.setStyle("-fx-font-weight:bold; -fx-background-color:GREEN;");
        

               
            }
        });


        Button superX = new Button("Core2Web-Super X");
        superX.setStyle("-fx-font-weight:bold");
        superX.setPrefWidth(180);
        superX.setStyle("-fx-background-color: BLUE;");
        superX.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println(superxtxt.getText());
                superX.setStyle("-fx-font-weight:bold; -fx-background-color:GREEN;");
               

        
            }
        });


        Button dsa = new Button("Core2Web- DSA");
        dsa.setStyle("-fx-font-weight:bold");
        dsa.setStyle("-fx-background-color: BLUE;");
        dsa.setPrefWidth(180);
        dsa.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println(dsatxt.getText());
                dsa.setStyle("-fx-font-weight:bold; -fx-background-color:GREEN;");
             

              
            }
        });


        //VBox vb = new VBox(20,java,superX,dsa);
        Buttons = new VBox(20,java,superX,dsa); 
        Buttons.setAlignment(Pos.CENTER);
        Buttons.setStyle("-fx-background-color:YELLOW;");
       // VBox vb1 = new VBox(20,Buttons,vb);

        Scene sc = new Scene(Buttons);

        prStage.setScene(sc);
        prStage.show();

        

    }
    
}

