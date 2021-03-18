import java.util.Arrays;

public class Sort_normal {

	public static int[] sort(int[] a) {
		for(int i =0 ; i < a.length-1;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j]=t;
}	
			}
		}
		return a;
	}
	public static void main(String[] args) {
		
		int[] a = {7,2,5,6};
		System.out.println(Arrays.toString(sort(a)));
	}
	
}
