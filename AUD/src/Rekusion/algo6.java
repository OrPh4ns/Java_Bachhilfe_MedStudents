package Rekusion;

public class algo6 {

	public static int algo6(int n) {
		System.out.println(n);
		if(n==1) {return 1;}
		else if(n%2!=0) {
			System.out.println("Ungerade : "+n);
			return 2*algo6(n-1);}
		else {
			System.out.println("Gerade : "+n);
			return n*algo6(n/2);
		}
	}
	
	public static int algo6_itv(int n) {
		int i = 1;
		while(n>1) {
			if(n%2!=0) {
				//System.out.println("Ungerade : "+n);
				i*=2;
				n--;
				//System.out.println(i);
			}else {
				//System.out.println("Gerade : "+n);
				i*=n;
				n= n/2;
				
				//System.out.println(i);
			}
		}
		return i;
	}
	public static void main(String[] args) {
		//System.out.print(algo6(10));
		System.out.println(algo6_itv(10));
		//int n = 7;
		//System.out.println(2*(n-1));
	}

}
