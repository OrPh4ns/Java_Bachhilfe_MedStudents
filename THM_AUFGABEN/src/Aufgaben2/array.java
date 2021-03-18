package Aufgaben2;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		int[] aa = new int[100];
		for(int i = 0; i < 100;i++) {
			aa[i] = 1+i;
		}
		System.out.println(Arrays.toString(aa));
		
		
		int[] a = {1, 2}; 
		int[] b = {1, 2};
		boolean val = true;
		if(a.length!=b.length) val = false;
		for(int i = 0 ; i < a.length;i++) {
			if ( a[i] != b[i] ){ 
				val  = false;
				}
		}
		System.out.println(val);
	}

}
