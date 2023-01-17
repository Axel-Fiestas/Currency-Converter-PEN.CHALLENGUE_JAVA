package Currencies;
import PEN.ConvertPENtoEUR;
import PEN.ConvertPENtoUSD;
import PEN.ConvertPENtoYEN;

public class PEN extends Currency{
	
	public PEN() {
		dolar= new ConvertPENtoUSD();
		yen= new ConvertPENtoYEN();
		eur=new ConvertPENtoEUR();
		
	}
}
