package GBP;

import Converts.ConvertToKRW;
public class ConvertGBPtoKRW implements ConvertToKRW{

	@Override
	public double convert(double quantity) {
		return quantity*1519.53;
	}

}
