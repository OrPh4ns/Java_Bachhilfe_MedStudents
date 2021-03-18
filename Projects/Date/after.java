import java.util.Date;

public class after {
    public static void main(String[] args) {

        Date date1 = new Date(1000);
        Date date2 = new Date(2000);

        boolean check = date1.after(date2);
        System.out.println(check);

        check = date2.after(date1);
        System.out.println(check);

    }
}
