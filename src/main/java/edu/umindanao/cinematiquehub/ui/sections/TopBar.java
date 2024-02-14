package edu.umindanao.cinematiquehub.ui.sections;

import edu.umindanao.cinematiquehub.ui.components.AnotherButton;
import edu.umindanao.cinematiquehub.ui.components.CustomPasswordField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class TopBar extends AnchorPane {
    private final HBox hBox;

//    private final AnchorPane anchorPane;

    public TopBar() {
        this.hBox = new HBox();
//        this.anchorPane = new AnchorPane();
        HBox iconBar = new HBox();

        // Search Bar Sample
        CustomPasswordField searchBar = new CustomPasswordField();

        searchBar.setPrefWidth(500);
        searchBar.setPrefHeight(50);
//        searchBar.setBorderColor(Color.BLUEVIOLET);
//        searchBar.setBackground(Background.fill(Color.LIGHTBLUE));
//        searchBar.setBorderColor(Color.BLUE);
//        searchBar.setBorderRadius(40);
        searchBar.setBackgroundColor(Color.BLUEVIOLET);
        searchBar.setTextSize(14);

        AnotherButton searchButton = new AnotherButton("Search", AnotherButton.Size.EXTRA_LARGE, AnotherButton.Variant.SUCCESS, "Blue", "Red", true);

        HBox searchBarWrapper = new HBox();
        searchBarWrapper.setPadding(new Insets(10, 20, 10, 20));
        searchBarWrapper.getChildren().addAll(searchBar, searchButton);


        // Create Circle as a sample icon
        HBox circleWrapper = new HBox();
        Circle circle = new Circle(25, Color.DODGERBLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circleWrapper.getChildren().add(circle);

        HBox circle2Wrapper = new HBox();
        Circle circle2 = new Circle(25, Color.DODGERBLUE);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle2Wrapper.getChildren().add(circle2);

//        HBox.setMargin(iconBar, new Insets(20));

        iconBar.setSpacing(20);

        iconBar.getChildren().addAll(circleWrapper, circle2Wrapper);

        searchBar.setAlignment(Pos.CENTER_LEFT);
        iconBar.setAlignment(Pos.CENTER_RIGHT);

//        AnchorPane.setLeftAnchor(searchBar, 10.0);
//        AnchorPane.setTopAnchor(searchBar, 5.0);
//
//        AnchorPane.setRightAnchor(iconBar, 10.0);
//        AnchorPane.setTopAnchor(iconBar, 5.0);

//        hBox.getChildren().addAll(searchBarWrapper, iconBar);
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(10.0));

        HBox.setHgrow(hBox, Priority.ALWAYS);
//        hBox.setAlignment(Pos.CENTER);


        HBox.setMargin(hBox, new Insets(10, 20, 10, 20));

        getChildren().add(hBox);


    }
}
