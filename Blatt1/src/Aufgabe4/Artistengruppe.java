package Aufgabe4;

public class Artistengruppe extends Kuenstlergruppe{
	private double pauschalPreis;
public Artistengruppe(String name,String genre,double preis){
	super(name,genre);
	this.pauschalPreis=preis;
	}
public double getPauschalPreis(){
	return this.pauschalPreis;}}