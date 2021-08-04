import java.util.Scanner;
import java.util.ArrayList;

public class filter {

    public static void main(String[] args) {


        ArrayList<String> newText = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        String oo = sc.nextLine();
        System.out.println(oo);
        String requiredString = s.substring(s.indexOf('"'+"text"+'"'+": "+'"') + 1, s.indexOf('"'+'}'));
        System.out.println(requiredString);
        
        try{
            while(sc.hasNextLine()){
                s = sc.nextLine().substring(s.indexOf("") + 1);
                s = s.substring(0, s.indexOf(")"));
                newText.add(sc.nextLine());
            }
        }catch(Exception e){
            e.getMessage();
        }

        System.out.println(newText.get(0));
        System.out.println(newText.get(2));

      

}

}
