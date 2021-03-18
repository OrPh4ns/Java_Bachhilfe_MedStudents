package Blatt1;

public class Abstand {

	public static boolean abstand(int[]a) {
		
		for(int i = 0; i < a.length-1;i++) {
			for(int j = i+1;j < a.length;j++) {
				if(a[i] - a[j] < 200 && a[i] - a[j]>= 0 || (a[j] - a[i] <200 && a[j]-a[i] >=0)) return false;
			}
		}
		return true;
	}
	
public static boolean ab(int[]a) {
		
		for(int i = 0; i < a.length-1;i++) {
			for(int j = i+1;j < a.length;j++) {
				if(a[i] - a[j] < 200) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = {150,350,600};
		System.out.println(abstand(a));
	}

}
