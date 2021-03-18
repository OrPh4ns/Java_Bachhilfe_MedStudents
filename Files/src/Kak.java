import java.io.File;

public class Kak {

	public static void main(String[] args) {
		 try {
			
	            
	            File f = new File("C:\\\\Users\\\\Abdulx\\\\Desktop\\\\file\\\\test.txt");
	  
	       
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