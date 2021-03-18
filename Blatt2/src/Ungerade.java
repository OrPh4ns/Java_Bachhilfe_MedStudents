
public class Ungerade extends Thread{
	 String isDran;
	

	public void run() {
		this.isDran = Thread.currentThread().getName();
		for(int i = 0 ; i <= 100 ; i++) {
			if(i%2!=0) {
				System.out.println(this.isDran+" ][ "+i);
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

}
