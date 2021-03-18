package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class control implements Initializable{

    @FXML
    private Label name;

    @FXML
    private ComboBox<String> combobox;

    ObservableList<String> list = FXCollections.observableArrayList("Ali","Sarah");
    @FXML
    public void initialize(URL location,ResourceBundle resources) {
    	combobox.setItems(list);
    }
    public void OnClick() {

    	name.setText(combobox.getValue());
    }

}
