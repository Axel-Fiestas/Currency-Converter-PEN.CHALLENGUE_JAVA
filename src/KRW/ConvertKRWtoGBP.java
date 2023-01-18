package KRW;

import Converts.ConvertToGBP;

public class ConvertKRWtoGBP implements ConvertToGBP{

	@Override
	public double convert(double quantity) {
		return quantity*0.00066;
	}
	

}
