package exam;

public class coffi {

	public static int coffz_rek(int n, int k) {
		if(k==0||n==k) return 1;
		
		else System.out.println(n+" n || "+k+" k "); return coffz_rek(n-1, k)+coffz_rek(n-1,k-1);

	}
	public static void main(String[] args) {
		System.out.println(coffz_rek(5, 3));
	}

}
