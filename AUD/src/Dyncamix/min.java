package Dyncamix;

public class min {



	public static int min_itv(int[] a) {
		int min = a[0];
		for(int i = 0 ; i < a.length; i ++) {
			if(min>a[i]) min=a[i];
		}
		return min;
	}
	public static int min_rek(int[] a, int n) {
		int m = a[0];

		if(n==a.length-1) return m;
		if(m>a[n]) {
			return m=a[n];
		}else {
			return min_rek(a,n+1);
		}

	}
	public static void main(String[] args) {

		int[] a = {4,2,7,9,3};
		//System.out.println(min_itv(a));
		System.out.println(min_rek(a, 0));
	}

}
