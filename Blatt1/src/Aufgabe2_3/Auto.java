package Aufgabe2_3;

public class Auto extends Fahrzeig {

	public Auto(String baujahr, String farbe, int leisung, int gewicht) {
		super(baujahr, farbe, leisung, gewicht);

	}

	private int volumen;

	public void setVolumen(int v) {
		this.volumen = v;
	}
	
	public void auftanken() {
		System.out.println("Auto ist "+this.volumen+" Liter gektankt");
	}
	public void fahren(int speed) {
	if(speed > 150) {
		System.out.println("Please drive only 145");
	}else {
		System.out.println("Speed is : "+speed);
	}
	}
	public void stoppen() {
		System.out.println("Car stopped");
	}
	public void hupen() {
		System.out.println("Peeeeeeep peeeep  ..");
	}
	
}
