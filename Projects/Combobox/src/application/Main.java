package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader load = new FXMLLoader();
			load.setLocation(getClass().getResource("design.fxml"));
			AnchorPane anc = load.load();
			Scene scene = new Scene(anc);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Combobox");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
