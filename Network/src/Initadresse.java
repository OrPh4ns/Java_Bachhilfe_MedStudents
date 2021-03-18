import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Initadresse {

	public static void main(String[] args) throws UnknownHostException {
		
		Inet4Address ip = (Inet4Address) Inet4Address.getByName(null);
		String s = ip.getHostAddress();
		System.out.println(s);
	}

}
