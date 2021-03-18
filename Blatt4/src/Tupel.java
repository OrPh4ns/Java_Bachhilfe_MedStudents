

public class Tupel <T>{

	public T one;
	public T two;
	
	public T getT1() {
		return this.one;
	}
	
	public T getT2() {
		return this.two;
	}
	
	public static void main(String[] args) {
		Tupel t = new Tupel<Integer>();
		t.one = 5;
		System.out.println(t.one);
	}
}
