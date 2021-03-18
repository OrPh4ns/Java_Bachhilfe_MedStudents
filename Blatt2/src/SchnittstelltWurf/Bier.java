package SchnittstelltWurf;

public class Bier extends Brauerei implements Bieranlage{

	public Bier(String zucker, int liter) {
		super(zucker, liter);
	}

	@Override
	public String abfullen() {
		return "Flaschen werden mit Bier abgefullt . . . ";
	}

}
