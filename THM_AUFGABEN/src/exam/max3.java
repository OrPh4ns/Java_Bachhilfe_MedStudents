package exam;

public class max3 {

	public static int max(int a, int b, int c) {
		if(a>b) if(a>c) return a;
		if(b>a) if(b>c) return b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println(max(2,1,8));
	}

}
