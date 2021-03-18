package Aufgaben3;
public class Dollareuro {
    public static void main(String[] args) {
        double wechselkurs = 0.7238;
        // USD -> EUR
        double[] dollarwerte = { 0.0, 1.0, 2.0, 3.0, 4.0, 5.0 };
        //Array 1   //initialisieren
        double[] eurowerte = new double[dollarwerte.length];

        // Array 2 mit gleicher Größe
        for(int i = 0; i < dollarwerte.length; i++) {
            eurowerte[i] = dollarwerte[i] * wechselkurs;
            System.out.println("Eurowert ][ "+eurowerte[i]+" ][ Dollarwt ][ "+dollarwerte[i]);

            // Eurowerte                                                                //berechnenSystem.out.println(dollarwerte[i] + "$ sind " + eurowerte[i] + "€."); // Ergebnisse ausgeben}
    }
}}
