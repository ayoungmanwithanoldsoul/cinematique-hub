package edu.umindanao.uitesting;

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

