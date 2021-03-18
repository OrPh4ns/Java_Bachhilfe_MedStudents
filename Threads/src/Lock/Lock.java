package Lock;

public class Lock {

	public static void main(String[] args) {
		
		String passenger1 = "Pick Passenger 1";
		String passenger2 = "Pick Passenger 2";
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (passenger1) {
					System.out.println("Thread 1 : Locked passenger 1");
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("Thread 1 : wating to get Passenger 2");
					synchronized (passenger2) {
						
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (passenger2) {
					System.out.println("Thread 2 : Locked passenger 2");
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("Thread 2 : wating to get Passenger 1");
					synchronized (passenger2) {
						
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
