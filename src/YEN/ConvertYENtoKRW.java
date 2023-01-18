package YEN;

import Converts.ConvertToKRW;

public class ConvertYENtoKRW implements ConvertToKRW {

	@Override
	public double convert(double quantity) {
		return quantity*9.65;
	}
	
}
