import java.util.Arrays;

public class Selectsort_aud {

	
	public static int[] Selectsort(int[] a) {
		for(int i = 0 ; i<a.length-1;i++) {
		int min = i;
		for(int j = i+1;j<a.length;j++) {
			if(a[j]<a[min]) {
				min=j;
			}
		}
		int temp =a[min];
		a[min] = a[i];
		a[i] = temp;

		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = {2,5,3,1};
		System.out.println(Arrays.toString(Selectsort(a)));
	}

}
