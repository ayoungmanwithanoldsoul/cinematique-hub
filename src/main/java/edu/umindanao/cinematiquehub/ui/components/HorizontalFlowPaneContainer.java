package edu.umindanao.cinematiquehub.ui.components;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
//import javafx.scene.layout.Pane;


public class HorizontalFlowPaneContainer extends HBox {

    private final FlowPane flowPane;

    public HorizontalFlowPaneContainer() {
        HorizontalScrollPane horizontalScrollPane = new HorizontalScrollPane();
//        setH
        setBorder(new Border(new BorderStroke(Color.GREEN,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//        setPrefWidth(Double.MAX_VALUE);

        flowPane = new FlowPane();
        flowPane.setOrientation(Orientation.HORIZONTAL);
        flowPane.setAlignment(Pos.CENTER_LEFT);
        flowPane.setHgap(40);
//        flowPane.setPrefWrapLength();
        flowPane.setPrefWrapLength(Double.MAX_VALUE);


        flowPane.setBorder(new Border(new BorderStroke(Color.ORANGE,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        horizontalScrollPane.setContent(flowPane);

        horizontalScrollPane.setBorder(new Border(new BorderStroke(Color.RED,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//        horizontalScrollPane.setMinWidth(Double.MAX_VALUE);

        getChildren().add(horizontalScrollPane);

        // Set any additional styling or properties as needed
    }

    public void addChild(Region child) {
        flowPane.getChildren().add(child);
    }
}
