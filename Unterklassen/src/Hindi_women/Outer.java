package Hindi_women;

public class Outer {

	 private class Inner{
		public void print() {
			System.out.println("I'm Inner class ..!");
		}

	}
		public void show_inner() {
			Inner inner = new Inner();
			inner.print();
		}
		public void show_outer() {
			System.out.println("i'n Outer class ..");
		}
}
