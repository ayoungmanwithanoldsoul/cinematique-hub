package edu.umindanao.cinematiquehub.ui.components;

import edu.umindanao.cinematiquehub.models.Movie;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MovieCardSample extends VBox {

    private ImageView imageView;
    private Label titleLabel;
    private Label descriptionLabel;
    private Label yearLabel;
    private Label ratingsLabel;
    private Label castLabel;
    private Label producerLabel;

    public MovieCardSample() {
        // Initialize UI components
        imageView = new ImageView();
        titleLabel = new Label();
        descriptionLabel = new Label();
        yearLabel = new Label();
        ratingsLabel = new Label();
        castLabel = new Label();
        producerLabel = new Label();

        // Set up internal styling
        setSpacing(5);
        setPadding(new Insets(10));
        setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #ccc; -fx-border-width: 1px;");

        // Add components to the layout
        getChildren().addAll(imageView, titleLabel, descriptionLabel, yearLabel, ratingsLabel, castLabel, producerLabel);

        // Customize styling for individual components
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        imageView.setFitWidth(150);
        imageView.setFitHeight(100);
    }

    public void setMovieDetails(Movie movie) {
        titleLabel.setText(movie.getTitle());
        descriptionLabel.setText(movie.getDescription());
        yearLabel.setText("Year: " + movie.getYear());
        ratingsLabel.setText("Ratings: " + movie.getRatings());
        castLabel.setText("Cast: " + String.join(", ", movie.getCast()));
        producerLabel.setText("Producer: " + movie.getProducer());

        // Load and display the image from the URI
        Image image = new Image(movie.getImageUri());
        imageView.setImage(image);
    }
}
