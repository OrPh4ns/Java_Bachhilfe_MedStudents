
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args) {
	try {
		System.out.println("Waiting for Clinets....");
		ServerSocket s = new ServerSocket(9806);
		Socket soc = s.accept();
		if(soc.isConnected()) {
			System.out.println("Connection established ..");
		}
		
	} catch (Exception e) {
		System.out.println("ERROR");
	}
}
}
