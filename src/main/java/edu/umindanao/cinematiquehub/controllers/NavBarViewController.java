/*
package edu.umindanao.cinematiquehub.controllers;

//package edu.umindanao.cinematiquehub.ui.controllers;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import edu.umindanao.cinematiquehub.ui.sections.NavBar;

public class NavBarViewController {

    private final NavBar navBar;
    private final IntegerProperty selectedTabIndex;

    public NavBarViewController(NavBar navBar) {
        this.navBar = navBar;
        this.selectedTabIndex = new SimpleIntegerProperty(-1);

        initialize();
    }

    private void initialize() {
        setupNavBarAppearance();
        setupNavItems();
        setupEventHandlers();
    }

    private void setupNavBarAppearance() {
        // Customize the appearance of the NavBar
        navBar.setStyle("-fx-background-color: #333333;"); // Replace with your preferred background color
    }

    private void setupNavItems() {
        // Create navigation items
        String[] items = {"Item1", "Item2", "Item3"}; // Replace with your actual items
        navBar.createNavItems(items, this::handleNavItemClicked);
        navBar.setDefaultSelectedIndex(0); // Set a default selected index
    }

    private void setupEventHandlers() {
        selectedTabIndex.addListener((observable, oldValue, newValue) -> handleSelectedIndexChange(newValue.intValue()));
    }

    private void handleNavItemClicked(int selectedIndex) {
        if (selectedTabIndex.get() != selectedIndex) {
            // Deselect the currently selected item
            if (selectedTabIndex.get() != -1) {
                navBar.deselectNavItem(selectedTabIndex.get());
            }

            // Select the newly clicked item
            selectedTabIndex.set(selectedIndex);
            navBar.selectNavItem(selectedIndex);

            // Add your navigation logic here
            System.out.println("Clicked on: " + navBar.getNavItemText(selectedIndex));
        }
    }

    private void handleSelectedIndexChange(int selectedIndex) {
        // Add your logic for handling the selected index change
        System.out.println("Selected Index changed to: " + selectedIndex);
    }

    // You can expose more methods as needed for your specific logic

    // ...
}
*/
