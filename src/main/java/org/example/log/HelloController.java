package org.example.log;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;



    @FXML
    private void openSignUpPage() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signUp.fxml"));
            Parent signUpPage = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(signUpPage));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}