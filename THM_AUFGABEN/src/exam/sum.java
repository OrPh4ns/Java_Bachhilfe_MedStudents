package exam;

public class sum {

	public static int sum_rek(int n) {
		if(n==0) return 0;
		return sum_rek(n-1)+n;
	}
	public static int sum_itv(int n) {
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			sum+=i;
		}return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum_rek(5));
		System.out.println(sum_itv(5));
	}
}
