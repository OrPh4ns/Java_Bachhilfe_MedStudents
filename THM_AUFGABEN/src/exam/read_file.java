package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_file {

	public static void read1() throws FileNotFoundException {
		String path = "C:\\Users\\Abdulx\\Desktop\\protocol.txt";
		Scanner sc = new Scanner(new File(path));
		try {
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws FileNotFoundException {

		read1();
	}

}
