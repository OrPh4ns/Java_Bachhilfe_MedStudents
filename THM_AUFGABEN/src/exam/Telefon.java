package exam;

public class Telefon {
	private static String[] allname = new String[100];
	private static int[] allnr = new int[100];
	private static int i = -1;
	
	public static void einfugen(String name, int num) {
		i++;
		allname[i] = name;
		allnr[i] = num;
	}
	public static void suche(String name) {
		for(int i = 0 ; i < allname.length;i++) {
			if(name.equals(allname[i])) {
				System.out.println(i+" ][ Name : "+allname[i]+" || Number : "+allnr[i]);
			}
		}
	}
	public static void main(String[] args) {
		Telefon.einfugen("Ali", 42567332);
		Telefon.einfugen("Sarah", 145236);
		Telefon.einfugen("Mo", 235266);
		Telefon.einfugen("Abdul", 126673);
		Telefon.suche("Ali");
		Telefon.suche("Abdul");
	}
}
