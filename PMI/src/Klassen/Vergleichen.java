package Klassen;

public class Vergleichen implements Comparable<Vergleichen>{
	
	int x;
	public Vergleichen(int x) {
		this.x = x;
	}
	@Override
	public int compareTo(Vergleichen o) {
		return this.x > o.x?-1:this.x == o.x?1:0;
	}

}
