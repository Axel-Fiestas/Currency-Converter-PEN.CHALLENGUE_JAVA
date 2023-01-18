package Currencies;
import PEN.*;

public class PEN extends Currency{
	public PEN() {
		dolar= new ConvertPENtoUSD();
		yen= new ConvertPENtoYEN();
		eur=new ConvertPENtoEUR();
		gbp=new ConvertPENtoGBP();
		krw=new ConvertPENtoKRW();
	}
}
