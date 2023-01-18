package Currencies;

import EUR.*;

public class EUR extends Currency{
	
	public EUR() {
		dolar=new ConvertEURtoUSD();
		yen=new ConvertEURtoYEN();
		pen=new ConvertEURtoPEN();
		gbp=new ConvertEURtoGBP();
		krw=new ConvertEURtoKRW();
		
	}

}
