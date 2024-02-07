package edu.umindanao.cinematiquehub.scenes.screens;

import edu.umindanao.cinematiquehub.scenes.components.Content;
import edu.umindanao.cinematiquehub.scenes.sections.NavBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


public class DefaultScreen extends VBox {
    public DefaultScreen() {
        SplitPane splitPane = new SplitPane();
//        splitPane.setPrefSize(1920, 1080);
        splitPane.setMinSize(400, 500);
        Content content = new Content();
        String[] items = new String[]{"Paolo", "Andrew", "Santos", "Pomar"};
        NavBar navBar = new NavBar(items);
//        navBar.setItems(items);
        navBar.setMinWidth(300);
//        navBar.setma
        splitPane.getItems().addAll(navBar, content);
        splitPane.setDividerPositions(0.4);

        getChildren().add(splitPane);
//        setPrefSize(1920, 1080);
    }
}
