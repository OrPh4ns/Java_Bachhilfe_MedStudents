import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Contain {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Abdulx\\Desktop\\file\\insta.txt";
		String over = "C:\\Users\\Abdulx\\Desktop\\file\\insta_new.txt";
		Scanner sc = new Scanner(new File(path));
    	FileWriter f = new FileWriter(over);
		try {
    		
    		 while(sc.hasNextLine()) {
				String user = sc.nextLine();
		    	//System.out.println(user.contains("__deleted__bhiebebbfjheagjgi"));
		    	if(user.contains("__deleted__bhiebebbfjheagjgi")) {
		    		
		    		f.append(user+"\n");
		    		Thread.sleep(500);
		    	}
		    	
		    	else {
		    		//System.out.println("No");
		    	}

}
}catch (Exception e) {
	System.out.println(e.getMessage());
}
    	}
	}