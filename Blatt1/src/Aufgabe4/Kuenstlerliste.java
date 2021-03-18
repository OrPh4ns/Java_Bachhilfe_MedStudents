package Aufgabe4;

import java.util.ArrayList;

public class Kuenstlerliste{
	private ArrayList<Kuenstlergruppe>kuenstlerListe;
	public void hinzufuegen(Kuenstlergruppe gruppe){
		this.kuenstlerListe.add(gruppe);}
	public void entfernen(Kuenstlergruppe gruppe){
		this.kuenstlerListe.remove(gruppe);}
	public Kuenstlergruppe get(int i){
		return this.kuenstlerListe.get(i);
		}
	}