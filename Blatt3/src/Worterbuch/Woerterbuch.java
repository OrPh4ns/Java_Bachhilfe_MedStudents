package Worterbuch;

import Worterbuch.Eintrag;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Woerterbuch  implements IWoerterbuch{

    public Woerterbuch() {

	
		        eintraege = new ArrayList<>();

	}

	private List<Eintrag> eintraege;

 


    @Override
    public void fuegeHinzu(Eintrag eintrag) {
    	eintraege.add(eintrag);
    }

    @Override
    public void entferne(Eintrag eintrag) throws NoSuchWordException {
    	eintraege.remove(eintrag);
    }

    @Override
    public String uebersetzteInsEnglische(String wort) throws NoExpressionFoundException {
        return wort;
    }

    @Override
    public String uebersetzteInsDeutsche(String wort) throws NoExpressionFoundException {
        return wort;
    }
    
    public void foreach() {

    	        System.out.println(eintraege);
    	    	eintraege.forEach((Consumer<? super Eintrag>) eintraege);
    	    }
    
    
    
}
