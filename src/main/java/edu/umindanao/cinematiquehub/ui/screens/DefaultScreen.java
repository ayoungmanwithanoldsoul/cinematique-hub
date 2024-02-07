package edu.umindanao.cinematiquehub.ui.screens;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class NodeUtils {

    public static void applyPadding(Node node, Insets padding) {
        node.setPadding(padding);
    }

    public static void applyMargins(Node node, Insets margins) {
        Insets currentMargins = StackPane.getMargin(node);
        if (currentMargins == null) {
            currentMargins = new Insets(0);
        }
        StackPane.setMargin(node, new Insets(
                currentMargins.getTop() + margins.getTop(),
                currentMargins.getRight() + margins.getRight(),
                currentMargins.getBottom() + margins.getBottom(),
                currentMargins.getLeft() + margins.getLeft()
        ));
    }

    public static void setWidth(Node node, double width) {
        node.setPrefWidth(width);
    }

    public static void setHeight(Node node, double height) {
        node.setPrefHeight(height);
    }

    public static void setMinWidth(Node node, double minWidth) {
        node.setMinWidth(minWidth);
    }

    public static void setMinHeight(Node node, double minHeight) {
        node.setMinHeight(minHeight);
    }

    public static void setBackgroundColor(Node node, Color backgroundColor) {
        BackgroundFill backgroundFill = new BackgroundFill(
                backgroundColor, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        node.setBackground(background);
    }

    public static void setFont(Control control, String fontName, double fontSize) {
        Font font = Font.font(fontName, fontSize);
        control.setFont(font);
    }

    public static void setTextColor(Control control, Color textColor) {
        control.setTextFill(textColor);
    }

    public static void setBorderColor(Node node, Color borderColor) {
        BorderStroke borderStroke = new BorderStroke(
                borderColor, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderStroke.THIN);
        Border border = new Border(borderStroke);
        node.setBorder(border);
    }
}
