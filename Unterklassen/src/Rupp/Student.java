package Rupp;

import java.util.Arrays;

public class Student {
	
	public static class privateUnterlagen{
		void getunter(int[] s) {
			System.out.println(Arrays.toString(s));
		}
	}
	public static void main(String[] args) {
		Student.privateUnterlagen p = new Student.privateUnterlagen();
		int[] a = {2,5,1};
		p.getunter(a);
	}

}
