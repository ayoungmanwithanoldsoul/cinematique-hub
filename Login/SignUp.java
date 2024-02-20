import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class SignUp {

    public SignUp(Stage primaryStage){
        BorderPane root = new BorderPane();
        root.setPrefSize(700, 500);
        root.setStyle("-fx-background-color: #90b4ce;");

        AnchorPane centerAnchorPane = new AnchorPane();
        centerAnchorPane.setPrefSize(400, 380);
        centerAnchorPane.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 16px;"); // Rounded corners CSS

        BorderPane.setAlignment(centerAnchorPane, javafx.geometry.Pos.CENTER);


        Text signUpText = new Text("Sign Up");
        signUpText.setLayoutX(154);
        signUpText.setLayoutY(40);
        signUpText.setFont(Font.font("Berlin Sans FB", 29));

        TextField userNameTextField = new TextField();
        userNameTextField.setLayoutX(85);
        userNameTextField.setLayoutY(76);
        userNameTextField.setPrefSize(250, 30);
        userNameTextField.setPromptText("Username");
        userNameTextField.setStyle("-fx-background-color: #6c9d8f;");

        PasswordField passwordTextField = new PasswordField();
        passwordTextField.setLayoutX(85);
        passwordTextField.setLayoutY(137);
        passwordTextField.setPrefSize(250, 30);
        passwordTextField.setPromptText("Password");
        passwordTextField.setStyle("-fx-background-color: #6c9d8f;");


        PasswordField confirmPassTextField = new PasswordField();
        confirmPassTextField.setLayoutX(85);
        confirmPassTextField.setLayoutY(197);
        confirmPassTextField.setPrefSize(250, 30);
        confirmPassTextField.setPromptText("Confirm password");
        confirmPassTextField.setStyle("-fx-background-color: #6c9d8f;");

        TextField addressTextField = new TextField();
        addressTextField.setLayoutX(85);
        addressTextField.setLayoutY(257);
        addressTextField.setPrefSize(250, 30);
        addressTextField.setPromptText("Address");
        addressTextField.setStyle("-fx-background-color: #6c9d8f;");

        TextField contactNumberTextField = new TextField();
        contactNumberTextField.setLayoutX(85);
        contactNumberTextField.setLayoutY(318);
        contactNumberTextField.setPrefSize(250, 30);
        contactNumberTextField.setPromptText("Contact Number");
        contactNumberTextField.setStyle("-fx-background-color: #6c9d8f;");

        ImageView usernameIcon = new ImageView("user24.png");
        ImageView passwordIcon = new ImageView("password.png");
        ImageView conPasswordIcon = new ImageView("confirmPassword.png");
        ImageView addressIcon = new ImageView("location.png");
        ImageView conNumIcon = new ImageView("add-contact.png");

        ImageView hiddenPassIcon = new ImageView("eye.png");
        hiddenPassIcon.setLayoutX(340);
        hiddenPassIcon.setLayoutY(143);
        hiddenPassIcon.setFitHeight(24);
        hiddenPassIcon.setFitHeight(24);
        hiddenPassIcon.setVisible(false);

        ImageView showPassIcon = new ImageView("hidden.png");
        showPassIcon.setLayoutX(340);
        showPassIcon.setLayoutY(143);
        showPassIcon.setFitHeight(24);
        showPassIcon.setFitHeight(24);

        ImageView hiddenConPassIcon = new ImageView("eye.png");
        hiddenConPassIcon.setLayoutX(340);
        hiddenConPassIcon.setLayoutY(200);
        hiddenConPassIcon.setFitHeight(24);
        hiddenConPassIcon.setFitHeight(24);
        hiddenConPassIcon.setVisible(false);

        ImageView showConPassIcon = new ImageView("hidden.png");
        showConPassIcon.setLayoutX(340);
        showConPassIcon.setLayoutY(200);
        showConPassIcon.setFitHeight(24);
        showConPassIcon.setFitHeight(24);




        usernameIcon.setLayoutX(60);
        usernameIcon.setLayoutY(80);
        usernameIcon.setFitWidth(20);
        usernameIcon.setFitHeight(20);

        passwordIcon.setLayoutX(60);
        passwordIcon.setLayoutY(143);
        passwordIcon.setFitWidth(20);
        passwordIcon.setFitHeight(20);

        conPasswordIcon.setLayoutX(60);
        conPasswordIcon.setLayoutY(202);
        conPasswordIcon.setFitWidth(24);
        conPasswordIcon.setFitHeight(20);

        addressIcon.setLayoutX(60);
        addressIcon.setLayoutY(262);
        addressIcon.setFitWidth(20);
        addressIcon.setFitHeight(20);

        conNumIcon.setLayoutX(60);
        conNumIcon.setLayoutY(326);
        conNumIcon.setFitWidth(20);
        conNumIcon.setFitHeight(20);


        Button registerButton = new Button("Register");
        registerButton.setLayoutX(154);
        registerButton.setLayoutY(390);
        registerButton.setPrefSize(80, 36);
        registerButton.setStyle(
                "-fx-background-color: linear-gradient(to right, #29323c, #485563, #2b5876, #4e4376), #004643;" +
                        "-fx-background-radius: 50px;" +
                        "-fx-background-insets: 0;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 14px;" +
                        "-fx-font-weight: 600;" +
                        "-fx-padding: 10 20;" + // Adjust padding as needed
                        "-fx-cursor: hand;" + // Change cursor to pointer
                        "-fx-alignment: center;" +
                        "-fx-pref-width: 110px;" +
                        "-fx-pref-height: 32px;" +
                        "-fx-effect: dropshadow(three-pass-box, rgba(45, 54, 65, 0.75), 10, 0, 0, 0);"); // Shadow effect
        registerButton.setTextFill(javafx.scene.paint.Color.WHITE);

        registerButton.setOnAction(e -> showUserInterface(primaryStage));
        // add argument if password does not match the confirm password field, the user need to re input those field before success register


        //textfield for show password
        TextField showtextField = new TextField();
        showtextField.setVisible(false);
        showtextField.setLayoutX(85);
        showtextField.setLayoutY(137);
        showtextField.setPrefSize(250, 30);
        showtextField.setStyle("-fx-background-color: #abd1c6;");

        TextField showtextField1 = new TextField();
        showtextField1.setVisible(false);
        showtextField1.setLayoutX(85);
        showtextField1.setLayoutY(197);
        showtextField1.setPrefSize(250, 30);
        //showtextField1.setPromptText("Confirm password");
        showtextField1.setStyle("-fx-background-color: #abd1c6;");


        //implementing the show password
        showPassIcon.setOnMouseClicked(e -> toggleOnPasswordVisibility(passwordTextField,showPassIcon,hiddenPassIcon,showtextField));
        hiddenPassIcon.setOnMouseClicked(e -> toggleOffPasswordVisibility(passwordTextField,showPassIcon,hiddenPassIcon,showtextField));

        showConPassIcon.setOnMouseClicked(e -> toggleOnConPasswordVisibility(confirmPassTextField,showConPassIcon,hiddenConPassIcon,showtextField1));
        hiddenConPassIcon.setOnMouseClicked(e -> toggleOffConPasswordVisibility(confirmPassTextField,showConPassIcon,hiddenConPassIcon,showtextField1));


        centerAnchorPane.getChildren().addAll(signUpText, userNameTextField, passwordTextField, addressTextField, contactNumberTextField, confirmPassTextField,
                registerButton,usernameIcon,passwordIcon,conPasswordIcon,addressIcon,conNumIcon,showPassIcon,hiddenPassIcon,
                hiddenConPassIcon,showConPassIcon,showtextField,showtextField1);
        root.setCenter(centerAnchorPane);

        AnchorPane topAnchorPane = new AnchorPane();
        topAnchorPane.setPrefSize(700, 30);
        topAnchorPane.setStyle("-fx-background-color: #90b4ce;");
        BorderPane.setAlignment(topAnchorPane, javafx.geometry.Pos.CENTER);
        root.setTop(topAnchorPane);

        AnchorPane rightAnchorPane = new AnchorPane();
        rightAnchorPane.setPrefSize(150, 244);
        rightAnchorPane.setStyle("-fx-background-color: #90b4ce;");
        BorderPane.setAlignment(rightAnchorPane, javafx.geometry.Pos.CENTER);
        root.setRight(rightAnchorPane);

        AnchorPane leftAnchorPane = new AnchorPane();
        leftAnchorPane.setPrefSize(150, 244);
        leftAnchorPane.setStyle("-fx-background-color: #90b4ce;");
        BorderPane.setAlignment(leftAnchorPane, javafx.geometry.Pos.CENTER);
        root.setLeft(leftAnchorPane);

        AnchorPane bottomAnchorPane = new AnchorPane();
        bottomAnchorPane.setPrefSize(700, 30);
        bottomAnchorPane.setStyle("-fx-background-color: #90b4ce;");
        BorderPane.setAlignment(bottomAnchorPane, javafx.geometry.Pos.CENTER);
        root.setBottom(bottomAnchorPane);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sign Up");
        primaryStage.show();

    }
    private void showUserInterface(Stage primaryStage) {
        new LoginDemo(primaryStage);

    }
    private void toggleOffPasswordVisibility(PasswordField passwordTextField, ImageView showPassIcon, ImageView hiddenPassIcon,TextField showtextField) {
        System.out.println("toggle off");


        passwordTextField.setText(showtextField.getText());
        showtextField.setVisible(false);
        passwordTextField.setVisible(true);

        showPassIcon.setVisible(true);
        hiddenPassIcon.setVisible(false);
    }
    private void toggleOnPasswordVisibility(PasswordField passwordTextField, ImageView showPassIcon, ImageView hiddenPassIcon,TextField showtextField){
        System.out.println("toggle On");

        showtextField.setText(passwordTextField.getText());
        passwordTextField.setVisible(false);
        showtextField.setVisible(true);

        hiddenPassIcon.setVisible(true);
        showPassIcon.setVisible(false);

    }

    private void toggleOnConPasswordVisibility(PasswordField passwordTextField, ImageView showPassIcon, ImageView hiddenPassIcon,TextField showtextField){
        System.out.println("toggle On");

        showtextField.setText(passwordTextField.getText());
        passwordTextField.setVisible(false);
        showtextField.setVisible(true);

        hiddenPassIcon.setVisible(true);
        showPassIcon.setVisible(false);

    }
    private void toggleOffConPasswordVisibility(PasswordField passwordTextField, ImageView showPassIcon, ImageView hiddenPassIcon,TextField showtextField){
        System.out.println("toggle off");


        passwordTextField.setText(showtextField.getText());
        showtextField.setVisible(false);
        passwordTextField.setVisible(true);

        showPassIcon.setVisible(true);
        hiddenPassIcon.setVisible(false);
    }


}
