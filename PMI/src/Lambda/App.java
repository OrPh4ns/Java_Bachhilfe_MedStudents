package Lambda;

public class App {

	public static void main(String[] args) {
		Tier t = ()-> {
			System.out.println("Hau hau");
		};
		t.sprechen();
	}
}
