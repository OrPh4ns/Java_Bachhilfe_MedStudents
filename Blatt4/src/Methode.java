import java.util.List;

public class Methode {

	public  void methode(List<?super Hund> list) {
		for(Object c : list) {
			System.out.println(c);
		}
	}
	
	public  void methode1(List<?> list) {
		for(Object c : list) {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {

	}

}
