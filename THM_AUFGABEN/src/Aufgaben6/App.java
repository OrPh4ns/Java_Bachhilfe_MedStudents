package Aufgaben6;
public class App {
    public static void main(String[] args) {
        Patient pat1 = new Patient();
        pat1.setinfo("Ali", 33);
        Patient pat2 = new Patient();
        pat2.setinfo("Gorege",25);
        System.out.println(pat1.toString());
        System.out.println(pat2.toString());
        System.out.println(pat2.getCount());
    }

}
