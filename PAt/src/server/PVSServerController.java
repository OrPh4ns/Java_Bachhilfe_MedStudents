package server;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class PVSServerController {
    private int localPort;
    private PVSServer serverthread;

    @FXML
    private Button connection;
    @FXML
    private Label connectionState;
    @FXML
    private TextField port;

    @FXML
    public void manageConnection(ActionEvent actionEvent){
        localPort = Integer.parseInt(port.getText());
        if(connection.getText().equals("verbinden")){
            serverthread = new PVSServer(localPort);
            System.out.println("Thread started");
            connection.setText("trennen");
            connectionState.setTextFill(Paint.valueOf("GREEN"));
            connectionState.setText("Server bereit! ");
        }
        else{
            serverthread.broadcast("cmd:disconnect");
            serverthread.disconnect();
            System.out.println("Thread stopped");
            connection.setText("verbinden");
            connectionState.setTextFill(Paint.valueOf("RED"));
            connectionState.setText("not connected!");

        }
    }
}
