package KRW;

import Converts.ConvertToPEN;

public class ConvertKRWtoPEN implements ConvertToPEN{

	@Override
	public double convert(double quantity) {
		return quantity*0.0031;
	}
}
