
import java.io.FileWriter;

public class w_and_r {

    public static void main(String[] args) {

        try {
            FileWriter w = new FileWriter("C:\\Users\\Abdulx\\Desktop\\file\\test.txt");
            w.write("Hello");
            System.out.println("File Created ..!");
        }
        catch (Exception e){
            System.err.println("Can't make this file ..!");
            System.out.println(e);
        }

    }
}
