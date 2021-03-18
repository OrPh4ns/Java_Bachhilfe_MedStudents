package exam;

public class sqrt {

	public static double sqrt(double n) {
		int i = 0;
		int w = 25;
		double a = n;
		while(i<w) {
			a=(a+n/a)/2.0;
			i++;
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(sqrt(17));
	}

}
