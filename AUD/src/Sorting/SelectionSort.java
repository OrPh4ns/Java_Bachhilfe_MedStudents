package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static int argmin(int[] a) {
		int m = a[0];
		for(int i = 0 ; i < a.length;i++) {
			if(a[i]<m) {
				m = i;
			}
		}
		return m;
	}
	public static int[] SelectionSort(int[] a) {
		for(int i = 0 ; i < a.length;i++) {
			int m = argmin(a);
			int t = a[i];
			a[i] = a[m];
			a[m] = t;
			
		}
		return a;
	}
	
	public static int xx(int x) {
		
		if(x==0) return 0;
		if(x>0) {
			System.out.println(x);
			return xx(x-1);
		}
		return xx(x-1);
	}
	public static boolean xx(int[] a) {
		if(a.length==1) return true; 
				
		System.out.println("Hello Leute");	
				return false;
	}
	public static void main(String[] args) {
		int[] a = {4,5,2,9,1};
		int[] x = {3};
		//System.out.println(argmin(a));
		System.out.println(xx(5));
		//System.out.println(Arrays.toString(SelectionSort(a)));

	}

}
