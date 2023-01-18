package GBP;

import Converts.ConvertToPEN;

public class ConvertGBPtoPEN implements ConvertToPEN{

	@Override
	public double convert(double quantity) {
		return quantity*4.70;
	}

}
