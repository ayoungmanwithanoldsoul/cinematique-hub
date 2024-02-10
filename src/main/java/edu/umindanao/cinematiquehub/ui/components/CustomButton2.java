package edu.umindanao.cinematiquehub.ui.components;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public class CustomButton2 extends Button {

    private Color defaultBackgroundColor;
    private Color hoverColor;

    public CustomButton2(String text, Color defaultBackgroundColor, Color textColor, Color hoverColor, Color pressedColor) {
        this.defaultBackgroundColor = defaultBackgroundColor;
        this.hoverColor = hoverColor;

        setText(text);

        // Set default styling
        setStyle(
                "-fx-background-color: " + toHex(defaultBackgroundColor) + "; " +
                        "-fx-text-fill: " + toHex(textColor) + "; " +
                        "-fx-font-size: 14px;"
        );

        // Apply drop shadow effect on hover
        setOnMouseEntered(e -> {
            setEffect(new DropShadow());
            setStyle("-fx-background-color: " + toHex(hoverColor) + "; -fx-text-fill: " + toHex(textColor) + ";");
        });

        // Remove drop shadow effect on exit
        setOnMouseExited(e -> {
            setEffect(null);
            setStyle("-fx-background-color: " + toHex(defaultBackgroundColor) + "; -fx-text-fill: " + toHex(textColor) + ";");
        });

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

    // Method to adjust the size
    public void setSize(double width, double height) {
        setPrefSize(width, height);
    }

    // Method to set margins
    public void setMargins(double top, double right, double bottom, double left) {
        setStyle("-fx-margin: " + top + " " + right + " " + bottom + " " + left + ";");
    }
}
