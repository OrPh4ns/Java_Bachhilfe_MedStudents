package Aufgaben5;
public class fak {
    public static int fak1(int n){
        int s = 1;
        for(int i=1;i<=n;i++){
            s *= i;
        }
        return s;
    }
    public static int fak2(int n){
        if(n==0){
            return 1;
        }
        return fak2(n-1)*n;
    }

    public static void main(String[] args) {
        System.out.println(fak2(5));
    }

}
