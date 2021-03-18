import java.io.FileReader;
import java.io.IOException;

public class Scan1 {

	public static void main(String[] args) throws IOException{

		FileReader r = new FileReader("C:\\Users\\Abdulx\\Desktop\\file\\test.txt");
		
		int i;
		while((i = r.read()) != -1) {
			System.out.print((char)i);
		}

	}

}
