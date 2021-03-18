package Aufgabe2_3;

public class Motorad extends Fahrzeig{
public Motorad(String baujahr, String farbe, int leisung, int gewicht) {
		super(baujahr, farbe, leisung, gewicht);
	}

public void auftankne(int liter) {
	System.out.println("Motorad is : "+liter+" Liter gekant");
}
public void fahren(int fahren) {
	System.out.println("Das Motorad Fahrt mit Geschwindigkeit : "+fahren);
}
public void stoppen() {
	System.out.println("MOTORAD Stopp please!!");
}
public void hupen() {
	System.out.println("Pip!");
}
private int helmfach;






}
