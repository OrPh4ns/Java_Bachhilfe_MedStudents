
public class test {

	public static void main(String[] args) {

		
		String[] arr = {"19e324:34","235235:235","235235:124"};
		for(String s : arr) {
			int w = s.indexOf(":");
			System.out.println(s.substring(0,w)+s.substring(w+1,s.length()));
		}
	}

}
