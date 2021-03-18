package Worterbuch;

public class NoSuchWordException extends Exception {
	
	String msg;
	public NoSuchWordException() {
		this.msg = "Please try to search again .. ";
		System.out.println(this.msg);

	}
}
