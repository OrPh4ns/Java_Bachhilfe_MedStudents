
public class Zwinger<T>{
	
	T x;
	
	public void SperrEin(T x) {
		this.x = x;
		System.out.println(x.getClass().getName()+" Wird eingesprrt");
	}
	
	public static void main(String[] args) {
		Zwinger<Hund> was = new Zwinger<>();
		Hund bello = new Hund(); 
		was.SperrEin(bello);
	}
	

}
