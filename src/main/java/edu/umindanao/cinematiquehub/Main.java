//package edu.umindanao.cinematiquehub;
package edu.umindanao.cinematiquehub;

import edu.umindanao.cinematiquehub.scenes.components.NavBar;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import edu.umindanao.cinematiquehub.scenes.user.HomeScreen;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CinematiqueHub");
        HomeScreen homeScreen = new HomeScreen();
        Scene scene = new Scene(homeScreen);
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

