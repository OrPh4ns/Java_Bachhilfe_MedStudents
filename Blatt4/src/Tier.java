

public abstract class Tier {
	private double gr��e;
	private int alter;
	private String geschlecht;

	public Tier(double a,int b, String c){
		super();
		this.gr��e=a;
		this.alter=b;
		this.geschlecht=c;
	}

	public abstract  String sprich();
}
