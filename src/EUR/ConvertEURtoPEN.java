package EUR;

import Converts.ConvertToPEN;

public class ConvertEURtoPEN implements ConvertToPEN {

	@Override
	public double convert(double quantity) {
		// TODO Auto-generated method stub
		return quantity*4.13;
	}

}
