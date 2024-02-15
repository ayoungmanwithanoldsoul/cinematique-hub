package edu.umindanao.cinematiquehub.ui.components;

/*

import javafx.beans.property.ListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;

public class MultiSelectFilterComponent<T> extends HBox {

    private final ChoiceBox<CheckBox> filterChoiceBox;

    public MultiSelectFilterComponent(ObservableList<T> filterOptions, ListProperty<T> selectedFilters) {
        filterChoiceBox = new ChoiceBox<>();
        filterChoiceBox.setMaxWidth(Double.MAX_VALUE);

        // Create checkboxes for each filter option
        for (T option : filterOptions) {
            CheckBox checkBox = new CheckBox(option.toString());
            checkBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue) {
                    selectedFilters.add(option);
                } else {
                    selectedFilters.remove(option);
                }
            });
            filterChoiceBox.getItems().add(checkBox);
        }

        // Layout and styling
        setSpacing(5);
        setAlignment(Pos.CENTER_LEFT);

        getChildren().add(filterChoiceBox);
    }

    public void setDefaultFilters(ObservableList<T> defaultFilters) {
        for (CheckBox checkBox : filterChoiceBox.getItems()) {
            checkBox.setSelected(defaultFilters.contains(checkBox.getText()));
        }
    }
}
*/


// version using chip like components
//package edu.umindanao.cinematiquehub.ui.components;

import javafx.beans.property.ListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MultiSelectFilterComponent<T> extends HBox {

    private final ComboBox<T> filterComboBox;
    private final HBox selectedChipsContainer;

    public MultiSelectFilterComponent(ObservableList<T> filterOptions, ListProperty<T> selectedFilters) {
        // Add a default item for placeholder text
        ObservableList<T> optionsWithPlaceholder = FXCollections.observableArrayList(filterOptions);
        optionsWithPlaceholder.add(0, null);

        filterComboBox = new ComboBox<>(optionsWithPlaceholder);
        selectedChipsContainer = new HBox();

        // Configure the ComboBox
        filterComboBox.setMaxWidth(Double.MAX_VALUE);
        filterComboBox.setPromptText("Select Category");
        filterComboBox.setOnAction(event -> addSelectedChip(filterComboBox.getValue(), selectedFilters));

        // Configure the selected chips container
        selectedChipsContainer.setAlignment(Pos.CENTER_LEFT);
        selectedChipsContainer.setSpacing(5);
        selectedChipsContainer.setUserData(selectedFilters); // Set the user data for the container

        // Style the selected chips container
        selectedChipsContainer.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 5px; -fx-border-radius: 5px;");

        // Layout and styling for the main container
        setSpacing(10);
        setAlignment(Pos.CENTER_LEFT);
        setPadding(new Insets(10));

        // Add a listener for selection changes in the dropdown
        filterComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Print the selected value when an item is selected from the dropdown
//                System.out.println("Selected category: " + newValue.toString());
                System.out.println("m0");
            } else {
                // Print when placeholder is selected (deselected)
//                System.out.println("Deselected category");
                System.out.println("m839");
            }
        });

        getChildren().addAll(filterComboBox, selectedChipsContainer);
    }

    private void addSelectedChip(T selectedValue, ListProperty<T> selectedFilters) {
        if (selectedValue != null && !selectedFilters.contains(selectedValue)) {
            Label chip = createChip(selectedValue);
            selectedChipsContainer.getChildren().add(chip);
            selectedFilters.add(selectedValue);
            System.out.println("selectedm1: " + selectedValue);
        }
        filterComboBox.setValue(null); // Reset the combo box
    }

    private Label createChip(T value) {
        Label chip = new Label(value == null ? "Select Category" : value.toString());
        chip.setFont(new Font("Arial", 12));
        chip.setTextFill(Color.WHITE);
        chip.setStyle("-fx-background-color: #007BFF; -fx-padding: 5px; -fx-border-radius: 5px; -fx-cursor: hand;");
        chip.setOnMouseClicked(event -> removeSelectedChip(chip, value));
        return chip;
    }

    private void removeSelectedChip(Label chip, T value) {
        selectedChipsContainer.getChildren().remove(chip);
        ((ListProperty<T>) selectedChipsContainer.getUserData()).remove(value);
        System.out.println("deselectedm2: " + value);
    }
}
