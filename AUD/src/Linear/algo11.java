package Linear;

import java.util.Arrays;

public class algo11 {

	public static String[] Sort(String[] a) {
		//char[] ch = new char[a.length]
		int j = 0;
		for(int i = j+1; i < a.length && j<a.length;)
	    {
			System.out.println("i = "+i+"|| j = "+j);
			//ch[i] = a[i].charAt(0);			
	        if(a[i].charAt(0)>a[j].charAt(0))
	        {

	            String t = a[i];
	            a[i] = a[j];
	            a[j] = t;
	            i=0;
	            j=i+1;
	            
	        } 
	        else
	        {
	            i++;
	            j++;
	        }  
	    }

		return a;
	}
	
	public static int[] Sortn(int[] a) {

		int j = 0;
		for(int i = j+1; i < a.length && j<a.length;)
	    {		
	        if(a[i]>a[j])
	        {
	            int t = a[i];
	            a[i] = a[j];
	            a[j] = t;
	            i=0;
	            j=i+1;   
	        } 
	        else
	        {
	            i++;
	            j++;
	        }  
	    }

		return a;
	}
	
	public static String[] linear(String[] a) {
		char[] l = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int j = 0;
		for(int i = 0 ; i < a.length;i++) {
		for(int c =0 ; c< l.length;c++) {
			if(a[i].charAt(0)==c) {
				a[j] = a[i];
				j++;
			}
		}
		}
		
		
		return a;
	}

	public static int min2(int[] a) {
		int min = a[0];
		int min2 = a[1];
	
		for(int i = 0 ; i < a.length;i++) {
			if(a[i]<min) {
				min2 = min;
				min = a[i];
			}else if(a[i]<min2 && a[i]!=min){
				min2 = a[i];
			}
		}System.out.println(min2);

		return min;
	}
	public static void bit(int n, int k) {
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < n;j++) {
				System.out.print(0);
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		int[] an = {3,7,4,9,5};
		String[] a= {"zebra","apfel","birne","demir","xavier","aahaa"};

		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(Sortn(an)));
		//System.out.println(Arrays.toString(Sort(a)));
		//System.out.println(Arrays.toString(linear(a)));
		//System.out.println(min2(an));
		bit(5,2);
	}

}
