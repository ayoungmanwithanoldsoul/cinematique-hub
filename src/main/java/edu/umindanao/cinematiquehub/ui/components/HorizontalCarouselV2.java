package edu.umindanao.cinematiquehub.ui.components;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class HorizontalCarouselV2 extends HBox {

    private static final double ANIMATION_DURATION = 300.0; // milliseconds

    public HorizontalCarouselV2() {
        setClip(new javafx.scene.shape.Rectangle());
    }

    public void addCard(Node card) {
        getChildren().add(card);
        layoutCards();
    }

    private void layoutCards() {
        double cardWidth = getWidth() / getChildren().size();

        for (int i = 0; i < getChildren().size(); i++) {
            Node card = getChildren().get(i);
            card.setLayoutX(i * cardWidth);
//            card.setPrefWidth(cardWidth);
        }

        setClip(new javafx.scene.shape.Rectangle(getWidth(), getHeight()));
    }

    public void scrollLeft() {
        double cardWidth = getWidth() / getChildren().size();
        double offset = cardWidth;

        double targetX = Math.min(0, getTranslateX() + offset);

        TranslateTransition transition = new TranslateTransition(Duration.millis(ANIMATION_DURATION), this);
        transition.setToX(targetX);
        transition.play();
    }

    public void scrollRight() {
        double cardWidth = getWidth() / getChildren().size();
        double offset = -cardWidth;

        double targetX = Math.max(-(getChildren().size() - 4) * cardWidth, getTranslateX() + offset);

        TranslateTransition transition = new TranslateTransition(Duration.millis(ANIMATION_DURATION), this);
        transition.setToX(targetX);
        transition.play();
    }
}

