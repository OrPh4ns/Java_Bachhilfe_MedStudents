package exam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class toTry {

	public static void eingabe() throws IOException {
		boolean b = true;
		int count = 0;
		while(b) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter >> ");
				int i = sc.nextInt();
				System.out.println("Done ... ][ "+i);
				b = false;
			}catch (Exception e) {
				count++;
				System.out.println("Falsche Eingabe .. "+count);
				String p = "C:\\Users\\Abdulx\\Desktop\\protocol.txt";
				FileWriter f = new FileWriter(p,true);
				f.write("Der Benutzer hat "+count+" Mal etwas Falsches eingegeben"+"\n");
				f.close();
			}
		}
	}
	public static void main(String[] args) throws IOException {
		eingabe();
	}

}
