package Aufgaben4;
public class generateSomeDRG {

    public static String generateSomeDRG(String icd, String ops){
        String drg = "";
        int summe = 0;

        if(icd.length() != 3 || ops.length() !=4 ){
            drg = "Länge Fehler ..!";
        }else {
            for(int i = 0 ; i < icd.length();i++){
                summe += icd.charAt(i);
            }
            for(int i = 0;i<ops.length();i++){
                summe += ops.charAt(i);
            }
            int A = Integer.parseInt(Integer.toString(summe).substring(0,1));
            int B = Integer.parseInt(Integer.toString(summe).substring(2,3));
            char A1 = 'a';
            drg = "";
        }

        return drg;
        }


    public static void main(String[] args) {
        System.out.println(generateSomeDRG("J42","3700"));
    }

}
