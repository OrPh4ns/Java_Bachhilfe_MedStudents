package Anfang;

public class algo6 {

	public static int algo6(int n) {
		int num = 1;
		while(n>1) {
			if(n%2!=0) {
				num *= 2;
				n-=1;
			}else {
				num *= n;
				n/=2;
			}
		}
		return num;
	}
	
	public static boolean issorted(int[] a) {

		for(int i = 0;i<a.length-1;i++) {
			
		if(a[i]>a[i+1]) {
		
			return false;
		}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(algo6(7));
		int[] a = {1,4,7,9};
		System.out.println(issorted(a));
	}

}
