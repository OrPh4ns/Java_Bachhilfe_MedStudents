package UnterKlassen;


public class Outer {
	
	static int s_Outer;
	public Outer(int s) {
		this.s_Outer = s;
	}
	public static class Static_Inner{
		int s_inner = 1;
		private void sout() {
		System.out.print(s_Outer);

		}

		}
	
	
	
	public static void main(String[] args) {
		Outer.Static_Inner a = new Static_Inner();
		Outer outer = new Outer(6);
		System.out.println(a.s_inner);
		System.out.println(outer.s_Outer);
	}

}
