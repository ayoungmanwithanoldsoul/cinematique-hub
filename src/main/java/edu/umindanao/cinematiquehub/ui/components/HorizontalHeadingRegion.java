package edu.umindanao.cinematiquehub.ui.components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;

import static javafx.scene.layout.StackPane.setAlignment;
import static javafx.scene.layout.StackPane.setMargin;

public class HorizontalHeadingRegion extends Region {

    private final Label headingLabel;

    public HorizontalHeadingRegion(String text) {
        HBox hbox = new HBox();
        headingLabel = new Label(text);
//        getChildren().add(headingLabel);
//        setFont(FontSize.MEDIUM); // Default font size

//        setPadding(new Insets(10)); // Adjust padding as needed
//        setMargin(headingLabel, new Insets(0, 0, 0, 0)); // Adjust margins as needed
        hbox.getChildren().add(headingLabel);
        hbox.setPadding(new Insets(0, 0, 0, 50));
        hbox.setAlignment(Pos.CENTER_LEFT);
        getChildren().add(hbox);
    }

    public void setFont(FontSize fontSize) {
        switch (fontSize) {
            case EXTRA_SMALL:
                headingLabel.setFont(Font.font(headingLabel.getFont().getFamily(), 10));
                break;
            case SMALL:
                headingLabel.setFont(Font.font(headingLabel.getFont().getFamily(), 12));
                break;
            case MEDIUM:
                headingLabel.setFont(Font.font(headingLabel.getFont().getFamily(), 16));
                break;
            case LARGE:
                headingLabel.setFont(Font.font(headingLabel.getFont().getFamily(), 20));
                break;
            case EXTRA_LARGE:
                headingLabel.setFont(Font.font(headingLabel.getFont().getFamily(), 24));
                break;
        }
    }

//    @Override
//    protected void layoutChildren() {
//        super.layoutChildren();
//        setMinHeight(Region.USE_PREF_SIZE); // Minimum height is the size of the container
//        setMinWidth(Region.USE_PREF_SIZE); // Minimum width is the content width of its parent
//        setMaxWidth(Region.USE_PREF_SIZE); // Maximum width is the content width of its parent
//    }

    public enum FontSize {
        EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }
}

