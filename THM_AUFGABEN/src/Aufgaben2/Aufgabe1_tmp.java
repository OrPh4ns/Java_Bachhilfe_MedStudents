package Aufgaben2;
public class Aufgabe1_tmp {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        if(a>b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println("a is : "+a+"\n b is : "+b);
    }
}
