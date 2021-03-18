package Wurfel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class WurfelApp {

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Wurfel w = new Wurfel(4);
		Wurfel w1 = new Wurfel(2);
		Wurfel w2 = new Wurfel(5);
		Wurfel w3 = new Wurfel(1);
	
		System.out.println(w.compareTo(w1));
		List<Wurfel> list = new ArrayList<>();
		list.add(w1);
		list.add(w2);
		list.add(w);
		list.add(w3);
		Collections.sort(list);
		System.out.println(list);

		}
	
	
		
	}


