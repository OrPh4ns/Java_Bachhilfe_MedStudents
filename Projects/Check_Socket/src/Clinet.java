
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Clinet {
public static void main(String[] args) {
	
	try {
		System.out.println("Clinet Started..");
		Socket soc = new Socket("localhost",9806);

		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
