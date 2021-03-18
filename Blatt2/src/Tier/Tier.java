package Tier;

public abstract class Tier {

	public abstract String sprich();
	private int gr;
	private int alter;
	private String geschlecht;
	public Tier(int gr, int alter, String geschlecht) {
		this.alter = alter;
		this.geschlecht = geschlecht;
		this.gr = gr;
	}
	
	public String toString() {
		return "Alter >> "+this.alter+" ][ Groesse >> "+this.gr+" ][ Geschlecht >> "+this.geschlecht;
	}
	
	
}
