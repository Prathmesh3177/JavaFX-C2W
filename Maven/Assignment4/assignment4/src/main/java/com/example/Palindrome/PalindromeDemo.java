package com.example.Palindrome;
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

public class PalindromeDemo extends Application {

    private VBox vb;
    private Label resultLabel;

    public void start(Stage prStage) throws Exception {
        prStage.setTitle("Assignment4- Palindrome");
        prStage.setResizable(false);
        prStage.setWidth(400);
        prStage.setHeight(400);

        TextField tx = new TextField();
        tx.setMaxWidth(300);

        Button checkButton = new Button("Check");
        checkButton.setOnAction(new EventHandler<ActionEvent>() {
        
            public void handle(ActionEvent event) {
                String input = tx.getText();
                boolean isPalindrome = isPalindrome(input);
                if (isPalindrome) {
                    resultLabel.setText("'" + input + "' is a palindrome.");
                } else {
                    resultLabel.setText("'" + input + "' is not a palindrome.");
                }
            }
        });

        resultLabel = new Label("");

        vb = new VBox(20, tx, checkButton, resultLabel); 
        vb.setAlignment(Pos.CENTER);

        Scene sc = new Scene(vb);

        prStage.setScene(sc);
        prStage.show();
    }


    private boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
