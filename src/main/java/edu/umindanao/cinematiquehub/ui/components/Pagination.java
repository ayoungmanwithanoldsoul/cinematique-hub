package edu.umindanao.cinematiquehub.ui.components;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Pagination extends VBox {

    private int currentPage;
    private final int totalPages;

    private Label pageIndicator;

    public Pagination(int totalPages) {
        this.totalPages = totalPages;
        this.currentPage = 1;

        initializeUI();
    }

    private void initializeUI() {
        setSpacing(10);
        setAlignment(Pos.CENTER);

        HBox buttonsContainer = new HBox(5);
        buttonsContainer.setAlignment(Pos.CENTER);

        for (int i = 1; i <= totalPages; i++) {
            Button pageButton = createPageButton(i);
            buttonsContainer.getChildren().add(pageButton);
        }

        pageIndicator = new Label();
        updatePageIndicator();

        getChildren().addAll(buttonsContainer, pageIndicator);
    }

    private Button createPageButton(int pageNumber) {
        Button button = new Button(String.valueOf(pageNumber));
        stylePageButton(button);
        button.setOnAction(event -> {
            currentPage = pageNumber;
            updatePageIndicator();
        });
        return button;
    }

    private void stylePageButton(Button button) {
        button.setStyle(
                "-fx-font-size: 14px;" +
                        "-fx-background-color: #3498db;" +
                        "-fx-text-fill: white;" +
                        "-fx-border-color: transparent;" +
                        "-fx-border-radius: 5;" +
                        "-fx-padding: 5 10;"
        );

        button.setOnMouseEntered(event -> button.setStyle("-fx-background-color: #2980b9;"));
        button.setOnMouseExited(event -> button.setStyle("-fx-background-color: #3498db;"));
    }

    private void updatePageIndicator() {
        pageIndicator.setText("Current Page: " + currentPage);
    }
}
