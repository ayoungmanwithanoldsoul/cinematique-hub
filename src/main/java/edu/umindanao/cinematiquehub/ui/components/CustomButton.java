package edu.umindanao.cinematiquehub.ui.components;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public class CustomButton extends Button {

    public CustomButton(String text, Color backgroundColor, Color textColor, Color hoverColor, Color pressedColor) {
        setText(text);

        // Set default styling
        setStyle(
                "-fx-background-color: " + toHex(backgroundColor) + "; " +
                        "-fx-text-fill: " + toHex(textColor) + "; " +
                        "-fx-font-size: 14px;"
        );

        // Apply drop shadow effect on hover
        setOnMouseEntered(e -> setEffect(new DropShadow()));

        // Remove drop shadow effect on exit
        setOnMouseExited(e -> setEffect(null));

        // Change background color on press
        setOnMousePressed(e -> {
            setStyle("-fx-background-color: " + toHex(pressedColor) + "; -fx-text-fill: " + toHex(textColor) + ";");
            setEffect(null); // Remove shadow on press
        });

        // Restore default style on release
        setOnMouseReleased(e -> setStyle(
                "-fx-background-color: " + toHex(hoverColor) + "; " +
                        "-fx-text-fill: " + toHex(textColor) + ";"
        ));
    }

    // Helper method to convert Color to hex
    private String toHex(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
}
