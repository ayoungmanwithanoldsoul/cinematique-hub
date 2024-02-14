package edu.umindanao.cinematiquehub.ui.components;


import edu.umindanao.cinematiquehub.controllers.MovieCardController;
import edu.umindanao.cinematiquehub.events.ButtonPressEvent;
import edu.umindanao.cinematiquehub.events.EventBus;
import edu.umindanao.cinematiquehub.events.EventListener;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

public class Content extends ScrollPane {

    FlowPane contentWrapperFlowPane = new FlowPane(Orientation.HORIZONTAL, 1, 2);

    public Content() {
        setPrefSize(Double.MAX_VALUE, -1);
        setFitToWidth(true);

        // create an achor pane to anchor the items
        // create an anchor pane inside the scroll pane
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setMinSize(-1, -1);
        anchorPane.setPrefSize(861.0, 1000);


        contentWrapperFlowPane.setPrefWrapLength(1000);
        contentWrapperFlowPane.setPadding(new Insets(5));
        contentWrapperFlowPane.setAlignment(Pos.CENTER);
        contentWrapperFlowPane.setHgap(20);
        contentWrapperFlowPane.setVgap(20);

        StyledText styledText = new StyledText("Hello, World!");
        styledText.setColor(Color.BLUE);
        styledText.setEffect(new DropShadow());
        styledText.setFontSize(20);
        styledText.setFont("Arial");
        styledText.setBold(true);
        styledText.setItalic(true);
        styledText.setFontSize(80);
        styledText.setText("ifudfiudifudf");

        HoverCard[] hoverCards = new HoverCard[20];
        MovieCardController[] movieCardControllers = new MovieCardController[20];
        for (int i = 0; i < 20; i++) {
            hoverCards[i] = new HoverCard();
            movieCardControllers[i] = new MovieCardController(hoverCards[i]);
            movieCardControllers[i].initialize(null, null);
            contentWrapperFlowPane.getChildren().add(hoverCards[i]);
        }
        contentWrapperFlowPane.getChildren().add(styledText);
        setContent(contentWrapperFlowPane);


//        EventBus.getInstance().subscribe(ContentUpdateEvent.UPDATE_CONTENT, event -> updateContentText("Updated Text, Hello World"));

        EventBus.listenFor(ButtonPressEvent.class, new EventListener<ButtonPressEvent>() {
            @Override
            public void handle(ButtonPressEvent event) {
                // React to the button press event
                System.out.println("Button pressed in NavBar. Updating content...");
                // Add your logic to update the content accordingly
                updateContentText(event.returnItem());
            }
        });
    }

    public void updateContentText(String newText) {
        // Update the text of contentWrapperFlowPane
        contentWrapperFlowPane.getChildren().clear();
        StyledText styledText = new StyledText(newText);
        styledText.setColor(Color.BLACK);
        styledText.setFontSize(20);
        contentWrapperFlowPane.getChildren().add(styledText);
    }
}
