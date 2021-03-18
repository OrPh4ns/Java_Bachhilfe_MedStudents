package Aufgaben5;
public class ggt {

    public static int rek(int a,int b){
        if(a==b)return a;
        if(a>b) return rek(a-b,b);
        else
            return rek(a,b-a);
    }
    public static int it(int a,int b){
        while (a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(it(100,45));
    }
}
