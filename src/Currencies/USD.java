package Currencies;

import USD.*;

public class USD extends Currency{
	public USD() {
		eur=new ConvertUSDtoEUR();
		pen=new ConvertUSDtoPEN();
		krw=new ConvertUSDtoKRW();
		yen=new ConvertUSDtoYEN();
		krw=new ConvertUSDtoKRW();
	}
}
