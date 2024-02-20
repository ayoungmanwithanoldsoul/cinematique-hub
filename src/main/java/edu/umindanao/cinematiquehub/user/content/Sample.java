package edu.umindanao.cinematiquehub.user.content;

import edu.umindanao.cinematiquehub.controllers.MovieCardController;
import edu.umindanao.cinematiquehub.ui.components.HorizontalFlowPaneContainer;
import edu.umindanao.cinematiquehub.ui.components.HorizontalHeadingRegion;
import edu.umindanao.cinematiquehub.ui.components.HoverCard;
import edu.umindanao.cinematiquehub.ui.sections.NavBar;
import edu.umindanao.cinematiquehub.ui.sections.TopBar;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Window;

public class Sample extends BorderPane {
    public Sample() {
        SplitPane splitPane = new SplitPane();
        HorizontalFlowPaneContainer moviesHorizontalFlowPaneContainer = new HorizontalFlowPaneContainer();
        HoverCard[] hoverCards = new HoverCard[20];
        MovieCardController[] movieCardControllers = new MovieCardController[20];
        for (int i = 0; i < 20; i++) {
            hoverCards[i] = new HoverCard();
            movieCardControllers[i] = new MovieCardController(hoverCards[i]);
            movieCardControllers[i].initialize(null, null);
            moviesHorizontalFlowPaneContainer.addChild(hoverCards[i]);
        }


        HorizontalHeadingRegion moviesHeading = new HorizontalHeadingRegion("Movies");
        HorizontalHeadingRegion tvShowsHeading = new HorizontalHeadingRegion("TV Shows");

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setAlignment(Pos.CENTER_LEFT);
        vBox.setSpacing(10);
        vBox.setBorder(new Border(new BorderStroke(Color.FORESTGREEN,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//        setPrefWidth(Double.MAX_VALUE);
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double widthInViewport = screenBounds.getWidth();
        double heightInViewport = screenBounds.getHeight();
        vBox.setPrefWidth(widthInViewport * 0.70);
//        vBox.setHeight(heightInViewport * 0.80);
        moviesHeading.setFont(HorizontalHeadingRegion.FontSize.EXTRA_LARGE);
        moviesHeading.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        // Adjust HorizontalHeadingRegion properties
        tvShowsHeading.setFont(HorizontalHeadingRegion.FontSize.EXTRA_LARGE);
        tvShowsHeading.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        ScrollPane scrollPane = new ScrollPane();
//    ContentWrapperFlowPane homeContentWrapperFlowPane = new ContentWrapperFlowPane();


        String[] items = new String[]{"Home", "Movies", "TV Shows", "Owned"};

        NavBar navBar = new NavBar(items);


        navBar.setDefaultSelectedIndex(0);

        vBox.minWidth(Window.getWindows().size() * 3);

        TopBar topBar = new TopBar();

        // Container for content and top bar
//        VBox vBox = new VBox();

        vBox.getChildren().add(moviesHorizontalFlowPaneContainer);

        navBar.setMinWidth(450);

//        splitPane.getItems().addAll(vBox);
        setTop(topBar);

        setLeft(navBar);

        setCenter(splitPane);
    }
}
