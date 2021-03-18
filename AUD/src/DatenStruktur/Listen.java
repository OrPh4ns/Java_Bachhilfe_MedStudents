package DatenStruktur;

import java.util.Arrays;

public class Listen {
	public static int[] insert(int y, int i) {
		int[] a = {12,55,99,22};
		int[] arr = new int[a.length+1];
		for(int x = 0 ; x < arr.length;x++) {
			if(x==i) {
				arr[x] = y;
			}else if(x<i){
				arr[x] = a[x];
			}else {
				arr[x] = a[x-1];
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(insert(565, 2)));
	}

}
