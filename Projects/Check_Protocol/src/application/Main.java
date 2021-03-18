package application;
	
import java.util.prefs.Preferences;

import com.sun.prism.Image;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader load = new FXMLLoader();
			load.setLocation(getClass().getResource("Design.fxml"));
			AnchorPane anc = load.load();
			Scene scene = new Scene(anc);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Check Protocols Dev-Point");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
