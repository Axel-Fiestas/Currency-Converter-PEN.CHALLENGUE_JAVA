package YEN;

import Converts.ConvertToEUR;

public class ConvertYENtoEUR implements ConvertToEUR {

	@Override
	public double convert(double quantity) {
		return quantity*0.0072;
	}

}
