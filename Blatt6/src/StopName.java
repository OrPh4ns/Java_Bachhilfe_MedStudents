
public class StopName extends Thread{

		boolean stopped = false;
		Person p;
		public StopName(Person p) {
			this.p = p;
			start();
		}
		



		
		public static void main(String[] args) {
			Person s = new Person("Sarah");
			s.start();
			try {
				
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			s.interrupt();
			//s.stopThread();
			//
			
			System.out.println("Ich wurde beendet");
		}
	}


