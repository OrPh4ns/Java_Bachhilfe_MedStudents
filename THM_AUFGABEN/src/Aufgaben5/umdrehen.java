package Aufgaben5;
public class umdrehen {
    public static String rek(String s){
        if(s.length() == 1){
            return s;
        }
        return rek(s.substring(1))+s.charAt(0);
    }

    public  static String it(String s){
        String word = "";
        for(int i = s.length()-1; i>=0;i--){
            word += s.charAt(i);

        }
        return word;
    }
    public static void main(String[] args) {
        System.out.println(it("Hello"));
    }
}
