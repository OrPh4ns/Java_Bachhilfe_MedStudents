package Anfang;

public class fiba {

	public static int fiba(int n) {
		System.out.println((n-1)+"-"+(n-2)+"="+n);
		if(n<=2) return 1;
		return fiba(n-1)-fiba(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fiba(3));
	}
}
