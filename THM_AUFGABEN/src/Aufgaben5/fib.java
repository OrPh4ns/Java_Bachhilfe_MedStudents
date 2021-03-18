package Aufgaben5;
public class fib {
        public static int rek(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return rek(n-1)+rek(n-2);
        }

        public static int nor(int n){
            if(n<=1){
                return n;
            }
            int fib = 1;
            int pre = 1;

            for(int i = 2; i<n; i++){
                int t = fib;
                fib += pre;
                pre = t;
            }
            return fib;
        }
    public static void main(String[] args) {

        System.out.println(nor(6));
    }
}
