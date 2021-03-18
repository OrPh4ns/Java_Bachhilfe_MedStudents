package Anfang;

public class imalj {

	public static int alg(int n) {
		int z = 0;
		for(int i = 1 ; i <= n;i++) {
			for(int j = 1; j <= n;j++) {
				System.out.println("s");
				z+=j*i;
			}
		}
		return z;
	}
	public static void main(String[] args) {
		System.out.println(alg(3));
	}

}
