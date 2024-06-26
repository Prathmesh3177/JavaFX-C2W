package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.InputStream;

public class Assignment2 extends Application {

    @Override
    public void start(Stage prStage) {
        prStage.setResizable(false);
        prStage.setWidth(1000);
        prStage.setHeight(800);

        // Create image views
        VBox vb1 = createImageViewVBox(
            "/images/Java.png", 
            "/images/Python.png", 
            "/images/C.png", 
            "/images/Cpp.png"
        );

        // Create labels
        VBox vb2 = createLabelVBox(
            new LabelData("JAVA", "AQUA"),
            new LabelData("PYTHON", "ORANGE"),
            new LabelData("C", "GREEN"),
            new LabelData("C++", "SANDYBROWN")
        );

        // Create image views
        VBox vb3 = createImageViewVBox(
            "/images/Spring.png", 
            "/images/ReactJS.png", 
            "/images/Flutter.png", 
            "/images/NodeJS.png"
        );

        // Create labels
        VBox vb4 = createLabelVBox(
            new LabelData("SPRING", "AQUA"),
            new LabelData("REACT JS", "ORANGE"),
            new LabelData("FLUTTER", "GREEN"),
            new LabelData("NODE JS", "SANDYBROWN")
        );

        HBox hb1 = new HBox(vb1, vb2);
        HBox hb2 = new HBox(vb3, vb4);
        hb1.setStyle("-fx-background-color: WHITE;");
        hb2.setStyle("-fx-background-color: WHITE;");

        HBox root = new HBox(30, hb1, hb2);

        Scene scene = new Scene(root, 1000, 800);
        prStage.setScene(scene);
        prStage.show();
    }

    private VBox createImageViewVBox(String... imagePaths) {
        VBox vbox = new VBox(20);
        for (String path : imagePaths) {
            ImageView imageView = createImageView(path);
            vbox.getChildren().add(imageView);
        }
        return vbox;
    }

    private ImageView createImageView(String path) {
        InputStream imageStream = getClass().getResourceAsStream(path);
        if (imageStream == null) {
            throw new IllegalArgumentException("Image not found: " + path);
        }
        Image img = new Image(imageStream);
        ImageView imageView = new ImageView(img);
        imageView.setFitWidth(300);
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    private VBox createLabelVBox(LabelData... labels) {
        VBox vbox = new VBox(20);
        for (LabelData data : labels) {
            Label label = createLabel(data.text, data.color);
            vbox.getChildren().add(label);
        }
        return vbox;
    }

    private Label createLabel(String text, String color) {
        Label label = new Label(text);
        label.setFont(new Font(40));
        label.setPrefWidth(300);
        label.setPrefHeight(150);
        label.setAlignment(Pos.CENTER);
        label.setStyle("-fx-background-color:" + color + ";");
        return label;
    }

    private static class LabelData {
        String text;
        String color;

        LabelData(String text, String color) {
            this.text = text;
            this.color = color;
        }
    }

    
}
