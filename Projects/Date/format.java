import java.text.SimpleDateFormat;
import java.util.Date;

public class format {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd][MM][yy");
        System.out.println(s.format(d));
    }
}
