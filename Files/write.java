import java.io.FileWriter;
public class write {

    public static void main(String[] args) {
        FileWriter w;
        int ch;
        try {
            String path = "C:\\Users\\Abdulx\\Desktop\\file\\a1.txt";
            w = new FileWriter(path);

            for(int i = 0 ; i < 10; i++){
                w.write(i);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
