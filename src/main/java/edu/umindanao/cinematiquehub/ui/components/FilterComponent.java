package edu.umindanao.cinematiquehub.ui.components;

import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;

public class FilterComponent extends HBox {

    private final ComboBox<String> filterDropdown;
    private final Button clearButton;

    public FilterComponent(String[] filterOptions, StringProperty selectedFilter) {
        filterDropdown = new ComboBox<>();
        clearButton = new Button("X");

        // Configure the dropdown
        filterDropdown.getItems().addAll(filterOptions);
        filterDropdown.setValue("Select Filter"); // Default text
        filterDropdown.valueProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.equals("Select Filter")) {
                selectedFilter.set(newValue);
            }
        });

        // Configure the clear button
        clearButton.setOnAction(event -> {
            filterDropdown.setValue("Select Filter");
            selectedFilter.set(null);
        });

        // Layout and styling
        setSpacing(5);
        setAlignment(Pos.CENTER_LEFT);

        getChildren().addAll(filterDropdown, clearButton);
    }

    public void setDefaultFilter(String defaultFilter) {
        filterDropdown.setValue(defaultFilter);
    }

    public void setClearButtonVisible(boolean visible) {
        clearButton.setVisible(visible);
    }
}
