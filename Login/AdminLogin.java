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

public class AdminLogin {
    
    public AdminLogin(Stage primaryStage){
 // Create BorderPane
        BorderPane root = new BorderPane();
        root.setPrefSize(700, 500);

        // Create right AnchorPane
        AnchorPane rightAnchorPane = new AnchorPane();
        rightAnchorPane.setPrefSize(400, 500);
        rightAnchorPane.setStyle("-fx-background-color: #004643;");

        // Set right AnchorPane in BorderPane
        root.setRight(rightAnchorPane);

        // Create center AnchorPane
        AnchorPane centerAnchorPane = new AnchorPane();
        centerAnchorPane.setPrefSize(350, 200);

        // Create Text for admin login title
        Text adminLoginTitle = new Text("Admin Login");
        adminLoginTitle.setLayoutX(73);
        adminLoginTitle.setLayoutY(183);
        adminLoginTitle.setFont(Font.font("Berlin Sans FB", 29));

        // Create TextField for username
        TextField usernameField = new TextField();
        usernameField.setLayoutX(76);
        usernameField.setLayoutY(225);
        usernameField.setPromptText("Username");
        usernameField.setStyle("-fx-background-color: #abd1c6;");

        // Create PasswordField for password
        PasswordField passwordField = new PasswordField();
        passwordField.setLayoutX(76);
        passwordField.setLayoutY(274);
        passwordField.setPromptText("Password");
        passwordField.setStyle("-fx-background-color: #abd1c6;");

        // Create Hyperlink for login as user
        Button userLoginButton = new Button("Login as Admin");
        userLoginButton.setLayoutX(95);
        userLoginButton.setLayoutY(444);
        userLoginButton.setStyle("-fx-background-color: transparent; -fx-text-fill: black; -fx-border-color: transparent; ");
        userLoginButton.setFont(Font.font(14));

        // Create Login Button
        Button loginButton = new Button("Login");
        loginButton.setLayoutX(113);
        loginButton.setLayoutY(323);
        loginButton.setPrefSize(75, 32);
        loginButton.setStyle("-fx-background-color: #004643;");
        loginButton.setTextFill(javafx.scene.paint.Color.WHITE);

        centerAnchorPane.getChildren().addAll(adminLoginTitle, usernameField, passwordField, userLoginButton, loginButton);

        // Set center AnchorPane in BorderPane
        root.setCenter(centerAnchorPane);

        // Create Scene and set it to Stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Admin Login");
        primaryStage.show();
    }
    private void switchToUserLogin(Stage primaryStage) {
        LoginDemo user = new LoginDemo(primaryStage);
    }
}
