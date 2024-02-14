package edu.umindanao.cinematiquehub.ui.screens;

import edu.umindanao.cinematiquehub.ui.components.Content;
import edu.umindanao.cinematiquehub.ui.sections.NavBar;
import edu.umindanao.cinematiquehub.ui.sections.TopBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Window;


public class DefaultScreen extends BorderPane {
    public DefaultScreen() {
        SplitPane splitPane = new SplitPane();
//        splitPane.setPrefSize(1920, 1080);
//        splitPane.setMinSize(430, 500);
        Content content = new Content();
        String[] items = new String[]{"Home", "Movies", "TV Shows", "Owned"};
        NavBar navBar = new NavBar(items);
        navBar.setDefaultSelectedIndex(0);
//        content.minWidth(content.getPrefViewportWidth() - navBar.getMinWidth());
        content.minWidth(Window.getWindows().size() * 3);
        TopBar topBar = new TopBar();

        // Containter for content and topbar
        VBox vBox = new VBox();

        vBox.getChildren().addAll(topBar, content);
//        navBar.setItems(items);
        navBar.setMinWidth(450);

        splitPane.getItems().addAll(vBox);
        setLeft(navBar);
        setCenter(splitPane);
    }
}
