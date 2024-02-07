package edu.umindanao.cinematiquehub.tests;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class MovieCard3 extends BorderPane {

    public MovieCard3(String movieTitle, String imageUrl, String ratings, String description) {
        // Create Image
        ImageView imageView = new ImageView(new Image(imageUrl));
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        imageView.setEffect(new DropShadow(10, Color.BLACK));

        // Create Movie Title
        StackPane titlePane = new StackPane();
        titlePane.setStyle("-fx-background-color: #263238; -fx-padding: 10;");
        javafx.scene.text.Text titleText = new javafx.scene.text.Text(movieTitle);
        titleText.setStyle("-fx-font-size: 18; -fx-fill: #ffffff; -fx-font-weight: bold;");
        titlePane.getChildren().add(titleText);
        titlePane.setAlignment(Pos.CENTER);
        titlePane.setMaxHeight(50);

        // Create Ratings
        HBox ratingsBox = new HBox();
        ratingsBox.getChildren().add(new javafx.scene.text.Text("Ratings: " + ratings));
        ratingsBox.setAlignment(Pos.CENTER);
        ratingsBox.setMaxHeight(30);

        // Create Description
        VBox descriptionBox = new VBox();
        javafx.scene.text.Text descriptionText = new javafx.scene.text.Text(description);
        descriptionText.setWrappingWidth(280);
        descriptionBox.getChildren().add(descriptionText);
        descriptionBox.setAlignment(Pos.CENTER);
        descriptionBox.setMaxHeight(100);

        // Create Buttons
        HBox buttonBox = new HBox(10);
        Button addButton = new Button("Add to Cart");
        Button buyButton = new Button("BUY");
        addButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
        buyButton.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white;");
        buttonBox.getChildren().addAll(addButton, buyButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setMaxHeight(40);

        // Set up layout
        setStyle("-fx-border-color: #bdbdbd; -fx-border-width: 2; -fx-border-radius: 10; -fx-background-radius: 10;");
        setMaxWidth(300);
        setPadding(new Insets(10));

        // Add nodes to layout
        setTop(titlePane);
        setCenter(imageView);
        setBottom(new VBox(ratingsBox, descriptionBox, buttonBox));
    }
}

