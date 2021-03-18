package Patient;

public class Patient {

	private String fname;
	private String lname;
	private int age;
	public Patient(String f, String l, int a) {
		this.fname = f;
		this.lname = l;
		this.age = a;
		
	}
	public int getAge() {
		return this.age;
	}
	public String toString() {
		return "Firstname >> "+this.fname+" || Lastname >> "+this.lname+" || Age >> "+this.age;
	}
}
