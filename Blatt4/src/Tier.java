

public abstract class Tier {
	private double größe;
	private int alter;
	private String geschlecht;

	public Tier(double a,int b, String c){
		super();
		this.größe=a;
		this.alter=b;
		this.geschlecht=c;
	}

	public abstract  String sprich();
}
