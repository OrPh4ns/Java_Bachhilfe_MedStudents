package Aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class TeilnehmerListe implements TNListe{

	List<Teilnehmer> list = new ArrayList<>();
	@Override
	public boolean einfugen(Teilnehmer tn) {
		if(!list.contains(tn)) {
			list.add(tn);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean entfernen(Teilnehmer tn) {
		return list.remove(tn)?true:false;
	}
	
}
