package Anfang;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Fx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("First");
        GridPane an = new GridPane();
        Scene scene = new Scene(an,600, 400);
        stage.setScene(scene);
        stage.show();
    }


}