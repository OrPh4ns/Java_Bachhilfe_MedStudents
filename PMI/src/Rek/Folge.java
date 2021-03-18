package Rek;

public class Folge {

	public static int folge_it(int n) {
		int num = 5;
		for(int i = 0 ; i  <=n;i++) {
			num+=i;
		}
		return num;
	}
	public static int folge_rek(int n) {
		int num = 5;
		
		while(n>0) {
			
			
			return folge_rek(n-1)+n;
		}
		
		return num+n;
	}
	public static void main(String[] args) {
		System.out.println(folge_rek(3));
	}

}
