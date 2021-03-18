package run;

public class B extends Sync{

	Sync s;
	public B(Sync s) {
		this.s = s;
	}
	
	public void run() {
		s.start();
	}

}
