package InstanseOf;

public class U {

	A a;
	B b;

	public void upCasting(Object o) {
		if(o instanceof A) {
			a = (A)o;
		}else if(o instanceof B) {
			 b = (B) o;
		}
	}
	public void printAll() {
		System.out.println(this.a.getClass().getName());
		System.out.println(this.b.getClass().getName());
	}
}
