package Dyncamix;

public class PartielSumme {

	public static boolean alg(int[] a , int x) {
		int teilsumme = a[0];
		for(int i = 0 ; i < a.length; i++) {
			
			//System.out.println(a[i]+"+"+a[i+1]+"="+teilsumme);
			if(teilsumme==x) {
				return true;
			}teilsumme += a[i];
		}
		
		return false;
	}
	public static boolean algo12(int[] a, int x) {
		int sum = 0;
		int k = 0;
		for(int i = 0 ;i < a.length-1 ; i++) {
			if(x!=i) k+= a[i];
		}
		return false;
	}
	
	public static boolean ps(int[] a) {
		
		int j = 0;
		for(int i = j+1; i < a.length && j<a.length;)
	    {
			System.out.println("i = "+i+"|| j = "+j);		
	        System.out.println(a[i]+a[j]);
			if(a[i]>a[j])
	        {
	            
	        } 
	        else
	        {
	            i++;
	            j++;
	        } 
 
	    }

		return false;
	}
	public static void main(String[] args) {
 
		  int a[] = {4,13,23,21,11};
		  System.out.println(alg(a,4));
	}

}
