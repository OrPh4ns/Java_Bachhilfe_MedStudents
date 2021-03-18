package UnterKlassen;

import java.io.File;

public class ooo{
	public static void main(String[] args) {
		 try {
			
	            
	            File f = new File("C:\\Users\\49178\\Desktop\\file\\text.txt");
	  
	       
	            if (f.createNewFile())
	                System.out.println("File created");
	            else
	                System.out.println("File already exists");
	        }
	        catch (Exception e) {
	            System.err.println(e);
	        }
	}
}




