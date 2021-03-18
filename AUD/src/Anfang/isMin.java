package Anfang;

public class isMin {

	public static boolean isMin(int[] a, int x) {
	for(int i = 0 ; i < a.length;i++) {
		if(x>a[i]) return false;
	
	}
	
	return true;
}
	
	public static void main(String[] args) {
		int[] a = {3,2,7,9,5,4,2};
		System.out.println(isMin(a, 3));
	}
}
