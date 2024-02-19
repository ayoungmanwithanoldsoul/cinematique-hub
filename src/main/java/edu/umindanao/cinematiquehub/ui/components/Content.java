package edu.umindanao.cinematiquehub.ui.components;


import edu.umindanao.cinematiquehub.controllers.MovieCardController;
import edu.umindanao.cinematiquehub.events.*;
import edu.umindanao.cinematiquehub.user.content.Home;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.lang.reflect.InvocationTargetException;

public class Content extends Pane {

    private final Home Home;
    //    private final SimpleStringProperty selectedFilter = new SimpleStringProperty();
//    ContentWrapperFlowPane contentWrapperFlowPane = new ContentWrapperFlowPane();

//    String[] filterOptions = {"Option1", "Option2", "Option3"}; // Replace with your actual filter options

//    FilterComponent filterComponent = new FilterComponent(filterOptions, selectedFilter);


//    private final ListProperty<String> multiSelectedFilters = new SimpleListProperty<>(FXCollections.observableArrayList());
//
//    DateRangeFilterComponent dateRangeFilterComponent;


    public Content() {


        // create an acnhor pane to anchor the items
        // create an anchor pane inside the scroll pane
//        AnchorPane anchorPane = new AnchorPane();
//        anchorPane.setMinSize(-1, -1);
//        anchorPane.setPrefSize(861.0, 1000);


//        StyledText styledText = new StyledText("Hello, World!");
//        styledText.setColor(Color.BLUE);
//        styledText.setEffect(new DropShadow());
//        styledText.setFontSize(20);
//        styledText.setFont("Arial");
//        styledText.setBold(true);
//        styledText.setItalic(true);
//        styledText.setFontSize(80);
//        styledText.setText("ifudfiudifudf");

        Home = new Home();

        getChildren().add(Home);

//        getChildren().add(new StyledText("Paolo"));


//        HoverCard[] hoverCards = new HoverCard[20];
//        MovieCardController[] movieCardControllers = new MovieCardController[20];
//        for (int i = 0; i < 20; i++) {
//            hoverCards[i] = new HoverCard();
//            movieCardControllers[i] = new MovieCardController(hoverCards[i]);
//            movieCardControllers[i].initialize(null, null);
//            contentWrapperFlowPane.getChildren().add(hoverCards[i]);
//        }


        EventBus.listenFor(RouteChangeEvent.class, new EventListener<RouteChangeEvent>() {
            @Override
            public void handle(RouteChangeEvent event) {
                // React to the route change event
                Class<?> destination = event.getDestination();

                // Update content to the destination
                try {
                    // Instantiate an object of the destination class
                    Object destinationInstance = destination.getDeclaredConstructor().newInstance();

                    // Assuming destinationInstance is a JavaFX Node, add it to the content
                    if (destinationInstance instanceof Node) {
//                        contentWrapperFlowPane.getChildren().clear(); // Clear existing content
//                        contentWrapperFlowPane.getChildren().add((Node) destinationInstance);
                        getChildren().clear();
                        getChildren().add((Node) destinationInstance);
                    } else {
                        // Handle non-Node destinations or take appropriate action
                        System.out.println("Destination is not a valid JavaFX Node.");
                    }
                } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                         InvocationTargetException e) {
                    // Handle the exception as needed
                    e.printStackTrace();
                }
            }
        });
    }


//    public void updateContentText(String newText) {
//        // Update the text of contentWrapperFlowPane
////        contentWrapperFlowPane.getChildren().clear();
////        Class clas ==contentWrapperFlowPane.getChildren().get(0 )
//        StyledText styledText = new StyledText(newText);
//        styledText.setColor(Color.BLACK);
//        styledText.setFontSize(20);
//        contentWrapperFlowPane.getChildren().add(styledText);
//    }

//    private void updateContent() {
//        // Listen for the RouteChangeEvent
//
//    }
}
