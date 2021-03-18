package Aufgaben7;
import java.util.Random;

public class Wurfel {
    int augenzahl;

    public Wurfel(){
        Random a = new Random();
        augenzahl = a.nextInt(6)+1;
    }
}
