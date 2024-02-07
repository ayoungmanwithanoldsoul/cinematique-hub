package edu.umindanao.cinematiquehub.scenes.user;

import edu.umindanao.cinematiquehub.scenes.components.Content;
import edu.umindanao.cinematiquehub.scenes.sections.NavBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;


public class HomeScreen extends AnchorPane {
    public HomeScreen() {
        SplitPane splitPane = new SplitPane();
//        splitPane.setPrefSize(1920, 1080);
        splitPane.setMinSize(400, 500);
        Content content = new Content();
        String[] items = new String[]{"Paolo", "Andrew", "Santos", "Pomar"};
        NavBar navBar = new NavBar();
        navBar.setItems(items);
        navBar.setMinWidth(300);
//        navBar.setma
        splitPane.getItems().addAll(navBar, content);
        splitPane.setDividerPositions(0.3);
        getChildren().add(splitPane);
//        setPrefSize(1920, 1080);
    }
}
