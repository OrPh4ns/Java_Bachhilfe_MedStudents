

public class Folge {

	
	public static void folge_it(int n) {
		int Summe=5;
		for(int i=0; i<=n; i++){
			System.out.println(i);
			Summe+=i;
		}
		System.out.println(Summe);
	}
	
	
    public static int folge_rek(int n) {

        int add=5;
        if(n>0) {
        	return n+folge_rek(n-1); 
        }
        return n+add;
    }
    

	public static void main(String[] args) {

		//folge_it(1);
		//System.out.println(folge_rek(4));
		System.out.println(folge_rek(5));
	}

}
