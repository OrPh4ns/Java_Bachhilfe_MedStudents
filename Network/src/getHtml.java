import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class getHtml {
	
	public static void name() {
		String content = null;
		URLConnection connection = null;
		try {
		  connection =  new URL("http://localhost/Dropbox/amko/with%20Sessions/v11/page/login.php").openConnection();
		  Scanner scanner = new Scanner(connection.getInputStream());
		  scanner.useDelimiter("\\Z");
		  content = scanner.next();
		  scanner.close();
		}catch ( Exception ex ) {
		    ex.printStackTrace();
		}
		System.out.println(content);
	}
	public static void main(String[] args) {
		name();
	}
}
