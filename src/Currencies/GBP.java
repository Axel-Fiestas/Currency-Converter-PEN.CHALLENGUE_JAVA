package Currencies;

import GBP.*;

public class GBP extends Currency {
	
	public GBP() {
		dolar=new ConvertGBPtoUSD();
		eur=new ConvertGBPtoEUR();
		pen=new ConvertGBPtoPEN();
		krw=new ConvertGBPtoKRW();
		yen=new ConvertGBPtoYEN();
	}
}
