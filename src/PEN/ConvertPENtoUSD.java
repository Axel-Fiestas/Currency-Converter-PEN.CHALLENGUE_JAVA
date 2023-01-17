package PEN;

import Converts.ConvertToUSD;

public class ConvertPENtoUSD implements ConvertToUSD {
	@Override
	public double convert(double quantity) {
		return quantity*0.26;
	}
}
