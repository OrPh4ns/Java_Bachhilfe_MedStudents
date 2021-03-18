package Aufgaben5;
public class gerade {
    public static boolean gerade(int n){
        if(n==0) return true;
        if(n==1) return false;

        return gerade(n-2);
    }

    public static void main(String[] args) {
        System.out.println(gerade(2));
    }
}
