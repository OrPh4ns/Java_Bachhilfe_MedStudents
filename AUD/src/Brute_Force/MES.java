package Brute_Force;

public class MES {

	
	public static int MES(int[] a,int n) {
		if(n==1) return a[1];
		else {
			System.out.println(a[n]);
			return max(MES(a,n-1)+a[n],a[n]);
		}
	}
	public static int MTS(int[] a,int n) {
		if(n==1) return a[1];
		else {
			return max(MES(a,n),MTS(a,n-1));
		}
	}
	public static int max(int x , int y) {
		return x>y?x:y;
	}
	public static void main(String[] args) {
		int[] a = {10,800,110,-1950,10,450,-100,450,450,-150};
		System.out.println(MTS(a,5));
	}

}
