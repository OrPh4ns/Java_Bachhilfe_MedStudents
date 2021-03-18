import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class Checker {

	public static void main(String[] args) throws UnknownHostException {

		
		try {
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("51.158.180.150", 8811));
			URL url = new URL("http://www.yahoo.com");
			HttpURLConnection uc = (HttpURLConnection)url.openConnection(proxy);
			uc.connect();
			System.out.println("Yes");
		} catch (Exception e) {
			System.out.println("No");
		}
	}
	
}


