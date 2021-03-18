
public class Sort_oneloop {

	public static boolean issorted(int[] a) {
		  for (int i = 0; i < a.length - 1; i++) {
		        if (a[i] > a[i + 1]) {
		            return false; 
		        }
		    }
	return true;
	}
	public static void main(String[] args) {
		int[] a = {1,40,41};
		System.out.println(issorted(a));
	}

}
