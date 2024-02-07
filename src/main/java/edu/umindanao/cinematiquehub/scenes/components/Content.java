package edu.umindanao.cinematiquehub.scenes.components;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Content extends ScrollPane {

    public Content() {
        setPrefSize(-1.0, -1.0);

        // create an achor pane to anchor the items
        // create an anchor pane inside the scroll pane
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setMinSize(-1.0, -1.0);
        anchorPane.setPrefSize(861.0, 863.0);


//        setPadding(new Insets(10));
//        setSpacing(10);
//        setStyle("-fx-background-color: #f0f0f0;"); // Set background color

        // Add sample card items to the content
        int i = 0;
        anchorPane.getChildren().addAll(
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i++),
                createCard("Card " + i)
        );

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
