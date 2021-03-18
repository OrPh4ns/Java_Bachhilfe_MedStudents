package Klassen;

public class Person {
	private String name;
	private String fname;
	private int age;
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void kocheEssen() {
		System.out.println("Es wird gekocht ..!");
	}

}
