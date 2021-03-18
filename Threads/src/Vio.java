
public class Vio {
	volatile int i = 0;
	
	public synchronized void add() throws InterruptedException {
		Thread.sleep(10);
		i++;
	}
	public synchronized void rem() throws InterruptedException{
		Thread.sleep(10);
		i--;
	}
	public synchronized int geti() {
		return i;
	}
	
	
	
	

}
