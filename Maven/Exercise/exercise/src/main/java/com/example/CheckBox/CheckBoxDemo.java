package com.example.CheckBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class CheckBoxDemo extends Application {
@Override
public void start(Stage stage) {

stage.setTitle("Creating CheckBox");


Label label = new Label("This is a check box demo");

String[] checkBoxLabels = {"Core2web", "Incubators", "Biencaps"};


VBox checkHBox = new VBox(20,label);

for (String checkBoxLabel : checkBoxLabels) {
CheckBox checkBox = new CheckBox(checkBoxLabel);


checkHBox.getChildren().add(checkBox);
}


Scene scene = new Scene(checkHBox, 200, 200);

stage.setScene(scene);

stage.show();
}

}