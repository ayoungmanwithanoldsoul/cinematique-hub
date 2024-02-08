package edu.umindanao.cinematiquehub.ui.screens;

import edu.umindanao.cinematiquehub.ui.components.Content;
import edu.umindanao.cinematiquehub.ui.sections.NavBar;
import edu.umindanao.cinematiquehub.ui.sections.TopBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;


public class DefaultScreen extends VBox {
    public DefaultScreen() {
        SplitPane splitPane = new SplitPane();
//        splitPane.setPrefSize(1920, 1080);
        splitPane.setMinSize(400, 500);
        Content content = new Content();
        String[] items = new String[]{"Paolo", "Andrew", "Santos", "Pomar"};
        NavBar navBar = new NavBar(items);

        TopBar topBar = new TopBar();
        // COntainter for content and topbar
        VBox vBox = new VBox();

        vBox.getChildren().addAll(topBar, content);
//        navBar.setItems(items);
        navBar.setMinWidth(300);
//        navBar.setma
        splitPane.getItems().addAll(navBar, vBox);
        splitPane.setDividerPositions(0.4);

        getChildren().add(splitPane);
//        setPrefSize(1920, 1080);
    }
}
