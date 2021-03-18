import java.util.Arrays;

public class Bubble {

	public static int[] bubble(int[]a) {
		for(int i = 0 ; i < a.length-1;i++) {
			for(int j = 0 ; j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {2,5,3,1};
		System.out.println(Arrays.toString(bubble(a)));
	}

}
