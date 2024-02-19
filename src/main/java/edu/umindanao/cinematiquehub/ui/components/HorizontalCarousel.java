package edu.umindanao.cinematiquehub.ui.components;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

public class HorizontalCarousel extends ScrollPane {

    private final HBox cardsContainer;

    public HorizontalCarousel() {
        cardsContainer = new HBox();
        setContent(cardsContainer);

        setHbarPolicy(ScrollBarPolicy.NEVER);
        setVbarPolicy(ScrollBarPolicy.NEVER);

        cardsContainer.prefWidthProperty().bind(widthProperty());
    }

    public void addCard(Node card) {
        cardsContainer.getChildren().add(card);
    }
}
