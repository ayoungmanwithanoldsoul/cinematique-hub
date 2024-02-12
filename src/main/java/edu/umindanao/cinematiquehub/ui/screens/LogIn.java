package edu.umindanao.cinematiquehub.ui.screens;

import edu.umindanao.cinematiquehub.ui.components.AnotherButton;
import edu.umindanao.cinematiquehub.ui.components.CustomInputField;
import edu.umindanao.cinematiquehub.ui.components.CustomPasswordField;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class LogIn extends GridPane {

    public LogIn() {
        // Set the layout properties
        setAlignment(javafx.geometry.Pos.CENTER);
        setHgap(40);
        setVgap(15); // Increased vertical gap for better spacing
        setPadding(new Insets(25, 25, 25, 25));
        setMinHeight(500);
        setMinWidth(300);

        // Add styles directly in Java code
        setStyle("-fx-background-color: #f4f4f4;");

        CustomInputField usernameTextField = new CustomInputField();
        usernameTextField.setPromptText("Enter your username");
        usernameTextField.setMinWidth(300);
        usernameTextField.setMinHeight(40);
        add(usernameTextField, 0, 0, 2, 1); // Spanning two columns

        CustomPasswordField passwordField = new CustomPasswordField();
        passwordField.setMinWidth(300);
        passwordField.setMinHeight(40);
        passwordField.setPromptText("Enter your password");
        add(passwordField, 0, 1, 2, 1); // Spanning two columns

        // Add login button
        AnotherButton loginButton = new AnotherButton("Login", AnotherButton.Size.LARGE, AnotherButton.Variant.PRIMARY, "BlueViolet", "Black", true);
        loginButton.setMinWidth(300);
        loginButton.setTextAlignment(TextAlignment.CENTER);
//        loginButton.setStyle(
//                "-fx-background-color: #2196F3; " +
//                        "-fx-text-fill: white; " +
//                        "-fx-font-family: 'Arial'; " +
//                        "-fx-font-size: 16px; " + // Increased font size
//                        "-fx-background-radius: 5px; " +
//                        "-fx-padding: 10px 15px;"); // Increased padding
        add(loginButton, 0, 4, 2, 1); // Spanning two columns
    }
}
