package InstanseOf;

public class C {

	public void Check_Class(Object o) {
		if(o instanceof A) {
			System.out.println("C from A");
		}else if(o instanceof B){
			System.out.println("C from B");
		}
		else {
			System.out.println("Unkown");
		}
	}
}
