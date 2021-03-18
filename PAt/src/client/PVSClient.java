package client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
PVS Client-Thread für die Socketverbindung.
 */

public class PVSClient extends Thread {
    private String host;
    private int port;
    private Socket clientSocket;
    private String message;
    private PrintWriter dataOut;
    private PVSClientController client;
    private BufferedReader dataIn;


    public PVSClient(String host, int port, PVSClientController client) throws IOException {
        this.port =port;
        this.host = host;
        this.client = client;
        start();
    }

    @Override
    public void run(){
        try {
            //Todo 1. ClientSocket verbinden

            //Todo 2. Ausgansstream öffnen

            //Todo 3. Eingangsstream öffnen

            String[] values;
            System.out.println("Client ready");
            // Kommunizieren...
            while ((message = dataIn.readLine()) != null){
                if (message.equals("cmd:disconnect")) {
                    client.setDisconnected();
                    clientSocket.close();
                    break;
                }

                if (message.equals("cmd:connection:ok")) {
                    client.setConnected();
                    continue;
                }
                if (message.equals("")) {
                    continue;
                }
                values = message.split(",");
                String toSend = values[0] + "," + values[1]+ ","+ values[2]+","+ values[3];
                client.addList(toSend);

            }
            dataIn.close();
            dataOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /*
    Client meldet sich am Server ab und sorgt dafür dass er aus der Liste der anderen Clients rausgenommen wird.
     */
    public void disconnect(){
        send("cmd:disconnect");
    }

    /*
    Senden einer Nachricht an den Server über die offene Socketverbindung
     */
    public void send(String message) {
        if (clientSocket != null) {
            // Todo Wenn ClientSocket existiert schreibe Nachricht in dataOut

            dataOut.flush();
        }
    }
}

