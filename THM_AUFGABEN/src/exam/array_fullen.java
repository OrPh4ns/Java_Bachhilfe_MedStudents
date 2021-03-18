package exam;

import java.util.Arrays;

public class array_fullen {

	public static void main(String[] args) {

		int[] a = new int[10];
		for(int i = 0; i<=a.length-1;i++) {
			a[i] = i+1;
		}
		
		int[][] m = {
				{1,5,1},
				{8,7,9},
				{3,4,6}
		};
		for(int i = 0;i<m.length;i++) {
			for(int j = 0 ; j<m.length;j++) {
				if(m[i][j]==1) m[i][j] = 0;
			}
		}
		for(int i = 0 ; i < m.length;i++) {
			for(int j = 0 ; j< m .length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		//// befullen
		int x = 4;
		int g = 10;
		for(int i = 0 ;i<g;i++) {
			System.out.print(x++ +" ");
		}
	}

}
