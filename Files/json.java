import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class json {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Abdulx\\Downloads\\5b5k_20200328_part_1\\messages.json";
        String path_w = "C:\\Users\\Abdulx\\Desktop\\file\\insta.txt";
        int ch;
        FileReader read = new FileReader(path);
        FileWriter w = new FileWriter(path_w,true);
        while ((ch = read.read()) != -1) {
            char alf = (char) ch;
            if(alf=='{'){
                w.write(alf+"\n");

                System.out.print(alf+"\n");
            }else{
                w.write(alf);

                System.out.print(alf);
            }

        }w.close();
    }
}