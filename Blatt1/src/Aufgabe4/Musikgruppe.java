package Aufgabe4;

public class Musikgruppe extends Kuenstlergruppe{
	public static double aktGemaPauschale;
	private double preisProStunde;
	private String musikStil;
	public Musikgruppe(String name,String stil,double preis){
		super(name,"Musik");
		this.musikStil=stil;
		this.preisProStunde=preis;}
	public static double getAktGemaPauschale(){
		return aktGemaPauschale;}
	public double getPreisProStunde(){
		return this.preisProStunde;
		}
}