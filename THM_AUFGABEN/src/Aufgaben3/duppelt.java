package Aufgaben3;
public class duppelt {


    public static void dop(int[] arr){

        for(int i = 0 ; i<arr.length;i++){
            for(int j =i+1 ; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Found - "+arr[i]); }

            }
        }

    }


    public static void main(String[] args) {

        int[] arr =  {100777,100546,101433,100546,100777,100211,100546,100777,100211};
        dop(arr);
    }
}
