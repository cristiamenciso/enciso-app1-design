package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Cristiam Enciso
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ListManager extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ListManager.fxml")));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("ListManager");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
