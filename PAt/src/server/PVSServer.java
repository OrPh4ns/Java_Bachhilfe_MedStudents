package server;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
Thread für den PVS Server welcher über die GUI gestartet wird.
Der Thread verarbeitet eingehende Clientverbindungen und startet sobald ein Client sich anmeldet einen Handler, welcher die Clientkommunikation verwaltet.
 */
public class PVSServer extends Thread {
    private int port;
    private Thread serverThread;
    private ServerSocket serverSocket;
    private ArrayList<Socket> clientList;
    private Socket clientSocket;

    public PVSServer(int port) {
        this.port = port;
        start();
    }

    @Override
    public void run() {
        try {
            //Todo 1. ServerSocket erstellen

            serverThread = Thread.currentThread();
            clientList = new ArrayList<>();
            while (!serverThread.isInterrupted()) {
                //Todo 2. ClientSocket erstellen und auf Verbindungen warten
                // -> Hier wird die Anwendung Blockiert! Darum muss die Kommunikation über den Handler laufen!

                //Todo 3. Kommuniziere mit den Clients entsprechend des Protokolls

            }
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Thread killed");
        System.out.println("Sockets closed");
    }


    /*
    Socketverbindungen schließen sobald disconnect gesendet wird.
     */
    public synchronized void disconnect() {
        if (serverThread != null && serverThread.isAlive()) {
            try {
                serverSocket.close();
                serverSocket = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
            serverThread.interrupt();
        }
    }

    /*
    Allen Clients eine Nachricht zukommen lassen
     */
    public void broadcast(String message){
        PrintWriter pw;
        //Todo Sende eine Nachricht an alle Clients in der Liste, Nutze den Printwriter und den Ausgangsstrom des Clients
        for ( ) {
            try {

                pw.println(message);
                pw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



