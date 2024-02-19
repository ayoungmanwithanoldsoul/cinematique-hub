package edu.umindanao.cinematiquehub.ui.components;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class ContentWrapperFlowPane extends FlowPane {
    public ContentWrapperFlowPane() {
        setOrientation(Orientation.HORIZONTAL);
        setPrefWrapLength(1000);
        setPadding(new Insets(5));
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(20);
//        setHgap(1);
//        setVgap(2);
    }
}
