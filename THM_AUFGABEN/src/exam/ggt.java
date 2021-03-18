package exam;

public class ggt {

	public static int ggt_itv(int a, int b) {
		while(a!=b) {
			if(a>b) a-=b;
			else b-=a;
		}
		return a;
	}
	public static int ggt_rek(int a, int b) {
		if(a==b) return a;
		if(a>b) return ggt_rek(a-b, b);
		else return ggt_rek(a,b-1);
		
	}
	public static void main(String[] args) {
		System.out.println(ggt_itv(15, 10));
		System.out.println(ggt_rek(15,3));
		String s = new String("Hello");
		System.out.println(s);
	}

}
