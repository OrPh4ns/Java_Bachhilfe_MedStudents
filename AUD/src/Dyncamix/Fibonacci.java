package Dyncamix;

import java.util.Arrays;

public class Fibonacci {

	public static int fib_rek(int n) {
		//System.out.println(n);
		if(n<=2) return 1;
		else {
			return fib_rek(n-1)+fib_rek(n-2);
		}
	}
	public static int fib_itv_ar(int n) {
		int[] a = new int[n];
		a[0] = 1;
		a[1] = 1;
		if(n>1) {
			for(int i = 2; i < n ; i++) {
				a[i] = a[i-1]+a[i-2];
			}
		}
		System.out.println(Arrays.toString(a));
		return a[n-1];
	}
	public static int fib_itv(int n) {
		int f1 = 1;
		int f2 = 1;
		for(int i = 2; i<n;i++) {
			int f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
		return f2;
	}
	public static void main(String[] args) {
		System.out.println(fib_rek(6));
		System.out.println(fib_itv_ar(6));
		System.out.println(fib_itv(6));
	}

}
