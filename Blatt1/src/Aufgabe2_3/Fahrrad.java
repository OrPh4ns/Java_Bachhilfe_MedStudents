package Aufgabe2_3;

public class Fahrrad extends Fahrzeig{

	public Fahrrad(String baujahr, String farbe, int leisung, int gewicht) {
		super(baujahr, farbe, leisung, gewicht);
		
	}
	public void auftanken() {
		System.out.println("Entscholigun .. Fahrrad kann nicht aufgekant werden");
	}
	public void fahren(int speed) {
	if(speed > 40) {
		System.out.println("Please drive only 35");
	}else {
		System.out.println("Speed is : "+speed);
	}
	}
	public void stoppen() {
		System.out.println("Bike stopped");
	}
	public void hupen() {
		System.out.println("Trrrrrn trrrn ..");
	}
	

}
