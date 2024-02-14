package edu.umindanao.cinematiquehub.ui.sections;

import edu.umindanao.cinematiquehub.events.ButtonPressEvent;
import edu.umindanao.cinematiquehub.events.EventBus;
import edu.umindanao.cinematiquehub.ui.components.NavBarItem;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

class CustomLogo extends HBox {

    public CustomLogo() {
        Label appNameLabel = new Label("CinematiqueHub");
        appNameLabel.setFont(new Font("Arial", 24));
        appNameLabel.setTextFill(Color.WHITE);

        // Customize logo container if needed
        setSpacing(10);
        setPadding(new Insets(10));
        setStyle("-fx-background-color: #333333;"); // Replace with your preferred background color
        getChildren().add(appNameLabel);
    }
}

public class NavBar extends StackPane {

    private final VBox vBox;
    private final NavBarItem[] navItems;
    private final CustomLogo customLogo;

    private final IntegerProperty selectedTabIndex = new SimpleIntegerProperty(-1);

//    EventBus eventBus = EventBus.getInstance();


    public NavBar(String[] items) {
        vBox = new VBox();
        customLogo = new CustomLogo();

        // Set the layout of the VBox on instantiation
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
        vBox.setStyle("-fx-background-color: #333333;"); // Replace with your preferred background color

        // Create navigation items
        navItems = new NavBarItem[items.length];
        for (int i = 0; i < items.length; i++) {
            navItems[i] = new NavBarItem(items[i], i, this::handleNavItemClicked);
            vBox.getChildren().add(navItems[i]);
        }

        getChildren().addAll(customLogo, vBox);
    }

    private void handleNavItemClicked(int selectedIndex) {
        if (selectedTabIndex.get() != selectedIndex) {
            // Deselect the currently selected item
            if (selectedTabIndex.get() != -1) {
                navItems[selectedTabIndex.get()].setSelected(false);
            }

            // Select the newly clicked item
            selectedTabIndex.set(selectedIndex);
            navItems[selectedIndex].setSelected(true);

            // Add your navigation logic here
            System.out.println("Clicked on: " + navItems[selectedIndex].getItem());
            EventBus.emit(new ButtonPressEvent(navItems[selectedIndex].getItem()));
        }
    }


    // A method that handles the changes in the item that was clicked
    public void setDefaultSelectedIndex(int defaultSelectedIndex) {
        if (defaultSelectedIndex >= 0 && defaultSelectedIndex < navItems.length) {

            // Deselect the current selected item
            if (selectedTabIndex.get() != -1) {
                navItems[selectedTabIndex.get()].setSelected(false);
            }

            // Select the new default item
            selectedTabIndex.set(defaultSelectedIndex);
            navItems[defaultSelectedIndex].setSelected(true);
        }
    }
}
