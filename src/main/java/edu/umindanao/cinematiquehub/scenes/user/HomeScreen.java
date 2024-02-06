package edu.umindanao.cinematiquehub.scenes.user;

import edu.umindanao.cinematiquehub.scenes.components.Content;
import edu.umindanao.cinematiquehub.scenes.components.NavBar;
import edu.umindanao.cinematiquehub.scenes.components.NavigationBar;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Collection;


public class HomeScreen extends AnchorPane {
    public HomeScreen() {
        SplitPane splitPane = new SplitPane();
//        splitPane.setPrefSize(1920, 1080);
        splitPane.setMinSize(400, 500);
        Content content = new Content();
        NavBar navBar = new NavBar();
        navBar.setMinWidth(300);
//        navBar.setma
        splitPane.getItems().addAll(navBar, content);
        splitPane.setDividerPositions(0.3);
        getChildren().add(splitPane);
//        setPrefSize(1920, 1080);
    }
}
