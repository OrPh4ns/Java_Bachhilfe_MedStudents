package Synchronized;

public class Sync {
	
	public synchronized void print()  {
	
		try {
			for(int i = 0; i <=10;i++) {
				System.out.println(i+ " ][ "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
