package PEN;

import Converts.ConvertToKRW;

public class ConvertPENtoKRW implements ConvertToKRW {

	@Override
	public double convert(double quantity) {
		return quantity*323.11;
	}

}
