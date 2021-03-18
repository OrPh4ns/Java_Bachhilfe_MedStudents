package run.copy;

public class B {

	
	public void run() {
		
		
			try {
				
				for (int i = 0; i < 10; i++) {
					System.out.println("A "+Thread.currentThread().getName()+" ][ "+ i);
					Thread.sleep(1000);
					
				}
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
		
	}
}
