package edu.umindanao.cinematiquehub.scenes.components;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Content extends VBox {

    public Content() {
        setPadding(new Insets(10));
        setSpacing(10);
        setStyle("-fx-background-color: #f0f0f0;"); // Set background color

        // Add sample card items to the content
        getChildren().addAll(
                createCard("Card 1"),
                createCard("Card 2"),
                createCard("Card 3")
        );
    }

    private StackPane createCard(String cardName) {
        StackPane card = new StackPane();
        card.setStyle("-fx-background-color: #ffffff; -fx-border-color: #cccccc;");
        card.setPadding(new Insets(10));
        card.setMinHeight(100);
        card.getChildren().add(new Label(cardName));
        return card;
    }
}
