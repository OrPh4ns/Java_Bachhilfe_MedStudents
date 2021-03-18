package Aufgaben7;
import java.io.FileWriter;
import java.io.IOException;

public class TodException extends Exception {
    public TodException(String str,int puls) throws IOException {
        FileWriter f = new FileWriter("C:\\Users\\Abdulx\\Desktop\\file\\test.txt",true);

        f.write("Name : "+str+" ][ Puls : "+puls+"\n");
        f.close();
        System.out.println("Der Patient ist Tod");
    }


}
