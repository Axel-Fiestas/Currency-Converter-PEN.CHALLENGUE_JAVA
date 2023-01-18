package GBP;

import Converts.ConvertToUSD;

public class ConvertGBPtoUSD implements ConvertToUSD{

	@Override
	public double convert(double quantity) {
		return quantity*1.23;
	}
	
}
