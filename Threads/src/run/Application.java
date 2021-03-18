package run;

public class Application {

	public static void main(String[] args) {

		Sync s = new Sync();
		A a = new A(s);
		A b = new A(s);
		a.start();
		b.start();
	}

}
