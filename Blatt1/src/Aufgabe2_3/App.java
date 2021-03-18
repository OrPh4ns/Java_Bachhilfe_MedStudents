package Aufgabe2_3;

public class App {

	public static void main(String[] args) {

		Motorad m1 = new Motorad("1994", "red", 40, 3);
		Auto a1 = new Auto("1993", "Miau", 600, 3);
		m1.auftankne(4);
		
		a1.setVolumen(5);
		a1.auftanken();
		a1.fahren(100);
	}

}
