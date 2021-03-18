package Linear;

import java.util.Arrays;

public class CountingSort1 {

	public static int max(int[] a) {
		int max = a[0];
		for(int i = 0 ; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	public static int[] Counting1(int[] a) {
	
		int[] count = new int[max(a)+1];
		for(int i = 0 ; i < a.length; i ++) {
			count[a[i]]++;
		}
		
		for(int x = 0; x< a.length; x++) {
			
		}
		
		return count;
	}
	public static void main(String[] args) {
		int[] a = {0,3,2,3,3,0,5,2,3};
		System.out.println(max(a));
		System.out.println(Arrays.toString(Counting1(a)));
	}

}
