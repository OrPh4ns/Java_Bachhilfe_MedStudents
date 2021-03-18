package Arraylist;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Ali");
		names.add("Mohammed");
		names.add("Sara");
		names.add("Ola");
		names.removeIf(name -> name.length()>4);
		for(String o:names) {
			System.out.println(o);
		}
		
		
		
	}
}
