public class add_void {
    public static boolean av_rek(int n){
        if(n==0) return true;
        if(n==1) return false;
        return av_rek(n-2);
    }

    public static boolean av_it(int n){

        while(n!=0){
            if(n==0) return true;
            if(n==1) return false;
            n-=2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(av_it(4));
    }
}
