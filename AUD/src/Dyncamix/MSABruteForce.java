package Dyncamix;

public class MSABruteForce {

	public static int MSABruteForce(int[] a) {
		int maxsum = a[0];
		for(int l = 0; l<a.length;l++) {
			for(int r = l; r<a.length;r++) {
				int sum = 0;
				for(int i = l ; i<a.length;i++) {
					sum+= a[i];
				}
				if(sum>maxsum) maxsum=sum;
			}
		}
		return maxsum;
	}
	public static void main(String[] args) {
		int[] a = {10,800,110,-1950,10,450,-100,450,450,-150};
		System.out.println(MSABruteForce(a));
	}

}
