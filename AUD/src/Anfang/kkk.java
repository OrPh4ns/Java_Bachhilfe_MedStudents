package Anfang;

import java.util.Arrays;

public class kkk {

	public static void enumm(int n,int k) {
		int[] arr = new int[n];
		enumRek(n-1,k,arr);
	}
	public static void enumRek(int n,int k , int[] b) {
		int[] a = b;
		if(n==0) {
			System.out.println(Arrays.toString(a));
		}else{
			if(k>0) {
				a[n] = 1;
				enumRek(n-1, k-1, a);
			}
			a[n] = 0;
			enumRek(n-1, k, a);
		}
		
	}
	public static void main(String[] args) {
		enumm(5,2);
	}

}
