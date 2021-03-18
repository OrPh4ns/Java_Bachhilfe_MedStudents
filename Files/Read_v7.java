import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Read_v7 {
    public static void main(String[] args) throws IOException {
        try {

            Path p = Paths.get("C:\\Users\\Abdulx\\Desktop\\file\\test.txt");
            Scanner sc = new Scanner(p);

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (Exception e){
            System.out.println("File does not excist ..! ");
        }

    }
}
