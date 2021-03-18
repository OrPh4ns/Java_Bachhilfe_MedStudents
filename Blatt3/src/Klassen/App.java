package Klassen;

import Klassen.Outer.Inner;

public class App {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.local();
		Outer.statische obj = new Outer.statische();
		obj.print();
		//Outer.Inner inner = inner.new Inner();
	}

}
