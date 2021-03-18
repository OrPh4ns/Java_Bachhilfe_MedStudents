import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class getSource {

	
	public static void name() throws IOException {
		
		URL url = new URL("https://twitter.com/qwkvcx");
		URLConnection uc = url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
		String s = br.readLine();
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
		}
	}
	public static void main(String[] args) throws IOException {
		name();
	}
}
