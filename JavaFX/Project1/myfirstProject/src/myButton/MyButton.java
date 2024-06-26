package myButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyButton extends Application {

    private VBox vb;

    public void start(Stage prStage) throws Exception {
        prStage.setResizable(false);
        prStage.setTitle("JButton Demo");
        prStage.setWidth(400);
        prStage.setHeight(400);

        Label username = new Label("User Name");
        username.setFont(new Font(10));
        TextField txt = new TextField();
        txt.setMaxWidth(150);

        Label pass = new Label("Password");
        pass.setFont(new Font(10));

        PasswordField pd = new PasswordField();
        pd.setMaxWidth(150);

        Button show = new Button("Show");
        show.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println(txt.getText());
                System.out.println(pd.getText());

                Label lb1 = new Label("Entered User Name: " + txt.getText());
                Label lb2 = new Label("Entered Password: " + pd.getText());

                vb.getChildren().addAll(lb1, lb2);
            }
        });

        vb = new VBox(20, username, txt, pass, pd, show);
        vb.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vb, 400, 300);

        prStage.setScene(scene);
        prStage.show();
    }

    
}
