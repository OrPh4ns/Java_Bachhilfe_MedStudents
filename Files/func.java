import java.io.File;
import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("C:\\Users\\Abdulx\\Desktop\\file\\test.txt");
        System.out.print("Enter Dir >> ");
        String dir = sc.next();
        File g = new File("C:\\Users\\Abdulx\\Desktop\\file\\"+dir);
        System.out.println(f.getName());
        System.out.println(f.toString());
        System.out.println(f.canWrite());
        System.out.println(f.isFile());
        System.out.println(g.mkdir());
    }
}
