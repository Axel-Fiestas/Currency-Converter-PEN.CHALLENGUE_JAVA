package KRW;

import Converts.ConvertToEUR;

public class ConvertKRWtoEUR implements ConvertToEUR {

	@Override
	public double convert(double quantity) {
		return quantity*0.00075;
	}

}
