package edu.umindanao.cinematiquehub.scenes.components;

//import edu.umindanao.cinematiquehub.utils.Sizes;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class NavBarItem extends AnchorPane {
    public NavBarItem(String item) {
        setPrefSize(238.0, 55.0);

        // Create a horizontal box to align the icon and the label
        HBox hBox = new HBox();
        hBox.setLayoutX(33.0);
        hBox.setLayoutY(13.0);
        hBox.setPrefSize(180.0, 32.0);
        hBox.setSpacing(10.0);
//        setPadding(new Insets(10));
//        setStyle("-fx-background-color: #333333;"); // Set background color

        // Create Circle as a sample icon
        Circle circle = new Circle(16.0, Color.DODGERBLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        // Create Label
        Label label = new Label(item);
        label.setTextFill(Color.WHITE);
        label.setFont(new Font(20));

        // Add Circle and Label to the HBox
        hBox.getChildren().addAll(circle, label);

        // Add click event or any other customization as needed
        setOnMouseClicked(event -> {
            System.out.println("Clicked on: " + item);
            // Add your navigation logic here
        });

        setTopAnchor(hBox, 0.0);
    }
}
