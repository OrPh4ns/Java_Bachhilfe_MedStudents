import java.io.FileWriter;
import java.io.IOException;

public class append {

    public static void append(String str, String path) throws IOException {
        try{
            FileWriter file = new FileWriter(path, true);
            file.write(str);
            file.close();
            System.out.println("Done ..");
        }catch (Exception e){
            System.out.println("Cant do it");
        }
    }


    public static void main(String[] args) throws IOException {
        String str = "Ali"+"\n";
        String path = "C:\\Users\\Abdulx\\Desktop\\file\\testl.txt";
        append(str,path);
    }
}
