package Tier;

public class Hund extends Tier{

	public Hund(int gr, int alter, String geschlecht) {
		super(gr, alter, geschlecht);

	}

	@Override
	public String sprich() {
		return "Hau hau ich bin ein Hund";
	}
	
	
	
}
