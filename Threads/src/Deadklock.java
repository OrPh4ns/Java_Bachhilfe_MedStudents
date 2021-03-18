
public class Deadklock {

	public static void main(String[] args) {
		
		final String a = "Abduk";
		final String b = "Mo";
		Thread a1 = new Thread() {
			public void run() {
				synchronized (a) {
					for(int i = 0 ; i < 10;i++) {
						System.out.println("Locked : "+a);
					}
				}
			}
		};
		Thread b1 = new Thread() {
			public void run() {
				synchronized (b) {
					for(int i = 0 ; i < 10;i++) {
						System.out.println("Locked : "+b);
					}
				}
			}	
		};
		
		a1.start();
		b1.start();
	}
}
