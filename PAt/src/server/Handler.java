package server;



import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

/*
Thread welcher die Clientkommunikation verarbeitet
Liest und schreibt die Datenstr�me mit Hilfe eines Broadcast
 */
public class Handler extends Thread{
    private Socket clientSocket;
    private String message;
    private PVSServer server;
    private ArrayList<Socket> clientList;

    public Handler(PVSServer pvsServer, Socket clientSocket, ArrayList<Socket> clientList) {
        this.server = pvsServer;
        this.clientSocket = clientSocket;
        this.clientList = clientList;
        start();
    }

    public void run(){
    	}
    }
     
            //Todo �ffne Inputstream f�r die Clientkommunikaiton
            //Ausgangsstrom wird im Broadcast des PVSServer verarbeitet!
           
            //Todo f�ge den Client in die Clientliste ein

            //Todo Lies vom Eingangsstrom
  
                
                //Todo sende die Nachricht an alle Clients


