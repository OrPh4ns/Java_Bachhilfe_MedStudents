package Brute_Force;

public class Kadane {

	public static int kadane(int[] a) {
		int mts = a[0];
		int mes = a[0];
		for(int i = 1 ; i < a.length; i++) {
			mes = max(mes + a[i], a[i]);
			mts = max(mts, mes);
		}
		return mts;
	}
	
	public static int max(int x , int y) {
		return x>y?x:y;
	}
	public static void main(String[] args) {
		int[] a = {9,-1,0,5};
		System.out.println(kadane(a));
	}

}
