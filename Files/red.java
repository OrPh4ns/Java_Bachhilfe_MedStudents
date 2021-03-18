import java.io.FileReader;

public class red {
    public static void main(String[] args) {
        FileReader read;

        try {
            int ch;
            String path = "C:\\Users\\Abdulx\\Desktop\\file\\test.txt";
            read = new FileReader(path);

            while ((ch = read.read()) != -1){
                System.out.print((char) ch);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
