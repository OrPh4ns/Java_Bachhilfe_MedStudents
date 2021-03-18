package Aufgaben3;
import java.util.Scanner;

public class Digit_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eingabe >> ");
        int anfang = sc.nextInt();
        int end = anfang+10;
        for(int i = anfang; i<end;i++){
            System.out.print(i+"\t");
        }
    }
}
