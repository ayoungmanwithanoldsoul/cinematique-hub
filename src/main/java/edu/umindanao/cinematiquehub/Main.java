package edu.umindanao.cinematiquehub;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import edu.umindanao.cinematiquehub.ui.screens.DefaultScreen;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CinematiqueHub");
        DefaultScreen defaultScreen = new DefaultScreen();
        Scene scene = new Scene(defaultScreen);
        stage.setScene(scene);
        stage.setHeight(720);
        stage.setWidth(1280);

        stage.centerOnScreen();

        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}

//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Vertical Navigation Bar");
//
//        // Create VBox for the navigation bar
//        VBox navBarVBox = new VBox();
//        navBarVBox.setPadding(new Insets(10));
//        navBarVBox.setStyle("-fx-background-color: #333333;"); // Set background color
//
//        // Create navigation items
//        for (int i = 1; i <= 5; i++) {
//            NavItem navItem = new NavItem("Item " + i);
//            navBarVBox.getChildren().add(navItem);
//        }
//
//        // Create Scene
//        Scene scene = new Scene(navBarVBox, 200, 400);
//        primaryStage.setScene(scene);
//
//        primaryStage.show();
//    }
//
//    // Custom navigation item class
//    private static class NavItem extends VBox {
//        public NavItem(String itemName) {
//            setSpacing(10);
//
//            // Create Circle
//            Circle circle = new Circle(8, Color.DODGERBLUE);
//
//            // Create Label
//            Label label = new Label(itemName);
//            label.setTextFill(Color.WHITE);
//            label.setFont(new Font(14));
//
//            // Add Circle and Label to the VBox
//            getChildren().addAll(circle, label);
//
//            // Add click event or any other customization as needed
//            setOnMouseClicked(event -> {
//                System.out.println("Clicked on: " + itemName);
//                // Add your navigation logic here
//            });
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}


/*

package edu.umindanao.cinematiquehub;


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

public class Main extends Application {

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

*/
