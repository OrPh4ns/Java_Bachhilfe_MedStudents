package SchnittstelltWurf;

public class Brauerei {

	private String zucker;
	private int liter;
	public Brauerei(String zucker, int liter) {
		this.liter = liter;
		this.zucker = zucker;
	}
	
	public String toString() {
		return this.zucker+" Zucker"+" || "+ this.liter+" : Liter";
	}
}
