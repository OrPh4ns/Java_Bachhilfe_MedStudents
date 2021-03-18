package Wurfel;
import java.util.Collection;
import java.util.Random;

public class Wurfel implements Comparable {

	private int augenzahl;
	
	public Wurfel() {
		this.augenzahl = 1;
	}
	


	public Wurfel(int w) {
		this.augenzahl = w;
	}
	
	public int getAugenzal() {
		return this.augenzahl;
	}
	
	public int Zufall() {
        Random a = new Random();
        this.augenzahl = a.nextInt(6)+1;
		return this.augenzahl;
	}

	public int gewunschteAugenzahl(int w) {
		this.augenzahl = w;
		return this.augenzahl;
	}
	@Override
	public String toString() {
		return "Ihr Zahl ist >> "+this.augenzahl;
	}




	@Override
	public int compareTo(Object o) {
		Wurfel comp = (Wurfel) o;
		if(getAugenzal() > comp.getAugenzal()) {
			return 1;
		}else if(getAugenzal() < comp.getAugenzal()){
			return -1;
		}else {
			return 0;
		}
	}
	



	
}
