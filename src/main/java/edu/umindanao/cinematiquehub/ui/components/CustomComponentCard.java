package edu.umindanao.cinematiquehub.ui.components;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class CustomComponentCard extends BorderPane {

    public CustomComponentCard() {
        // Set overall layout properties
        setStyle("-fx-border-color: #e0e0e0; -fx-border-width: 1px; -fx-padding: 16px;");

        // Title
        Text title = new Text("Your Title");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        setTop(title);

        // Plan boxes
        HBox planBox = new HBox();
        // Add individual plan boxes using CSS grid or flexbox
        planBox.getChildren().add(createPlanBox("Plan 1", "#ffffff", "#cccccc"));
        planBox.getChildren().add(createPlanBox("Plan 2", "#ffffff", "#cccccc"));
        planBox.getChildren().add(createPlanBox("Plan 3", "#ffffff", "#cccccc"));
        planBox.getChildren().add(createPlanBox("Plan 4", "#ffffff", "#cccccc"));
        setCenter(planBox);

        // Payment details
        TextField cardDetails1 = new TextField();
        TextField cardDetails2 = new TextField();
        Button cardTypeButton1 = new Button("Card Type 1");
        Button cardTypeButton2 = new Button("Card Type 2");

        // Add event handlers and styles for buttons
        HBox paymentDetails = new HBox(cardDetails1, cardDetails2, cardTypeButton1, cardTypeButton2);
        paymentDetails.setStyle("-fx-spacing: 8px;");
        setBottom(paymentDetails);

        // Email address
        TextField emailAddress = new TextField();
        emailAddress.setStyle("-fx-border-color: #cccccc; -fx-background-color: #f5f5f5;");
        // Add event handlers or validations for the email address input

        // Buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        // Add event handlers, styles, and hover/active states for buttons
        HBox buttons = new HBox(button1, button2);
        buttons.setStyle("-fx-spacing: 8px;");
        setRight(buttons);
    }

    // Optionally, you can create a method to generate plan boxes dynamically
    private VBox createPlanBox(String planName, String backgroundColor, String borderColor) {
        VBox planBox = new VBox();
        planBox.setStyle("-fx-background-color: " + backgroundColor + "; -fx-border-color: " + borderColor + ";");
        // Customize the plan box content based on your requirements
        return planBox;
    }
}
