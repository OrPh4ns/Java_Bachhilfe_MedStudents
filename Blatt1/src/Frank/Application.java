package Frank;

public class Application {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		
		Person p1 = new Student();
		
		p = (Student) p;
	}

}
