package exam;

public class count_id {

	static int count = 0;
	
	 static void hi() {
		int x = 0;
		count++;
		x++;
		System.out.println("Hi . "+x+" . "+count);
	}
	public static void main(String[] args) {
		hi();
		hi();
		hi();
		count_id.hi();
	}

}
