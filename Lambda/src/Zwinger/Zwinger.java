package Zwinger;

public class Zwinger <T>{
	private T x;
	public void SperrEin(T x) {
		this.x = x;
		System.out.println(this.x.getClass().getSimpleName()+" ist eingesparrt");
	}
	
	

}
