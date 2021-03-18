package Obaide;

public class Application {

	public static void main(String[] args) {
		myRunable m = new myRunable();
		m.run();
		Runnable myRun1 =()->{
			System.out.println("Welcome with Lambda");
		};
		myRun1.run();
	}

}
