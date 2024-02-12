package edu.umindanao.cinematiquehub.ui.components;

import javafx.animation.ScaleTransition;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class CustomInputField extends TextField {

    private static final double DEFAULT_BORDER_RADIUS = 5.0;
    private static final double GROW_ANIMATION_SCALE = 1.1;
    private static final Duration GROW_ANIMATION_DURATION = Duration.millis(200);

    private Color backgroundColor;
    private Color borderColor;
    private double borderRadius;

    public CustomInputField() {
        initialize();
    }

    private void initialize() {
        // Set default properties
        setMinWidth(200);
        setMinHeight(30);
        setDefaultStyles();
        setPlaceholder("Enter text...");

        // Add hover effects
        setOnMouseEntered(event -> {
//            setBackgroundColor(Color.LIGHTGRAY);
            playGrowAnimation();
        });

        setOnMouseExited(event -> {
//            setBackgroundColor(Color.WHITE);
            playShrinkAnimation();
        });
    }

    private void setDefaultStyles() {
        setBorderRadius(DEFAULT_BORDER_RADIUS);
        setBorderColor(Color.BLACK);
        setBackgroundColor(Color.WHITE);
        setTextSize(12);
    }

    public void setBorderRadius(double radius) {
        borderRadius = radius;
        setStyle("-fx-background-radius: " + radius + "px;");
    }

    public void setBorderColor(Color color) {
        borderColor = color;
        setStyle("-fx-border-color: " + toHex(color) + "; -fx-border-width: 1;");
    }

    public void setBackgroundColor(Color color) {
        backgroundColor = color;
        setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, null)));
    }

    public void setTextSize(double textSize) {
        setStyle("-fx-font-size: " + textSize + "px;");
    }

    public void setPlaceholder(String placeholder) {
        setPromptText(placeholder);
    }

    private Color getBackgroundColor() {
        Background background = getBackground();
        if (background != null && !background.getFills().isEmpty()) {
            BackgroundFill backgroundFill = background.getFills().get(0);
            return (Color) backgroundFill.getFill();
        } else {
            // Return a default color or handle accordingly
            return Color.WHITE;
        }
    }


    private void playGrowAnimation() {
        ScaleTransition scaleTransition = new ScaleTransition(GROW_ANIMATION_DURATION, this);
        scaleTransition.setToX(GROW_ANIMATION_SCALE);
        scaleTransition.setToY(GROW_ANIMATION_SCALE);
        scaleTransition.play();
    }

    private void playShrinkAnimation() {
        ScaleTransition scaleTransition = new ScaleTransition(GROW_ANIMATION_DURATION, this);
        scaleTransition.setToX(1.0);
        scaleTransition.setToY(1.0);
        scaleTransition.play();
    }

    private String toHex(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
}
