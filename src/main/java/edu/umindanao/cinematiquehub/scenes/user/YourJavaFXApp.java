package edu.umindanao.cinematiquehub.scenes.user;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class YourJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Your JavaFX App");

        // Create VBox
        VBox rootVBox = new VBox();
        rootVBox.setPrefSize(1161.0, 864.0);

        // Create SplitPane
        SplitPane splitPane = new SplitPane();
        splitPane.setDividerPositions(0.2505567928730512);
        splitPane.setPrefSize(-1.0, -1.0);
        splitPane.setFocusTraversable(true);

        // Create AnchorPane for the left side
        AnchorPane leftAnchorPane = new AnchorPane();
        leftAnchorPane.setPrefSize(324.0, 683.0);

        // Create VBox inside leftAnchorPane
        VBox leftVBox = new VBox();
        leftVBox.setLayoutX(-4.0);
        leftVBox.setPrefSize(238.0, 576.0);
        leftVBox.setPadding(new Insets(5.0));

        // Create AnchorPanes inside leftVBox
        for (int i = 0; i < 5; i++) {
            AnchorPane anchorPane = createAnchorPane();
            leftVBox.getChildren().add(anchorPane);
        }

        leftAnchorPane.getChildren().add(leftVBox);
        leftAnchorPane.setTopAnchor(leftVBox, 0.0);

        // Create ScrollPane for the right side
        ScrollPane rightScrollPane = new ScrollPane();
        rightScrollPane.setPrefSize(-1.0, -1.0);

        // Create AnchorPane inside ScrollPane
        AnchorPane rightAnchorPane = new AnchorPane();
        rightAnchorPane.setMinSize(-1.0, -1.0);
        rightAnchorPane.setPrefSize(861.0, 863.0);

        // Create Label inside rightAnchorPane
        Label viewLabel = new Label("View");
        viewLabel.setAlignment(javafx.geometry.Pos.CENTER);
        viewLabel.setLayoutX(14.0);
        viewLabel.setLayoutY(14.0);
        viewLabel.setStyle("");
        viewLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        viewLabel.setFont(new Font(18.0));
        viewLabel.setTextFill(new Color(0.624, 0.624, 0.624, 1.0));

        rightAnchorPane.getChildren().add(viewLabel);

        rightScrollPane.setContent(rightAnchorPane);

        // Add AnchorPanes to SplitPane
        splitPane.getItems().addAll(leftAnchorPane, rightScrollPane);

        // Add SplitPane to VBox
        rootVBox.getChildren().add(splitPane);

        // Create Scene
        Scene scene = new Scene(rootVBox, 1161.0, 864.0);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private AnchorPane createAnchorPane() {
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefSize(238.0, 55.0);

        HBox hBox = new HBox();
        hBox.setLayoutX(33.0);
        hBox.setLayoutY(13.0);
        hBox.setPrefSize(180.0, 32.0);
        hBox.setSpacing(10.0);

        Circle circle = new Circle(16.0, Color.DODGERBLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        Label label = new Label("Label");
        label.setFont(new Font(22.0));

        hBox.getChildren().addAll(circle, label);

        anchorPane.getChildren().add(hBox);
        AnchorPane.setTopAnchor(hBox, 0.0);

        VBox.setMargin(anchorPane, new Insets(5.0));

        return anchorPane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
