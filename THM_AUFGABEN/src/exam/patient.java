package exam;

public class patient {

	public static void dopp(int[] a) {
		int count = 0;
		for(int i = 0 ; i < a.length; i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					 System.out.println(a[i]);
						count++;
					
				}
			}
		}	System.out.println("Doppelte Zahlen >> "+count);
	}
	public static void zahl(String[] a,String s) {
		for(int i = 0 ; i <a.length; i++) {
			if(s.equals(a[i])) System.out.println(i+1);
		}
	}
	public static void main(String[] args) {
		int[] a = {100546,101433,100546,100211,100777,100777};
		String[] s = {"G01","B04","C56","J09","H63","J09","F00"};
		dopp(a);
		zahl(s,"J09");
	}

}
