package Aufgaben4;
public class findeGroesstes {

    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length;i++){
            if(max>arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {3,5,8,2,4};
        System.out.println(max(a));
    }
}
