package KRW;

import Converts.ConvertToUSD;

public class ConvertKRWtoUSD implements ConvertToUSD{

	@Override
	public double convert(double quantity) {
		return quantity*0.00081;
	}

}
