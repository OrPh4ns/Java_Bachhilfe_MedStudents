
import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args) throws IOException {
        FileReader r = null;
        int ch;

            r= new FileReader("C:\\Users\\Abdulx\\Desktop\\file\\test.txt");
    
        while ((ch=r.read())!=-1)
            System.out.print((char)ch);
    }
}
