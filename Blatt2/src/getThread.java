
public class getThread {
	public static void main(String[] args) throws InterruptedException {
		Person  karl = new Person("Karl");
		Person mia = new Person("Mia Khalifa");
		
		karl.start();
		karl.join();
		mia.start();

	}
}
