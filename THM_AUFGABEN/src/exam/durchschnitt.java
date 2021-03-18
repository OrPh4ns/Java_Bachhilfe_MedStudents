package exam;

import java.util.Scanner;

public class durchschnitt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		double d = 0;
		while(i<=5) {
			System.out.print("Zahl "+i+" >> ");
			int ent = sc.nextInt();
			d+=(double) ent;
			i++;
		}
		System.out.println(d/5);
	}
}
