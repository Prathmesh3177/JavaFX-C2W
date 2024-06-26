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
import javafx.stage.Stage;

public class LoginPage extends Application {

    private VBox vb;
    private Label lb;

    public void start(Stage prStage) throws Exception {
        prStage.setResizable(false);
        prStage.setTitle("Login Page");
        prStage.setWidth(400);
        prStage.setHeight(300);

        Label usernameLabel = new Label("Username:");
        TextField usernameTextField = new TextField();
        usernameTextField.setMaxWidth(150);

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        passwordField.setMaxWidth(150);

        Button loginButton = new Button("Login");
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String username = usernameTextField.getText();
                String password = passwordField.getText();
                if (username.equals("admin") && password.equals("password")) {

                    vb.getChildren().remove(lb);
                    lb = new Label("You are Welcome!");
                    vb.getChildren().add(lb);
                } else {
                    vb.getChildren().remove(lb);
                    lb = new Label("Incorrect username or password.");
                    vb.getChildren().add(lb);
                }
            }
        });

        vb = new VBox(20, usernameLabel, usernameTextField, passwordLabel, passwordField, loginButton);
        vb.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vb);

        prStage.setScene(scene);
        prStage.show();
    }

    
}
