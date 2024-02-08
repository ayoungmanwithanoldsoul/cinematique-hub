package edu.umindanao.cinematiquehub.ui.components;

import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class HoverCardSample extends StackPane {

    private static final double CARD_WIDTH = 400;
    private static final double CARD_HEIGHT = 600;

    public HoverCardSample(String mainContent, String hoverContent) {
        initializeCard(mainContent, hoverContent);
    }

    private void initializeCard(String mainContent, String hoverContent) {
        // Create the main card with specified dimensions
        VBox mainCard = createMainCard(mainContent);
        mainCard.setVisible(true);

        // Create the hover card with the same dimensions
        VBox hoverCard = createHoverCard(hoverContent);
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

    private VBox createHoverCard(String content) {
        VBox cardContainer = new VBox();
//        Rectangle card = new Rectangle(CARD_WIDTH, CARD_HEIGHT);
//        card.setFill(Color.LIGHTBLUE);

        cardContainer.setMinWidth(CARD_WIDTH);
        cardContainer.setMinHeight(CARD_HEIGHT);
        cardContainer.setBackground(Background.fill(Color.LIGHTBLUE));

        Label label = new Label(content);
        label.setStyle("-fx-text-fill: red;");

        Circle circle = new Circle(16.0, Color.DODGERBLUE);

        circle.setStroke(Color.BLACK);

        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cardContainer.getChildren().addAll(label, circle);
//        cardContainer.getChildren().add(label);

        return cardContainer;
    }

    private VBox createMainCard(String content) {
        VBox cardContainer = new VBox();
//        Rectangle card = new Rectangle(CARD_WIDTH, CARD_HEIGHT);
//        card.setFill(Color.LIGHTBLUE);

        cardContainer.setMinWidth(CARD_WIDTH);
        cardContainer.setMinHeight(CARD_HEIGHT);
        cardContainer.setBackground(Background.fill(Color.BLUEVIOLET));

        Label label = new Label(content);
        label.setStyle("-fx-text-fill: GREEN;");

        Circle circle = new Circle(16.0, Color.GREEN);

        circle.setStroke(Color.BLACK);

        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        cardContainer.getChildren().addAll(label, circle);
//        cardContainer.getChildren().add(label);

        return cardContainer;
    }

//    private Rectangle createMainCard(String content) {
//        Rectangle card = new Rectangle(CARD_WIDTH, CARD_HEIGHT);
//        card.setFill(Color.SEAGREEN);
//
//        Label label = new Label(content);
//        label.setStyle("-fx-text-fill: red;");
//
//
//        return card;
//    }
}
