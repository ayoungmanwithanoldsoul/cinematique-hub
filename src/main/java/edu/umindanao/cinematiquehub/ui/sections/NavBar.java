package edu.umindanao.cinematiquehub.ui.sections;

//import edu.umindanao.cinematiquehub.utils.Sizes;


import edu.umindanao.cinematiquehub.ui.components.NavBarItem;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class NavBar extends AnchorPane {

    private final VBox vBox;

    public NavBar(String[] items) {
        setPrefSize(400, 683.0);
        this.vBox = new VBox();
//        setPadding(new Insets(10));
//        setStyle("-fx-background-color: #333333;");

        // Set the layout of the Vbox on instantiation
        this.vBox.setLayoutX(-4.0);
        this.vBox.setPrefSize(238.0, 576.0);
        this.vBox.setPadding(new Insets(5.0));

        // Set background color
//        String[] tabNames = {"Home", "Movies", "TV", "My Library"};
        // Create navigation items
        for (String tabName : items) {
            NavBarItem navItem = new NavBarItem(tabName);
//            navItem.setItem(tabName);
            this.vBox.getChildren().add(navItem);
        }
        getChildren().add(this.vBox);
    }

    public NavBar() {
        setPrefSize(324.0, 683.0);
        this.vBox = new VBox();
//        setPadding(new Insets(10));
//        setStyle("-fx-background-color: #333333;");

        // Set the layout of the Vbox on instantiation
        this.vBox.setLayoutX(-4.0);
        this.vBox.setPrefSize(238.0, 576.0);
        this.vBox.setPadding(new Insets(5.0));
    }

    public void setItems(String[] items) {
        for (String tabName : items) {
            NavBarItem navItem = new NavBarItem(tabName);
            this.vBox.getChildren().add(navItem);
        }
    }
}
