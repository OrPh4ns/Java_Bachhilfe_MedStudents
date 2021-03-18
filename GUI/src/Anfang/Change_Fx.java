package Anfang;

import java.awt.Button;import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Change_Fx extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane border = new BorderPane();
		Scene scene = new Scene(border,200,200);
		stage.setScene(scene);
		stage.setTitle("First");
		stage.show();
		Button button = new Button("Druck mich !! ");
		

		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
