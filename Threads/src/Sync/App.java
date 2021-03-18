package Sync;

public class App {

	 public static void main(String[] args) throws InterruptedException {
		Sync s1 = new Sync();
		s1.start();
		Sync s2  = new Sync();
		s2.start();
	}

}
