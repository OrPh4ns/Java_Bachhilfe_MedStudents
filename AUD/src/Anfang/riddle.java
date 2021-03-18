package Anfang;

public class riddle {
	
	public static int riddle(int n) {
		int num = 1;
		while(n>0) {
			num*=2;
			n--;
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(riddle(3));
	}

}
