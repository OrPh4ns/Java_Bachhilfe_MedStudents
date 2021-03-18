package Aufgaben5;
public class zeichen {
    public static String rek(char c,int n){
        if(n==1)return ""+c;
        return rek(c,n-1)+c;
    }
    public static String it(char c , int n){
        String s = "";
        for(int i = 0 ; i < n; i++){
            s += c;
        }
        return s;
    }
    public static String z(char c , int n) {
    	String s = "";
    	for(int i = 0 ; i < n;i++) {
    		s+=c;
    	}
    	return s;
    }
    
    public static String zRek(char c, int n) {
    	if(n==1) return ""+c;
    	return zRek(c,n-1)+c;
    }

    public static void main(String[] args) {
        //System.out.println(it('x',5));
        //System.out.println(z('c',5));
        System.out.println(zRek('c',5));
    }
}
