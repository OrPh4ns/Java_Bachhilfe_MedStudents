package Thread;

public class App {

	public static void main(String[] args) {

		Runnable rx = new Runnable() {
			public void run() {
				int i = 0;
				while(i<20) {
					System.out.println("Without Lambda xXx ");
					i++;
				}
			}
		
	};
	
	Runnable r = ()-> {
		int i = 0;
		while(i<20) {
			System.out.println("With Lambda <<>> ");
			i++;
		}
	};
	
	Thread t = new Thread(rx);
	Thread tt = new Thread(r);
	t.start();
	tt.start();
	

}
	}