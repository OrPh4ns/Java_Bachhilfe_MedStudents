package Aufgaben3;
import java.util.Scanner;

public class durchschnitt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Grosse des Arrays >> ");
        int size = sc.nextInt();
        double summ = 0;
        for(int i = 0; i< size;i++){
            System.out.print("Eingabe "+i+" >>");
            int x = sc.nextInt();
            summ += x;
        }
        System.out.println("Durchschnitt ist : "+summ/size);
    }
}
