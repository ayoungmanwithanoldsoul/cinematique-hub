package edu.umindanao.cinematiquehub.user.content;

import edu.umindanao.cinematiquehub.ui.components.HorizontalHeadingRegion;
import edu.umindanao.cinematiquehub.utils.ViewportUnitsHelper;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;

public class Home extends VBox {


    ScrollPane scrollPane = new ScrollPane();
//    ContentWrapperFlowPane homeContentWrapperFlowPane = new ContentWrapperFlowPane();

    HorizontalHeadingRegion moviesHeading = new HorizontalHeadingRegion("Movies");
    HorizontalHeadingRegion tvShowsHeading = new HorizontalHeadingRegion("TV Shows");

//    HorizontalFlowPaneContainer moviesHorizontalFlowPaneContainer = new HorizontalFlowPaneContainer();
//
//    HorizontalFlowPaneContainer tvShowsHorizontalFlowPaneContainer = new HorizontalFlowPaneContainer();


    public Home() {
//        ViewportUnitsHelper.setCurrentScene(getScene());
//        double widthInViewport = ViewportUnitsHelper.getWidthInViewportUnits(100);
//        double heightInViewport = ViewportUnitsHelper.getHeightInViewportUnits(100);
        setPadding(new Insets(10, 10, 10, 10));
        setAlignment(Pos.CENTER_LEFT);
        setSpacing(10);
        setBorder(new Border(new BorderStroke(Color.FORESTGREEN,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//        setPrefWidth(Double.MAX_VALUE);
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double widthInViewport = screenBounds.getWidth();
        double heightInViewport = screenBounds.getHeight();
        setPrefWidth(widthInViewport * 0.70);
        setHeight(heightInViewport * 0.80);
//        setPadding(new Insets(20));
//        scrollPane.setPrefSize(Double.MAX_VALUE, 4);
//        scrollPane.setFitToWidth(true);
//        setPrefWidth(Double.MAX_VALUE);
//        setFitToWidth(true);

        //scrollPane.setPadding(new Insets(100));

        // Adjust ContentWrapperFlowPane properties
//        homeContentWrapperFlowPane.setPadding(new Insets(10)); // Adjust the padding as needed
//        homeContentWrapperFlowPane.setHgap(10); // Set the horizontal gap between elements

//        HoverCard[] hoverCards = new HoverCard[20];
//        MovieCardController[] movieCardControllers = new MovieCardController[20];
//        for (int i = 0; i < 20; i++) {
//            hoverCards[i] = new HoverCard();
//            movieCardControllers[i] = new MovieCardController(hoverCards[i]);
//            movieCardControllers[i].initialize(null, null);
//            moviesHorizontalFlowPaneContainer.addChild(hoverCards[i]);
//        }
//        HoverCard[] hoverCards2 = new HoverCard[20];
//        MovieCardController[] tvCardControllers = new MovieCardController[20];
//        for (int i = 0; i < 20; i++) {
//            hoverCards2[i] = new HoverCard();
//            tvCardControllers[i] = new MovieCardController(hoverCards2[i]);
//            tvCardControllers[i].initialize(null, null);
//            tvShowsHorizontalFlowPaneContainer.addChild(hoverCards2[i]);
//        }

        // Adjust HorizontalHeadingRegion properties
        moviesHeading.setFont(HorizontalHeadingRegion.FontSize.EXTRA_LARGE);
        moviesHeading.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        // Adjust HorizontalHeadingRegion properties
        tvShowsHeading.setFont(HorizontalHeadingRegion.FontSize.EXTRA_LARGE);
        tvShowsHeading.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

//        moviesHorizontalFlowPaneContainer.setMinWidth(Double.MAX_VALUE);
//        tvShowsHorizontalFlowPaneContainer.setMinWidth(Double.MAX_VALUE);


//        homeContentWrapperFlowPane.getChildren().add(moviesHeading);
//        homeContentWrapperFlowPane.getChildren().add(moviesHorizontalFlowPaneContainer);


//        VBox vBox = new VBox();
//        vBox.getChildren().add(moviesHeading);

//        vBox.getChildren().add(moviesHorizontalFlowPaneContainer);

//        vBox.getChildren().add(tvShowsHeading);
//        vBox.getChildren().add(tvShowsHorizontalFlowPaneContainer);


//        vBox.setMaxWidth(1500);


//        homeContentWrapperFlowPane.getChildren().add(new StyledText("TEST"));


//        scrollPane.setContent(vBox);
//        setContent(vBox);

        // Add the ScrollPane to the VBox
        getChildren().add(moviesHeading);
        getChildren().add(tvShowsHeading);


    }

}
