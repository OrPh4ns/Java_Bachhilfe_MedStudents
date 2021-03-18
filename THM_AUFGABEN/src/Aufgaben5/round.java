package Aufgaben5;
public class round {
    public static double round(double d,double dd){
        double o = d/dd;
        double i = (int) o;
        return i;

    }
    public static void main(String[] args) {
        System.out.println(round(20,5));    }
}
