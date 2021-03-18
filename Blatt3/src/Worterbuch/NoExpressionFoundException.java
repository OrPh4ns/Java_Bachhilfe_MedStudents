package Worterbuch;

public class NoExpressionFoundException extends Exception {
	
	static String msg;
	public NoExpressionFoundException() {
		this.msg = "There is no Expression .. try again ";
		System.out.println(this.msg);

	}

}
