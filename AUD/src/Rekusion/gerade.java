package Rekusion;

public class gerade {

	public static boolean gerade_rek(int n) {
		if(n==0) return true;
		if(n==1) return false;
		return gerade_rek(n-2);
	}
	public static boolean gerade_itv(int n) {
		int x = n;
		while(x>=0) {
			//System.out.println(x);
			if(x==0) return true;
			x-=2;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(gerade_rek(4));
		System.out.println(gerade_itv(8));
	}

}
