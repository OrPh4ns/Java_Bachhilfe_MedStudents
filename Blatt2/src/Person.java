
public class Person extends Thread{
	String name;
	public Person(String name) {
		this.name = name;
	}
	public void run() {
		int i = 0;
		while(i<=10) {
			System.out.println("Hallo ich bin "+this.name+" "+Thread.currentThread().getName());
			i++;
		}
	}
}
