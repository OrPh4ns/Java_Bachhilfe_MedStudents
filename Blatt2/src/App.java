
public class App {
	
	public static void main(String[] args) throws InterruptedException {
		Gerade g = new Gerade();
		Ungerade u = new Ungerade();
		
		g.start();
		
		u.start();
	}
}
