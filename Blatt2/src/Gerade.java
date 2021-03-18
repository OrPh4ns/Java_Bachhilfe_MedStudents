
public class Gerade extends Thread{
	volatile String isDran;
	

	public void run() {
		this.isDran = Thread.currentThread().getName();
		for(int i = 0 ; i <= 100 ; i++) {
			if(i%2==0) {
				System.out.println(this.isDran+" ][ "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
