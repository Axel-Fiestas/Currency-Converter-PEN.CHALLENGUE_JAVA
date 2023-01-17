package PEN;

import Converts.ConvertToYEN;

public class ConvertPENtoYEN implements ConvertToYEN{
	@Override
	public double convert(double quantity) {
		return quantity*33.49;
	}

}
