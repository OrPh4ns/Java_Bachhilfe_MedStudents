package Clone;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {


		Person a = new Person("Ali");
		Person b = (Person) a.cloneObject();
		
		
	}

}
