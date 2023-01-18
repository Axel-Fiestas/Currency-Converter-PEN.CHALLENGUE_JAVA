package GBP;

import Converts.ConvertToYEN;

public class ConvertGBPtoYEN implements ConvertToYEN {

	@Override
	public double convert(double quantity) {
		return quantity*157.58;
	}

}
