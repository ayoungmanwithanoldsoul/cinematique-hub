package edu.umindanao.cinematiquehub.scenes.components;

//import edu.umindanao.cinematiquehub.utils.Sizes;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class NavBar extends VBox {

    public NavBar() {
        setPadding(new Insets(10));
        setStyle("-fx-background-color: #333333;"); // Set background color
        String[] tabNames = {"Home", "Movies", "TV", "My Library"};
        // Create navigation items
        for (String tabName : tabNames) {
            NavItem navItem = new NavItem(tabName);
            getChildren().add(navItem);
        }
    }

    // Custom navigation item class
    private static class NavItem extends HBox {
        public NavItem(String itemName) {
            setSpacing(10);

            // Create Circle
            Circle circle = new Circle(8, Color.DODGERBLUE);

            // Create Label
            Label label = new Label(itemName);
            label.setTextFill(Color.WHITE);
            label.setFont(new Font(20));

            // Add Circle and Label to the VBox
            getChildren().addAll(circle, label);

            // Add click event or any other customization as needed
            setOnMouseClicked(event -> {
                System.out.println("Clicked on: " + itemName);
                // Add your navigation logic here
            });
        }
    }
}
