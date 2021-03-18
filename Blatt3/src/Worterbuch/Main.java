package Worterbuch;

import java.awt.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {


    	
    	
    	//IWoerterbuch derInstance = new IWoerterbuch(); 
    	//derInstance.entferne(null);
        
    	IWoerterbuch wb = new Woerterbuch();
    	// Foreach als Methode
    	wb.foreach();

    	// forEach
    	ArrayList<Eintrag> list = new ArrayList<>();
    	list.add(new Eintrag("Tisch", "table"));
    	list.add(new Eintrag("Stuhl", "Chair"));
    	list.forEach(i->System.out.println(i));
       // wb.fuegeHinzu(new Eintrag("Tisch", "table"));
        //wb.fuegeHinzu(new Eintrag("Stuhl", "chair"));
    	
    	//IWoerterbuch instance =(Eintrag eintrag)->{
    		
    		// leider nicht weitergekommen da das Interfaces mehrere Methods enthält
    		// The target type of this expression must be a functional interface 
    		// das habe ich nicht verstanden
    	//};
        
        try {
            System.out.println(wb.uebersetzteInsDeutsche("table"));
            System.out.println(wb.uebersetzteInsEnglische("Stuhl"));

            wb.entferne(new Eintrag("Tisch", "table"));
        }
        catch (NoExpressionFoundException nex){
           System.out.println(nex.msg);
        }
        catch (NoSuchWordException nsw){
            System.out.println(nsw.msg);
        }
        // System.out.println(wb.uebersetzteInsDeutsche("table"));
    }
}
