package KRW;

import Converts.ConvertToYEN;

public class ConvertKRWtoYEN implements ConvertToYEN{

	@Override
	public double convert(double quantity) {
		return quantity*0.10;
	}

}
