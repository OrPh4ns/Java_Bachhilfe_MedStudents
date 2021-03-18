package Aufgaben3;
public class gleichheit {
    public static void main(String[] args) {
        int[] a = {1, 2,5};
        int[] b = {1, 2};
        String check = "Gleich !";
        String u = "Ungleich !";
        if(a.length!=b.length){
            check = u;
        }else {
            for(int i = 0 ; i < a.length;i++){
                if(a[i]!=b[i]){
                    check = u;
                 
                }}
        }
        System.out.println(check);
        }

    }

