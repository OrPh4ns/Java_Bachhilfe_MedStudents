package exam;

public class fib {

	public static int fib_it(int n) {
		int f1 = 1;
		int f2 = 1;
		for(int i = 2; i<=n;i++) {
			int f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
		return f2;
	}
	public static void main(String[] args) {

		System.out.println(fib_it(6));
	}

}
