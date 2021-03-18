package exam;

public class faktorsierte {

	public static boolean faktor(int n) {
		for(int i = 2;i<n;i++) {
			if(teilt(n,i) && prim(n)) return false;	
			}
		return true;
	}
	public static boolean prim(int n) {
		return n==2;
	
	}
	public static boolean teilt(int n,int i) {
		return n%i==0;
	}
	public static void main(String[] args) {
		System.out.println(faktor(5));
	}

}
