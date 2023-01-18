package Currencies;

import YEN.*;

public class YEN extends Currency{
	
	public YEN() {
		dolar=new ConvertYENtoUSD();
		eur=new ConvertYENtoEUR();
		pen=new ConvertYENtoPEN();
		krw=new ConvertYENtoKRW();
		gbp=new ConvertYENtoGBP();
	}
}
