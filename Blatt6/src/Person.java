
public class Person extends Thread{
	String name;
	public Person(String name) {
		this.name = name;
	}
	public void run() {
		int i = 0;
		while(!isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println(i+" ][ Hallo ich bin "+this.name+" "+Thread.currentThread().getName());
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
