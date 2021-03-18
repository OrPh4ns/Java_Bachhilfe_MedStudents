package Sync;

public  class Sync extends Thread{

	 public  void run() {

		
		synchronized (this) {
			int i = 0;
			while(i<10) {
	
			System.out.println(Thread.currentThread().getName()+" ][ " + i);
			i++;
		}	}
	}
}
