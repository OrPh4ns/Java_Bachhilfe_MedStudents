package exam;

public class umdrehen {

	public static void umitv(String s) {
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	public static String umrek(String s) {
		if(s.length()==1) {
			return s;
		}
		System.out.println();
	      return umrek(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		umitv("Hello");
		System.out.println();
		System.out.println(umrek("Ahmed"));
	}

}
