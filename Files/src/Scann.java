import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scann {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\\\Users\\\\Abdulx\\\\Desktop\\\\file\\\\abdul.txt"));
		
		while(sc.hasNextLine()) {
			String find = sc.nextLine();
			if(find.contains("abdul")) {
				System.out.println("Yes     ][     "+find);
			}else {
				System.out.println("No     ][     "+find);
			}
		}
	}
	
}
