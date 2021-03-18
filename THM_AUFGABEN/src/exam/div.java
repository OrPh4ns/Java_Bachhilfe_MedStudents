package exam;

public class div {

	public static int div(int a, int b) throws Exception {
		if(b==0) {
			throw new MyEx("Problem");
		}else {
			return a/b;
		}
		
	}
	public static void main(String[] args) throws Exception {
		System.out.println(div(5,0));
	}
}
