import java.io.FileReader;
import java.io.FileWriter;

public class fi_baghdad {

    public static void main(String[] args) {

        FileWriter fi = null;

        int r = 1;
        if(r==2){
            try {
                fi = new FileWriter("C:\\Users\\Abdulx\\Desktop\\file\\test.txt");

                for(int i = 0 ; i  < 20 ; i++){
                    fi.write("Hello \n");
                }
                fi.close();
                System.out.println("Done ../");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else if(r==1)
        {
            FileReader re = null;
            try {
                re = new FileReader("C:\\Users\\Abdulx\\Desktop\\file\\test.tx");
                int ro;
                while((ro = re.read()) != -1){
                    System.out.print((char) ro);
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
