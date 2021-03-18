
public class Aufgabe1 {


	public static boolean algo1(int x,int[]arr) {
		
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				System.out.println(arr[i]+arr[j]);
				if(x==arr[i]+arr[j]) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		int[] a = {5,2,25,61,20,80};
		System.out.println(algo1(81, a));
	}

}
