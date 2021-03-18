package Aufgaben1;

public class kette {

	public static String z(char c, int a) {
		String s = "";
		for(int i = 0 ; i < a; i++) {
			s+=c;
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(z('x',5));
	}

}
