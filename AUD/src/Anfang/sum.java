package Anfang;

public class sum {

	public static boolean is(int[] a) {
		int x = 0;
		for(int i = 1 ; i <a.length ;i++) {
			System.out.println(x+" "+a[i]);
			
			
			if(x>a[i]) {
				return false;
			}else{
				x+=a[i];
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		int[] a = {2,4,7,1};
		System.out.println(is(a));

	}

}
