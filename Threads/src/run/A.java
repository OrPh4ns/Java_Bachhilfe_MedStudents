package run;

public class A extends Sync{

	Sync s;
	public A(Sync s) {
		this.s = s;
	}
	
	public void run() {
		s.start();
	}
	
	

	
}
