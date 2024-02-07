package edu.umindanao.cinematiquehub.tests;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class MovieCard extends BorderPane {

    public MovieCard(String movieTitle, String imageUrl, String ratings, String description) {
        // Create Image
        ImageView imageView = new ImageView(new Image(imageUrl));
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);

        // Create Movie Title
        StackPane titlePane = new StackPane();
        titlePane.setStyle("-fx-background-color: #263238; -fx-padding: 10;");
        titlePane.getChildren().add(new javafx.scene.text.Text(movieTitle));
        titlePane.setAlignment(Pos.CENTER);
        titlePane.setMaxHeight(50);

        // Create Ratings
        HBox ratingsBox = new HBox();
        ratingsBox.getChildren().add(new javafx.scene.text.Text("Ratings: " + ratings));
        ratingsBox.setAlignment(Pos.CENTER);
        ratingsBox.setMaxHeight(30);

        // Create Description
        VBox descriptionBox = new VBox();
        descriptionBox.getChildren().add(new javafx.scene.text.Text(description));
        descriptionBox.setAlignment(Pos.CENTER);
        descriptionBox.setMaxHeight(100);

        // Create Buttons
        HBox buttonBox = new HBox(10);
        Button addButton = new Button("Add to Cart");
        Button buyButton = new Button("BUY");
        buttonBox.getChildren().addAll(addButton, buyButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setMaxHeight(40);

        // Set up layout
        setStyle("-fx-border-color: black; -fx-border-width: 2;");
        setMaxWidth(300);

        // Add nodes to layout
        setTop(titlePane);
        setCenter(imageView);
        setBottom(new VBox(ratingsBox, descriptionBox, buttonBox));
    }
}
