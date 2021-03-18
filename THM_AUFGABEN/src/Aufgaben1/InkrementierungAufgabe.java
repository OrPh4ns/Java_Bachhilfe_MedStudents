package Aufgaben1;
public class InkrementierungAufgabe {

    public static void main(String[] args) {

        int a=5;

        //Erwarteter Wert:5
        System.out.println(a++);
        //Erwarteter Wert:7
        System.out.println(++a);
        //Erwarteter Wert:8
        System.out.println(++a);
        //Erwarteter Wert:76
        System.out.println("a="+(--a)+(--a));
        //Erwarteter Wert:6
        System.out.println(a++);
        //Erwarteter Wert:8
        System.out.println(++a);

    }}
