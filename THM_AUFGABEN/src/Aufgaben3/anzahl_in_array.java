package Aufgaben3;
import java.util.Scanner;

public class anzahl_in_array {

    public static void anzahl(String[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eingabe ICD >> ");
        String icd = sc.next();
        for(int i =0 ; i < arr.length;i++){
            if(icd.equals(arr[i])){
                System.out.println(icd+" steht in : "+(i+1));
            }
        }
    }
    public static void main(String[] args) {
        String[] icd = {"G01","B04","C56","J09","H63","J09","F00"};
        anzahl(icd);
    }
}
