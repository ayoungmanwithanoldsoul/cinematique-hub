package edu.umindanao.cinematiquehub.user;

import edu.umindanao.cinematiquehub.events.EventBus;
import edu.umindanao.cinematiquehub.events.RouteChangeEvent;
import edu.umindanao.cinematiquehub.events.RouterClassProvider;
import edu.umindanao.cinematiquehub.ui.components.Content;
import edu.umindanao.cinematiquehub.ui.sections.NavBar;
import edu.umindanao.cinematiquehub.ui.sections.TopBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Window;


public class UserDashboard extends BorderPane {
    public UserDashboard() {

        SplitPane splitPane = new SplitPane();

        Content content = new Content();

        String[] items = new String[]{"Home", "Movies", "TV Shows", "Owned"};

        NavBar navBar = new NavBar(items);


        navBar.setDefaultSelectedIndex(0);

        content.minWidth(Window.getWindows().size() * 3);

        TopBar topBar = new TopBar();

        // Container for content and top bar
        VBox vBox = new VBox();

        vBox.getChildren().add(content);

        navBar.setMinWidth(450);

        splitPane.getItems().addAll(vBox);
        setTop(topBar);

        setLeft(navBar);

        setCenter(splitPane);
        EventBus.emit(new RouteChangeEvent(new RouterClassProvider(), "edu.umindanao.cinematiquehub.user.content.Home"));

    }
}
