package Linear;

public class CountingSort {

	public static int max(int[] a) {
		int max = a[0];
		for(int i = 0 ; i < a.length-1;i++) {
			if(a[i]>max) {
				max=i;
			}
		}
		return max;
	}
	public static int[] CountingSort(int[] a) {
		int m = max(a);
		int[] neu = new int[m];
		for(int j = 0 ; j < m;j++) {
			neu[j] = 0;
		}
		for(int i = 0 ; i<5;i++) {
			int j=a[i];
			neu[j]=neu[j+1];
		}int i=1;
		for(int j= 0;j<m;j++) {
			if(neu[j]>0) {
				for(int k = 1;k<neu[j];k++) {
					a[i] = j;
					i=i+1;
				}
			}
		}
				return a;
	}
	public static void main(String[] args) {
		int[] a = {3,2,6,9,1};
		System.out.println(CountingSort(a));
	}

}
