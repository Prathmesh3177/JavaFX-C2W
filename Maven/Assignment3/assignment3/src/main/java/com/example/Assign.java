package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assign extends Application {
    
    public void start (Stage prStage)throws Exception{
        prStage.setResizable(false);
        prStage.setTitle("JButton Demo");
        prStage.setWidth(1000);
        prStage.setHeight(500);

        Label lb = new Label("Core2Web.in");
        lb.setAlignment(Pos.CENTER);

        

        Button java = new Button("JAVA");
        java.setPrefWidth(180);
        java.setStyle("-fx-font-weight:bold");
        java.setStyle("-fx-background-color: BLUE;");
    

        Button python = new Button("Python");
        python.setStyle("-fx-font-weight:bold");
        python.setPrefWidth(180);
        python.setStyle("-fx-background-color: BLUE;");
        

        Button dsa = new Button("DSA");
        dsa.setStyle("-fx-font-weight:bold");
        dsa.setStyle("-fx-background-color: BLUE;");
        dsa.setPrefWidth(180);
        
        Button cpp = new Button("Cpp");
        cpp.setPrefWidth(180);
        cpp.setStyle("-fx-font-weight:bold");
        cpp.setStyle("-fx-background-color: BLUE;");
    

        Button os = new Button("OS");
        os.setStyle("-fx-font-weight:bold");
        os.setPrefWidth(180);
        os.setStyle("-fx-background-color: BLUE;");
        

        Button c = new Button("C");
        c.setStyle("-fx-font-weight:bold");
        c.setStyle("-fx-background-color: BLUE;");
        c.setPrefWidth(180);
        

        VBox vb = new VBox(20,os,java);
        vb.setAlignment(Pos.BOTTOM_CENTER);
        VBox vb1 = new VBox(20,c,dsa);
        vb1.setAlignment(Pos.BOTTOM_CENTER);
        VBox vb2 = new VBox(20,cpp, python);
        vb2.setAlignment(Pos.BOTTOM_CENTER);
  
       


        HBox hb = new HBox(20,vb,vb1,vb2); 
        hb.setAlignment(Pos.BOTTOM_CENTER);
        hb.setAlignment(Pos.BOTTOM_CENTER);
        hb.setStyle("-fx-background-color:YELLOW;");
       // VBox vb1 = new VBox(20,Buttons,vb);
       StackPane sp = new StackPane(hb,lb);

        Scene sc = new Scene(sp,400,400);

        prStage.setScene(sc);
        prStage.show();

        

    }
    
}
