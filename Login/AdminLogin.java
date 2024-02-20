package edu.umindanao.cinematiquehub.ui.components;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminLogin{

    public AdminLogin(Stage primaryStage){

        Image icon = new Image(getClass().getResourceAsStream("Logo.png"));
        primaryStage.getIcons().add(icon);

        //  BorderPane
        BorderPane root = new BorderPane();
        root.setPrefSize(750, 500);


        // Right AnchorPane
        AnchorPane rightAnchorPane = new AnchorPane();
        rightAnchorPane.setPrefSize(400, 500);
        rightAnchorPane.setStyle("-fx-background-color: #30D5C8;");

        // Set right AnchorPane in BorderPane
        root.setRight(rightAnchorPane);
        ImageView logo = new ImageView("logo.png");
        logo.setLayoutX(80);
        logo.setLayoutY(90);
        logo.setFitWidth(250);
        logo.setFitHeight(300);
        logo.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(45, 54, 65, 0.75), 10, 0, 0, 0");

        rightAnchorPane.getChildren().add(logo);
        //  Left AnchorPane
        AnchorPane leftAnchorPane = new AnchorPane();
        leftAnchorPane.setPrefSize(350, 200);

        //  Text for admin login title
        Text adminLoginTitle = new Text("Admin Login");
        adminLoginTitle.setLayoutX(100);
        adminLoginTitle.setLayoutY(183);
        adminLoginTitle.setFont(Font.font("Berlin Sans FB", 29));

        // TextField for username
        TextField usernameField = new TextField();
        usernameField.setLayoutX(100);
        usernameField.setLayoutY(225);
        usernameField.setPromptText("Username");
        usernameField.setStyle("-fx-background-color: #abd1c6;");

        // PasswordField for password
        PasswordField passwordField = new PasswordField();
        passwordField.setLayoutX(100);
        passwordField.setLayoutY(274);
        passwordField.setPromptText("Password");
        passwordField.setStyle("-fx-background-color: #abd1c6;");

        // Button for login as user
        Button userLoginButton = new Button("Login as User");
        userLoginButton.setLayoutX(115);
        userLoginButton.setLayoutY(444);
        userLoginButton.setStyle("-fx-background-color: transparent; -fx-text-fill: black; -fx-border-color: transparent; ");
        userLoginButton.setFont(Font.font(14));
        userLoginButton.setOnAction(e -> showUserInterface(primaryStage));

        //  Login Button
        Button loginButton = new Button("Login");
        loginButton.setLayoutX(129);
        loginButton.setLayoutY(332);
        loginButton.setPrefSize(75, 32);
        loginButton.setStyle(
                "-fx-background-color: linear-gradient(to right, #29323c, #485563, #2b5876, #4e4376), #004643;" +
                        "-fx-background-radius: 50px;" +
                        "-fx-background-insets: 0;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 14px;" +
                        "-fx-font-weight: 600;" +
                        "-fx-padding: 10 20;" + // Adjust padding as needed
                        "-fx-cursor: hand;" + // Change cursor to pointer
                        "-fx-alignment: center;" +
                        "-fx-pref-width: 90px;" +
                        "-fx-pref-height: 32px;" +
                        "-fx-effect: dropshadow(three-pass-box, rgba(45, 54, 65, 0.75), 10, 0, 0, 0);"); // Shadow effect



        ImageView adminIcon = new ImageView("security.png");
        adminIcon.setLayoutX(125);
        adminIcon.setLayoutY(25);
        adminIcon.setFitHeight(100);
        adminIcon.setFitWidth(100);

        ImageView userNameIcon = new ImageView("id-card.png");
        userNameIcon.setLayoutX(65);
        userNameIcon.setLayoutY(225);
        userNameIcon.setFitHeight(25);
        userNameIcon.setFitWidth(25);

        ImageView passwordIcon = new ImageView("key.png");
        passwordIcon.setLayoutX(65);
        passwordIcon.setLayoutY(275);
        passwordIcon.setFitWidth(25);
        passwordIcon.setFitHeight(25);

        ImageView hiddenPassIcon = new ImageView("eye.png");
        hiddenPassIcon.setLayoutX(260);
        hiddenPassIcon.setLayoutY(275);
        hiddenPassIcon.setFitHeight(24);
        hiddenPassIcon.setFitHeight(24);
        hiddenPassIcon.setVisible(false);

        ImageView showPassIcon = new ImageView("hidden.png");
        showPassIcon.setLayoutX(260);
        showPassIcon.setLayoutY(275);
        showPassIcon.setFitHeight(24);
        showPassIcon.setFitHeight(24);



        //textfield for show password
        TextField showtextField = new TextField();
        showtextField.setVisible(false);
        showtextField.setLayoutX(100);
        showtextField.setLayoutY(274);
        showtextField.setStyle("-fx-background-color: #abd1c6;");

        //implementing the show password
        showPassIcon.setOnMouseClicked(e -> toggleOnPasswordVisibility(passwordField,showPassIcon,hiddenPassIcon,showtextField));
        hiddenPassIcon.setOnMouseClicked(e -> toggleOffPasswordVisibility(passwordField,showPassIcon,hiddenPassIcon,showtextField));


        leftAnchorPane.getChildren().addAll(adminLoginTitle, usernameField, passwordField, userLoginButton, loginButton,adminIcon,userNameIcon,passwordIcon,
                hiddenPassIcon,showPassIcon,showtextField);

        // Set center AnchorPane in BorderPane
        root.setCenter(leftAnchorPane);

        // Create Scene and set it to Stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Admin Login");
        primaryStage.show();
    }

    private void toggleOnPasswordVisibility(PasswordField passwordField, ImageView showPassIcon, ImageView hiddenPassIcon, TextField showtextField) {
        System.out.println("toggle On");

        showtextField.setText(passwordField.getText());
        passwordField.setVisible(false);
        showtextField.setVisible(true);

        hiddenPassIcon.setVisible(true);
        showPassIcon.setVisible(false);
    }

    private void toggleOffPasswordVisibility(PasswordField passwordField, ImageView showPassIcon, ImageView hiddenPassIcon,TextField showtextField) {
        System.out.println("toggle off");


        passwordField.setText(showtextField.getText());
        showtextField.setVisible(false);
        passwordField.setVisible(true);

        showPassIcon.setVisible(true);
        hiddenPassIcon.setVisible(false);
    }

    private void showUserInterface(Stage primaryStage) {
        new LoginDemo(primaryStage);
    }

}

