
import java.net.InetAddress;
import java.net.UnknownHostException;

public class get_ip {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress [] adds = InetAddress.getAllByName("www.facebook.com");
		for (int i = 0; i < adds.length; i++) {
			System.out.println(adds[i]);
			
		}
		
		InetAddress add1 = InetAddress.getByName("www.facebook.com");
		
		System.out.println(add1.getHostAddress());
		
		String site = "www.facebook.com";
		if(site.contains("com")) {
			site.replace("com", " ");
		}
			System.out.println(site);
		InetAddress ad = InetAddress.getByName(site);
		System.out.println(ad.getHostAddress());
		
	
		
	}

}

