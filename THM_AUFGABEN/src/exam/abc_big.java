package exam;

public class abc_big {

	public static int max(int a, int b , int c) {
		if(a>b) if(a>c) return a;
		if(b>a) if(b>c) return b;
		
		return c;
	}
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 3;
		System.out.println(max(a,b,c));
	}

}
