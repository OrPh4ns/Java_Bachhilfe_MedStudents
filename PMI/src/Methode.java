import java.util.ArrayList;

public class Methode {
	
	
	public static void methode(ArrayList<?super Hund> list) {
		for(Object i : list) {
			System.out.println(i.toString());
		}
	}
	
	public static void main(String[] args) {
		Hund a1 = null;
		Hund a2 = null;
		ArrayList<Hund> list = new ArrayList<>();
		list.add(a2);
		list.add(a1);
		methode(list);
	}
}
