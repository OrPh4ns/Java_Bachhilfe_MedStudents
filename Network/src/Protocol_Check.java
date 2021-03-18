import java.net.MalformedURLException;
import java.net.URL;

public class Protocol_Check {

	public static void main(String[] args) throws InterruptedException {

		String website = "www.youtube.com";
    	String file = "file.html";
    	String[] regex = {"http","https","ftp","mailto","talent","file","nfs","stmp"};
    	
    	for(int i = 0 ; i < regex.length;i++) {
    		Thread.sleep(2000);
    		try {
				URL u = new URL(regex[i],website,file);
				
				System.out.println("Yes : "+regex[i]);
				
			} catch (MalformedURLException e) {
				System.out.println("No"+regex[i]+"   "+ e);
				
				
			}
    	}
		
	}

}
