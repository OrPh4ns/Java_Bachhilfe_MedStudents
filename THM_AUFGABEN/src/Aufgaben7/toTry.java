package Aufgaben7;
import java.util.Scanner;

public class toTry {

    public static void eingabe(){

        boolean b = true;


        while (b){
            try {


                System.out.print("Enter >> ");
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                sc.close();
                b = false;
                System.out.println(i+" : Saved");
            } catch (Exception e){

                System.out.println(e.getLocalizedMessage());
                System.out.println("Falsche eingabe");




            }
    }}

    public static void main(String[] args) {
        eingabe();
    }
}
