package edu.umindanao.cinematiquehub.tests;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class MovieCard2 extends VBox {

    public MovieCard2(String movieTitle, String imageUrl, String ratings, String description) {
        // Create Image
        ImageView imageView = new ImageView(new Image(imageUrl));
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);

        // Create Movie Title
        Text titleText = new Text(movieTitle);
        titleText.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Create Ratings
        Text ratingsText = new Text("Ratings: " + ratings);
        ratingsText.setStyle("-fx-font-size: 14px;");

        // Create Description
        Text descriptionText = new Text(description);

        // Create Buttons
        Button addButton = new Button("Add to Cart");
        Button buyButton = new Button("BUY");

        // Set up layout
        setAlignment(Pos.CENTER);
        setStyle("-fx-padding: 20; -fx-spacing: 10; -fx-border-color: black; -fx-border-width: 2;");

        // Add nodes to layout
        getChildren().addAll(imageView, titleText, ratingsText, descriptionText, new HBox(10, addButton, buyButton));
    }
}
