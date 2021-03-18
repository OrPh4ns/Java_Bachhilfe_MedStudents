package Blatt1;

public class algo1 {

	public static boolean algo1(int[]a , int x) {
		for(int i = 0 ; i < a.length-1;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(x==a[i]+a[j]) return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {2,4,6,8,3};
		System.out.println(algo1(a, 15));

	}

}
