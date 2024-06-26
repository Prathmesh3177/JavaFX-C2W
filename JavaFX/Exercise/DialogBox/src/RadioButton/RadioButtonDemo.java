package RadioButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class RadioButtonDemo extends Application {
@Override
public void start(Stage stage) {

stage.setTitle("RadioButtonDemo");

VBox vbox = new VBox(10); 

Label label = new Label("Career Option:");

RadioButton radioButton1 = new RadioButton("Backend Developer");
RadioButton radioButton2 = new RadioButton("Web Developer");
RadioButton radioButton3 = new RadioButton("Flutter Developer");

ToggleGroup group = new ToggleGroup();
radioButton1.setToggleGroup(group);
radioButton2.setToggleGroup(group);
radioButton3.setToggleGroup(group);

vbox.getChildren().addAll(label, radioButton1, radioButton2,
radioButton3);

Scene scene = new Scene(vbox, 200, 200);

stage.setScene(scene);

stage.show();

}

}
