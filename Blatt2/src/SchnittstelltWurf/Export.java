package SchnittstelltWurf;

public class Export extends Brauerei implements Bieranlage{

	public Export(String zucker, int liter) {
		super(zucker, liter);
	}

	@Override
	public String abfullen() {
		return "Flaschen werden mit Export abgefullt . . . ";
	}
	


}
