package edu.umindanao.cinematiquehub;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import edu.umindanao.cinematiquehub.scenes.user.HomeScreen;

public class Main extends Application {

    /**
     * Main starting point of our application
     */
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CinematiqueHub");
        BorderPane root = new HomeScreen();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setHeight(1020);
        stage.setWidth(1920);
//        stage.setTitle("JavaFX App");
//
//        Stage stage2 = new Stage();
////        stage2.initModality(Modality.APPLICATION_MODAL);
//        stage2.initModality(Modality.WINDOW_MODAL);
//        stage2.initModality(Modality.NONE);

        stage.centerOnScreen();

        stage.show();
////        text.getOnMouseClicked().handle(stage2.showAndWait());
//        stage2.setOnShown((event) -> {
//            System.out.println("Stage Shown");
//        });
//        stage.setOnShowing((event) -> {
//            System.out.println("Showing Stage");
//        });
//        stage2.setOnHidden((event) -> {
//            System.out.println("Stage hidden");
//        });
//        stage2.setOnHiding((event) -> {
//            System.out.println("Hiding Stage");
//        });
//        stage2.setOnCloseRequest((event) -> {
//            System.out.println("Closing Stage");
//        });
//        stage2.addEventHandler(KeyEvent.KEY_PRESSED, (event) -> {
//            System.out.println("Key pressed: " + event.toString());
//
//            switch (event.getCode().getCode()) {
//                case 27: { // 27 = ESC key
//                    stage2.close();
//                    break;
//                }
//                case 10: { // 10 = Return
//                    stage2.setWidth(stage2.getWidth() * 2);
//                }
//                default: {
//                    System.out.println("Unrecognized key");
//                }
//            }
//        });
////        stage2.show();
//
//        stage2.show();

//        stage.setFullScreen(true);

    }

    public static void main(String[] args) {
        launch();
    }
}
