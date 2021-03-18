package Student;

public abstract class Student {

	String name;
	String vorname;
	int alter;
	public Student(String name, String vn , int alter) {
		this.name = name;
		this.vorname = vn;
		this.alter = alter;
	}
	
	public String toString() {
		return this.name+" || "+this.vorname+ " || "+this.alter;
	}

}
