package edu.umindanao.cinematiquehub.ui.components;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginDemo {

    public LoginDemo(Stage primaryStage) {
        // Create BorderPane
        BorderPane root = new BorderPane();
        root.setPrefSize(700, 500);

        // For left AnchorPane
        AnchorPane leftAnchorPane = new AnchorPane();
        leftAnchorPane.setPrefSize(400, 500);
        leftAnchorPane.setStyle("-fx-background-color: #004643;");

        // Text for left anchor pane "Title"
        Text movieRentalTitle = new Text("Paolo's Movie Rental");
        movieRentalTitle.setLayoutX(33);
        movieRentalTitle.setLayoutY(283);
        movieRentalTitle.setFont(Font.font("MV Boli", 29));

        leftAnchorPane.getChildren().add(movieRentalTitle);

        // Set left AnchorPane in BorderPane
        root.setLeft(leftAnchorPane);

        // For right AnchorPane
        AnchorPane rightAnchorPane = new AnchorPane();
        rightAnchorPane.setPrefSize(350, 200);

        //  Text for login title
        Text loginTitle = new Text("User Login");
        loginTitle.setLayoutX(113);
        loginTitle.setLayoutY(158);
        loginTitle.setFont(Font.font("Berlin Sans FB", 29));

        // TextField for username
        TextField usernameField = new TextField();
        usernameField.setLayoutX(101);
        usernameField.setLayoutY(213);
        usernameField.setPromptText("Username");
        usernameField.setStyle("-fx-background-color: #abd1c6;");

        //  PasswordField for password
        PasswordField passwordField = new PasswordField();
        passwordField.setLayoutX(101);
        passwordField.setLayoutY(262);
        passwordField.setPromptText("Password");
        passwordField.setStyle("-fx-background-color: #abd1c6;");

        // Login Button
        Button loginButton = new Button("Login");
        loginButton.setLayoutX(138);
        loginButton.setLayoutY(332);
        loginButton.setPrefSize(75, 32);
        loginButton.setStyle("-fx-background-color: #004643;");
        loginButton.setTextFill(javafx.scene.paint.Color.WHITE);

        //  Hyperlink for login as admin - idk if its right to use hyperlink might change later
        Button adminLoginButton = new Button("Login as Admin");
        adminLoginButton.setLayoutX(119);
        adminLoginButton.setLayoutY(444);
        adminLoginButton.setStyle("-fx-background-color: transparent; -fx-text-fill: black; -fx-border-color: transparent; ");
        adminLoginButton.setFont(Font.font(14));

        rightAnchorPane.getChildren().addAll(usernameField, passwordField, loginButton, adminLoginButton, loginTitle);

        // Setting right AnchorPane in BorderPane
        root.setRight(rightAnchorPane);

        // Creating Scene and set it to Stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Movie Rental Login");
        primaryStage.show();
    }


   
}
