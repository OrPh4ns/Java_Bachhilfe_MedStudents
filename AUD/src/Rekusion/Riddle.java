package Rekusion;

public class Riddle {

	public static int riddle_rek(int n) {
		if(n==0) return 1;
		System.out.println(n);
		return 2*riddle_rek(n-1);
	}
	public static int riddle_itv(int n) {

		int i = 1;
		while(n>0){
			System.out.println(n);
			i = 2*i;
			n--;
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println(riddle_rek(5));
		//System.out.println(riddle_itv(3));
	}

}
