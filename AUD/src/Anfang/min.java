package Anfang;

public class min {

	public static int min(int[] arr) {
		int min = arr[0];
		for(int i =0  ; i < arr.length;i++) {
			if(arr[i]>min) min = arr[i];
		}
		return min;
	}
	public static void main(String[] args) {
		
		int[] a = {3,2,9,0,3,1};
		System.out.println(min(a));

	}

}
