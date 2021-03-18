package Aufgaben2;
import java.util.Scanner;
public class Patienten {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bo = false;
        int fall = 0;
        String vorname = "";
        String name = "";
        int alter = 0;
        String geschlecht = "";
        while(bo==false){

            System.out.println("1 - Einen Patienten eingeben");
            System.out.println("2 - Zuletzt eingegebenen Patienten ausgeben");
            System.out.println("3 - Aktuelle Fallzahl ausgeben");
            System.out.println("4 - Alle vorhandenen Informationen ausgeben");
            System.out.println("5 - Programm beenden");
            System.out.print("Eingabe von 1 bis 5 >> ");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    fall++;
                    System.out.print("Name >> ");
                    name = sc.next();
                    System.out.print("Vorname >> ");
                    vorname = sc.next();
                    System.out.print("Geschlecht >> ");
                    geschlecht = sc.next();
                    System.out.print("Alter >> ");
                    alter = sc.nextInt();
                    break;
                case 2:
                    System.out.println(vorname+"\n"+name+"\n"+alter+"\n"+geschlecht);
                    break;
                case 3:
                    System.out.println("Wir haben "+fall+" Patienten ..");
                    break;
                case 4:
                    System.out.println("Fall : "+fall);
                    System.out.println(vorname+"\n"+name+"\n"+alter+"\n"+geschlecht);
                    break;
                case 5:
                    System.out.println("Aufwiedersehen ^_^ ..!");
                    bo = true;
                    break;
                default:
                    System.out.println("Eingabe ist Falsch .. Aufwiedersehen ..");
                    bo = true;
            }

        }
    }
}
