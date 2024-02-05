package edu.umindanao.cinematiquehub;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CinematiqueHub");

        Label label = new Label("String displayed using Label!");
        label.setText("Label New");
        Scene scene = new Scene(label, 500, 500);


        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}