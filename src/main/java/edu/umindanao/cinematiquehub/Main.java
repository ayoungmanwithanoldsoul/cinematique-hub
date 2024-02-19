package edu.umindanao.cinematiquehub;

import edu.umindanao.cinematiquehub.utils.ViewportUnitsHelper;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import edu.umindanao.cinematiquehub.user.UserDashboard;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CinematiqueHub");

        UserDashboard userDashboard = new UserDashboard();


        Scene scene = new Scene(userDashboard);
        stage.setScene(scene);
//        ViewportUnitsHelper.setCurrentSceneFromStage(stage);
//        stage.setHeight(720);
//        stage.setWidth(1280);
//        stage.setMaximized(true);

//        Stage stage2 = new Stage();
//        stage2.centerOnScreen();

//        LogIn loginPane = new LogIn();

        // Set up the scene
//        Scene scene2 = new Scene(loginPane, 300, 200);
//        ViewportUnitsHelper.setStage(stage);


        stage.centerOnScreen();
//        System.out.println();

        stage.show();

//        stage2.setScene(scene2);
//        stage2.setMinHeight(600);
//        stage2.setMinWidth(400);

//        stage2.showAndWait();


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

/*

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Movie 1
        ImageView poster1 = new ImageView(new Image("https://i.ibb.co/ThPNnzM/blade-runner.jpg"));
        poster1.setFitWidth(230);
        poster1.setPreserveRatio(true);

        Text title1 = new Text("Blade Runner 2049");
        Text slogan1 = new Text("More human than human is our motto.");
        Text currentPrice1 = new Text("$28.00");
        Text oldPrice1 = new Text("$44.99");

        Button buyButton1 = new Button("Buy now");
        buyButton1.setStyle("-fx-background-color: #2f2f2f; -fx-text-fill: white;");

        // Movie 2
        ImageView poster2 = new ImageView(new Image("https://i.ibb.co/Zd51z5c/justice-league.jpg"));
        poster2.setFitWidth(230);
        poster2.setPreserveRatio(true);

        Text title2 = new Text("Justice League");
        Text slogan2 = new Text("You can't save the world alone.");
        Text currentPrice2 = new Text("$20.75");
        Text oldPrice2 = new Text("$40.99");

        Button buyButton2 = new Button("Buy now");
        buyButton2.setStyle("-fx-background-color: #2f2f2f; -fx-text-fill: white;");

        // Layout
        VBox movie1Container = createMovieContainer(poster1, title1, slogan1, currentPrice1, oldPrice1, buyButton1);
        VBox movie2Container = createMovieContainer(poster2, title2, slogan2, currentPrice2, oldPrice2, buyButton2);

        VBox heroContainer = new VBox(movie1Container, movie2Container);
        heroContainer.setSpacing(20);
        heroContainer.setStyle("-fx-background-color: #457fb4;");

        Scene scene = new Scene(heroContainer, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Movie Ticket App");
        primaryStage.show();
    }

    private VBox createMovieContainer(ImageView poster, Text title, Text slogan, Text currentPrice, Text oldPrice, Button buyButton) {
        VBox movieContainer = new VBox();

        StackPane posterContainer = new StackPane(poster);
        posterContainer.setStyle("-fx-background-color: #fff; -fx-padding: 20px; -fx-border-radius: 5px; -fx-box-shadow: 0 5px 20px 3px rgba(0, 0, 0, 0.6);");

        VBox ticketContent = new VBox(title, slogan, currentPrice, oldPrice, buyButton);
        ticketContent.setStyle("-fx-background-color: #fff; -fx-spacing: 10; -fx-padding: 20px; -fx-border-radius: 5px; -fx-box-shadow: 0 5px 20px 3px rgba(0, 0, 0, 0.6); -fx-opacity: 0;");
        ticketContent.setOnMouseEntered(event -> {
            ticketContent.setStyle("-fx-opacity: 1; -fx-animation: bounceIn 0.6s linear;");
        });

        movieContainer.getChildren().addAll(posterContainer, ticketContent);
        movieContainer.setStyle("-fx-spacing: 20; -fx-alignment: center; -fx-padding: 20px;");

        return movieContainer;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/
/*

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        ImageView movieImage = new ImageView(new Image("https://i.ibb.co/FDGqCmM/papers-co-ag74-interstellar-wide-space-film-movie-art-33-iphone6-wallpaper.jpg"));
        movieImage.setFitWidth(375);
        movieImage.setFitHeight(380);

        Text movieTitle = new Text("Interstellar");
        Text movieDetails = new Text("PG-13  / 2h 49min  / Adventure, Drama, Sci-Fi,");
        Text summary = new Text("A group of elderly people are giving interviews about having lived in a climate of crop blight and constant dust reminiscent of The Great Depression of the 1930's.");
        Text actors = new Text("Matthew McConaughey, Anne Hathaway, Jessica Chastain");

        Button watchButton = new Button("WATCH TRAILER");
        watchButton.setStyle("-fx-background-color: #fe4141; -fx-text-fill: white;");

        // Additional action buttons/icons can be added as needed

        VBox movieDetailsContainer = new VBox(movieTitle, movieDetails, summary, actors, watchButton);
        movieDetailsContainer.setStyle("-fx-background-color: #1e1b26; -fx-text-fill: #e7e7e7; -fx-padding: 12px;");

        StackPane movieContainer = new StackPane(movieImage, movieDetailsContainer);
        movieContainer.setStyle("-fx-background-color: #1e1b26; -fx-border-radius: 4px; -fx-background-radius: 4px;");

        VBox mainContainer = new VBox(movieContainer);
        mainContainer.setStyle("-fx-background-image: url('https://i.ibb.co/FDGqCmM/papers-co-ag74-interstellar-wide-space-film-movie-art-33-iphone6-wallpaper.jpg'); -fx-background-position: center; -fx-background-size: cover; -fx-background-repeat: repeat;");

        Scene scene = new Scene(mainContainer, 400, 650);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Movie Details");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/

