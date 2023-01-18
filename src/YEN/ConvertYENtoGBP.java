package YEN;

import Converts.ConvertToGBP;

public class ConvertYENtoGBP implements ConvertToGBP{

	@Override
	public double convert(double quantity) {
		return quantity*0.0063;
	}

}
