package edu.umindanao.cinematiquehub.ui.components;

import edu.umindanao.cinematiquehub.models.Movie;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.util.List;

public class HoverCard extends StackPane {

    private static final double CARD_WIDTH = 400;
    private static final double CARD_HEIGHT = 600;

    private ImageView imageView;
    private StyledText titleLabel;
    private TextFlow descriptionContainer;
    private StyledText descriptionText;
    private Label yearLabel;
    private Label ratingsLabel;
    private Label castLabel;
    private Label producerLabel;
    private Label priceLabel;
    private Label durationLabel;

    private AnotherButton addToCart;
    private HBox categoryBox;
    private Label categoryLabel;


    // Add the local variables

    private String title;
    private String description;
    private int year;
    private double ratings;
    private List<String> cast;
    private String producer;
    private String category;
    private String imageUri;
    private double duration;
    private double price;


    public HoverCard() {
        // Initialize UI components
        imageView = new ImageView();
        titleLabel = new StyledText();
        descriptionText = new StyledText();
        descriptionContainer = new TextFlow();
        yearLabel = new Label();
        ratingsLabel = new Label();
        castLabel = new Label();
        producerLabel = new Label();
        priceLabel = new Label();
        durationLabel = new Label();
        categoryLabel = new Label();

        initializeCard();

    }

    private void initializeCard() {
        // Create the main card with specified dimensions
        VBox mainCard = createMainCard();
        mainCard.setVisible(true);

        // Create the hover card with the same dimensions
        VBox hoverCard = createHoverCard();
        hoverCard.setVisible(false);
//        mainCard.setVisible(false);

        // add the hover card first to prevent hierarchy issues
        getChildren().add(hoverCard);
        getChildren().add(mainCard);


        // Set up hover events
        setOnMouseEntered(event -> {
            mainCard.setVisible(false);
            hoverCard.setVisible(true);
        });

        setOnMouseExited(event -> {
            mainCard.setVisible(true);
            hoverCard.setVisible(false);
        });
    }


    private VBox createHoverCard() {
        VBox cardContainer = new VBox();
        cardContainer.setMinWidth(CARD_WIDTH);
        cardContainer.setMinHeight(CARD_HEIGHT);
        cardContainer.setBackground(Background.fill(Color.LIGHTBLUE));
        cardContainer.setPadding(new Insets(30));

//        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        titleLabel.setColor(Color.BLUE);
        titleLabel.setFontSize(40);
        titleLabel.setFont("Arial");
        titleLabel.setAlignment(Pos.CENTER_LEFT);

        StyledText descriptionStyled = new StyledText(description);
//        descriptionText.(descriptionStyled);
        descriptionText.setText(description);

        descriptionContainer.getChildren().add(descriptionStyled);

        categoryBox = new HBox(new Label("Category: "));
        categoryLabel.setStyle("-fx-background-color: #66bb6a; -fx-padding: 3px 8px; -fx-text-fill: white;");
        categoryBox.getChildren().add(categoryLabel);

        cardContainer.getChildren().addAll(titleLabel, descriptionContainer, yearLabel, ratingsLabel, categoryLabel, castLabel, producerLabel);


        return cardContainer;
    }

    private VBox createMainCard() {
        VBox cardContainer = new VBox();
        cardContainer.setMinWidth(CARD_WIDTH);
        cardContainer.setMinHeight(CARD_HEIGHT);
        cardContainer.setBackground(Background.fill(Color.BLUEVIOLET));
        cardContainer.setPadding(new Insets(30));
        cardContainer.getChildren().addAll(imageView);
        return cardContainer;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMovieDetails(Movie movie) {
        setTitle(movie.getTitle());
        setDescription(movie.getDescription());
        setYear(movie.getYear());
        setRatings(movie.getRatings());
        setCast(movie.getCast());
        setProducer(movie.getProducer());
        setPrice(movie.getPrice());
        setDuration(movie.getDuration());
        setCategory(movie.getCategory());

        titleLabel.setText(movie.getTitle());
        descriptionContainer.getChildren().add(new Text(description));
        yearLabel.setText("Year: " + movie.getYear());
        ratingsLabel.setText("Ratings: " + movie.getRatings());
        castLabel.setText("Cast: " + String.join(", ", movie.getCast()));
        producerLabel.setText("Producer: " + movie.getProducer());
        priceLabel.setText("PHP: " + movie.getPrice());
        durationLabel.setText(movie.getDuration() + " mins");
        categoryLabel.setText(movie.getCategory());

        // Load and display the image from the URI
        Image image = new Image(movie.getImageUri());
        imageView.setImage(image);
    }


}
