package EUR;

import Converts.ConvertToGBP;

public class ConvertEURtoGBP implements ConvertToGBP {

	@Override
	public double convert(double quantity) {
		return quantity*0.88;
	}

}
