package edu.umindanao.cinematiquehub.scenes.sections;

//import edu.umindanao.cinematiquehub.utils.Sizes;

import com.sun.javafx.sg.prism.NGGroup;
import edu.umindanao.cinematiquehub.scenes.components.NavBarItem;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class NavBar extends VBox {

    private VBox vBox;

    public NavBar() {
        setPadding(new Insets(10));
        setStyle("-fx-background-color: #333333;");

        setLayoutX(-4.0);
        setPrefSize(238.0, 576.0);
        setPadding(new Insets(5.0));

//        VBox vBox = new VBox();
        vBox.setLayoutX(-4.0);
        vBox.setPrefSize(238.0, 576.0);
        vBox.setPadding(new Insets(5.0));

        // Set background color
//        String[] tabNames = {"Home", "Movies", "TV", "My Library"};
        // Create navigation items
//        for (String tabName : items) {
//            NavBarItem navItem = new NavBarItem(tabName);
////            navItem.setItem(tabName);
//            getChildren().add(navItem);
//        }

    }

    public void setItems(String[] items) {
        for (String tabName : items) {
            NavBarItem navItem = new NavBarItem(tabName);
            vBox.getChildren().add(navItem);
        }
    }

}
