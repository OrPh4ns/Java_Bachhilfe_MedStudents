
public class schnellauswahl {

	public static int[] algo9(int[] a,int k) {
		
		int m = part(a);
		return a;
	}
	
	public static int part(int[] a) {
		int piv = a[a.length-1];
		int m = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<piv) {
				int t = a[i];
				a[i] = a[m];
				a[m] = t;
				m++;
			}
			int tmp = a[m];
			a[m] = a[a.length-1];
			a[a.length-1] = tmp;
		}
		return m;
	}
	
	public static void main(String[] args) {
		int[] a = {3,1,4,7,9,8};
		System.out.println(part(a));
	}
}
