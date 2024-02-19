package edu.umindanao.cinematiquehub.ui.components;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class NavBarItem extends Button {

    private final HBox hBox;
    private final Circle circle;
    private final Label label;
    private final String itemName;

    private final BooleanProperty selectedProperty = new SimpleBooleanProperty(false);


    public NavBarItem(String item, int index, NavItemClickListener listener) {
        itemName = item;
        hBox = new HBox();
        hBox.setSpacing(10.0);

        // Create Circle as a sample icon
        circle = new Circle(16.0, Color.DODGERBLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        // Create Label
        label = new Label(item);
        label.setTextFill(Color.WHITE);
        label.setFont(new Font("Arial", 20));

        // Add Circle and Label to the HBox
        hBox.getChildren().addAll(circle, label);
        hBox.setPadding(new Insets(10));

        // Set button content and style
        setGraphic(hBox);
        setContentDisplay(ContentDisplay.LEFT);
        setMaxWidth(Double.MAX_VALUE);

        // Add click event for item selection
        setOnAction(event -> listener.onNavItemClicked(index));

        // Set initial style
        updateStyle();

        // Bind selectedProperty to background color
        selectedProperty.addListener((observable, oldValue, newValue) -> updateStyle());
    }

    public boolean isSelected() {
        return selectedProperty.get();
    }

    public void setSelected(boolean selected) {
        selectedProperty.set(selected);
    }

    private void updateStyle() {
        // Update style based on the selected state
        if (selectedProperty.get()) {
            setBackground(new Background(new BackgroundFill(Color.rgb(200, 200, 200), new CornerRadii(5), Insets.EMPTY)));
            setStyle("-fx-border-width: 0 0 0 20; -fx-border-color: #00C853;");
            label.setTextFill(Color.BLACK);
        } else {
            setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
            setStyle("-fx-border-width: 0;");
            label.setTextFill(Color.WHITE);
        }
    }

    public String getItem() {
        return itemName.replace(" ", "");
    }

    public interface NavItemClickListener {
        void onNavItemClicked(int selectedIndex);


    }
}
