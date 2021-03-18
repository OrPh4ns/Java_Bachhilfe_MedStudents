package exam;

public class Fifo {

	public static int fit(int n) {
		int x;
		if(n%2==0) x=1;
		else x=2;
		while(n>1){
			x = x*n-1;
			n-=2;
		}
		return x;
	}
	public static int fRek(int n) { 
		System.out.println(n+" ][ "+ ((4*n)-1));
		if(n<=0) return 1;
		if(n==1) return 2;	
	return 4 * fRek(n-2) -1;
		 }
	
	public static void main(String[] args) {
		System.out.println(fRek(7));
		System.out.println(fit(7));
	}

}
