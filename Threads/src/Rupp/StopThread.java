package Rupp;

public class StopThread extends Thread{

	boolean stopped = false;
	
	public StopThread() {
		start();
	}
	public synchronized void stopThread() {
		stopped = true;
	}
	public synchronized boolean isStopped() {
		return stopped;
	}
	public void run() {
		int i = 0;
		while(!isStopped()) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		StopThread s = new StopThread();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		//s.interrupt();
		s.stopThread();
	}
}
