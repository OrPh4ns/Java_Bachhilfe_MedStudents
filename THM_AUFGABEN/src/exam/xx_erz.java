package exam;

public class xx_erz {

	public static String er_rek(char c, int i) {
		String s = "";
		if(i==1) return s+=c;
		s+=c;
		return  er_rek(c,i-1)+s;
	}
	public static String er_rek1(char c, int i) {
		
		if(i==1) return ""+c;
		else {
			return c+er_rek1(c, i-1);
		}
		 
	}
	public static void main(String[] args) {
		//System.out.println(er_rek('x',5));
		//System.out.println(er_rek1('x',5));
	
	}

}
