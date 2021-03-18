package Rupp;

public class RunnableThread implements Runnable{
	
	int n;
	 public RunnableThread(int n) {
		 this.n = n;
	}
	@Override
	public void run() {
		for(int i = 0 ; i<=this.n;i++) {
			System.out.println(Thread.currentThread().getName()+" || "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		RunnableThread r = new RunnableThread(200);
		RunnableThread r1 = new RunnableThread(200);
		Thread t = new Thread(r);
		Thread t1 = new Thread(r1);
		t.start();
		t.join();
		t1.start();
	}

}
