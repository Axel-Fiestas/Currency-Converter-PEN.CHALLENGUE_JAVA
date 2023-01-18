package YEN;

import Converts.ConvertToPEN;

public class ConvertYENtoPEN implements ConvertToPEN {

	@Override
	public double convert(double quantity) {
		return quantity*0.030;
	}

}
