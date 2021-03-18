package Klassen;

public class Outer {
	int x;
	 public class Inner {
		 
		public void print() {
			System.out.println("Ich bin Unterklasse");
		}
	}
	  static class statische{
		 void print() {
			 System.out.println("Ich bin statische Klasse bzw memberklasse");
		 }
	 }
	 public void local() {
		 class local{
			 void print() {
				 System.out.println("Ich bin eine Lokale Klasse in Methoden");
			 }
		 }
		 local l = new local();
		 l.print();
	 }

}
