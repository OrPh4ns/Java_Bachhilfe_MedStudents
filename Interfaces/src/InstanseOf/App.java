package InstanseOf;

public class App {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		c.Check_Class(b);
		U u = new U();
		u.upCasting(a);
		u.upCasting(b);
		u.printAll();
	}

}
