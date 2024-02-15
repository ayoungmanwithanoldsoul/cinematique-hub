package edu.umindanao.cinematiquehub.ui.components;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.controlsfx.control.RangeSlider;

/**
 * A custom component for filtering date ranges.
 */
public class DateRangeFilterComponent extends VBox {

    private final Label filterLabel;
    private final RangeSlider yearRangeSlider;
    private final Label startYearLabel;
    private final Label endYearLabel;

    private final IntegerProperty startYearProperty;
    private final IntegerProperty endYearProperty;

    /**
     * Constructs a DateRangeFilterComponent with the specified label, minimum year, and maximum year.
     *
     * @param label   The label for the date range filter.
     * @param minYear The minimum year for the date range.
     * @param maxYear The maximum year for the date range.
     */
    public DateRangeFilterComponent(String label, int minYear, int maxYear) {
        filterLabel = new Label(label);
        yearRangeSlider = new RangeSlider(minYear, maxYear, minYear, maxYear);
        startYearLabel = new Label(String.valueOf(minYear));
        endYearLabel = new Label(String.valueOf(maxYear));

        startYearProperty = new SimpleIntegerProperty(minYear);
        endYearProperty = new SimpleIntegerProperty(maxYear);

        initializeUI();
        setupBindings();
        setupListeners();
    }

    /**
     * Initializes the user interface components and styling.
     */
    private void initializeUI() {
        setSpacing(10);
        setAlignment(Pos.CENTER_LEFT);
        setPadding(new Insets(10));

        filterLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14px;");

        // Apply built-in styles
        yearRangeSlider.setStyle("-fx-background-color: linear-gradient(to right, #64b5f6, #1976d2);");

        HBox inputBox = new HBox(10);
        inputBox.setAlignment(Pos.CENTER_LEFT);
        inputBox.getChildren().addAll(
                filterLabel,
                new Label("Start Year:"),
                startYearLabel,
                new Label("End Year:"),
                endYearLabel
        );

        getChildren().addAll(yearRangeSlider, inputBox);
    }

    /**
     * Sets up data bindings between the slider and labels.
     */
    private void setupBindings() {
        // Bind slider values to labels
        startYearLabel.textProperty().bind(Bindings.format("%.0f", yearRangeSlider.lowValueProperty()));
        endYearLabel.textProperty().bind(Bindings.format("%.0f", yearRangeSlider.highValueProperty()));

        // Bind labels values to slider
        startYearProperty.bind(yearRangeSlider.lowValueProperty().asObject());
        endYearProperty.bind(yearRangeSlider.highValueProperty().asObject());
    }

    /**
     * Sets up event listeners for tracking changes in the year range and printing selected range.
     */
    private void setupListeners() {
        // Print the selected range when the user releases the slider
        yearRangeSlider.lowValueChangingProperty().addListener((obs, changing, changed) -> {
            if (!changed) {
                System.out.println("Selected Year Range: " + startYearProperty.get() + " - " + endYearProperty.get());
            }
        });

        yearRangeSlider.highValueChangingProperty().addListener((obs, changing, changed) -> {
            if (!changed) {
                System.out.println("Selected Year Range: " + startYearProperty.get() + " - " + endYearProperty.get());
            }
        });
    }

    /**
     * Gets the start year property.
     *
     * @return The start year property.
     */
    public IntegerProperty startYearProperty() {
        return startYearProperty;
    }

    /**
     * Gets the end year property.
     *
     * @return The end year property.
     */
    public IntegerProperty endYearProperty() {
        return endYearProperty;
    }
}
