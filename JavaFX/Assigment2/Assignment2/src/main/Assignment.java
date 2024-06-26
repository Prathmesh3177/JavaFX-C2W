package main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Assignment extends Application {
    @Override
    public void start(Stage prStage) throws Exception {
        prStage.setResizable(false);
        prStage.setWidth(1000);
        prStage.setHeight(800);

        Image javaImg = new Image("/Assets/images/Java.png");
        ImageView javaIv = new ImageView(javaImg);
        javaIv.setFitWidth(300);
        javaIv.setFitHeight(150);
        javaIv.setPreserveRatio(true);

        Image pythonImg = new Image("/Assets/images/Python.png");
        ImageView pythonIv = new ImageView(pythonImg);
        pythonIv.setFitWidth(300);
        pythonIv.setFitHeight(150);
        pythonIv.setPreserveRatio(true);

        Image cImg = new Image("/Assets/images/C.png");
        ImageView cIv = new ImageView(cImg);
        cIv.setFitWidth(300);
        cIv.setFitHeight(150);
        cIv.setPreserveRatio(true);

        Image cppImg = new Image("/Assets/images/Cpp.png");
        ImageView cppIv = new ImageView(cppImg);
        cppIv.setFitWidth(300);
        cppIv.setFitHeight(150);
        cppIv.setPreserveRatio(true);

        VBox vb = new VBox(20, javaIv, pythonIv, cIv, cppIv);

       
        Label lb = new Label("JAVA");
        lb.setFont(new Font(40));
        lb.setPrefWidth(300);
        lb.setPrefHeight(150);
        lb.setAlignment(Pos.CENTER);
        lb.setStyle("-fx-background-color:AQUA;"); 

        Label lb1 = new Label("PYTHON");
        lb1.setFont(new Font(40));
        lb1.setPrefWidth(300);
        lb1.setPrefHeight(150);
        lb1.setAlignment(Pos.CENTER);
        lb1.setStyle("-fx-background-color:ORANGE;");

        Label lb2 = new Label("C");
        lb2.setFont(new Font(40));
        lb2.setPrefWidth(300);
        lb2.setPrefHeight(150);
        lb2.setAlignment(Pos.CENTER);
        lb2.setStyle("-fx-background-color:GREEN;");

        Label lb3 = new Label("C++");
        lb3.setFont(new Font(40));
        lb3.setPrefWidth(300);
        lb3.setPrefHeight(150);
        lb3.setAlignment(Pos.CENTER);
        lb3.setStyle("-fx-background-color:SANDYBROWN;");

        VBox vb1 = new VBox(20, lb, lb1, lb2, lb3);

      
        Image springImg = new Image("/Assets/images/Spring.png");
        ImageView springIv = new ImageView(springImg);
        springIv.setFitWidth(300);
        springIv.setFitHeight(150);
        springIv.setPreserveRatio(true);

        Image reactImg = new Image("/Assets/images/ReactJS.png");
        ImageView reactIv = new ImageView(reactImg);
        reactIv.setFitWidth(300);
        reactIv.setFitHeight(150);
        reactIv.setPreserveRatio(true);

        Image flutterImg = new Image("/Assets/images/Flutter.png");
        ImageView flutterIv = new ImageView(flutterImg);
        flutterIv.setFitWidth(300);
        flutterIv.setFitHeight(150);
        flutterIv.setPreserveRatio(true);

        Image nodeImg = new Image("/Assets/images/NodeJS.png");
        ImageView nodeIv = new ImageView(nodeImg);
        nodeIv.setFitWidth(300);
        nodeIv.setFitHeight(150);
        nodeIv.setPreserveRatio(true);

        VBox vb2 = new VBox(20, springIv, reactIv, flutterIv, nodeIv);

       
        Label lb4 = new Label("SPRING");
        lb4.setFont(new Font(40));
        lb4.setPrefWidth(300);
        lb4.setPrefHeight(150);
        lb4.setAlignment(Pos.CENTER);
        lb4.setStyle("-fx-background-color:AQUA;"); 

        Label lb5 = new Label("REACT JS");
        lb5.setFont(new Font(40));
        lb5.setPrefWidth(300);
        lb5.setPrefHeight(150);
        lb5.setAlignment(Pos.CENTER);
        lb5.setStyle("-fx-background-color:ORANGE;");

        Label lb6 = new Label("FLUTTER");
        lb6.setFont(new Font(40));
        lb6.setPrefWidth(300);
        lb6.setPrefHeight(150);
        lb6.setAlignment(Pos.CENTER);
        lb6.setStyle("-fx-background-color:GREEN;");

        Label lb7 = new Label("NODE JS");
        lb7.setFont(new Font(40));
        lb7.setPrefWidth(300);
        lb7.setPrefHeight(150);
        lb7.setAlignment(Pos.CENTER);
        lb7.setStyle("-fx-background-color:SANDYBROWN;"); 

        VBox vb3 = new VBox(20, lb4, lb5, lb6, lb7);

        HBox hb = new HBox( vb, vb1);
        HBox hb1 = new HBox(vb2,vb3);
        hb.setStyle("-fx-background-color: WHITE;");
        hb1.setStyle("-fx-background-color: WHITE;");

        HBox root = new HBox(30,hb,hb1);


        Scene scene = new Scene(root,1000, 800);

        prStage.setScene(scene);
        prStage.show();
    }

}
