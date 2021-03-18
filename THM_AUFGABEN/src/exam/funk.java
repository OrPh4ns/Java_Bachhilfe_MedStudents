package exam;

public class funk {

	public static int fItv(int n) {
		int x;
		if(n%2==0) x=1;
		else x = 2;
		while(n>1) {
			x = 4*x-1;
			n-=2;
		}
		return x;
	}
	public static int fRek(int n) {
		if(n==0) return 1;
		if(n==1) return 2;
	
		return 4*fRek(n-2)-1;
	}
	public static void main(String[] args) {
		System.out.println(fRek(6));
		System.out.println(fItv(5));
	}

}
