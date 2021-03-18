import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Abdulx\\Desktop\\file\\test.txt";

        int ch;
        try{
            FileReader read = new FileReader(path);
            while ((ch=read.read()) != -1){
                System.out.print((char)ch);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
