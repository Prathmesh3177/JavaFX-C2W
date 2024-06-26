package com.example.Square;
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

public class Square extends Application {
    private VBox vb;

    public void start(Stage prStage) throws Exception {
        prStage.setTitle("Assignment4-Square and SquareRoot");
        prStage.setResizable(false);
        prStage.setWidth(1000);
        prStage.setHeight(800);

        TextField tx = new TextField();
        tx.setMaxWidth(100);

        Button squareButton = new Button("Square");
        squareButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            
                    double number = Double.parseDouble(tx.getText());
                    double square = number * number;
                    System.out.println("Square: " + square);
                    Label lb = new Label("Square of Given  Number is:"+ square);
                    vb.getChildren().addAll(lb);                
            }
        });

        Button squareRootButton = new Button("Square Root");
        squareRootButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                    double number = Double.parseDouble(tx.getText());
                    double squareRoot = Math.sqrt(number);
                    System.out.println("Square Root: " + squareRoot);
                    Label lb1 = new Label("Square Root of Given Numebr is : "+ squareRoot);

                    vb.getChildren().addAll(lb1);
                
            }
        });

        vb = new VBox(20, tx, squareButton, squareRootButton);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-color: AQUA;");

        Scene sc = new Scene(vb);

        prStage.setScene(sc);
        prStage.show();
    }

}
