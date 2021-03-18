package exam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_copy {

	public static void copy(String a, String b) throws IOException {
		File f1 = new File(a);
		File f2 = new File(b);
		FileWriter r = new FileWriter(f2,true);
		Scanner sc = new Scanner(f1);
		while(sc.hasNextLine()) {
			r.write(sc.nextLine()+"\n");
			
		}
		System.out.println("Done");
		r.close();
	}
	public static void main(String[] args) throws IOException {
		String a = "C:\\Users\\Abdulx\\Desktop\\file.txt";
		String b = "C:\\Users\\Abdulx\\Desktop\\file1.txt";
		copy(a,b);
	}

}
