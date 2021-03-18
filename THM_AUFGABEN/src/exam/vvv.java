package exam;

import java.util.Arrays;

public class vvv {

public static void main(String[] args) {
	int[] a = {0,1,2};
	int[] b = {3,4,5};
	a=b;
	b[2] = 6;
	System.out.println(Arrays.toString(a));
	String s = "test";
	int v = 2;
	set(a);
	set(s);
	set(v);
	System.out.println(v);
	System.out.println(Arrays.toString(a));
	System.out.println(s);
}
public static void set(int[] a) {
	a[0] = 2019;
}
public static void set(int v) {
	v = 90;
}
public static void set(String s) {
	s = "Klausur";
}
	
}
