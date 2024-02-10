package edu.umindanao.cinematiquehub.ui.components;


//import javafx.geometry.Pos;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Priority;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.block;

public class AnotherButton extends Button {

    public enum Size {
        EXTRA_LARGE, LARGE, MEDIUM, SMALL
    }

    public enum Variant {
        PRIMARY, SECONDARY, SUCCESS, INFO, WARNING, ERROR
    }

    private final String textColor;
    private static String textPressedColor;

    public AnotherButton(String text, Size size, Variant variant, String textColor, String textPressedColor, boolean block) {
        this.textPressedColor = textPressedColor;

        this.textColor = textColor;

        // Set default styling
        setDefaultStyle(size, variant, textColor, block);

        // Set button text
        setText(text);

//        setTextColor(textColor);

        // Apply drop shadow effect on hover
        setOnMouseEntered(e -> {
            setEffect(new DropShadow());
            setStyle(getHoverStyle(size, variant, block));
        });

//        if(isEntered)


        // Remove drop shadow effect on exit
        setOnMouseExited(e -> {
            setEffect(null);
            setStyle(getDefaultStyle(size, variant, block));
        });

        // Change background color on press
        setOnMousePressed(e -> {
            setStyle(getPressedStyle(size, variant, block));
            setEffect(null); // Remove shadow on press
        });

        // Restore default style on release
        setOnMouseReleased(e -> {
            setStyle(getHoverStyle(size, variant, block));
            setEffect(new DropShadow());
        });
    }

    // Set default style based on size, variant, and block
    private void setDefaultStyle(Size size, Variant variant, String textColor, boolean block) {
        setStyle(
                "-fx-text-fill: " + textColor + "; " +
                        "-fx-font-size: " + getFontSize(size) + "; " +
                        "-fx-background-color: " + getBackgroundColor(variant) + "; " +
                        "-fx-border-color: " + getBorderColor(variant) + "; " +
                        "-fx-border-radius: " + getBorderRadius(block) + "; " +
                        "-fx-padding: " + getPadding(size) + "; " +
                        "-fx-background-radius: " + getBackgroundRadius(block) + "; " +
                        "-fx-alignment: CENTER_LEFT;"
        );

        if (block) {
            setMaxWidth(Double.MAX_VALUE);
        }
    }

    // Get the default style based on size, variant, and block
    private String getDefaultStyle(Size size, Variant variant, boolean block) {
        return "-fx-text-fill: " + getColor(variant) + "; " +
                "-fx-font-size: " + getFontSize(size) + "; " +
                "-fx-background-color: " + getBackgroundColor(variant) + "; " +
                "-fx-border-color: " + getBorderColor(variant) + "; " +
                "-fx-border-radius: " + getBorderRadius(block) + "; " +
                "-fx-padding: " + getPadding(size) + "; " +
                "-fx-background-radius: " + getBackgroundRadius(block) + "; " +
                "-fx-alignment: CENTER_LEFT;";
    }

    // Get the hover style based on size, variant, and block
    private String getHoverStyle(Size size, Variant variant, boolean block) {
        return getDefaultStyle(size, variant, block);
    }

    // Get the pressed style based on size, variant, and block
    private String getPressedStyle(Size size, Variant variant, boolean block) {
        return "-fx-text-fill: " + getColor(variant) + "; " +
                "-fx-font-size: " + getFontSize(size) + "; " +
                "-fx-background-color: " + getPressedBackgroundColor(variant) + "; " +
                "-fx-border-color: " + getBorderColor(variant) + "; " +
                "-fx-border-radius: " + getBorderRadius(block) + "; " +
                "-fx-padding: " + getPadding(size) + "; " +
                "-fx-background-radius: " + getBackgroundRadius(block) + "; " +
                "-fx-alignment: CENTER_LEFT;";
    }

    // Helper method to convert Variant to color
    private String getColor(Variant variant) {
        switch (variant) {
            case PRIMARY:
                return "#007BFF";
            case SECONDARY:
                return "#6C757D";
            case SUCCESS:
                return "#28A745";
            case INFO:
                return "#17A2B8";
            case WARNING:
                return "#FFC107";
            case ERROR:
                return "#DC3545";
            default:
                return "#007BFF";
        }
    }

    // Helper method to get background color based on variant
    private String getBackgroundColor(Variant variant) {
        return getColor(variant);
    }

    // Helper method to get pressed background color based on variant
    private String getPressedBackgroundColor(Variant variant) {
        return "#0056b3";
    }

    // Helper method to get border color based on variant
    private String getBorderColor(Variant variant) {
        return getColor(variant);
    }

    // Helper method to get font size based on size
    private int getFontSize(Size size) {
        switch (size) {
            case EXTRA_LARGE:
                return 18;
            case LARGE:
                return 16;
            case MEDIUM:
                return 14;
            case SMALL:
                return 12;
            default:
                return 14;
        }
    }

    // Helper method to get padding based on size
    private String getPadding(Size size) {
        switch (size) {
            case EXTRA_LARGE:
                return "10 20";
            case LARGE:
                return "8 16";
            case MEDIUM:
                return "6 12";
            case SMALL:
                return "4 8";
            default:
                return "6 12";
        }
    }

    // Helper method to get border radius based on block
    private String getBorderRadius(boolean block) {
        return block ? "0" : "5";
    }

    // Helper method to get background radius based on block
    private String getBackgroundRadius(boolean block) {
        return block ? "0" : "5";
    }

    // Method to set the button size
    public void setSize(Size size) {
        setStyle(getDefaultStyle(size, Variant.PRIMARY, false));
    }

    // Method to set the block style
    public void setBlock(boolean block) {
        setStyle(getDefaultStyle(Size.MEDIUM, Variant.PRIMARY, block));
    }

    // Method to set the border radius
    public void setBorderRadius(double radius) {
        setStyle("-fx-border-radius: " + radius + ";");
    }

    public void setButtonBorderRadius(double radius) {
        setStyle("-fx-border-radius: " + radius + ";" +
                "-fx-background-radius: " + radius + ";");
    }

    // Method to set the button variant
    public void setVariant(Variant variant) {
        setStyle(getDefaultStyle(Size.MEDIUM, variant, false));
    }

    // Method to set padding for the button
    public void setButtonPadding(Insets padding) {
        setPadding(padding);
    }

    // Method to set the text color
    public void setTextColor(String textColor) {
        setStyle("-fx-text-fill: " + textColor + ";");
    }
}
