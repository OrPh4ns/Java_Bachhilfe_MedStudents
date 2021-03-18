package exam;

public class fak {

	public static int fak_itv(int n) {
		int fak = 1;
		for(int i = 1 ; i <= n;i++) {
			fak*=i;
		} return fak;
	}
	public static int fak_rek(int n) {
		if(n==0) return 1;
		System.out.println(n);
		return fak_rek(n-1)*n;
	}
	public static void main(String[] args) {
		System.out.println(fak_itv(5));
		System.out.println(fak_rek(5));
	}

}
