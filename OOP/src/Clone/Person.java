package Clone;

public class Person implements Cloneable{

	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Object cloneObject() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
}
