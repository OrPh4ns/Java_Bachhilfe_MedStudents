package Local_methode_innter;

public class Outer {

	int num = 20;
	public void print() {
		class Inner {
			public void display() {
				System.out.println("Number is >> "+num);
			}
		}
		Inner in = new Inner();
		in.display();
	}
}
