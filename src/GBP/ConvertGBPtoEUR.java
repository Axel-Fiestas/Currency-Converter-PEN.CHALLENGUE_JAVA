package GBP;

import Converts.ConvertToEUR;

public class ConvertGBPtoEUR implements ConvertToEUR {

	@Override
	public double convert(double quantity) {
		return quantity*1.14;
	}

}
