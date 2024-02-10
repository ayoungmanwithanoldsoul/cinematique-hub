package edu.umindanao.cinematiquehub.ui.components;

//import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;

import edu.umindanao.cinematiquehub.controllers.MovieCardController;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.util.Collection;
//import edu.umindanao.cinematiquehub.ui.components.AnotherButton;


public class Content extends ScrollPane {

    public Content() {
        setPrefSize(-1.0, -1.0);

        // create an achor pane to anchor the items
        // create an anchor pane inside the scroll pane
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setMinSize(-1, -1);
        anchorPane.setPrefSize(861.0, 1000);
//        anchorPane.setMinWidth(1000);

        FlowPane contentWrapperFlowPane = new FlowPane(Orientation.HORIZONTAL, 2, 2);
        contentWrapperFlowPane.setPadding(new Insets(5));

//        setPadding(new Insets(10));
//        setSpacing(10);
//        setStyle("-fx-background-color: #f0f0f0;"); // Set background color

        // Add sample card items to the content
//        int i = 0;
//        anchorPane.getChildren().addAll(
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i++),
//                createCard("Card " + i)
//        );
//        AnotherButton customButton = new AnotherButton("Click me", AnotherButton.Size.LARGE, AnotherButton.Variant.SUCCESS, "#ff0000", true);
//        customButton.setButtonBorderRadius(19);
//        customButton.setTextColor();


        StyledText styledText = new StyledText("Hello, World!");

        // Customize the styled text
        styledText.setColor(Color.BLUE);
//        styledText.setEffect(new DropShadow());
        styledText.setFontSize(20);
        styledText.setFont("Arial");
//        styledText.setBold(true);
//        styledText.setItalic(true);
        styledText.setFontSize(80);

        styledText.setText("diodis\noioedi");


        MovieCardSample movieCardSample = new MovieCardSample();
        MovieCardController movieController = new MovieCardController(movieCardSample);
        movieController.initialize(null, null);


        contentWrapperFlowPane.getChildren().addAll(
                movieCardSample
        );

        anchorPane.getChildren().add(contentWrapperFlowPane);
        setContent(anchorPane);

    }
}
