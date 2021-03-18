package Tier;

public class Katze extends Tier{

	public Katze(int gr, int alter, String geschlecht) {
		super(gr, alter, geschlecht);
	}

	@Override
	public String sprich() {
		return "Miau Miau bin ne Katze ^_~";
	}
	
}
