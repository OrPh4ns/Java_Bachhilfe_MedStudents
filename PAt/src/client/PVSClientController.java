package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Paint;

import java.io.IOException;

public class PVSClientController {
    @FXML
    private TextField host;
    @FXML
    private TextField port;
    @FXML
    private Button connection;
    @FXML
    private TextField name;
    @FXML
    private TextField vorname;
    @FXML
    private DatePicker geb;
    @FXML
    private TextField caseID;
    @FXML
    private ListView patList;
    @FXML
    private Button save;
    @FXML
    private Label connectionState;

    private PVSClient clientThread;

    //Patient wird hinzugefügt. Click auf Button
    public void addPatient(ActionEvent actionEvent) {
        String lname= name.getText();
        String lvorname=vorname.getText();
        String lgeb = geb.getValue().toString();
        String lcaseID = caseID.getText();
        clientThread.send(lname + "," +lvorname + "," + lgeb + "," + lcaseID);
    }

    //Socketverbindung herstellen; Click auf Button
    public void connect(ActionEvent actionEvent)  {

        if (connection.getText().equals("verbinden")) {

            try {
                //ToDo erzeuge ein PVSClientobjekt
            	PVSClient clientThread = new PVSClient(host, port, PVSClient);
            } catch (IOException e) {
                connectionState.setTextFill(Paint.valueOf("RED"));
                connectionState.setText("Fehler bei der Verbindung mit dem Server!");
            }

            System.out.println("Thread started");
            connection.setText("trennen");
            connectionState.setTextFill(Paint.valueOf("GREEN"));
            connectionState.setText("Client verbunden!");
        } else {

            System.out.println("Thread stopped");
            clientThread.disconnect();

            connection.setText("verbinden");
            connectionState.setTextFill(Paint.valueOf("RED"));
            connectionState.setText("not connected!");
        }
    }

    /*
    Status der Verbindung auf disconnected
     */
    public void setDisconnected() {
        System.out.println("Thread stopped");
        //ToDo sende eine disconnect nachricht an clientThread

        patList.getItems().clear();
        connection.setText("verbinden");
        connectionState.setTextFill(Paint.valueOf("RED"));
        connectionState.setText("not connected!");
    }

    /*
    Status der Verbindung auf Connected
     */
    public void setConnected() {
        System.out.println("Thread started");
        connection.setText("trennen");
        connectionState.setTextFill(Paint.valueOf("GREEN"));
        connectionState.setText("Client verbunden!");
    }

    /*
    Liste der Patienten befüllen
     */
    public void addList(String name) {
        String[] values = name.split(",");
        patList.getItems().add(values[0] + "," + values[1]+ "," + values[2]+ "," + values[3]);
    }
}
