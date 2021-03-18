package SchnittstelltWurf;

public class Weizen extends Brauerei implements Bieranlage{

	
	public Weizen(String zucker, int liter) {
		super(zucker, liter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String abfullen() {
		return "Flaschen werden mit Export abgefullt . . . ";

	}

}
