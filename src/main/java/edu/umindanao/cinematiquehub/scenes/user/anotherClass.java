package edu.umindanao.cinematiquehub.scenes.user;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class anotherClass extends VBox {
    public anotherClass() {
        setSpacing(20);
        setAlignment(Pos.CENTER);

        // Create components for the home page
        ImageView imageView = new ImageView(new Image("https://images.unsplash.com/photo-1662016745909-1554d716b8b2?q=80&w=2072&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        TextField searchField = new TextField();
        searchField.setPromptText("Search...");

        Button searchButton = new Button("Search");

        // Add components to the VBox
        getChildren().addAll(imageView, searchField, searchButton);
    }
}
