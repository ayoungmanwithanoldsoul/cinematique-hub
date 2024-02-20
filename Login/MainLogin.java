
package edu.umindanao.cinematiquehub.ui.components;
import javafx.application.Application;
import javafx.stage.Stage;



public class MainLogin extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
	LoginDemo demo = new LoginDemo(primaryStage);
	//AdminLogin admin = new AdminLogin(primaryStage);
	}
}