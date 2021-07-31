import java.util.Scanner;
import java.util.ArrayList;

public class filter {

    public static void main(String[] args) {


        ArrayList<String> newText = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        try{
            while(sc.hasNextLine()){
                newText.add(sc.nextLine());
            }

        }catch(Exception e){
            e.getMessage();
        }

        System.out.println(newText.get(0));
        System.out.println(newText.get(2));

      

}

}
