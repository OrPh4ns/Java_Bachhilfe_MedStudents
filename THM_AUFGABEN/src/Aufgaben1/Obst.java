package Aufgaben1;
public class Obst {

    public static void main(String[] args) {



    // deklariere eine Variable "kirschen" vom Typ int/
        // weise ihr den Wert zwei zu

        int kirschen = 2;
        System.out.println("2 erwartet: " + kirschen);
        kirschen+=6;
        // addiere sechs zu dem Wert
        System.out.println("8 erwartet: " + kirschen);
        // deklariere eine Variable "aepfel" vom Typ int und weise ihr
        int aepfel = 4;
        // den Wert vier zu
        System.out.println("4 erwartet: " + aepfel);
        // subtrahiere zwei von dem Wert
        aepfel -= 2;
        System.out.println("2 erwartet: " + aepfel);
        // deklariere eine Variable „fruechte“ vom Typ int und weise ihr
        // die Werte der kirschen und aepfel zu
        int fruechte = aepfel + kirschen;
        System.out.println("10 erwartet: " + fruechte);
}


          }