package PEN;

import Converts.ConvertToGBP;

public class ConvertPENtoGBP implements ConvertToGBP{
	@Override
	public double convert(double quantity) {
		return quantity*0.21;
	}

}
