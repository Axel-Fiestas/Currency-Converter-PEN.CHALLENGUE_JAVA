package Currencies;

import KRW.*;

public class KRW extends Currency{
	
	public KRW(){
		dolar=new ConvertKRWtoUSD();
		eur=new ConvertKRWtoEUR();
		pen=new ConvertKRWtoPEN();
		yen=new ConvertKRWtoYEN();
		gbp=new ConvertKRWtoGBP();
	}

}
