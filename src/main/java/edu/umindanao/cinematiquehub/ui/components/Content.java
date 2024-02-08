package edu.umindanao.cinematiquehub.ui.components;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

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
        contentWrapperFlowPane.getChildren().addAll(
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, w\"",
                        "\"Neque porro quisquam est qui dolorem ip\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\""),
                new HoverCardSample(
                        "\"There is no one who loves pain itself, wh\"",
                        "\"Neque porro quisquam est qui dolorem i\"")
        );

        anchorPane.getChildren().add(contentWrapperFlowPane);

        setContent(anchorPane);
    }

    private StackPane createCard(String cardName) {
        StackPane card = new StackPane();
        card.setStyle("-fx-background-color: #ffffff; -fx-border-color: #cccccc;");
        card.setPadding(new Insets(10));
        card.setMinHeight(100);
        card.getChildren().add(new Label(cardName));
        return card;
    }
}
