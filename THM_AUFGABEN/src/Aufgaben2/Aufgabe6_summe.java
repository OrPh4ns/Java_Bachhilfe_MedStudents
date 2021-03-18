package Aufgaben2;
public class Aufgabe6_summe {
    public static void main(String[] args) {

    	int[] a = {1,2,3,4,5,6,7,8,9,0}; 
    	int i = 2; 
    	i = a[i]; 
    	a[i] = i;
    	a[(2*a[i]+a[i+1])%10] = a[a[i-1]+a[i+1]]-1; 
       System.out.println(a[(2*a[i]+a[i+1])%10]);
    	int res = 0;
        for(int x = 0 ; x < 30; x++){
            res = x + res;

        }
        System.out.println(res);
    }
}
