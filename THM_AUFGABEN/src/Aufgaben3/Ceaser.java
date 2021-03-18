package Aufgaben3;
public class Ceaser {
    public static void main(String[] args) {
        String word = "hello";
        String code = "encode";
        int pos = 16;
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i = 0 ; i < word.length()-1;i++){
            for(int j = 0;j<alphabet.length;j++){
                if(word.charAt(i)==alphabet[j]){
                    if(code.equals("encode")){
                        int p = i+pos%26;
                        if(p>=25) {
                            p-=26;
                            System.out.print(p+" "+ alphabet[p]+" || ");
                        }
                        else {
                            System.out.print(p+" "+ alphabet[p]+" || ");
                        }
                    }
                }
            }
        }

    }
}
